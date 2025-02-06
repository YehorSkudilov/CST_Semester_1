package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * Names. Gets a name and print the full name.
 * @author Yehor S.
 * @version  2025
 */

public class Names {

    /**
     * Driver program creates two Die objects and rolls them.
     * @param args command-line arguments (unused)
     */
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter First Middle and "
                + "Last Name Separated by Spaces");
        Name name = new Name(scan.next(), scan.next(), scan.next());
        System.out.println(name.toString());
        scan.close();
    }

    
}
