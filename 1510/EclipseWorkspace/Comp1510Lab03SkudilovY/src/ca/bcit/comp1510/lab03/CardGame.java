package ca.bcit.comp1510.lab03;

import java.util.random.RandomGenerator;
/**
 * CardGame.
 * @author Yehor S.
 * @version 2025
 */

public class CardGame {
    /**
     * Rank of cards.
     */
    
    enum Rank { Ace, Two, Three, Four, Five, Six, 
        /**
         * Rank of cards.
         */
        Seven, Eight, Nine, Ten, Jack, Queen, King } 
    
    /**
     * Suit of cards.
     */
    enum Suit { hearts, diamonds, clubs, spades }
    
    /**
     * Runs Program.
     * @param args unused.
     */
    
    public static void main(String[] args) {
        RandomGenerator random = RandomGenerator.getDefault();
        
        int randomRankChoice = random.nextInt(Rank.values().length);
        
        Rank randomRank = Rank.values()[randomRankChoice];
        
        int randomSuitChoice = random.nextInt(Suit.values().length);
        
        Suit randomSuit = Suit.values()[randomSuitChoice];
        
        System.out.println("Your card is " + randomRank + " " + randomSuit);
    }
}
