package com.practice;

/**
    - Pada Saat membuat test, kita harus memastikan  bahwa test tersebut sesuai dengan ekspektasi yang kita inginkan.
    - Jika manual, kita dapat melalkukan pengecekan if-else, namun itu tidak direkomendasikan.
    - JUnit memiliki fitur untuk melakukakan assertions, yaitu memastikan bahwa unit test sesuai dengan kondisi yang kita inginkan.
    - Assertions di JUnit di representasikan dalam class Assertions, dan di dalamnya terdapat banyak sekali method static.
    - Banyak sekali method-method static yang dapat digunakan untuk melakukan Assertions, untuk detailnya dapat dikunjungi
      pada halaman : 'https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html'.

    - Pada saat membuat unit test, kita mungkin tidak hanya ingin mengecek kondisi sukses atau gagal, ada kalanya  kita ingin
      melakukan test sebuah exception, Assertions juga bisa digunakan untuk mengecek apakah sebuah exception terjadi.
    - Tidak boleh melakukan throws error dalam unit test, jika melakukan throws error dalam unit test maka unit testnya gagal,
      namun dengan method 'assertThrows' yang ada di class Assertions kita dapat throws error pada unit test.

 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
