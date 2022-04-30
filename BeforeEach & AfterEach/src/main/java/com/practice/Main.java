package com.practice;

/**

 - Kadang kita ingin menjalankan kode yang sama sebelum dan setelah eksekusi Unit Test, di setiap method Unit Test.
 - Hal ini sebenarnya bisa dilakukan secara manual di method @Test nya, namun hal ini akan membuat kode yang sama (duplikat)
   pada setiap method unit test, sehingga kode program akan sangat banyak.
 - JUnit memilki annotation @BeforeEach Dan @AfterEach.
 - @BeforeEach digunakan untuk menandai function yang akan dieksekusi sebelum unit test dijalankan.
 - @AfterEach digunakan untuk menandai function yang akan dieksekusi setelah unit test dijalankan.
 - Namun perlu diingat bahwa method dengan kedua annotation tersebut akan dieksekusi setiap kali untuk function @Test, bukan
   sekali untuk class test saja, jadi misalnya di dalam suatu class ada 10 unit test dengan method @Test maka method dengan
   annotation @BefareEach atau @AfterEach akan dieksekusi sebanyak 10 kali juga.
 - Untuk penempatan method-method yang akan menggunakan annotation @BefareEach atau @AfterEach biasanya di tempat paling atas,
   sebelum method unit test di tambahkan.
 - Untuk modifier dari method yang menggunakan annotation @BefareEach atau @AfterEach adalah public.

 - @BeforeEach & @AfterEach akan dieksekusi setiap kali function @Test berjalan.
 - Namun kadang kita ingin melakukan sesuatu sebelum semua unit test berjalan, atau setelah semua unit test berjalan dan akan
   dieksekusi hanya sekali, hal tersebut bisa dilakukan menggunakan annotation @BeforeAll dan @AfterAll.
 - Namun hanya static function yang bisa menggunakan @BeforeAll dan @AfterAll.


 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
