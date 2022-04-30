package com.practice;

/**
    - Pada saat membuat aplikasi yang besar source code pun akan semakin besar, struktur class pun akan semakin kompleks.
    - Kita tidak bisa memungkiri lagi bahwa akan ada ketergantungan antar class.
    - Unit test yang bagus itu bisa terpredeksi dan cukup melakukan test ke satu function, jika harus melakukan test
      pada interaksi antar class test ataupun class test dengan sofware-software pendukungnya misalnya database,
      lebih disarankan integration test jadi menjalankan testnya setiap bagian dari integrasi aplikasi.
    - Namun bagaimana jika kita harus melakukan test pada class yang ketergantungan dengan class lain, Solusinya adalah
      melakukan mocking terhadap dependency yang dibutuhkan class yang akan kita test. misalnya pada saat kita ingin melakukan
      test pada class test A namun class test A bergantung pada class test B, maka kita dapat membuat mocking pada
      class test B, dimana mocking itu adalah object tiruan dari sebuah class.
    - Sederhananya Mocking adalah object tiruan.
    - Membuat object tiruan dilakukan agar behavior object tersebut bisa kita tentukan sesuai dengan keinginan kita,
      karena ketika membuat object aslinya maka bahavior object tersebut sesuai dengan object aslinya dan tidak bisa diatur.
    - Dengan mocking, kita bisa membuat request responese seolah-olah object tersebut benar dibuat, misalnya pada saat kita
      membuat object mocking kemudian mengirim request ataupun memanggil method kita bisa tentukan ketika memanggil method A
      maka harus return value Data C.

    - Ada banyak framework untuk melakukan mocking, Mockito adalah salah satu mocking framework paling populer di Java,
      dan bisa juga digunakan untuk Kotlin.
    - Mockito bisa diintegrasikan dengan JUnit.
    - Website Mockito 'https://site.mockito.org/'
    - Ketika ingin menggunakan Mockito maka harus menambahkan dependency Mockito.

    - Mocking pada unit test.
        - Mockito memiliki MokitoExtension yang bisa kita gunakan untuk integrasi dengan JUnit. sehingga memudahkan kita dalam
          membuat mock object, kita tidak perlu lagi menggunakan 'Mockito.mock(NamaClass.class)' namun cukup menggunakan
          annotation @Mock namun menambahkan @ExtendWith(MockitoExtension,java), jadi kita cukup bikin attribut/field pada
          class test lalu ditambahkan @Mock maka secara otomatis dia akan di inject sebagai mocking object.

    - Verifikasi di Macking.
        - Ketika melakukan verifikasi terhadap object mocking, maka ketika lupa memanggil method dengan return value, maka
          unit testnya gagal.
        - Bagaimana jika functionnya tidak mengembalikan value (method void).
*/
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
