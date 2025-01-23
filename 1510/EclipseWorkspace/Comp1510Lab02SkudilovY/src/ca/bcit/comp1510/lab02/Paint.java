package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * Paint. Calculates how many cans of 
 * paint are needed to paint a house.
 * @author Yehor S.
 * @version 2025
 */

public class Paint {
    
    /**
     * Drives the program.
     * @param args unused
     */

    
    public static void main(String[] args) {
        final int coverage = 400;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter room length(ft):");
        double length = scanner.nextDouble();
        
        System.out.println("Enter room width(ft):");
        double width = scanner.nextDouble();
        
        System.out.println("Enter room height(ft):");
        double height = scanner.nextDouble();
        
        System.out.println("Enter number of coats:");
        double coats = scanner.nextDouble();
        
        double surfaceArea = ((length * width) + 2 
                * (length * height) + 2 * (width * height));
        
        double coverageNeeded = surfaceArea * coats;
        
        double cansOfPainNeeded = coverageNeeded / coverage;
        
        System.out.println("Cans of paint needed: " + cansOfPainNeeded);
    }
    
}
