package com.practice;

/**
    - Secara default, urutan eksekusi unit test tidak ditentukan, jadi jangan berharap jika sebuah method unit test berada
      diatas method unit test lainnya, maka akan dijalankan lebih dulu.
    - Maka dari itu sebaikanya method unit test itu harus independen, tidak saling ketergantungan.
    - Secara default pun, object class unit test akan selalu dibuat ulang tiap method unit test, jadi jangan berharap kita
      bisa menyimpan data di satu variabel reference untuk digunakan pada banyak method unit test, artinya tiap-tiap method
      unit test memiliki variabel reference dan object sendiri.
    - JUnit mendukung perubahan urutan eksekusi test, dengan menggunakan annotation @TestMethodOrder, ada beberapa cara
      yang bisa dilakukan yaitu :

        - Sorting Alphanumeric, artinya mengurutkan eksekusi unit test berdasarkan alphanumeric.
        - Random, artinya eksekusi unit test dilakukan secara random.
        - OrderAnnotation, artinya urutan eksekusi unit test akan mengikuti annotation @Order yang ada di tiap method unit test.
          jadi tiap method unit test akan ditambahkan annotation @Order, maka method tersebut akan dieksekusi sesuai value dari
          annotation @Order.

    - Ada beberapa class yang implementasi interface MethodOrderer yang digunakan untuk perubahan urutan eksekusi test yaitu :
        - DisplayName.class untuk sorting method unit test berdasarkan alphanumeric.
        - Random.class digunakan untuk eksekusi method unit test dengan urutan random.
        - OrderAnnotation.class digunakan untuk membuat method unit test tersebut akan dieksekusi sesuai value
          dari annotation @Order(). misalnya @Order(1), @Order(2), @Order(3)....@Order(n).
    - Namun Ketika kita ingin membuat cara mengurutkan urutan method unit test, maka dapat dengan mudah membuat class baru yang
      implementasi dari interface MethodOrderer.
*/
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
