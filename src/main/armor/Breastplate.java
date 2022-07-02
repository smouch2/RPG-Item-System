package main.armor;

import main.items.Gem;
import main.aspects.Breakable;
import main.aspects.Equippable;
import main.aspects.Repairable;
import main.aspects.Upgradeable;
import main.slots.Chest;

/**
 @author Stephen Mouch
 @version 0.1
 */
/**
 * A class for modeling chest armor objects to be used by the player
 */
public class Breastplate extends ArmorBase implements Breakable, Repairable,
        Equippable, Upgradeable, Chest {

    /**
     * Creates a Breastplate object using the ArmorBase class as a template
     */
    public Breastplate() {

        super("Leather Breastplate", "A simple leather chestpiece.", 25, 10);

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
     * Improves the defense rating of the breastplate by the bonus value of the gem object passed in
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
