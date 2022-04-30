package com.case2;

import com.case2.Person;
import com.case2.PersonRepository;
import com.case2.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

// Melakukan test pada Class PersonService dimana class ini terintegrasi/bergantung pada interface PersonRepository, test pada
// method 'get()' dengan tipe data 'Person' yang ada pada class PersonService dengan menggunakan bantuan dari Integrasi Mockito
// dengan JUnit
@Extensions({
        @ExtendWith(MockitoExtension.class)
})

public class PersonServiceTest {

    // Ketika attribut yang ditambahkan @Mock maka secara otomatis Extensi MockitoExtension.class akan mencari attribut dengan
    // annotation @Mock dan secara otomatis di inject sebagai mock object. sehinnga tidak memerlukan lagi perintah
    // 'Mockito.mock(NamaClass.class)' untuk membuat mock object.
    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    public void setUp(){
        personService = new PersonService(personRepository);
    }

    // Case1
        @Test
        void testGetPersonNotFound() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> personService.get("Not Found"));
        }

        @Test
        void testGetPersonSuccess() {

            // menambah behavior ke mock object.
            Mockito.when(personRepository.selectedByid("suardi"))
                    .thenReturn(new Person("suardi", "Suardi"));

            var person = personService.get("suardi");
            Assertions.assertNotNull(person);
            Assertions.assertEquals("suardi", person.getId());
            Assertions.assertEquals("Suardi", person.getName());
        }

    /**Case2
      - test ini kelihatan berjalan dengan baik namun, coba hapus kode 'personRepository.insert(person)' yang ada pada
        class com.case2.PersonService pada method register, maka unit testnya pun tetap sukses, hal ini terjadi karena kita
        tidak melakukan verifikasi bahwa mocking object dipanggil. Hal ini sangat berbahaya, karena jika code sampai
        ke production, bisa jadi orang yang registrasi datanya tidak masuk ke database. Jadi kalau kasusnya seperti ini pastikan
        setiap selesai menggunakan mocking object maka harus dilakukan verifikasi bahwa sebuah method di mocking object tersebut
        telah dipanggil dan beberapa kali dipanggil contoh :
        'verify(personRepository, times(1)).insert(new Person(person.getId(), person.getName()))'. pada method unit test
        yang menggunakan mock object.
      - Jadi membuat mocking object harus berhati-hati apalagi methodnya void.
    */

    @Test
    void testRegisterSuccess(){
        var person = personService.register("Suardi");
        Assertions.assertNotNull(person);
        Assertions.assertEquals("Suardi", person.getName());
        Assertions.assertNotNull(person.getId());

        /**
         Ketika perintah 'personRepository.insert(person)' di disabled pada method register pada class com.case2.PersonService
         maka seharusnya akan menimbulakan error karena method 'insert(Person person)' tidak pernah dipanggil karena sudah
         di disabled pada method 'register' sedangkan method 'verify' value dari pemanggilan method 'insert' dari interface
         PersonRepository di set 1. hal ini untuk menghidari Unit test ini tetap sukses meskipyn belum menambahkan data atau
         memanggil method insert(Person person), hal ini dapat mengakibatkan pada saat implementasi data tidak akan tersimpan
         pada database.
        */
        Mockito.verify(personRepository, Mockito.times(1))
                .insert(new Person(person.getId(), "Suardi"));

    }



}
