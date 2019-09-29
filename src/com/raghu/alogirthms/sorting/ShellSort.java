package com.raghu.alogirthms.sorting;

class ShellSort {
    static void sort(int[] actual) {
        int n = actual.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = actual[i];
                int j = i;
                while (j >= gap && actual[j - gap] > key) {
                    actual[j] = actual[j - gap];
                    j -= gap;
                }
                actual[j] = key;
            }
        }
    }
}
