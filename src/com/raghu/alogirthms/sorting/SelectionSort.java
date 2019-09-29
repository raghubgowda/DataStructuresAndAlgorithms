package com.raghu.alogirthms.sorting;

class SelectionSort {
    static void sort(int[] actual) {
        for(int i = 0; i < actual.length-1; i++){
            int minElementIndex = i;
            for(int j = i+1; j < actual.length; j++){
                if( actual[minElementIndex] > actual[j]){
                    minElementIndex = j;
                }
            }

            if(minElementIndex != i){
                int temp = actual[i];
                actual[i] = actual[minElementIndex];
                actual[minElementIndex] = temp;
            }
        }
    }
}
