package main.items;

/**
 @author Stephen Mouch
 @version 0.1
 */

/**
 * Class for modeling AttackGems
 */
public class AttackGem extends Gem {

    /**
     * Constructor for AttackGem.
     * @param itemName name of the gem
     * @param itemValue value of the gem
     * @param bonusValue value the gem can add to the attack power of the item it's socketed in a weapon
     */
    public AttackGem(String itemName, int itemValue, int bonusValue) {

        super("Eye of the Storm", 30, 15);
    }

}
