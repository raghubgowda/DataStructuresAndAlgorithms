package com.raghu.alogirthms.sequencesandnumbers;
import java.util.Scanner;

/**
 * Generate and print Fibonacci number by both recursion and iterative approaches.
 * Fibonacci number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2
 * first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
 *
 * @author Raghavendra M Boregowda
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Enter number upto which Fibonacci series to print: ");
        int fibonacciLength = new Scanner(System.in).nextInt();

        System.out.println("Fibonacci series upto " + fibonacciLength + " numbers : ");

        System.out.println("\nIterative approach:");
        for (int i = 1; i <= fibonacciLength; i++) {
            System.out.print(fibonacciIterative(i) + " ");
        }

        System.out.println("\n\n\nRecursive approach:");
        for (int i = 1; i <= fibonacciLength; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
    }

    /*
     * Generates Fibonacci number using recursive function.
     * @return Fibonacci number
     */
    private static int fibonacciRecursive(final int fibonacciLength){
        if(fibonacciLength == 1 || fibonacciLength == 2){
            return 1;
        }
        return fibonacciRecursive(fibonacciLength - 1) + fibonacciRecursive(fibonacciLength - 2);
    }

    /*
     * Generates Fibonacci number using iteration.
     * @return Fibonacci number
     */
    private static int fibonacciIterative(final int fibonacciLength){
        if(fibonacciLength == 1 || fibonacciLength == 2){
            return 1;
        }
        int first = 1, second = 1, fibonacci = 1;
        for(int i = 3; i <= fibonacciLength; i++){
            fibonacci = first + second;
            first = second;
            second = fibonacci;
        }
        return fibonacci;
    }
}