package com.practice;

import com.resolver.RandomParameterResolver;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test Class Calcultor(Repeated)")
@Extensions(value = {

        @ExtendWith(RandomParameterResolver.class)
})
public class RandomCalculatorTest {

    private Calculator cal = new Calculator();

    // @Test diganti menjadi @RepeatedTest
    @RepeatedTest(
            value = 10, // perulangannya 10 kali.
            name = "{displayName} ke {currentRepetition} dari {totalRepetitions}" // overide displayName.
    )
    @DisplayName("Test Random")
    public void testRandomRepeated(Random random) {
        var number1 = random.nextInt();
        var number2 = random.nextInt();
        assertEquals(number1 + number2, cal.add(number1, number2));

    }

    // Repeated Test menggunakan RepetitionInfo
    @RepeatedTest(
         value = 5, // perulangannya 5 kali.
         name = "{displayName}"
    )
    @DisplayName("Test Random With RepetitionInfo")
    public void testRandomRepeatInfo(TestInfo testInfo, Random random, RepetitionInfo repetitionInfo){
        System.out.println(testInfo.getDisplayName()+" ke "
                +repetitionInfo.getCurrentRepetition()+" dari "
                +repetitionInfo.getTotalRepetitions());
        var number1 = random.nextInt();
        var number2 = random.nextInt();
        assertEquals(number1 + number2, cal.add(number1, number2));
    }
}
