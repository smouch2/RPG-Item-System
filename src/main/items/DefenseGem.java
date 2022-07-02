package main.items;

/**
 @author Stephen Mouch
 @version 0.1
 */

/**
 * Class for modeling DefenseGems.
 */
public class DefenseGem extends Gem{
    /**
     * Constructor for DefenseGem.
     * @param itemName name of the gem
     * @param itemValue value of the gem
     * @param bonusValue value the gem can add to a piece of armor's defense rating
     */
    public DefenseGem(String itemName, int itemValue, int bonusValue) {

        super("Heart of the Forest", 30, 15);
    }
}
