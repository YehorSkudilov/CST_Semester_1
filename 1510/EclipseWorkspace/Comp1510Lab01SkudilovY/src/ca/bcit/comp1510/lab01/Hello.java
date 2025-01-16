package ca.bcit.comp1510.lab01;

/**
* Prints a Hello World message.
*
* @author Yehor S.
* @version 2025
*/

public class Hello {
    
    /**
     * Prints the greeting.
     *
     * @param args unused.
     */
    
    public static void main(String[] args) {
    
        System.out.println("Hello world!");

    }
}

/*
* a. Error: The public type Helo must be defined in its own file
* b. There is no error message because I just changed contents of the string.
* c. String literal is not properly closed by a double-quote
* d. Multiple markers at this line
*   - String literal is not properly closed by a double-quote
*   - Syntax error on token(s), misplaced construct(s)
*   - Syntax error on token "!", ; expected
* e. Syntax error, insert ";" to complete BlockStatements
*/