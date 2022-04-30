package com.practice;

/**
   - Pada saat membuat unit test, ada baiknya ukuran test classnya tidak terlalu besar, karena akan sulit dibaca dan dimengerti.
   - Jika test class sudah semakin besar, ada baiknya kita pecah menjadi beberapa test class, lalu kita grouping sesuai dengan
     jenis method testnya.
   - JUnit mendukung pembuatan class test di dalam class test, jadi kita bisa memecah sebuah class test, tanpa harus membuat
     class di file yang berbeda, kita cukup menggunakan inner class.
   - Untuk memberi tahu bahwa inner class tersebut adalah test class, kita dapat menggunakan annotation @Nested.
*/
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
