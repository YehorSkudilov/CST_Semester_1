package q1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Change. Represents money value in bills and coins.
 * @author Yehor S.
 * @version 2025
 */

public class Change {
    
    /**
     * main. Runs the program.
     * @param args unused.
     */
    
    public static void main(String[] args) {
        
        System.out.println("Enter a number to convert into denominations: ");
        
        Scanner scan = new Scanner(System.in);
        
        //Get input from user
        double userGivenNumber = scan.nextDouble();

        //Convert to int keeping 2 fractional decimals.
        int[] userGivenNumberArray = {(int) (userGivenNumber * 100)}; 
        
        //Create a dictionary for denominations that remembers the order or .put
        Map<String, Integer> denominations = new LinkedHashMap<>();
        
        //Bills
        denominations.put("Ten Dollar Bill", 1000);
        denominations.put("Five Dollar Bill", 500);
        denominations.put("Toonie", 200); 
        denominations.put("Loonie", 100); 

        //Coins
        denominations.put("Quarter", 25);
        denominations.put("Dime", 10);
        denominations.put("Nickel", 5);
        denominations.put("Penny", 1);
        
        //Dictionary for storing the values
        Map<String, Integer> storedDenominations = new LinkedHashMap<>();
        
        //Go through each denomination and get how many of 
        //them will fit in the user given number.
        //Divide the value stored*denomination from the userGivenNumber
        denominations.forEach((key, value) -> {
            int numberOfDenomination = (userGivenNumberArray[0] / value);
            userGivenNumberArray[0] -= numberOfDenomination * value; 
            storedDenominations.put(key, numberOfDenomination);
        });
        
        System.out.println("\nYour number " 
                + userGivenNumber 
                + " in denominations is: ");

        //Print out all of the values in the storedDenominations
        storedDenominations.forEach((key, value) -> {
            
            //If value of the denomination is 0 don't print it
            if (value > 0) {
                
                //Add s to values that are > than 1
                if (value > 1) {
                    System.out.println("    • " + value + " " + key + "s");

                } else {
                    System.out.println("    • " + value + " " + key);

                }
            }
        });
    }

}
