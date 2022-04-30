package com.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

@DisplayName("CalculatorSpeedTestSequential")
public class CalculatorSpeedTestSequential {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    // untuk valuenya adalah lama durasi testnya sedangkan unitnya adalah satuan waktunya bisa MILLISECONDS,SECONDS,MINUTES,dll.
    // berdasarkan contoh diatas maka, method unit test ini tidak boleh berjalan diatas 5 detik, ketika berjalan diatas 5 detik
    // maka testnya akan gagal
    public void speed1() throws InterruptedException{
        Thread.sleep(3_000);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void speed2() throws InterruptedException{
        Thread.sleep(3_000);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void speed3() throws InterruptedException{
        Thread.sleep(3_000);
    }
}
