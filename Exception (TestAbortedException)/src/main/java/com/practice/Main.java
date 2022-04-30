package com.practice;

/**
 - Kadang kita ingin membatalkan unit test ketika kondisi tertentu terjadi.
 - Untuk membatalkan unit test dalam JUnit, kita bisa Throws Exception dengan menggunakan exception TestAbortedExeception.
 - Jika JUnit mendapatkan exception TestAbortedException, secara otomatis test tersebut akan dibatalkan/di-ignore.
 - jadi ketika JUnit mendapatkan exception selain TestAbortedException maka secara default unit testnya akan error namun
   special case ketika exceptionnya TestAbortedException maka unit testnya akan dibatalkan.
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
