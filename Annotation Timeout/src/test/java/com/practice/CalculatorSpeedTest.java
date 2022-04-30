package com.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

@DisplayName("CalculatorSpeedTest Class")
public class CalculatorSpeedTest {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    // untuk valuenya adalah lama durasi testnya sedangkan unitnya adalah satuan waktunya bisa MILLISECONDS,SECONDS,MINUTES,dll.
    // berdasarkan contoh diatas maka, method unit test ini tidak boleh berjalan diatas 5 detik, ketika berjalan diatas 5 detik
    // maka testnya akan gagal
    public void speed() throws InterruptedException{
        // Method unit test akan di berhentikan selama 10.000 Milliseconds (10 detik), sehingga seharusnya method unit test ini
        // akan gagal.
        Thread.sleep(10_000);
    }
}
