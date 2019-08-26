package com.raghu.alogirthms.sequencesandnumbers;

import java.util.Scanner;

/**
 * Checks if a given number is palindrome or not.
 * @author Raghavendra M Boregowda
 */
public class Palindrome {
    public static void main(String[] args){

        System.out.println("Please Enter a number : ");
        String input = new Scanner(System.in).next();
        boolean isPalindrome;

        try{
            int intPalindrome = Integer.parseInt(input);
            isPalindrome = isPalindrome(intPalindrome);
        }
        catch (NumberFormatException nfe){
            //Input is not a number. So assuming it be a string
            isPalindrome = isPalindrome(input);
        }

        if(isPalindrome){
            System.out.println(input + " is a palindrome");
        }
        else{
            System.out.println(input + " is not a palindrome");
        }
    }

    /*
     * @returns true if the given number is a palindrome. Otherwise returns false.
     */
    private static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome > 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        return number == reverse;
    }

    /*
     * @returns true if the given string is a palindrome. Otherwise returns false.
     */
    private static boolean isPalindrome(final String input) {
        char[] chars = input.toCharArray();
        int len = chars.length;
        for(int i = 0; i < len/2; i++){
            if(chars[i] != chars[(len - 1) - i]){
                return false;
            }
        }
        return true;
    }
}
