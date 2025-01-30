
package ca.bcit.comp1510.lab03;

import java.util.Scanner;

/**
 * FunWithStrings. 
 * Program that explores some useful methods in the String class.
 * @author Yehor S.
 * @version 2025
 */

public class FunWithStrings {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Returns whole line before enter
        
        //Print prompt
        System.out.println("Enter title of your favorite book:");
        
        //Get line entered by used
        String userString = scan.nextLine();
        
        //Print string
        System.out.println("The books title: " + userString);
        
        //Length of string
        System.out.println("Length of the title is " + userString.length());
        
        //Tell the user when their title starts with The
        if (userString.startsWith("The")) {
            System.out.println("Your title starts with THE");
        }
        
        //Fail to do upper case
        userString.toUpperCase();
        System.out.println("Call method toUpperCase on userString: " 
                + userString);
        
        //All upper and all lower case
        String allCaps = userString.toUpperCase();
        System.out.println("All caps: " + allCaps);
        System.out.println("All lower case after being all caps: " 
                + allCaps.toLowerCase());
        
        //Trimmed userString
        String trimmedUserInput = userString.trim();
        System.out.println("Trimmed titile: " + trimmedUserInput);
        System.out.println("Trimmed titile length: " 
                + trimmedUserInput.length());
        
        //Finally, display what the user typed, 
        //fully trimmed, in lower case, with the first and last 
        //letters capitalized.
        System.out.println("\n\n////////////////");
        System.out.println("Display what the user typed, "
                + "fully trimmed, in lower case, with the first and last"
                + "letters capitalized.");
        System.out.println("////////////////\n\n");
        
        System.out.println("Fully trimmed: " + userString.trim());
        System.out.println("Lower Case: " + userString.toLowerCase());
        
        String start = userString.substring(0, 1);
        String middle = userString.substring(1, userString.length() - 1);
        String end = userString.substring(userString.length() - 1);
        System.out.println("With the first and last "
                + "letters capitalized: " 
                + start.toUpperCase() 
                + middle.toLowerCase() 
                + end.toUpperCase());


        
        //reads until encounters space
        //System.out.println("Enter title of your favorite book:");
        //var value = scan.next();
        //System.out.println(value);
    }
}

//9. Print the value stored in the 
//String variable to the console.  Did it work? 

//Yes it print the user input.

//10. Challenge Question: what about the Scanner’s next() method?  Does it work?

//Scanner.next(); reads characters until space 
//and Scanner.nextLine() reads everything before you hit enter.

//14. There is a method in the String class called toUpperCase(). 
//Will it permanently change a 
//String?  Invoke it on the String object storing user’s input,
//then print the user’s input.  
//Did it change? 

//No the output won't change because when you call the method toUpperCase() 
//and don't assign the new value to a variable it goes nowhere.

//15. What if we invoke the toUpperCase() method on
//the String storing the user’s input, and 
//then assign the result to a new String variable.  Did it work? 

//Yes it works this time because the return of method 
//toUpperCase is stored now and not lost.