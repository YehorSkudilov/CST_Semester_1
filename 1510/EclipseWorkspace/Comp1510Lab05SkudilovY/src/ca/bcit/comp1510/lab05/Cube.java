package ca.bcit.comp1510.lab05;


/**
 * Cube. Represents a Cube concept.
 * @author Yehor S.
 * @version 2025
 * @param x coordinate.
 * @param y coordinate.
 * @param z coordinate.
 * @param edgeLength is length of the edge of the Cube.
 */
public record Cube(double x, double y, double z, double edgeLength) {
    /**
     * Represents 6.
     */
    static final double SIX = 6;
    
    /**
     * Represents 3.
     */
    static final double THREE = 3;
    
    /**
     * getSurfaceArea. Gets surface area of the Cube.
     * @return surface area of the Cube.
     */
    
    public double getSurfaceArea() {
        return SIX * Math.pow(edgeLength, 2);
    }
    
    /**
     * getVolume. Gets volume of the Cube.
     * @return volume of the Cube.
     */
    public double getVolume() {
        return Math.pow(edgeLength, 2);
    }
    
    /**
     * getFaceDiagonal. Gets face diagonal of the Cube.
     * @return face diagonal of the Cube.
     */
    public double getFaceDiagonal() {
        return Math.sqrt(2) * edgeLength;
    }
    
    /**
     * getSpaceDiagonal. Gets space diagonal of the Cube.
     * @return face diagonal of the Cube.
     */
    public double getSpaceDiagonal() {
        return Math.sqrt(THREE) * edgeLength;
    }
    
    /**
     * toString. Gets string that contains output of every method.
     * @return string that contains output of every method.
     */
    public String toString() {
        return getSurfaceArea() + " " + getVolume() + " " 
                + getFaceDiagonal() + " " + getSpaceDiagonal();
    }
}
