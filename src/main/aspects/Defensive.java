package main.aspects;
/**
 @author Stephen Mouch
 @version 0.1
 */

/**
 * Interface enabling defense
 */
public interface Defensive {
    /**
     * Method to acquire integer value of defense rating of a piece of armor
     * @return int defense rating
     */
    int getDefenseRating();

    /**
     * Method to acquire integer value of durability of a piece of armor
     * @return int durability
     */
    int getDurability();
}
