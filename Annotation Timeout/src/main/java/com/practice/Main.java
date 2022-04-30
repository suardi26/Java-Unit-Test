package com.practice;

/**
    - Kadang kita ingin memastikan bahwa unit test berjalan tidak lebih dari sekian detik.
    - Misalnya ketika kasus kita ingin memastikan kode program kita mempunyai performa bagus dan cepat.
    - JUnit memiliki fitur timeout, yang berfungsi untuk memastikan bahwa unit test berjalan tidak lebih dari waktu yang
      ditentukan, jika melebihi waktu yang ditentukan, secara otomatis unit test tersebut akan gagal.
    - Kita bisa menggunakan annotatioon @Timeout untuk melakukan hal tersebut.
    - Misalnya :
         @Test
         @Timeout(value = 5, unit = TimeUnit.MILLISECONDS)
         untuk valuenya adalah lama durasi testnya sedangkan unitnya adalah satuan waktunya bisa MILLISECONDS,SECONDS,MINUTES,dll.
         berdasarkan contoh diatas maka, method unit test ini tidak boleh berjalan diatas 5 detik, ketika berjalan diatas 5 detik
         maka testnya akan gagal
*/
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
