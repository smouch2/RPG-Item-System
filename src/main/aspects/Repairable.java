package main.aspects;

/**
 @author Stephen Mouch
 @version 0.1
 */

/**
 * Interface enabling repair of an object
 */
public interface Repairable {
    /**
     * a method to implement repairs on objects, i.e. resetting the durability
     */
    void repair();
}
