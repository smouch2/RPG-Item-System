package main.items;

/**
 @author Stephen Mouch
 @version 0.1
 */

/**
 * A class for modeling generic inventory items.  For equipment, please use ArmorBase or WeaponBase as appropriate.
 */
public abstract class ItemBase {
    protected String itemName;
    protected int itemValue;

    /**
     * Creates a generic ItemBase object
     * @param itemName name of the item to be created
     * @param itemValue value of the item to be created
     */
    public ItemBase(String itemName, int itemValue) {
        this.itemName = itemName;
        this.itemValue = itemValue;
    }

    /**
     * Method to return item name.
     * @return item name as String
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets item name as a String.
     * @param itemName name of the item to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * Gets the value of an item as an integer.
     * @return itemValue as integer
     */
    public int getItemValue() {
        return itemValue;
    }

    /**
     * Sets the value of an item as an integer.
     * @param itemValue item value to set
     */
    public void setItemValue(int itemValue) {
        this.itemValue = itemValue;
    }
}
