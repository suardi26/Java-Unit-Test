package com.practice;

/**
    - Pada fitur interface TestInfo merupakan bagian dari dependency injection di JUnit.
    - Dependency Injection sederhananya adalah bagaimana kita bisa memasukkan dependency (object/instance) ke dalam unit test
      secara otomatis tanpa harus manual.
    - Saat kita menambahkan parameter di method unit test, sebenarnya kita bisa secara otomatis memasukan parameter tersebut
      dengan bantuan ParameterResolver.
    - Dan parameter yang di tambahkan dengan bantuan ParameterResolver dapat lebih dari satu pada method test dan posisinya
      bebas tidak ada paremter tertentu yang harus diawal atau pun diakhir.
    - Contohnya  ParameterResolver 'TestInfo testInfo', sebenarnya objectnya dibuat oleh TestInfoParameterResolver, karena
      tanpa object yang mengisi parameter method unit test maka tidak akan dapat di eksekusi.
    - Kita dapat juga membuat dependency injection secara manual misalnya membuat dependency injection untuk inject data
      random (Membuat data random).
    - Dan ketika implements interface ParameterResolver maka harus implementasi 2 method yaitu :

        - Method supportsParameter: boolean, dan untuk parameternya dikarenakan ingin membuat data random dari Class
          java.util.Random maka parameter method supportsParameter adalah
          'return parameterContext.getParameter().getType() == Random.class'

        - Method resolveParameter: Object, dan untuk parameternya adalah object dari class java.util.Random.

    - Untuk menggunakan parameter resolver yang sudah kita buat sendiri, kita bisa menggunakan
      annotation @ExtendWith di test class berbeda dengan parameter resolver TestInfo yang bawaan dari JUnit-nya sehingga
      kita tidak perlu lagi menambahkan @ExtendWith di test classnya.
    - Namun jika lebih dari 1 parameter resolver, kita dapat menggunakan @Extentions.

 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
