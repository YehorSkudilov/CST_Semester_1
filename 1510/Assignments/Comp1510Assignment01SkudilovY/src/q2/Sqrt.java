package q2;

import java.util.Scanner;

/**
 * Sqrt. Calculates an approximation to the square root of a number given.
 * Takes a number and calculates an approximation to the 
 * square root 10 times and prints every result.
 * @author Yehor S.
 * @version 1.0
 */

public class Sqrt {
    
    /**
     * This is the main method that runs the code.
     *
     * @param args command line arguments.
     */
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //Prompt and get input
        System.out.println("Enter number to square root: ");
        double a = scan.nextDouble();
        
        //Use formula #1 and print.
        double s = (a + 1) / 2;
        System.out.println("Estimate 1: " + s);
        
        //Repeat formula #2 9 times and print each.
        s = (s + a / s) / 2;
        System.out.println("Estimate 2" + ": " + s);
        
        s = (s + a / s) / 2;
        System.out.println("Estimate 3" + ": " + s);
        
        s = (s + a / s) / 2;
        System.out.println("Estimate 4" + ": " + s);
        
        s = (s + a / s) / 2;
        System.out.println("Estimate 5" + ": " + s);
        
        s = (s + a / s) / 2;
        System.out.println("Estimate 6" + ": " + s);
        
        s = (s + a / s) / 2;
        System.out.println("Estimate 7" + ": " + s);
        
        s = (s + a / s) / 2;
        System.out.println("Estimate 8" + ": " + s);
        
        s = (s + a / s) / 2;
        System.out.println("Estimate 9" + ": " + s);
        
        s = (s + a / s) / 2;
        System.out.println("Estimate 10" + ": " + s);
                
        scan.close();
    }

}
