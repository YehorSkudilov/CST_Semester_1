package ca.bcit.comp1510.lab04;

/**
 * MultiDie. Gets number of sides and gives random number in that range.
 * Can set and get face value of the die or get the value in string.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @author Yehor S.
 * @version 2025
 * 
 *      Questions
 *      1. Do you need getters and setters for max? Should you have them? 
 *          No, because its final and u can't change the value.
 * 
 *      2. Can you have getters and setters for max? 
 *          You can have getters but not setters because its final.
 * 
 *      3. Can you have getters and setters for max? 
 *          Having max final assures that it will be set once and never change,
 *          which makes sense since it defines the amount of sides a die has.
 *          It would be confusing if the same die object could transform 
 *          from 6 sides to 10. 
 *  
 *      4. What does max’s being final say about the abstraction of
 *      a MultiDie object? 
 *          Having max final enforces the abstraction that a MultiDie object 
 *          represents a die with a fixed number of sides,
 *          ensuring that it does not change after creation.
 * 
 *      5. Is max an instance variable? 
 *          max is an instance variable because its not static.
 * 
 *      6. Should you use a record for your Die?  Why or why not? 
 *          In a Java record, all fields are final and cannot be changed after 
 *          the object is created but a die needs to change 
 *          its face value when you roll it.
 */

public class MultiDie {
    /** Maximum face value. */
    public final int max;
    
    /** Current value showing on the die. */
    private int faceValue;
    
    /**
     * MultiDie.
     * @param numSides sets max
     */
    public MultiDie(int numSides) {
        max = numSides;
        faceValue = roll();
    }

    /**
     * Rolls this Die and returns the result.
     * @return faceValue as an int
     */
    public int roll() {
        faceValue = (int) (Math.random() * max) + 1;

        return faceValue;
    }

    /**
     * Sets the face value of this Die to the specified value.
     * @param value an int
     */
    public void setFaceValue(int value) {
        faceValue = value;
    }

    /**
     * Returns the face value of this Die as an int.
     * @return faceValue as an int
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Returns a String representation of this Die.
     * @return toString description
     */
    public String toString() {
        String result = Integer.toString(faceValue);

        return result;
    }
}
