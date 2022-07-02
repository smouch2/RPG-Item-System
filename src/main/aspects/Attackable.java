package main.aspects;
/**
 @author Stephen Mouch
 @version 0.1
 */
/**
 * Interface for implementing attack
 */
public interface Attackable {
    /**
     * Method to acquire integer value of attack power of a weapon
     * @return int attackRating
     */
    int getAttackRating();

    /**
     * Method to acquire integer value of durability.
     * @return integer value of durability
     */
    int getDurability();
}
