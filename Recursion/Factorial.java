package Recursion;

// Factorial of a non-negative integer n
// Denoted by n!
// Is the product of all positive integers from 1 to n
// Example: 5! = % * 4 * 3 * 2 * 1
// Written by Daniel Kang 14/12/2020

public class Factorial {

    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}