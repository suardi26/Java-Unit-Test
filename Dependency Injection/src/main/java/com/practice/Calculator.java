package com.practice;

public class Calculator {
    public Integer add(Integer first, Integer second){
        return first + second;
    }

    public Integer divide (Integer number1, Integer number2){
        if (number2 == 0){
            throw new IllegalArgumentException("Bilangan tidak bisa dibagi 0");
        }else{
            return number1/number2;
        }
    }
}
