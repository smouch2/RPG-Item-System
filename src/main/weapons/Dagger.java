package main.weapons;

import main.items.AttackGem;
import main.items.Gem;
import main.slots.Hand;
import main.aspects.*;

/**
 @author Stephen Mouch
 @version 0.1
 */

/**
 * A class for modeling Daggers for player use
 */
public class Dagger extends WeaponBase implements Equippable, Breakable,
        Repairable, Upgradeable, Hand, Attackable {

    protected boolean isEquipped;

    /**
     *  Constructs a Dagger object using the WeaponBase abstract class as a framework
      */
    public Dagger(){
        super("Dagger","A short blade",35,8);
        this.isEquipped = false;
    }

    /**
     * creates a 'weapon shards' object when Dagger is destroyed
     */
    @Override
    public void destroy() {
        this.setName("Weapon shards");
        this.setDescription("Remnants of a blade");
        this.setAttackRating(0);
        this.setWeight(1);
        this.setDurability(0);
    }

    /**
     * Method that sets equipped value to true
     */
    @Override
    public void equip() {
        this.isEquipped = true;
    }

    /**
     * Method to restore durability to 100
     */
    @Override
    public void repair() {
        setDurability(100);
    }

    /**
     * Method to return if the weapon is equipped or not
     * @return equipped boolean value
     */
    public boolean isEquipped() {
        return isEquipped;
    }

    /**
     * Implements an upgrade via an upgrade gem, improving attack points
     *      however, this only works if the Gem object is not socketed already
     *      and is an Attack Gem.
     * @param gem object of Gem type
     */
    public void upgrade(Gem gem) {
        if (!gem.socketed() && gem instanceof AttackGem){
            gem.setSocketed();
            setAttackRating(getAttackRating() + gem.getBonusValue());
        }
    }

    /**
     * Method to return name, description, attackRating, weight, and durability as a formatted String.
     * @return name, description, attackRating, weight, durability
     */
    @Override
    public String toString(){
        String text = String.format("%s/%s/%d AP/Weight:%d [%d/100]", name, description, attackRating, weight, durability);
        return text;
    }


}
