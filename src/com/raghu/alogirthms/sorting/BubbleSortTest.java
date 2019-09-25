package com.raghu.alogirthms.sorting;

import org.junit.Assert;
import org.junit.Test;


public class BubbleSortTest {

    @Test
    public void testPositive() {
        int[] actual = {23, 4, 2, 78, 14, 98, 8};
        int[] expected = {2, 4, 8, 14, 23, 78, 98};
        BubbleSort.sort(actual, actual.length);
        Assert.assertArrayEquals(actual, expected);
    }
}