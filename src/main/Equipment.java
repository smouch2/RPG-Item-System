package main;

import main.aspects.Defensive;
import main.items.Item;
import main.slots.*;
import main.weapons.WeaponBase;

/**
 @author Stephen Mouch
 @version 0.1
 */

/**
 * A class to 'hold' the equipment that the player is currently using.  This class is also responsible
 * for totalling defense and attack points for implementing combat systems.
 */
public class Equipment {
    protected Hand mainHand;
    protected Offhand offhand;
    protected Head head;
    protected Chest chest;
    protected Legs legs;
    protected Feet feet;

    /**
     * Constructor for the equpment object, with the objects represented by their slots.
     * @param mainHand an object to bind to the mainHand as a weapon
     * @param offhand an object to bind the offHand as a weapon or shield
     * @param head an object to bind the head armor
     * @param chest an object to bind the chest armor
     * @param legs an object to bind the leg armor
     * @param feet an object to bind the foot armor
     */
    public Equipment(Hand mainHand, Offhand offhand, Head head, Chest chest, Legs legs, Feet feet) {
        this.mainHand = mainHand;
        this.offhand = offhand;
        this.head = head;
        this.chest = chest;
        this.legs = legs;
        this.feet = feet;
    }

    /**
     * Method to set the mainHand
     * @param mainHand weapon to pass in
     */
    public void setMainHand(Hand mainHand) {
        this.mainHand = mainHand;
    }

    /**
     * Method to set the offhand
     * @param offhand item to pass in
     */
    public void setOffhand(Offhand offhand) {
        this.offhand = offhand;
    }

    /**
     * Method to set the head
     * @param head item to pass in
     */
    public void setHead(Head head) {
        this.head = head;
    }

    /**
     * Method to set the chest.
     * @param chest item to pass in
     */
    public void setChest(Chest chest) {
        this.chest = chest;
    }
    /**
     * Method to set the legs.
     * @param legs item to pass in
     */
    public void setLegs(Legs legs) {
        this.legs = legs;
    }
    /**
     * Method to set the feet.
     * @param feet item to pass in
     */
    public void setFeet(Feet feet) {
        this.feet = feet;
    }

    /**
     * A method to total the defensive values of currently equipped armor items.
     * @return integer defense points
     */
    public int totalDefense(){
        int totalDefense = 0;  //starting sum is 0
        //array of equipped items to adhere to DRY using a for-loop
        Object[] equipped = {offhand, head, feet, legs, chest};
        for (Object slot : equipped ){
            //check if item is defensable
            if (slot instanceof Defensive){
                Defensive armor = (Defensive) slot;      //cast it
                totalDefense += armor.getDefenseRating(); //access defense method
            }
        }
        return totalDefense;   //return sum
    }

    /**
     * A method to total attack value
     * @return integer attack value
     */
    public int totalAttack(){
        int attackRating = 0;
        if (mainHand instanceof WeaponBase) {
            WeaponBase weapon = (WeaponBase) mainHand;
             attackRating = weapon.getAttackRating();
        }
        return attackRating;
    }

    /**
     * A method to return mainhand weapon durability for implementing armor degradation
     * @return integer value weapon durability
     */
    public int getWeaponDurability(){
        int weaponDurability = 0;
        if (mainHand instanceof WeaponBase){
            WeaponBase weapon = (WeaponBase) mainHand;
            weaponDurability =  weapon.getDurability();
        }
        return  weaponDurability;
    }

    /**
     * A method to return total durability for implementing repair costs and fractional damage according to
     * percent durability remaining
     * @return integer value of durability
     */
    public int totalDurability() {
        int totalDurability = 0;  //starting sum is 0
        //array of equipped items to adhere to DRY using a for-loop
        Object[] equipped = {mainHand, offhand, head, feet, legs, chest};
        for (Object slot : equipped) {
            if (slot instanceof Item){
            Item item = (Item) slot;      //cast it
            totalDurability += item.getDurability(); //access defense method
            }
        }
        return totalDurability;   //return sum
    }

}
