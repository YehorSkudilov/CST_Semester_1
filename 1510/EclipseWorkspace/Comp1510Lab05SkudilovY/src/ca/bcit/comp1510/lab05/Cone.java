package ca.bcit.comp1510.lab05;

/**
 * Cone. Represents a Cone concept.
 * @author Yehor S.
 * @version 2025
 */
public record Cone(double radius, double height){
    
    public double getVolume() {
        return 1.0/3.0 * Math.PI * Math.pow(radius, 2) * height;
    }
    
    public double getSlantHeight() {
        return Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
    }
    
    public double getSurfaceArea(){
        return Math.PI * Math.pow(radius, 2) + Math.PI * radius *(Math.sqrt(Math.pow(radius,2) + Math.pow(height, 2)));
    }
    
    public String toString() {
        return getVolume() + " " + getSlantHeight() + " " + getSurfaceArea();
    }

}
