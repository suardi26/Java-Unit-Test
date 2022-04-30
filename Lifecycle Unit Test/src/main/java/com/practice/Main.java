package com.practice;

/**
    - Secara default, lifecycle (siklus hidup) object adalah independent per method test, artinya object unit test akan
      selalu dibuat baru per method unit test, oleh karena itu kita tidak bisa bergantung dari method unit test yang satu
      ke method unit test yang lain.
    - Cara pembuatan object test di JUnit ditentukan oleh annotation @TestInstance, dimana defaultnya adalah
      Lifecycle.PER_METHOD, artinya tiap method unit test akan dibuat sebuah instance / object baru.
    - Kita bisa menggantinya menjadi Lifecycle.PER_CLASS jika mau, dengan demikian instance/object testnya akan dibuat sekali
      per class, dan setiap method unit test pada class yang sama akan menggunakan object test yang sama.
    - Hal ini bisa kita manfaatkan ketika ingin membuat Method unit test yang saling bergantung dengan method unit test yang lain
      pada suatu class yang sama.
    - Salah satu keuntungan saat menggunakan Lifecycle.PER_CLASS adalah kita bisa menggunakan @BeforeALl dan @AfterAll
      pada method biasa, tidak harus menggunakan method static. hal ini disebabkan karena setiap method unit test tidak lagi
      memiliki variabel reference dan object sendiri (independent) sehingga method yang dibuat menggunakan annotation
      @BeforeAll dan @AfterAll tidak lagi static.

*/
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
