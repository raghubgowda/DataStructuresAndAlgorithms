package com.raghu.util;

import java.util.*;

public class ArrayUtils {

    public static void print(int[] input){
        System.out.println(Arrays.toString(input));
    }

    public static int[] getRandomArray(final int size, final int max){
        Set<Integer> uniques = new LinkedHashSet<>(size);
        Random generator = new Random();
        for (int i = 0; i < size; i++) {
            uniques.add(generator.nextInt(max) + 1);
        }

        return uniques.stream().mapToInt(i->i).toArray();
    }
}
