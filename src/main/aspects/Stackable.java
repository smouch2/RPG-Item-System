package main.aspects;

/**
 @author Ted Holmberg
 @version 0.1
 */

/**
 * Interface enabling stacking of an object
 */
public interface Stackable {
    /**
     * Method to stack object.
     * @param s an Object passed in to stack
     */
    void stack(Stackable s);
}
