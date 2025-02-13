package ca.bcit.comp1510.lab05;

/**
 * Name. Data class. Represents a Name concept. 
 * @author Yehor S.
 * @version 2025
 * @param firstName first name.
 * @param middleName middle name.
 * @param lastName last namme.
 */
public record Name(String firstName, String middleName, String lastName) {
    
    /**
     * getLength. Gets lengths of the first middle and last name combined.
     * @return lengths of the first middle and last name combined
     */
    public int getLength() {
        return (firstName + middleName + lastName).toString().length();
    }
     
    /**
     * getInitials. Gets initials of the first middle and last name combined.
     * @return initials.
     */
    public String getInitials() {
        return ("" + firstName.charAt(0) + middleName.charAt(0)
                 + lastName.charAt(0)).toUpperCase();
    }
    
    /**
     * getNameChar. Get a character in the first middle and last 
     * name combined at a specified index.
     * @param n index of the char.
     * @return character in the first middle and last 
     *      name combined at a specified index.
     */
    public char getNameChar(int n) {
        return (firstName + middleName + lastName).charAt(n);
    }
    
    /**
     * getLastFirstMiddleWithCommas. Gets last first and 
     * middle name with commas.
     * @return last first and middle name with commas.
     */
    public String getLastFirstMiddleWithCommas() {
        return firstName + ", " + lastName + ", " + middleName;
    }
     
    /**
     * matchString. Checks if first name equals to the input.
     * @return whether first name equals to the input or not.
     */
    public boolean firstNameEquals(String matchString) {        
        return matchString.equals(firstName);
    }
    

}

/* 4f. Would it be useful to define a method that accepts a 
 * Name object and returns true if the three parts of the name 
 * object are the same as the three parts of “this” Name object?
 * 
 *      It would make no sense because record already has equals method.
 */
