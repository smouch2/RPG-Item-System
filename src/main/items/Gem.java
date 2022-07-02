package main.items;

/**
 @author Stephen Mouch
 @version 0.1
 */

/**
 * Abstract class for modeling gem types.
 */
public abstract class Gem extends ItemBase{

    protected int bonusValue;
    protected boolean socketed;


    /**
     * Constructor for basic gem type.
     * @param itemName name of the gem
     * @param itemValue value of the gem
     * @param bonusValue bonus value to be applied to attack or defense
     */
    public Gem(String itemName, int itemValue, int bonusValue) {
        super(itemName, itemValue);
        this.bonusValue = bonusValue;
        this.socketed = false;
    }
    /**
     * returns the bonus value of the gem to add with the attack power of the item
     * @return bonus value of gem
     */
    public int getBonusValue() {
        return bonusValue;
    }

    /**
     * Socket or use(d) status of gem
     * @return returns the socketed value, i.e. the usability of the gem
     */
    public boolean socketed(){
        return socketed;
    }

    /**
     * Sets the socketed value of the gem to true.
     */
    public void setSocketed(){
        this.socketed = true;
    }
// type, color
}
