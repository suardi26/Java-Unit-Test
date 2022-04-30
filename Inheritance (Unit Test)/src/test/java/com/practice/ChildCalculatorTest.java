package com.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Child Test Class Calcultor.")
public class ChildCalculatorTest extends ParentCalculatorTest{

    @Test
    public void testRandom(Random random){
        var a = random.nextInt();
        var b = random.nextInt();
        assertEquals(a + b, cal.add(a,b));
    }
}
