package ca.bcit.comp1510.lab04;

/**
 * Demonstrates the creation and use of a user-defined class.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class RollingMultiDice {
    /**
     * Driver program creates two Die objects and rolls them.
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        final int newFace = 4;
        final int die1Sides = 9;
        final int die2Sides = 20;
        
        MultiDie die1;
        MultiDie die2;
        int sum;
        
        System.out.println("Number of sides on a die1 is " + die1Sides);
        System.out.println("Number of sides on a die2 is " + die2Sides);


        die1 = new MultiDie(die1Sides);
        die2 = new MultiDie(die2Sides);

        die1.roll();
        die2.roll();
        System.out.println("\nRolling dice");
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);

        System.out.println("\nRolling die 1 but setting face value to die2");
        die1.roll();
        die2.setFaceValue(newFace);
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);

        System.out.println("\nGetting face value from the die objects (die1 and die2)");
        sum = die1.getFaceValue() + die2.getFaceValue();
        System.out.println("Sum: " + sum);

        System.out.println("\nRolling die1 and die2 and summing");
        sum = die1.roll() + die2.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);
        System.out.println("New sum: " + sum);
    }
}

