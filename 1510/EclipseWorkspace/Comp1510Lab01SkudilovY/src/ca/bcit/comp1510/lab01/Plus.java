package ca.bcit.comp1510.lab01;

/**
* Demonstrates the different behaviours of the + operator.
*
* @author Yehor
* @version 2024
*/

public class Plus {
    /**
    * Drives the program.
    * @param args unused
    */
    
    public static void main(String[] args) {
    
        System.out.println("This is a long string that is the"
                + " concatenation of two shorter strings.");
        
        //Concatenation on string int and string
        System.out.println("The first computer was invented about " + 70
                + " years ago");
        
        //Concatenation on string int and int. 
        //Will be 8 plus 5 is 85 because of the order of operations
        System.out.println("8 plus 5 is " + 8 + 5);
        
        //Prints 8 plus 5 is 85
        System.out.println("8 plus 5 is " + (8 + 5));
        
        //Will 85 be equals 8 plus 5. because of the order of operations
        System.out.println(8 + 5 + " equals 8 plus 5.");
    }
}