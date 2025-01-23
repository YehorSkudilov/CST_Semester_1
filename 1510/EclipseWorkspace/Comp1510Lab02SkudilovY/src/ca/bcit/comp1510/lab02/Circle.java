package ca.bcit.comp1510.lab02;

import java.util.Scanner; 

/**
* Circle.Calculates some important values for a Circle.
* @author Yehor S.
* @version 2025
*/

public class Circle {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        final double pi = 3.14159;
        double radius;
        double doubleRadius;
        Scanner myScanner = new Scanner(System.in); 
        
        try {
            System.out.println("Enter radius:");
            
            //get radius from user
            radius = myScanner.nextDouble(); 
           
            //calculate if radius was doubled
            doubleRadius = radius * 2;
            
            
            double circumference = 2 * pi * radius;
            System.out.println("Circumference is: " + circumference);
            
            double area = pi * radius * radius;
            System.out.println("Area is: " + area);
            
            double doubleCircumference = 2 * pi * doubleRadius;        
            double doubleArea = pi * doubleRadius * doubleRadius;
            
            double circumferenceIncrease = doubleCircumference / circumference;
            double areaIncrease = doubleArea / area;
            
            System.out.println("If area is doubled circumference is " 
                + circumferenceIncrease 
                + " times greater and area is " 
                + areaIncrease + " times greater");

        } catch (java.util.InputMismatchException e) {
                
            System.out.println("Wrong Input: " + e);
        }
        
        myScanner.close();
    }

}
