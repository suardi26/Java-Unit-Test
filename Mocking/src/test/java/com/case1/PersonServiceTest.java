package com.case1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.junit.jupiter.api.function.Executable;
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
}
