package q2;

import java.util.Scanner;

/**
 * Sqrt. Calculates an approximation to the square root.
 * @author Yehor S.
 * @version 1.0
 */

public class Sqrt {
    
    /**
     * main. Runs the program
     * @param args unused.
     */
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter double: ");
        double a = scan.nextDouble();
        
        //apply the square root formula and print
        double s = (a + 1) / 2;
        System.out.println("Estimate 1: " + s);
        
        //9 times apply the square root formula and print
        for (int i = 2; i < 11; i++) {
            s = (s + a / s) / 2;
            System.out.println("Estimate " + i + ": " + s);
        }
        
        
    }

}
