package com.practice;

/**
    - Secara default,JUnit tidak melakukan eksekusi unit test secara pararel, artinya unit test akan dijalankan secara sequential
      satu per satu misalnya di dalam satu class test terdapat 5 method unit test maka dijalankan satu per satu bukan dijalankan
      secara bersamaan.
    - Namun kadang ada kasus kita ingin mempercepat proses unit test sehingga dijalankan secara pararel, hal ini bisa dilakukan
      di JUnit, namun perlu beberapa langkah.
    - Akan tetapi pastikan method unit test kita aman ketika dijalankan secara pararel misalnya method unit test tidak saling
      bergantung satu sama lain melainkan setiap unit test berdiri sendiri (Independent).
    - Untuk membuat JUnit dapat menjalankan unit test secara pararel dapat dilakukan beberapa tahap :

        - Menambah konfigurasi dengan membuat file junit-platform.properties di project dan didalam folder resources, dimana
          folder resources dibuat di dalam folder 'test'. dimana folder resources ini dapat digunakan juga untuk menyimpan
          resources file. lalu menambahkan value : junit.jupiter.execution.parallel.enabled = true. nilai defaultnya
          adalah false sehinnga kita tidak dapat menjalankan unit test secara pararel di JUnit.
        - Setelah itu, agar unit test berjalan pararel, kita perlu menggunakan annotation @Execution sebelum nama classnya,
          lalu memilih jenis execution-nya, misalnya untuk pararel bisa menggunakan ExecutionMode.CONCURRENT.


*/
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
