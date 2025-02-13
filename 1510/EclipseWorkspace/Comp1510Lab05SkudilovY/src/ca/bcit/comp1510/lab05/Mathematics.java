package ca.bcit.comp1510.lab05;


/**
 * Mathematics.
 * @author Yehor S.
 * @version 2025
 */
public class Mathematics {

    /**
     * Represents PI.
     */
    public static final double PI = 3.14159265358979323846;


    /**
     * sumOfInts. Gets sum oof ints.
     * @param num whole number.
     * @return sum of ints.
     */
    public int sumOfInts(int num) {
        
        if (num < 0) {
            return 0;
        }
        
        int sum = 0;
       
        if (num >= 0) {
            for (int i = 0; i <= num; i += 1) {
                sum += i;
            }
        } else {
            for (int i = 0; i >= num; i -= 1) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * isPositive. Check if whole number is positive.
     * @param i whole number.
     * @return whether the num is posotive or not.
     */
    public boolean isPositive(int i) {
        
        return i > 0;
    }

    /**
     * isEven. Checks if the whole number is even.
     * @param i whole number.
     * @return whether the number is positive or not.
     */
    public boolean isEven(int i) {
     
        return i % 2  == 0;
    }

    /** 
     * Returns sum of the even numbers between 0 and the specified value, 
     * inclusive.  The value can be positive, negative, or zero. 
     *  
     * @param num upper bound 
     * @return sum of the even numbers between 0 and number 
     */ 
    public int sumOfEvens(int num) {
        int sum = 0;
        
        if (num >= 0) {
            for (int i = 0; i <= num; i += 2) {
                sum += i;
            }
        } else {
            for (int i = 0; i >= num; i -= 2) {
                sum += i;
            }
        }
        return sum;
    }

    /** 
     * Returns the area of the circle with the specified radius. 
     *  
     * @param radius 
     *            of the circle. 
     * @return area as a double 
     */ 
    public double getCircleArea(double radius) {
        return PI * Math.pow(radius, 2);
    }

    
    
}
