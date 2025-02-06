package ca.bcit.comp1510.lab04;

/**
 * Name. Data class. Represents a Name concept. 
 * @author Yehor S.
 * @version 2025
 */
public class Name {
    /** First Name.*/
    private String first;
    
    /** Middle Name.*/
    private String middle;
    
    /** Last Name.*/
    private String last;
    
    /**
     * Constructs a Name object with the given first, middle, and last names.
     * @param firstName The first name.
     * @param middleName The middle name.
     * @param lastName The last name.
     */
    public Name(String firstName, String middleName, String lastName) {
        first = firstName;
        middle = middleName;
        last = lastName;
    }
    
    /**
     * Gets the first name.
     * @return The first name.
     */
    public String getFirst() {
        return first;
    }

    /**
     * Gets the middle name.
     * @return The middle name.
     */
    public String getMiddle() {
        return middle;
    }

    /**
     * Gets the last name.
     * @return The last name.
     */
    public String getLast() {
        return last;
    }

    /**
     * Returns a string representation of the full name.
     * @return The full name in "First Middle Last" format.
     */
    public String toString() {
        return first + " " + middle + " " + last;
    }

}
