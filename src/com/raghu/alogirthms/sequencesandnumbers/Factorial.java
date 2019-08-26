package com.raghu.alogirthms.sequencesandnumbers;

import java.util.Scanner;

/**
 * Calculates factorial by recursion and iteration approach.
 * @author Raghavendra M Boregowda
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println("Enter input for which factorial to be calculated: ");
        int input = new Scanner(System.in).nextInt();

        //Factorial using recursion
        System.out.println("Factorial of "+input+" using recursion is: "+factorialByRecursion(input));

        //Factorial using iteration
        System.out.println("\nFactorial of "+input+" using iteration is: "+factorialByIteration(input));
    }


    /*
     * Calculate factorial of a number using recursion
     * @return factorial of number
     */
    private static int factorialByRecursion(final int number){
        if(number == 0){
            return 1;
        }
        return number * factorialByRecursion(number - 1);
    }

    /*
     * calculate factorial by iterative approach.
     * @return factorial of number
     */
    private static int factorialByIteration(int number){
        int result = 1;
        while(number != 0){
            result = result*number;
            number--;
        }
        return result;
    }
}
