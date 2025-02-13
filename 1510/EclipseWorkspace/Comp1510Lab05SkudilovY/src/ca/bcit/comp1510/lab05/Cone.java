package ca.bcit.comp1510.lab05;

/**
 * Cone. Represents a Cone concept.
 * @author Yehor S.
 * @version 2025
 * @param radius of the Cone.
 * @param height of the one.
 */
public record Cone(double radius, double height) {
    
    /**
     * Represents 1/3.
     */
    static final double F = 1.0 / 3.0;
    
    /**
     * getVolume. Gets volume of the Cone.
     * @return colume of the Cone.
     */
    public double getVolume() {
        return F * Math.PI * Math.pow(radius, 2) * height;
    }
    
    /**
     * getSlantHeight. Gets slant height of the Cone.
     * @return slant height of the Cone.
     */
    public double getSlantHeight() {
        return Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
    }
    
    /**
     * getSurfaceArea. Gets surface area of the Cone.
     * @return surface area of the Cone.
     */
    public double getSurfaceArea() {
        return Math.PI * Math.pow(radius, 2) + Math.PI * radius 
                * (Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
    }
    
    /**
     * toString. Gets string that contains output of every method.
     * @return string that contains output of every method.
     */
    public String toString() {
        return getVolume() + " " + getSlantHeight() + " " + getSurfaceArea();
    }

}
