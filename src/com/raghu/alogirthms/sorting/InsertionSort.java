package com.raghu.alogirthms.sorting;

import com.raghu.util.ArrayUtils;

import static java.lang.System.out;

public class InsertionSort {
     static void sort(int[] input, int n) {
        if (n <= 1) {
            return;
        }

        sort(input, n - 1);

        int last = input[n - 1];
        int j = n - 2;

        while (j >= 0 && input[j] > last) {
            input[j + 1] = input[j];
            j--;
        }
        input[j + 1] = last;
    }

    public static void main(String[] args) {
        int[] input = ArrayUtils.getRandomArray(8, 25);
        out.print("Given: ");
        ArrayUtils.print(input);

        out.print("Output: ");
        sort(input, input.length);
        ArrayUtils.print(input);

    }
}
