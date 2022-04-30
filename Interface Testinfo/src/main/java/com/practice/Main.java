package com.practice;

/**
    - Walaupun mungkin jarang digunakan, tapi kita juga bisa mendapatkan informasi test yang sedang berjalan menggunakan
      interface TestInfo.
    - Kita bisa menambahkan TestInfo sebagai parameter di method unit test maka secara otomatis JUnit memasukan data test
      informasinya kedalam object parameter tersebut, dengan kata lain informasi method unit testnya di kirim melalui argument
      yang diisi pada paramter method unit test.
    - Informasinya dapat berupa :
        - getDisplayName(), digunakan Untuk mendapatkan display name method unit test.
        - getTags(), digunakan untuik mendapatkan Tags dari methods unit test.
        - getTestClass() : Optional<Class<?>>, digunakan untuk mendapatkan Class testnya.
        - getTestMehtod() : Optional<Method>, digunakan untuk mendapatkan Method unit testnya.

*/
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
