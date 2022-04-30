package com.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@Tag("integration-test")
@DisplayName("Test Class Calcultor With Tag")
public class TestWithTag {
    private Calculator calculator = new Calculator();

    @Test
    @DisplayName("Test (Skenario Success) Function Calculator.divide(Integer,Integer)")
    public void testDivideSuccess(){
        var result = calculator.divide(25,5);
        assertEquals(5,result);
    }

    @Test
    @DisplayName("integrationTest1")
    public void integrationTest1(){
        System.out.println("Integration Test 1");
    }

    @Test
    @DisplayName("integrationTest2")
    public void integrationTest2(){
        System.out.println("Integration Test 2");
    }
}
