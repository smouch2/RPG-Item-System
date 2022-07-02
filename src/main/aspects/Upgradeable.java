package main.aspects;
import main.items.Gem;

/**
 @author Stephen Mouch
 @version 0.1
 */

/**
 * Interface enabling upgrade of an object
 */
public interface Upgradeable {
    /**
     * Upgrade method that utilizes gem to increase stats
     * @param gem  a gem object to be used in the upgrade process is passed to the subclass's upgrade method
     */
    void upgrade(Gem gem);
}
