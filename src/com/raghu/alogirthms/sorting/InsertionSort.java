package com.raghu.alogirthms.sorting;

import java.util.Arrays;

public class InsertionSort {
    private static void insertionSortRecursive(int[] input, int n) {
        if (n <= 1) {
            return;
        }

        insertionSortRecursive(input, n - 1);

        int last = input[n - 1];
        int j = n - 2;

        while (j >= 0 && input[j] > last) {
            input[j + 1] = input[j];
            j--;
        }
        input[j + 1] = last;
    }

    public static void main(String[] args) {
        int[] input = {23, 45, 11, 20, 7, 65, 2};
        System.out.print("Input : ");
        System.out.println(Arrays.toString(input));

        insertionSortRecursive(input, input.length);

        System.out.print("Sorted array : ");
        System.out.println(Arrays.toString(input));
    }
}
