package ca.bcit.comp1510.lab05;

/**
 * Sphere. Represents a Sphere concept.
 * @author Yehor S.
 * @version 2025
 * @param x coorfinate.
 * @param y coordinate.
 * @param z coordinate.
 * @param radius is radius.
 */
public record Sphere(double x, double y, double z, double radius) {
    /**
     * Represents 4.
     */
    static final double FOUR = 4;
    
    /**
     * Represents 4/3.
     */
    static final double F = 4.0 / 3.0;
    
    /**
     * Represents 4/3.
     */
    static final int THREE = 3;
    
    /**
     * getSurfaceArea. Gets surface area the Sphere.
     * @return surface area of the Sphere.
     */
    public double getSurfaceArea() {
        return FOUR * Math.PI * Math.pow(radius, 2);
    }
    
    /**
     * getVolume. Gets volume of the Sphere.
     * @return colume of the Sphere.
     */
    public double getVolume() {
        return F * Math.PI * Math.pow(radius, THREE);
    }
    
    /**
     * toString. Gets string that contains output of every method.
     * @return string that contains output of every method.
     */
    public String toString() {
        return getSurfaceArea() + " " + getVolume();
    }
}














//greatful dead