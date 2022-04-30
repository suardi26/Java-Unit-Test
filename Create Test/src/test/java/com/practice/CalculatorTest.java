package com.practice;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAddSucces(){
        var result = calculator.add(10,10);
    }
}
