package com.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Test Class Calcultor With Tag (Method).")
public class TestWIthTagMethod {

    @Test
    @DisplayName("Tag Method")
    @Tag("integration-method")
    public void integrationTest1(){
        System.out.println("Integration Test 1");
    }
}
