package com.practice;

/**
    - Selain exception TestAbortException digunakan untuk membatalkan unit test, ada juga cara yang lebih mudah yaitu Assumptions.
    - Penggunaan Assumtions mirip seperti Assertions, jika nilainya tidak sama, maka method Assumptions akan Thrown
      TestAbortExceptions, sehingga secara otomatis akan membatalkan unit test yang sedang berajalan.
    - Banyak sekali method-method static yang dapat digunakan untuk melakukan Assumptions.html, untuk detailnya dapat dikunjungi
      pada halaman : 'https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assumptions.html'.
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
