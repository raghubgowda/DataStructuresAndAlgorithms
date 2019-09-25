package com.raghu.alogirthms.sorting.src;

import com.raghu.util.ArrayUtils;
import static java.lang.System.out;

public class BubbleSort {
    public static void sort(int[] input, int n) {
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
        int[] input = ArrayUtils.getRandomArray(6, 20);
        out.print("Input: ");
        ArrayUtils.print(input);

        out.print("Output: ");
        sort(input, input.length);
        ArrayUtils.print(input);

    }
}
