package main.armor;

import main.items.Item;
import main.aspects.*;

/**
 @author Stephen Mouch
 @version 0.1

 A class for modeling armor objects to be used by the player
 */

/**
 * A class for modeling armor objects to be used by the player
 */
public abstract class ArmorBase extends Item implements Equippable, Breakable, Upgradeable, Repairable, Defensive {
    protected String name;
    protected String description;
    protected int defenseRating;
    protected int weight;
    protected int durability;
    protected boolean isEquipped;

    /**
     * Base constructor for all pieces of armor, take a default value of not equipped and a durability of 100.
     * @param name item name (String)
     * @param description description of the item (String)
     * @param defenseRating defensive rating or points (integer)
     * @param weight weight of the item (integer)
     */
    public ArmorBase(String name, String description, int defenseRating, int weight) {
        this.name = name;
        this.description = description;
        this.defenseRating = defenseRating;
        this.weight = weight;
        this.durability = 100;
        this.isEquipped = false;
    }
    /**
     * Gets the name of the piece of armor as a String.
     * @return returns the armor's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the piece of armor as a String.
     * @param name intended name of armor
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets description of piece of armor as a String.
     * @return returns description of piece of armor
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets a description of the item as a String.
     * @param description description of the item
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the defense rating, or defensive point value, as an integer.
     * @return returns the defense rating of the armor
     */
    public int getDefenseRating() {
        return defenseRating;
    }

    /**
     * Sets the defense rating, or defensive point value, as an integer.
     * @param defenseRating amount of defense against attacks that each armor piece provides
     */
    public void setDefenseRating(int defenseRating) {
        this.defenseRating = defenseRating;
    }

    /**
     * Gets the weight of an item as an integer.
     * @return return weight value for item
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets the weight of an item as an integer.
     * @param weight weight value for item
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Gets the durability of an item as an integer.
     * @return remaining durability of the item
     */
    public int getDurability() {
        return durability;
    }

    /**
     * Sets the durability of an item as an integer.
     * @param durability sets the durability of an item
     */
    public void setDurability(int durability) {
        this.durability = durability;
    }

    /**
     * Sets the equipped field to true when called.
     */
    public void equip(){
        this.isEquipped = true;
    }

    /**
     * Gets the status of use of the piece of armor.
     * @return if the equipment is equipped or not
     */
    public boolean isEquipped() {
        return isEquipped;
    }
}


