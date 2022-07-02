package main.aspects;

import main.Player;

/**
 @author Stephen Mouch
 @version 0.1
 */

/**
 * Interface for consuming items
 */
public interface Consumable {
    /**
     * method for consuming an item and establishing what happens to the item after consumption
     */

    void consume();

    /**
     * consumption method with player object to affect
     * @param player object to be modified by consumption
     */
    void consume(Player player);
}
