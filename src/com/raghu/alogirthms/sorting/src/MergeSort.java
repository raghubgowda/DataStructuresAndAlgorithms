package com.raghu.alogirthms.sorting.src;

import com.raghu.util.ArrayUtils;

import static java.lang.System.*;
import static java.lang.System.out;

public class MergeSort {
    public static void sort(int[] a, int n) {
        if (n < 2)
            return;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        arraycopy(a, 0, l, 0, mid);

        if (n - mid >= 0){
            arraycopy(a, mid, r, 0, n - mid);
        }

        sort(l, mid);
        sort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    private static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j])
                a[k++] = l[i++];
            else
                a[k++] = r[j++];
        }

        while (i < left)
            a[k++] = l[i++];

        while (j < right)
            a[k++] = r[j++];
    }

    public static void main(String[] args) {
        int[] input = ArrayUtils.getRandomArray(7, 30);
        out.print("Given : ");
        ArrayUtils.print(input);

        out.print("Output : ");
        sort(input, input.length);
        ArrayUtils.print(input);

    }
}
