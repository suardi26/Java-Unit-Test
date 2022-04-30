package com.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;


import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test Class Calculator (ParameterizedTest)")
public class RandomCalculatorTest {

    // Menggunakan @ValueSource, untuk sumber Number, Char, Boolean, dan String.

        @DisplayName("Test Calculator (ParameterizedTest) I")
        // @Test diganti menjadi @ParameterizedTest
        @ParameterizedTest(name = "{displayName} dengan Parameter {0}")
        @ValueSource(ints = {1, 2, 3, 4}) // Untuk value score yang int maka dapat menggunakan 'ints' dengan value array
        // dan pada @ParameterizedTest dapat dipanggil menggunakan '{0}' untuk mengetahui test keberapa sesuai
        // dengan valuenya serta harus disesuaikan dengan parameter di method unit testnya ketika int parameternya maka
        // @ValueSource juga harus int.
        public void testWithParameter(int value){
            var result = value + value;
            assertEquals(result, new Calculator().add(value, value));
        }

    // Membuat method static tanpa parameter untuk @MethodSource, ketika return valuenya int maka paramter method unit test
    // juga harus int seperti pada method unit test 'testWithMethodSource'.
    public static List<Integer> parameterSource() {
            return List.of(1,2,3,4);
    }

    // @MethodSource, untuk sumber data dari static method.
        @DisplayName("Test Calculator (ParameterizedTest) II")
        @ParameterizedTest(name = "{displayName} dengan Parameter {0}")
        @MethodSource(value = {"parameterSource"})
        public void testWithMethodSource(Integer value){
            var result = value + value;
            assertEquals(result,new Calculator().add(value, value));
        }

}
