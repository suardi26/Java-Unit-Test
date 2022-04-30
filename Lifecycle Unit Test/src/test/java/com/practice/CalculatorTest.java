package com.practice;

import org.junit.jupiter.api.*;


@DisplayName("Test Class Calcultor.")
// @TestMethodOrder(value = MethodOrderer.DisplayName.class) untuk sorting method unit test berdasarkan alphanumeric.
// @TestMethodOrder(value = MethodOrderer.Random.class) eksekusi unit test dilakukan secara random.

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class) // maka method tersebut akan dieksekusi
// sesuai value dari annotation @Order().

// By default @TestInstance(value = TestInstance.Lifecycle.PER_METHOD)
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
// Ketika memilih Enum 'PER_CLASS' maka Method unit test akan saling bergantung dengan method unit test yang lain pada
// suatu class yang sama.

public class CalculatorTest {

    private Calculator calculator = new Calculator();
    private int number = 0;

    // Membuat method dengan menggunakan annotation  @BeforeAll dan @AfterAll tanpa keyword static dikarenakan
    // Lifecycle.PER_CLASS.
    @BeforeAll
    public void beforeALl(){

    }
    @AfterAll
    public void afterAll(){

    }

    @Test
    @Order(3)
    public void test3(){
        this.number++;
        System.out.println("Test yang ke-"+this.number);
    }

    @Test
    @Order(2)
    public void test2(){
        this.number++;
        System.out.println("Test yang ke-"+this.number);

    }

    @Test
    @Order(1)
    public void test1(){
        this.number++;
        System.out.println("Test yang ke-"+this.number);

    }
}
