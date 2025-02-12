package ca.bcit.comp1510.lab05;


/**
 * Cube. Represents a Cube concept.
 * @author Yehor S.
 * @version 2025
 */
public record Cube(double x, double y, double z, double edgeLength) {

    public double getSurfaceArea(){
        return 6 * Math.pow(edgeLength, 2);
    }
    
    public double getVolume(){
        return Math.pow(edgeLength, 2);
    }
    
    public double getFaceDiagonal(){
        return Math.sqrt(2) * edgeLength;
    }
    
    public double getSpaceDiagonal() {
        return Math.sqrt(3) * edgeLength;
    }
    
    public String toString(){
        return getSurfaceArea() + " " + getVolume() + " " 
    + getFaceDiagonal() + " " + getSpaceDiagonal();
    }
}
