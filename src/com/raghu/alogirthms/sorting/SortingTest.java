package com.raghu.alogirthms.sorting;

import org.junit.Assert;
import org.junit.Test;


public class SortingTest {

    private int[] actual = {23, 4, 2, 78, 14, 98, 8};
    private int[] expected = {2, 4, 8, 14, 23, 78, 98};

    @Test
    public void testBubbleSort() {
        BubbleSort.sort(actual, actual.length);
        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void testInsertionSort() {
        InsertionSort.sort(actual, actual.length);
        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void testMergeSort() {
        MergeSort.sort(actual, actual.length);
        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void testSelectionSort(){
        SelectionSort.sort(actual);
        Assert.assertArrayEquals(actual, expected);
    }
}