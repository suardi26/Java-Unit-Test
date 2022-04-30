package com.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;
import java.util.function.BiConsumer;


@DisplayName("Test Class Calcultor.")
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    // Kondisi Sistem Operasi (System Operasi yang digunakan adalah windows).
        @Test
        @DisplayName("EnabledOnOs")
        @EnabledOnOs(value = {OS.WINDOWS,OS.SOLARIS})
        public void onlyRunWindows(){
            System.out.println("test ini hanya dapat berjalan pada OS WINDOWS dan OS SOLARIS.");
        }

        @Test
        @DisplayName("DisabledOnOS")
        @DisabledOnOs(value = {OS.WINDOWS,OS.SOLARIS})
        public void disabledRunOnWindows(){
            System.out.println("test ini tidak dapat berjalan pada OS Windows dan OS SOlARIS");
        }

    // Kondisi Versi Java (java yang digunakan adalah versi 17.0.1).
        @Test
        @DisplayName("EnabledOnJre")
        @EnabledOnJre(value = {JRE.JAVA_15,JRE.JAVA_17})
        public void onlyRunJava15And17(){
            System.out.println("Test ini hanya dapat berjalan pada Java versi 15 dan 17");
        }

        @Test
        @DisplayName("DisabledOnJre")
        @DisabledOnJre(value = {JRE.JAVA_15,JRE.JAVA_17})
        public void disabledRunOnJava15And17(){
            System.out.println("Test ini hanya dapat berjalan pada Java versi 15 dan 17");
        }

        @Test
        @DisplayName("EnabledForJreRange")
        @EnabledForJreRange(min = JRE.JAVA_15, max = JRE.JAVA_17)
        public void onlyRunRangeJava15To17(){
            System.out.println("Test ini hanya dapat berjalan pada Java mulai versi 15 sampai 17");
        }

        @Test
        @DisplayName("DisabledForJreRange")
        @DisabledForJreRange(min = JRE.JAVA_15, max = JRE.JAVA_17)
        public void disabledRunRangeJava15To17(){
            System.out.println("Test ini tidak dapat berjalan pada Java mulai versi 15 sampai 17");
        }

     // Kondisi System Property.
        @Test
        @DisplayName("System Properties")
        public void testSystemProperties(){
            Properties properties = System.getProperties();
            properties.forEach(new BiConsumer<Object, Object>() {
                @Override
                public void accept(Object key, Object value) {
                    System.out.println(key + " : " + value);
                }
            });
        }

        @Test
        @DisplayName("EnabledIfSystemProperty")
        @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
        public void enableOnVendorOracle(){
            System.out.println("Unit Test akan berjalan ketika System properties 'java.vendor' valuenya adalah " +
                    "Oracle Corporation");
        }

        @Test
        @DisplayName("DisabledIfSystemProperty")
        @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
        public void disableOnVendorOracle(){
            System.out.println("Unit Test tidak akan berjalan ketika System properties 'java.vendor' valuenya adalah " +
                    "Oracle Corporation");
        }

        @Test
        @DisplayName("EnabledIfSystemProperties")
        @EnabledIfSystemProperties({
                @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation"),
                @EnabledIfSystemProperty(named = "os.arch", matches = "amd64")
        })
        public void enableOnVendorAndOsArch(){
            System.out.println("Unit Test akan berjalan ketika System properties 'java.vendor' valuenya adalah " +
                    "Oracle Corporation dan 'os.arch' valuenya adalah amd64");
        }

        @Test
        @DisplayName("DisabledIfSystemProperties")
        @DisabledIfSystemProperties({
                @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation"),
                @DisabledIfSystemProperty(named = "os.arch", matches = "amd64")
        })
        public void DisabledOnVendorAndOsArch(){
            System.out.println("Unit Test tidak akan berjalan ketika System properties 'java.vendor' valuenya adalah " +
                    "Oracle Corporation dan 'os.arch' valuenya adalah amd64");
        }

    // Kondisi System Property.
        @Test
        @DisplayName("EnabledIfEnvironmentVariable")
        @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "donatello")
        public void enableOnEnvVarUsername(){
            System.out.println("Unit Test akan berjalan ketika Terdapat environment variable 'USERNAME' dan valuenya adalah " +
                    "donatello");
        }

        @Test
        @DisplayName("DisabledIfEnvironmentVariable")
        @DisabledIfEnvironmentVariable(named = "USERNAME", matches = "donatello")
        public void disableOnEnvVarUsername(){
            System.out.println("Unit Test Tidak akan berjalan ketika Terdapat environment variable 'USERNAME' dan " +
                    "valuenya adalah donatello");
        }

        @Test
        @DisplayName("EnabledIfEnvironmentVariables")
        @EnabledIfEnvironmentVariables({
                @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "donatello"),
                @EnabledIfEnvironmentVariable(named = "OS", matches = "Windows_NT")

        })
        public void enableOnEnvVarUsernameAndOS(){
            System.out.println("Unit Test akan berjalan ketika Terdapat environment variable 'USERNAME' dan valuenya adalah " +
                    "donatello");
            System.out.println("Serta environment variable 'OS' dan valuenya adalah Windows_NT");
        }

    @Test
    @DisplayName("EnabledIfEnvironmentVariables")
    @DisabledIfEnvironmentVariables({
            @DisabledIfEnvironmentVariable(named = "USERNAME", matches = "donatello"),
            @DisabledIfEnvironmentVariable(named = "OS", matches = "Windows_NT")

    })
    public void disableOnEnvVarUsernameAndOS(){
        System.out.println("Unit Test tidak akan berjalan ketika Terdapat environment variable 'USERNAME' dan valuenya adalah " +
                "donatello");
        System.out.println("Serta environment variable 'OS' dan valuenya adalah Windows_NT");
    }
}
