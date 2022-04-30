package com.practice;
/**
    - Software Testing.
         - Software Testing adalah salah satu disiplin ilmu dalam software engineering/rekayasa perangkat lunak.
         - Tujuan utama dari software testing adalah untuk memastikan kualitas kode dan aplikasi kita baik, sehingga aplikasi kita
         dapat berjalan dengan baik dan dapat meminimalisasi terjadinya bug.
         - Untuk Ilmu Software testing sangatlah luas, dan salah satu bagian terkecil dari software testing adalah unit testing.

    - Test Pyramid.

             ---UI---
         ----Service-----
     ----------Unit----------

        Secara garis besar software testing dibagi menjadi beberapa bagian dan biasanya digambarkan pada pyramida testing dimana bagian
     bawah itu adalah unit dan testing ini dibuat sebanyak-banyaknya terhadap aplilkasi kita biasanya testing ini diimplementasikan
     dengan unit test, semakin ke bawah eksekusi testingnya semakin cepat namun semakin ke atas eksekusinya semakin lambat dan juga
     dari sisi biaya, semakin ke bawah biaya testingnya semakin sedikit namun semakiin ke atas biayanya semakin banyak. jadi pada
     saat implementasi unit test maka kita implementasi testing yang paling cepat dan murah. jadi diusahakan untuk membuat
     sebanyak-banyaknya implementasi testing menggunakan unit test dikarenakan biayanya murah dan lebih mudah diimplementasikan.

        Setelah unit test maka diatasnya ada service testing (integration test), testing ini akan melakukan test terhadap aplikasi
     kita dan integrasi aplikasi kita dengan sofware-software pendukungnya misalnya database, ataupun service lain yang terintegrasi
     dengan aplikasi kita, service testing ini berada ditengah-tengah piramida sehingga biayanya tidak mahal ataupun tidak murah,
     dan eksekusi testingnya tidak yang tercepat namun tidak yang terlambat.

        setelah service testing maka diatanya ada UI testing (end to end test) jadi UI testing akan melakukan test dari ujung depan
     ke ujung akhir dan di test secara flow dari UI-nya, UI testing adalah testing yang paling lambat eksekusinya/pengerjaannya
     dan yang paling mahal biayanya contohnya pada saat membuat aplikasi web maka kita harus menyediakan server untuk automation
     webnya.

        dari piramida diatas testing paling bawah atau unit test diusahakan dibuat sebanyak-banyaknya sehingga makin keatas tidak
     perlu dibuat terlalu banyak testing, misalkan untuk skenario errornya dikerjakan pada Unit test sehingga lebih murah dan cepat.

    - UI Test (End To End Test).
        UI Test adalah test yang dilakukan menyeluruh atau dari ujung depan ke ujung akhir, jadi testing ini membuat program yang
     bertindak sebagai user dan mengecek semua flow dari frontend, sampai ke backend hingga service-service yang terintegrasi
     dengan aplikasi kita. Karena testing ini melakukan test secara menyeluruh dan sistem harus berjalan secara bersamaan pada
     saat melakukan test untuk itu testing ini paling mahal biayanya.

     - Service Test (Integration Test).
        Service Test adalah test yang biasanya dilakukan di back-end dan tidak melakukan test secara menyeluruh namun mengerjakan
     testnya setiap bagian dari integrasi aplikasi dengan software pendukungnya misalnya database atau service lain yang
     terhubung dengan aplikasi kita. Jadi service test mengerjakan satu persatu proses integrasi software pendukung dengan aplikasi
     kita, hal ini mengakibatkan biayanya lebih murah dibanding dengan UI testing.

     - Unit Test.
        Pada saat membuat aplikasi, maka aplikasi tersebut terbagi dalam beberapa bagian yaitu layer atau class. Unit test adalah
     melakukan testing ke kompenen terkecil dari aplikasi yaitu layer/class. Misalnya kita membuat class Controller maka kita
     akan membuat unit test Controller atau kita membuat class Service maka kita akan membuat unit test Service. jadi fokus dari
     unit test yaitu melalukan test di bagian terckecil di dalam aplikasi kita, sehingga biayanya paling murah dan untuk melakukan
     testing unit test terbilang mudah karena kita cukup menjalankan unit test dari aplikasi kita tanpa harus menjalankan
     aplikasinya. Dan meskipun aplikasi connect ke database namun ketika melakukan unit test tidak dibutuhkan ke database.

 - Unit Test.
     - Unit test akan fokus menguji bagian kode program terkecil, biasanya menguji sebuah class dan method.
     - Unit test biasanya dibuat kecil dan cepat, oleh karena itu biasanya koadang kode unit test lebih banyak dari kode program
       aslinya, karena semua skenario pengujian akan dicoba di unit test misalnya membuat suatu method maka unit testnya dibuat
       berbagai skenario contohnya skenario berhasil, gagal, dll sesuai kebutuhan pengujian.
     - Unit test bisa digunakan sebagai cara untuk meningkatkan kualitas program.

 - JUnit.
     - Junit adalah test framework yang paling populer di Java.
     - Untuk implementasi unit test tidak bisa menggunakan bawaan java karena bawaan java tidak terdapat tasting frameworknya
       namun memerlukan library.
     - Library yang digunakan untuk melakukan unit test adalah JUnit & TestNG.
     - Untuk JUnit 5 membutuhkan java minimal versi 8.
     - Untuk detail mengenai JUnit dapat mengujungi halaman 'https://junit.org'.

 - Membuat Project menggunakan Maven.
     - mvn archetype:generate.
     - maven-archetype-quickstart.
*/
public class JUnit {
    public static void main(String[] args) {

    }
}
