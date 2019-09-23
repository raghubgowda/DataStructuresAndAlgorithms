package com.raghu.alogirthms.sequencesandnumbers;

class OddEvenSum {
    public static void main(String[] args) {
        int input = 23456;
        System.out.println("Input: " + input);
        calculateOddEvenSum(input);
    }

    private static void calculateOddEvenSum(int n) {
        boolean isOdd = n % 2 == 0;
        int sumOdd = 0, sumEven = 0;

        while (n != 0) {
            if (isOdd) {
                sumOdd += n % 10;
            } else {
                sumEven += n % 10;
            }

            isOdd = !isOdd;
            n /= 10;
        }

        System.out.println("OddSum: "+sumOdd+" EvenSum: "+sumEven);
    }
}