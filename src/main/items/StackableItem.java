package main.items;

import main.aspects.Stackable;

/**
 @author Ted Holmberg
 @version 0.1
 */

/**
 * Class for modeling stackable items in player inventory.
 */
public abstract class StackableItem extends ItemBase implements Stackable {

    protected int quantity;
    protected int maxStacks;

    /**
     * constructor for a stackable object
     * @param itemValue value of the item
     * @param itemName name of the item
     * @param quantity quantity of the item
     * @param maxStacks maximum stacks allowed of the item
     */
    public StackableItem(int itemValue, String itemName, int quantity, int maxStacks){
        super(itemName,itemValue);
        this.quantity = quantity;
        this.maxStacks = maxStacks;
    }

    /**
     * Method to create 'stacking' by limiting quantity to max stacks.
     * @param s an Object of class main.aspects.Stackable passed in to stack
     */
    @Override
    public void stack (Stackable s){
        if (s instanceof StackableItem) {
            StackableItem si = (StackableItem) s;
            if(this.getQuantity() + si.getQuantity() < maxStacks){
                this.setQuantity(this.getQuantity()+si.getQuantity());
                si.setQuantity(0);
            } else if (this.getQuantity() + si.getQuantity() > maxStacks) {
                int diff = maxStacks - this.getQuantity();
                this.setQuantity(this.getQuantity() + diff);
                si.setQuantity(si.getQuantity() - diff);
            }
        }
    }

    /**
     * Method to acquire integer quantity of a stackable item
     * @return itemQuantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Method to set the integer quantity of a stackable item
     * @param quantity quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Method to acquire integer value of maximum stacks of a stackable item
     * @return max stacks of a stackable item
     */
    public int getMaxStacks() {
        return maxStacks;
    }

    /**
     * Method to set integer value of maximum stacks of a stackable item
     * @param maxStacks maximum stacks of a stackable item
     */
    public void setMaxStacks(int maxStacks) {
        this.maxStacks = maxStacks;
    }
}
