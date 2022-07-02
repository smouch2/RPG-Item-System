package main.aspects;

import main.items.Gem;

/**
 @author Stephen Mouch
 @version 0.1
 */

/**
 * Interface to enable mining of an object
 */
public interface Mineable {
    /**
     * Method to mine ore and produce gems
     * @param amtMined the amount of ore being mined for gems, amtMined > 0
     * @return in it's concrete implementations, this method returns a gem in exchange for
     */
    Gem mine(int amtMined);
}
