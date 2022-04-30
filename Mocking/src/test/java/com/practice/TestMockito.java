package com.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("TestMockito")
public class TestMockito {

    @Test
    @DisplayName("Test Method 1")
    public void testMockitoMethod(){

        // Membuat Mock Object
        // Dimana ketika membuat object dari Interface List tidak bisa, namun harus dari class yang implementasi dari interface List.
        // Akan tetapi dengan melakukan mock object pada interface List itu dapat dilakukan.
        List<String> list = Mockito.mock(List.class);

        // Menambah Behaviour ke Mock Object
        // dimana ketika mengambil index ke 0 dari data List maka akan mengembalikan data misalnya 'Suardi'
        Mockito.when(list.get(0)).thenReturn("Suardi");
        System.out.println(list.get(0));

        // Test Mock
        assertEquals("Suardi", list.get(0));

        // Verify Mock
        // Untuk melakukan verifikasi berapa kali method yang ditentukan dipanngil.
        // dimana paramter ke-1 yaitu objectnya dan paramter ke-2 value dari berapa kali method dipanggil dan juga ada nama
        // method yang dipanggil. misalnnya method 'get(0)'  dipanggil 2 kali dan ditentukan berbeda yaitu 1 kali maka akan error.
        Mockito.verify(list, Mockito.times(1)).get(0);
    }

}
