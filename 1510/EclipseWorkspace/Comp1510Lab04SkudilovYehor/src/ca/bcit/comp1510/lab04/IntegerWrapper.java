package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * IntegerWrapper.
 * A program that converts an integer into binary, octal, and hexadecimal
 * representations, displays min/max integer values, and sums two integers.
 * 
 * @author Yehor S.
 * @version 2025
 */

public class IntegerWrapper {
    
    /**
     * Runs the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        
        // Create a Scanner object to read user input
        Scanner scan = new Scanner(System.in);
        
        // Prompt user to enter an integer
        System.out.println("Provide an intiger to represent in binary,"
                + " octal and hexadecimal: ");
        
        // Read integer input from the user
        int input = scan.nextInt();
        
        // Convert integer to binary and print
        System.out.println("Intiger representation: " 
                + Integer.toBinaryString(input));
        
        // Convert integer to octal and print
        System.out.println("Octal representation: " 
                + Integer.toOctalString(input));

        // Convert integer to hexadecimal and print
        System.out.println("Hex representation: " + Integer.toHexString(input));
        
        // Print maximum and minimum integer values in Java
        System.out.println("Max int value: " + Integer.MAX_VALUE);
        System.out.println("Min int value: " + Integer.MIN_VALUE);

        // Prompt user to enter two integers for summation
        System.out.println("Enter two ints seperetaed by space or new line: ");
        
        // Read first integer input as a string
        String int1 = scan.next();
        
        // Read second integer input as a string
        String int2 = scan.next();
        
        // Convert string inputs to integers and calculate their sum
        int sum = Integer.parseInt(int1) + Integer.parseInt(int2);
        
        // Print the result of the sum
        System.out.println("Sum of " + int1 + " + " + int2 + " is " + sum);
        
        // Close the scanner to free resources
        scan.close();
    }
}
