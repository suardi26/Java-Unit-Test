package com.practice;

import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@DisplayName("Test Class Calcultor.")
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAllMethod(){
        System.out.println("Code akan dieksekusi sekali sebelum semua unit test berjalan (BeforeAll)");
    }
    @AfterAll
    public static void afterAllMethod(){
        System.out.println("Code akan dieksekusi sekali sesudah semua unit test berjalan (AfterAll)");
    }

    @BeforeEach
    public void beforeEachMethod(){
        System.out.println("Code akan dieksekusi sebelum unit test (BeforeEach)");
    }
    @AfterEach
    public void afterEachMethod(){
        System.out.println("Code akan dieksekusi sesudah unit test (AfterEach)");
    }

    @Test
    @DisplayName("Test (Skenario Success) Function Calculator.add(Integer,Integer)")
    public void testAddSuccess(){
        var result = calculator.add(10,10);

         // Cara manual membuat unit test.
         // Cara manual akan memakan waktu yang lama sehingga tidak disarankan.
         // if(result != 20){
         //  throw new RuntimeException("Test Gagal");
         // }

        // Menggunakan Assertions pada unit test menggunakan method 'assertEquals()' yang membandingkan parameter pertama
        // yaitu nilai ekspektasi dan parameter kedua merupakan nilai hasil operasi dari method yang dibuat.
        assertEquals(20, result);
        // dan masih banyak method static yang ada pada class Assertions yang dapat diguanakan untuk detailnya silahkan
        // di buka class Assertions.

    }

    @Test
    @DisplayName("Test (Skenario Success) Function Calculator.divide(Integer,Integer)")
    public void testDivideSuccess(){
        var result = calculator.divide(25,5);
        assertEquals(5,result);
    }

    @Test
    @DisplayName("Test (Skenario Failed) Function Calculator.divide(Integer,Integer)")
    public void testDivideFailed(){

        // Menggunakan Assertions pada unit test menggunakan method 'assertThrows()' yang digunakan untuk melakukan
        // throws error dalam unit test, karena ketika tidak menggunakan method 'assertThrows()' dari class Assertions
        // saat melakukan throws error pada unit test maka akan error. Ketika menggunakan method 'assertThrows()' maka isi
        // dari kode program harus throws error, ketika tidak throws error maka akan error.
        assertThrows(IllegalArgumentException.class, () -> {

            // Ekspektasi adalah 'IllegalArgumentException' yang ditentukan pada method 'divide' dari class 'Calculator' ketika
            // penyebut bernilai 0.
            var result = calculator.divide(6, 0);

            // namun ketika penyebut tidak bernilai dengan 0 berarti tidak ada thrown exception 'IllegalArgumentException'
            // sedangkan pada ekspektasi ada thrown exception 'IllegalArgumentException' pada paremeter method 'assertThrows'
            // diatas sehingga ketika penyebut bukan 0 maka akan error.
            // var result = calculator.divide(6,3);// ERROR!!!
        });

    }

    @Test
    @Disabled
    @DisplayName("Test UpComming")
    public void testComingSoon(){
        System.out.println("Next Month !!!!!");
    }

    @Test
    @DisplayName("Test Aborted")
    public void testAborted(){
        var profile = System.getenv("PROFILE");
        if (!"DEV".equals(profile)){
            throw new TestAbortedException("Test Gagal !!!");
        }
    }

}
