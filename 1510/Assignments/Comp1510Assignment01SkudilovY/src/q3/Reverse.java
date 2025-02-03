package q3;

import java.util.Stack;
import java.util.Scanner;
/**
 * Reverse. Reverses a line of 10 words.
 * Takes input of 10 words separated by space 
 * and writes them out in reverse order.  
 *
 * @author Yehor Skudilov
 * @version 1.0
 */

public class Reverse {

    /**
     * This is the main method that runs the code.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        Stack<String> wordStack = new Stack<String>();
        
        Scanner scan = new Scanner(System.in);
        
        //Prompts and gets input of 10 words separated by space 
        //and pushes into the stack.
        System.out.println("Enter 10 words separated by space to reverse: ");
        
        wordStack.push(scan.next());
        wordStack.push(scan.next());
        wordStack.push(scan.next());
        wordStack.push(scan.next());
        wordStack.push(scan.next());
        wordStack.push(scan.next());
        wordStack.push(scan.next());
        wordStack.push(scan.next());
        wordStack.push(scan.next());
        wordStack.push(scan.next());

        //Prints the words in reverse order
        System.out.println("Reversed: " + wordStack.pop() + " " 
                + wordStack.pop() + " " 
                + wordStack.pop() + " " 
                + wordStack.pop() + " " 
                + wordStack.pop() + " "
                + wordStack.pop() + " "
                + wordStack.pop() + " "
                + wordStack.pop() + " "
                + wordStack.pop() + " "
                + wordStack.pop() + " ");
        
        scan.close();
    }

}
