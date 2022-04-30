package com.practice;


import com.resolver.RandomParameterResolver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;


@Extensions( value = {

        @ExtendWith(RandomParameterResolver.class)

})
@DisplayName("Parent Test Class Calcultor.")
public class ParentCalculatorTest {

    protected Calculator cal = new Calculator();

    @BeforeEach
    public void setUp(){
        System.out.println("Before Each");
    }
}
