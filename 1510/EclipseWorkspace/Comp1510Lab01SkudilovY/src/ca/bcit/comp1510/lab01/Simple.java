package ca.bcit.comp1510.lab01;

/**
 * Simple. Testing legal class names.
 * 
 * @author Yehor S.
 * @version 2025
 */

public class Simple {

    /**
     * Prints to console.
     * 
     * @param args command-line arguments (unused)
     */
    
    public static void main(String[] args) {

    }

}

/*
    1. simple - legal
        It's different because java is case sensitive. Not descriptive. 
        Shouldn't use it for a class name because it looks like a variable.
    2. SimpleProgram - legal
        Not descriptive.
    3. 1 Simple - illegal (Can't have space or start with a number)
        Not descriptive.
    4. _Simple_ - legal
        Not descriptive
    5. *Simple* - illegal (Can't use * in class name)
    6. $123_45 - legal
        Not descriptive. Discouraged from using $ in class name.
    7. Simple! - illegal (Can't use !)
        Not descriptive.
*/