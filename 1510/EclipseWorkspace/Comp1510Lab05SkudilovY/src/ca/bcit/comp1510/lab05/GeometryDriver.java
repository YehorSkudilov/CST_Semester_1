package ca.bcit.comp1510.lab05;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * GeometryDriver.
 * @author Yehor S.
 * @version 2025
 */
public class GeometryDriver {
    /**
     * Represents 3.
     */
    static final int THREE = 3;
    
    /**
     * main. Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.###");
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(THREE);
        
        System.out.println("Enter the radius and coordinates for a sphere "
                 + "(example: x y z radius): ");
        Sphere sphere = new Sphere(scan.nextDouble(), scan.nextDouble(), 
                 scan.nextDouble(), scan.nextDouble());
        System.out.println("Sphere \nSureface area: " 
                 + df.format(sphere.getSurfaceArea()) + " \nVolume: "
                 + df.format(sphere.getVolume()));
         
        System.out.println("Enter the edge length and centre "
                + "coordinates for a cube (example: x y z edgeLength): ");
        Cube cube = new Cube(scan.nextDouble(), scan.nextDouble(),
                 scan.nextDouble(), scan.nextDouble());
        System.out.println("Cube \nSureface Area: " 
                + nf.format(cube.getSurfaceArea()) + "\nVolume: " 
                + nf.format(cube.getVolume())
                + "\nFace Diagonal: " + nf.format(cube.getFaceDiagonal()) 
                + "\nSpace Diagonal " + (cube.getSpaceDiagonal()));
         
        System.out.println("Enter the radius and height for a right "
                 + "circular cone(example: radius height): ");
        Cone cone = new Cone(scan.nextDouble(), scan.nextDouble());
        System.out.println("Cone: \nVolume: " + nf.format(cone.getVolume()) 
            + "\nSlant Hight: " + nf.format(cone.getSlantHeight()) 
            + "\nSureface Area: " 
                 + nf.format(cone.getSurfaceArea()));
    }

}
