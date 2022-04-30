package com.practice;

import com.resolver.RandomParameterResolver;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;


import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Test Class Calcultor.")
@Extensions(value = {

        @ExtendWith(RandomParameterResolver.class)
})

public class RandomCalculatorTest {

    private Calculator cal = new Calculator();

    @Test
    @DisplayName("Test Random")
    //public void testRandom(Random random, TestInfo testInfo){ // bisa lebih dari satu parameter.
    public void  testRandom(Random random){
        var number1 = random.nextInt();
        var number2 = random.nextInt();
        assertEquals(number1 + number2, cal.add(number1, number2));

    }
}
