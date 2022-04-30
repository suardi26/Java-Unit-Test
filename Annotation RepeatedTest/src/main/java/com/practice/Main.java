package com.practice;

/**
    - JUnit mendukung juga eksekusi unit test berulang kali sesuai dengan jumlah yang kita tentukan.
    - JUnit mengulang wksekusi unit test, kita bisa menggunakan annotation @RepeatedTest di method unit testnya dan annotation
      ini juga merupakan pengganti dari annotation @Test yang menjalankan method unit test sekali, namun pada annotation
      @RepeatedTest digunakan untuk menjalankan method unit test berkali-kali sesuai dengan jumlah yang kita mau.

    - @RepeatedTest memiliki 'value' yang digunakan untuk menampung jumlah perulangan yang dimasukan.
    - @RepeatedTest juga dapat digunakan untuk mengubah detail nama unit test-nya (Override displayName) dengan mengisi
      'name' dapat juga dikombinasikan dengan perinitah berikut:
      - {displayName} untuk mendapatkan display name dari running unit test.
      - {currentRepetition} untuk mendapatkan perulangan ke berapa saat ini dari running method unit test.
      - {totalRepetitions} untuk mendapatkan total perulangan dari running method unit test.
    - Untuk mendapatkan informasi dari @RepetedTest didalam isi body methodnya dapat menggunakan object RepetitionInfo yang
      di inject oleh class RepetitionInfoParamterResolver, sehingga kita bisa mendapatkan informasi RepetitionInfo melalui
      parameter method unit test.
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
