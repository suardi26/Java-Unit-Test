package com.practice;

/**
 - Sebenarnya kita bisa menggunakan Assumtions untuk menjalankan unit test berdasarkan kondisi tertentu.
 - Namun JUnit menyediakan fitur yang lebih mudah untuk pengecekan beberapa kondisi, seperti kondisi sistem operasi,
   versi java, system property atau environment variable.
 - Ini lebih mudah dibandingkan menggunakan Assumtions.

    - Kondisi Sistem Operasi.
      Untuk kondisi sistem operasi, kita bisa menggunakan beberapa annotation. misalnya :
        - @EnabledOnOs digunakan untuk penanda bahwa unit test boleh berjalan di sistem operasi yang ditentukan.
        - @DisabledOnOs digunakan untuk penanda bahwa unit test tidak boleh berjalan di sistem operasi yang ditentukan.
      Untuk Annotation @EnabledOnOs & @DisabledOnOs valuenya boleh dari satu sistem operasi, hal ini disebabkan valuenya
      adalah array.

    - Kondisi Versi Java.
      Untuk Kondisi versi Java yang kita gunakan, kita bisa menggunakan beberapa annotation, misalnya :
        - @EnabledOnJre digunakan untuk penanda bahwa unit test boleh berjalan di Java versi tertentu.
        - @DisabledOnJre digunakan untuk penanda bahwa unit test tidak boleh berjalan di Java versi tertentu.
        - @EnabledForJreRange digunakan untuk penanda bahwa unit test boleh berjalan di range Java versi tertentu.
        - @DisabledForJreRange digunakan untuk penanda bahwa unit test tidak boleh berjalan di range Java versi tertentu.
      Untuk Annotation @EnabledOnJre, @DisabledOnJre valuenya boleh dari satu versi java , hal ini disebabkan valuenya
      adalah array.

    - Kondisi System Property
      - Untuk kondisi nilai dari system property, kita bisa menggunakan beberapa annotation.
      - @EnabledIfSystemProperty untuk penanda bahwa unit test boleh berjalan jika system property sesuai dengan yang ditentukan.
      - @DisabledIfSystemProperty untuk penanda bahwa unit test tidak boleh berjalan jika system property sesuai dengan yang
        ditentukan.
      - Jika kondisinya lebih dari satu, dapat menggunakan @EnabledIfSystemProperties dan @DisabledIfSystemProperties.

    - Kondisi Environment variable
      - Untuk kondisi nilai dari environment vaeiable, kita bisa menggunakan beberapa annotation.
        - @EnabledIfEnvironmentVariable untuk penanda bahwa unit test boleh berjalan jika environment variable sesuai dengan
          yang ditentukan.
        - @DisabledIfEnvironmentVariable untuk penanda bahwa unit test tidak boleh berjalan jika environment variable sesuai
          dengan yang ditentukan.
        - Namun ketika kondisinya lebih dari satu, kita bisa menggunakan @EnabledIfEnvironmentVariaables dan
          @DisabledIfEnvironmentVariables.
*/
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
