package ca.bcit.comp1510.lab04;
import java.util.Scanner;
/**
 * IntegerWrapper.
 * @author Yehor S.
 * @version 2025
 */
public class IntegerWrapper {
/**
 * Runs the program.
 * @param args unused.
 */
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide an intiger to represent in binary, octal and hexadecimal: ");
        int input = scan.nextInt();
        
        //To binary
        System.out.println("Intiger representation: " + Integer.toBinaryString(input));
        
        //To octal
        System.out.println("Octal representation: " + Integer.toOctalString(input));

        //To hex
        System.out.println("Hex representation: " + Integer.toHexString(input));
        
        //max and min java int values
        System.out.println("Max int value: " + Integer.MAX_VALUE);
        System.out.println("Min int value: " + Integer.MIN_VALUE);

        //String to int and sum of them
        System.out.println("Enter two ints seperetaed by space or new line: ");
        String int1 = scan.next();
        String int2 = scan.next();
        
        int sum = Integer.parseInt(int1) + Integer.parseInt(int2);
        
        System.out.println("Sum of " + int1 + " + " + int2 + " is " + sum);
        
        scan.close();
    }
    
}
