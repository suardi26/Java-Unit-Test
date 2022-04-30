package com.practice;

import org.junit.jupiter.api.Test;

public class LifeCycleTest {
    private String product;

    @Test
    void testA(){
        this.product = "Sunco";
    }

    @Test
    void testB(){

        // Hasilnya bukan 'Sunco' namun null karena object dan variabel reference berbeda antara method testA dengan testB.
        System.out.println(this.product);
    }
}
