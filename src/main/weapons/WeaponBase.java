package main.weapons;

import main.items.Item;
import main.aspects.Breakable;
import main.aspects.Equippable;
import main.aspects.Repairable;
import main.aspects.Upgradeable;

/**
 @author Stephen Mouch
 @version 0.1
 */

/**
 * Class for modeling weapon items for player use.
 */
public abstract class WeaponBase extends Item implements Equippable, Breakable, Upgradeable, Repairable {
    protected String name;
    protected String description;
    protected int attackRating;
    protected int weight;
    protected int durability;

    /**
     * Constructor for base for weapons
     * @param name name of weapon
     * @param description description of weapon
     * @param attackRating attack power of weapon
     * @param weight weight of weapon
     */
    public WeaponBase(String name, String description, int attackRating, int weight) {
        this.name = name;
        this.description = description;
        this.attackRating = attackRating;
        this.weight = weight;
        this.durability = 100;
    }

    /**
     * Method to return the name of the weapon as a String value.
     * @return weapon name
     */
    public String getName() {
        return name;
    }

    /**
     * Method to set the name of a weapon as a String value.
     * @param name name to set for the weapon
     */
    public void setName(String name) {
        this.name = name;
    }

    /** Method returns the description of the weapon as a String value.
     * @return weapon description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Method to set weapon description as a String value.
     * @param description weapon description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Method to acquire integer value of the attack power of a weapon
     * @return integer attack power
     */
    public int getAttackRating() {
        return attackRating;
    }

    /**
     * Method to set the integer value of the attack power of a weapon.
     * @param attackRating integer attack power
     */
    public void setAttackRating(int attackRating) {
        this.attackRating = attackRating;
    }

    /**
     * Method to return the integer value of the weight of the weapon
     * @return integer weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Method to set the integer value of the weight of the weapon
     * @param weight integer weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Method to return the integer value of the durability of the weapon
     * @return integer durability
     */
    public int getDurability() {
        return durability;
    }

    /**
     * Method to set the integer value of the weight of the weapon
     * @param durability integer durability to set
     */
    public void setDurability(int durability) {
        this.durability = durability;
    }


}
