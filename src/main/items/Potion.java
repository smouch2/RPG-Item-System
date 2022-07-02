package main.items;

import main.Player;
import main.aspects.Breakable;
import main.aspects.Consumable;

/**
 @author Ted Holmberg
 @version 0.1
 */

/**
 * Class for modeling potions for player use.
 */
public class Potion extends StackableItem implements Consumable, Breakable {
    public Potion(int quantity) {
        super(20, "main.items.Potion", quantity, 10);
    }

    public Potion(){
        this(1);
    }

    /**
     * Original consume method
     */
    @Override
    public void consume() {
    }

    /**
     * Overloaded method to consume a single potion, adding 20 health points to player character
     */
    @Override
    public void consume(Player player) {
        player.setHealth(player.getHealth() + 20);
        this.setQuantity(this.quantity-1);
    }

    /**
     * method to destroy potions
     */
    @Override
    public void destroy(){
        this.setItemName("Broken Bottles");
    }

    /**
     * Returns the name, value, quantity, and current/max stacks of potion.
     * @return itemName, itemValue, quantity, maxStacks
     */
    @Override
    public String toString(){
        String text = String.format("%s/%dgp [%d/%d]",itemName, itemValue, quantity, maxStacks);
        return text;
    }
}

