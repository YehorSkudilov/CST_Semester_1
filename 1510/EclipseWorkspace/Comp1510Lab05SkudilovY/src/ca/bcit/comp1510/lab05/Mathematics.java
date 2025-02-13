package ca.bcit.comp1510.lab05;


/**
 * Mathematics.
 * @author Yehor S.
 * @version 2025
 */
public class Mathematics {

    public static final double PI = 3.14159265358979323846;



    public int sumOfInts(int num) {
       if(num < 0) {
           return 0;
       }
       int sum = 0;
       
       if(num >= 0) {
           for(int i = 0; i <= num; i+=1) {
               sum += i;
           }
       }
       else {
           for(int i = 0; i >=num; i-=1) {
               sum += i;
           }
       }
       return sum;
    }

    public boolean isPositive(int i) {
        
        return i > 0;
    }

    public boolean isEven(int i) {
     
        return i % 2  == 0;
    }

    public int sumOfEvens(int num) {
        int sum = 0;
        
        if(num >= 0) {
            for(int i = 0; i <= num; i+=2) {
                sum += i;
            }
        }
        else {
            for(int i = 0; i >=num; i-=2) {
                sum += i;
            }
        }
        return sum;
    }

    public double getCircleArea(double r) {
        return PI * Math.pow(r, 2);
    }

    
    
}
