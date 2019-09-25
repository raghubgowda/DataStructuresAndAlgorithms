package com.raghu.util;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {

    public static void print(int[] input){
        System.out.println(Arrays.toString(input));
    }

    public static int[] getRandomArray(final int size, final int max){
        int[] numbers = new int[size];
        Random generator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(max);
        }
        return numbers;
    }
}
