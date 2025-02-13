package ca.bcit.comp1510.lab05;

/**
 * Sphere. Represents a Sphere concept.
 * @author Yehor S.
 * @version 2025
 */
public record Sphere(  double x, double y, double z, double radius){
   
    public double getSurfaceArea(){
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    
    public double getVolume() {
        return 4.0/3.0 * Math.PI * Math.pow(radius,3);
    }
    
    public String toString() {
        return getSurfaceArea() + " " + getVolume();
    }
}













//greatful dead