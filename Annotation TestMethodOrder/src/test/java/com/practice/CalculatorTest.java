package com.practice;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;
import java.util.function.BiConsumer;


@DisplayName("Test Class Calcultor.")
// @TestMethodOrder(value = MethodOrderer.DisplayName.class) untuk sorting method unit test berdasarkan alphanumeric.
// @TestMethodOrder(value = MethodOrderer.Random.class) eksekusi unit test dilakukan secara random.

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class) // maka method tersebut akan dieksekusi
// sesuai value dari annotation @Order().
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    @Order(3)
    public void test3(){
        System.out.println("Test yang ke-3");
    }

    @Test
    @Order(2)
    public void test2(){
        System.out.println("Test yang ke-2");
    }

    @Test
    @Order(1)
    public void test1(){
        System.out.println("Test yang ke-1");
    }
}
