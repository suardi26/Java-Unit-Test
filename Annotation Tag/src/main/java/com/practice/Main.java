package com.practice;

/**
    - Class atau method unit test bisa kita tambahkan tag(tanda) dengan menggunakan annotation @Tag.
    - Dengan menambahkan tag ke dalam unit test, kita bisa fleksibel ketika menjalankan unit test, bisa memilih tag mana
      yang mau di include atau di exclude.
    - Jika kita menambahkan tag di class di unit test, secara otomatis semua function unit test di dalam class tersebut
      memiliki tag tersebut.
    - Jika ingin menambahkan beberapa tag di suatu class atau function unit test, kita bisa menggunakan annotation @Tags.
    - Memilih Tag Dengan Maven dapat menggunakan perintah : 'mvn test -Dgroups=tag1,tag2,...'
    - Ketika runninng unit test secara default dengan perintah 'mvn test' maka menjalankan seluruh unit test.

*/
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
