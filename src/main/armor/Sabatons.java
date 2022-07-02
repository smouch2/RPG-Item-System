package main.armor;

import main.items.Gem;
import main.aspects.Breakable;
import main.aspects.Equippable;
import main.aspects.Repairable;
import main.aspects.Upgradeable;
import main.slots.Chest;
import main.slots.Feet;

/**
 @author Stephen Mouch
 @version 0.1
 */
/**
 * A class for modeling foot armor objects to be used by the player
 */
public class Sabatons extends ArmorBase implements Breakable, Repairable,
        Equippable, Upgradeable, Feet {

    /**
     * Creates a foot armor object using the ArmorBase class as a template
     */
    public Sabatons() {

        super("Leather Sabatons", "A simple pair of leather sabatons.", 25, 10);

    }

    /**
     * A method to mutate the object into it's destroyed version.
     */
    @Override
    public void destroy() {
        this.setName("Armor Fragments");
        this.setDescription("Remnants of a breastplate");
        this.setDefenseRating(0);
        this.setWeight(1);
        this.setDurability(0);

    }

    /**
     * A method to restore the durability to 100%.
     */
    @Override
    public void repair() {
        setDurability(100);
    }

    /**
     * Improves the defense rating of the sabatons by the bonus value of the gem object passed in
     *      however, this only works if the gem has not been socketed already.
     * @param gem a Gem type object
     */
    public void upgrade(Gem gem) {
        if (!gem.socketed()) {
            gem.setSocketed();
            setDefenseRating(getDefenseRating() + gem.getBonusValue());
        }
    }

    /**
     * Returns the name, description, defenseRating, weight, and durability of an item as a String.
     * @return all stats on item as String
     */
    @Override
    public String toString(){
        String text = String.format("%s/%s/%d DP/Weight:%d [%d/100]", name, description, defenseRating, weight, durability);
        return text;
    }

}