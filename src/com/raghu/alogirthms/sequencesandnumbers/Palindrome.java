package com.raghu.alogirthms.sequencesandnumbers;

import java.util.Scanner;

/**
 * Checks if a given number is palindrome or not.
 * @author Raghavendra M Boregowda
 */
public class Palindrome {
    public static void main(String[] args){

        System.out.println("Please Enter a number : ");
        int palindrome = new Scanner(System.in).nextInt();

        if(isPalindrome(palindrome)){
            System.out.println("Number : " + palindrome + " is a palindrome");
        }else{
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }

    }

    /*
     * @returns true if the given number is a palindrome. Otherwise returns false.
     */
    private static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        return number == reverse;
    }
}
