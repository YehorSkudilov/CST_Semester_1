package ca.bcit.comp1510.lab03;

import java.util.HashMap;
import java.util.Map;
import java.util.random.RandomGenerator;

/**
 * Dice. simulates the rolling of a collection of D&D dice.
 * @author Yehor S.
 * @version 2025
 */

public class Dice {
    
    /**
     * Runs program.
     * @param args unused.
     */
    
    public static void main(String[] args) {
        
        RandomGenerator random = RandomGenerator.getDefault();
        
        Map<String, Integer> diceDictionary = new HashMap<>();

        //Add random values from 1 to max for each die to the dictionary
        diceDictionary.put("d4", random.nextInt(4) + 1);
        diceDictionary.put("d6", random.nextInt(6) + 1);
        diceDictionary.put("d8", random.nextInt(8) + 1);
        diceDictionary.put("d10", random.nextInt(10) + 1);
        diceDictionary.put("d12", random.nextInt(12) + 1); 
        diceDictionary.put("d20", random.nextInt(20) + 1); 
        
        int[] dTotal = new int[1]; 
        
        //print all rolled die values
        diceDictionary.forEach((key, value) -> {
            System.out.println(key + " rolled: " + value);
        });
        
        //get total
        diceDictionary.forEach((key, value) -> {
            dTotal[0] += value;
        });
        
        //print total
        System.out.println("Total rolled: " + dTotal[0]);
    }

}
