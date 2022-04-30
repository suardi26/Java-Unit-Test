package com.practice;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("A Queue")
public class QueueTest {

    private Queue<String> queue;

    @Nested
    @DisplayName("WhenNew")
    public class WhenNew {

        @BeforeEach
        public void setUp(){
            queue = new LinkedList<>();
        }

        @Test
        @DisplayName("When Offer, size must be 1") // Ketika menambahkan data ukurannya harus 1.
        void offerNewData(){
            queue.offer("Suardi");
            Assertions.assertEquals(1,queue.size());
        }

        @Test
        @DisplayName("When Offer 2 Data, size must be 2") // Ketika menambahkan data ukurannya harus 2.
        void offerMoreData(){
            queue.offer("Mike");
            queue.offer("Arjen");
            Assertions.assertEquals(2, queue.size());
        }
    }


}
