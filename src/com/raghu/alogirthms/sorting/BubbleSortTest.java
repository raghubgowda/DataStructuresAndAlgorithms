package com.raghu.alogirthms.sorting;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


public class BubbleSortTest {

    private int[] numbers;
    private final static int SIZE = 7;
    private final static int MAX = 20;

    @Before
    public void setUp() {
        generateRandomArray();
    }

    private void generateRandomArray() {
        numbers = new int[SIZE];
        Random generator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(MAX);
        }
    }

    @Test
    public void testBubbleSort() {
        long startTime = System.currentTimeMillis();

        BubbleSort.sort(numbers, numbers.length);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("BubbleSort " + elapsedTime);

        verifySort();

    }

    private void verifySort() {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                fail("Should not happen");
            }
        }
        assertTrue(true);
    }

    @Test
    public void itWorksRepeatably() {
        for (int i = 0; i < 200; i++) {
            generateRandomArray();
            BubbleSort.sort(numbers, numbers.length);
            verifySort();
        }
    }

    @Test
    public void testStandardSort() {
        long startTime = System.currentTimeMillis();
        Arrays.sort(numbers);
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Standard Java sort " + elapsedTime);

        verifySort();
    }
}