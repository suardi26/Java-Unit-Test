package com.practice;

import org.junit.jupiter.api.*;



@DisplayName("Test Class Calcultor.")

public class CalculatorTest {

    @Test
   @Tags({
           @Tag("TestInformation"),
           @Tag("TestMethod"),
           @Tag("TestClass")
   })
    @DisplayName("Method Information Test")
    public void informationTest(TestInfo testInfo){
        System.out.println("Display Name : "+testInfo.getDisplayName());
        System.out.println("Tags         : "+testInfo.getTags());
        System.out.println("Method Test  : "+testInfo.getTestMethod().orElse(null));
        System.out.println("Class Test   : "+testInfo.getTestClass().orElse(null));

    }
}
