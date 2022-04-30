package com.practice;

/**
    - JUnit mendukung pewarisan di test, artinya jika kita membuat class ateu interface dan menambahkan informasi test disitu,
      maka ketika kita membuat turunannya, secara otomatis semua fitur testnya dimiliki oleh turunannya.
    - jadi apapun yang ada di parentnya akan diturunkan pada childnya misalnya method dengan Annotation @BeforeAll, @AfterAll,
      @BeforeEach, @AfterEach dan juga @Extensions ParameterResolver pada superclass.
    - Ini sangat berguna ketika terdapat kasus sering membuat code sebelum dan setelah test yang akan berulang-ulang
      pada setiap class test, sehingga dibanding dibuat di semua test class, lebih baik dibuat sekali di parent class test,
      dan class test lainnya tinggal menjadi child class dari parent test class.
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
