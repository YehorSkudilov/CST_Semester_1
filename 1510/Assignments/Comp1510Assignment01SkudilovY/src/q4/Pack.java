package q4;

import java.util.Scanner;

/**
 * Pack. Encodes a 5 MIX-character string into a single int variable and 
 * decode an int value back into MIX-characters. Valid for 'A'-'I'.
 *
 * @author Yehor Skudilov
 * @version 1.0
 */
public class Pack {
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        final int base = 56;
        
        //Prompts and gets the input line.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a line of 5 characters (valid for 'A'-'I') "
                + "to encode and decode: ");
        String userLine = scan.nextLine();
        
        int characterNumber = 0;
        
        //Puts every character into its variable.
        char c1 = userLine.charAt(characterNumber);
        char c2 = userLine.charAt(++characterNumber);
        char c3 = userLine.charAt(++characterNumber);
        char c4 = userLine.charAt(++characterNumber);
        char c5 = userLine.charAt(++characterNumber);

        //Encodes the characters. 
        //Converts into numeric numbers, puts in base 56, and prints.
        int encodedLine = (((((c1 - 'A' + 1) * base 
                + (c2 - 'A' + 1)) * base 
                + (c3 - 'A' + 1)) * base 
                + (c4 - 'A' + 1)) * base 
                + (c5 - 'A' + 1));
        
        System.out.println("Encoded line: " + encodedLine);
        
        //Decodes the encoded characters into numeric numbers.
        int temp = encodedLine;
        int d5 = temp % base;
        temp /= base;
        
        int d4 = temp % base;
        temp /= base;
        
        int d3 = temp % base;
        temp /= base;
        
        int d2 = temp % base;
        temp /= base;
        
        int d1 = temp % base;
        temp /= base;
        
        //Converts into characters and prints.
        String decodedLine = "" + (char) (d1 - 1 + 'A') 
                + (char) (d2 - 1 + 'A')
                + (char) (d3 - 1 + 'A')
                + (char) (d4 - 1 + 'A')
                + (char) (d5 - 1 + 'A');
        
        System.out.println("Decoded line: " + decodedLine);
        scan.close();
    }

}
