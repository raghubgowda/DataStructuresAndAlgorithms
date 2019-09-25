package com.raghu.alogirthms.sorting.test;

import com.raghu.alogirthms.sorting.src.BubbleSort;
import com.raghu.alogirthms.sorting.src.InsertionSort;
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
}