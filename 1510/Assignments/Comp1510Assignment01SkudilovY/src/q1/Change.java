package q1;

import java.util.Scanner;

/**
 * Change. Represents money value in bills and cents.
 * Takes numeric user input and converts it into a list 
 * of the number in denominations.
 * @author Yehor S.
 * @version 1.0
 */

public class Change {
    
    /**
     * This is the main method that runs the code.
     *
     * @param args command line arguments.
     */
    
    public static void main(String[] args) {
        final int toCentsConversion = 100;
        
        final int cad10 = 1000;
        final int cad5 = 500;
        final int cad2 = 200;
        final int cad1 = 100;
        final int cent25 = 25;
        final int cent10 = 10;
        final int cent5 = 5;
        final int cent1 = 1;

        Scanner scan = new Scanner(System.in);

        //Prompts and gets an input
        System.out.println("Enter a number like 10.10 to "
                + "convert into denominations: ");
        int userGivenNumberInCoins = (int) (scan.nextDouble() 
                * toCentsConversion); 

       
        System.out.println("\nYour number in denominations: ");
        
        //Get the number of denominations that will fit in the number and print.
        int numberOfCad10 = userGivenNumberInCoins / cad10;
        userGivenNumberInCoins -= numberOfCad10 * cad10;
        System.out.println("    * Ten Dollar Bills: " + numberOfCad10);

        int numberOfCad5 = userGivenNumberInCoins / cad5;
        userGivenNumberInCoins -= numberOfCad5 * cad5;
        System.out.println("    * Five Dollar Bills: " + numberOfCad5);

        int numberOfCad2 = userGivenNumberInCoins / cad2;
        userGivenNumberInCoins -= numberOfCad2 * cad2;
        System.out.println("    * Toonies: " + numberOfCad2);

        int numberOfCad1 = userGivenNumberInCoins / cad1;
        userGivenNumberInCoins -= numberOfCad1 * cad1;
        System.out.println("    * Loonies: " + numberOfCad1);

        int numberOfCent25 = userGivenNumberInCoins / cent25;
        userGivenNumberInCoins -= numberOfCent25 * cent25;
        System.out.println("    * Quarters: " + numberOfCent25);

        int numberOfCent10 = userGivenNumberInCoins / cent10;
        userGivenNumberInCoins -= numberOfCent10 * cent10;
        System.out.println("    * Dimes: " + numberOfCent10);

        int numberOfCent5 = userGivenNumberInCoins / cent5;
        userGivenNumberInCoins -= numberOfCent5 * cent5;
        System.out.println("    * Nickels: " + numberOfCent5);

        int numberOfCent1 = userGivenNumberInCoins / cent1;
        userGivenNumberInCoins -= numberOfCent1 * cent1;
        System.out.println("    * Pennies: " + numberOfCent1);

        scan.close();
    }

}
