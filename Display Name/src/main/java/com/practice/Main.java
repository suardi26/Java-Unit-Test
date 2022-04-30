package com.practice;

/**

    - Di dalam unit test mungkin agak sulit untuk membuat nama method yang merepresentasikan kasus testnya.
    - Untuk itu kita dapat menambahkan deskripsi untuk tiap test, dengan menggunakan annotation @displayName.
    - Dengan menggunakan annotation @DisplayName, kita dapat menambahkan deskripsi unit testnya.
    - Annotation @DisplayName dapat digunakan pada TYPE/Class dan METHOD.
    - Pada Saat method-method di Unit Test sangat banyak maka dapat menggunakan DisplayNameGenerator dan di JUnit mendukung
      pembuatan DisplayName secara otomatis menggunakan generator.
    - yang perlu dilakukan adalah membuat class turunan dari interface DisplayNameGenerator pada unit test,
      lalu menambahkan annotation pada DisplayNameGeneration di test classnya.
    - Ada 3 method yang harus di override dari interface DisplayNameGenerator, untuk lebih jelasnya silahkan buka
      class SimpleDisplayNameGenerator yang ada pada unit test di package 'com.generator'.
        - Method 'generateDisplayNameForClass' untuk membuat generate Display Name pada class di unit test.
        - Method 'generateDisplayNameForMethod' untuk membuat generate Display Name pada Method di unit test.
        - Method 'generateDisplayNameForNestedClass'
    - Pada saat membuat class untuk unit test maka dapat menambahkan annotation
      @DisplayNameGeneration(value = Class yang dibuat untuk menambahkakn Display Name Generator) misalnya
      @DisplayNameGeneration(value = SimpleDisplayNameGenerator)
    - Ketika tidak ingin membuat Class baru yang implementasi dari interface DisplayNameGenerator untuk membuat
      display name generator maka dapat menggunakan beberapa class yang implementasi dari interface DisplayNameGenerator yang
      disediakan oleh JUnit.

    - Menanaktifkan Test.
    - Kadang ada kalanya kita ingin menonaktifkan unit test, misal karena terjadi error di unit test tersebut, dan belum bisa
      diperbaiki.
    - Untuk menonaktifkan unit test bisa saja dengan menghapus annotation @Test, namun jika kita lakukan hal tersebut, kita
      tidak dapat mendeteksi nantinya bahwa ada unit test yang disabled, apalagi unit testnya sangat banyak.
    - Untuk menonaktifkan unit test secara benar, kita bisa menggunakan annotation @Disabled terhadap method unit test yang
      ingin di-disabled.

 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
