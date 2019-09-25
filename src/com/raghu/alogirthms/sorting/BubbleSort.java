package com.raghu.alogirthms.sorting;

import java.util.Arrays;

public class BubbleSort {
    static void sort(int[] input, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (input[i] > input[i + 1]) {
                int temp = input[i];
                input[i] = input[i + 1];
                input[i + 1] = temp;
            }
        }
        sort(input, n - 1);
    }

    public static void main(String[] args) {
        int[] input = {23, 45, 11, 20, 7, 65, 2};
        System.out.print("Input : ");
        System.out.println(Arrays.toString(input));

        sort(input, input.length);

        System.out.print("Sorted array : ");
        System.out.println(Arrays.toString(input));
    }
}
