package main.items;

import main.aspects.Mineable;

/**
 @author Stephen Mouch
 @version 0.1
 */

/**
 * A class to model mineable ore objects
 */
public class Ore extends StackableItem implements Mineable {
    /**
     * @param quantity of ore to be created using StackableItem super values of
     *                value, name, quantity, and max stacks
     */
    public Ore(int quantity) {

        super(5,"Raw Ore" , quantity, 100);
    }

    /**
     * single quantity instantiation
     */
    public Ore() { this(1);}

    /**
     * Method to acquire quantity of ore
     * @return the quantity of ore
     */
    public int getQuantity(){
        return this.quantity;
    }

    /**
     * Method to set the quantity of ore.
     * @param newQuantity new integer value for quantity of ore to set
     */
    public void setQuantity(int newQuantity){
        this.quantity = newQuantity;
    }

    /**
     * Method to mine ore objects and produce defense gems
     * @param amtMined the amount of ore being mined for gems, amtMined > 0
     * @return returns a new gem object for upgrading equipment
     */
    public Gem mine(int amtMined) {
        Gem d1 = null;
        if (amtMined > 0) {
            this.setQuantity(this.getQuantity() - amtMined);
            d1 = new DefenseGem("Mined Defense Gem", 25, 15);
        }
        return d1;
    }

    /**
     * a method to rename the object and zero out the value upon destruction
     */
    public void destroy(){
        this.setItemValue(0);
        this.setItemName("Rock Fragments");
    }

    /**
     * Method returning the ore's name, value, quantity, and current/max stacks
     * @return itemName, itemValue, quantity, maxStacks
     */
    @Override
    public String toString(){
        String text = String.format("%s/%dgp [%d/%d]",itemName, itemValue, quantity, maxStacks);
        return text;
    }
}
