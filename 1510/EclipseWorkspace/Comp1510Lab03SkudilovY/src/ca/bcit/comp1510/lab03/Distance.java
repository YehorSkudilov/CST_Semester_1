
package ca.bcit.comp1510.lab03;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Distance. Calculates the distance between two points.
 * @author Yehor S.
 * @version 2025
 */

public class Distance {
    
    /**
     * Runs Program.
     * @param args unused.
     */
    
    public static void main(String[] args) {
        
        double[] point1 = new double[2];
        double[] point2 = new double[2];

        
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("Type x and y coordinates "
                + "seperated by space for point 1" 
                + "\nEx. 20 20"); 
        point1[0] = scan.nextDouble(); 
        point1[1] = scan.nextDouble();
        
        System.out.println("Type x and y coordinates "
                + "seperated by space for point 1" 
                + "\nEx. 20 20"); 
        point2[0] = scan.nextDouble(); 
        point2[1] = scan.nextDouble();
        


        double distance = Math.sqrt(Math.pow(point2[0] - point1[0], 2) 
                + Math.pow(point2[1] - point1[1], 2));
        
        DecimalFormat df = new DecimalFormat("#.##");

        String formattedNumber = df.format(distance);

        
        System.out.println("Distance between point 1 nad point 2 is: " 
                + formattedNumber);
    }

}

//6. The reason you won't do Math mathObject = new Math(); 
//is because the class is static aka final so u can't instantiate it.

//7. Yes it works in all quadrants.

//8. The formatter will include all whole numbers 
//and will include 2 significant fractional numbers.