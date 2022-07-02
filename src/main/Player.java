package main;

/**
 @author Stephen Mouch
 @version 0.1
 */

/**
 * A class for modeling the player object.
 */
public class Player {

    protected int health;
    protected int goldPieces;
    protected String name;
    protected int experiencePoints;
    protected int attackValue;

    /**
     * Constructor for a player object to be controlled by user
     */
    public Player() {
        this.health = 100;
        this.goldPieces = 10;
        this.name = "Hero";
        this.experiencePoints = 0;
    }

    /**
     * Method to acquire integer value of player health.
     * @return integer health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Method to set integer value of player health
     * @param health integer health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Method to acquire integer value of gold on player's person
     * @return integer gold pieces
     */
    public int getGoldPieces() {
        return goldPieces;
    }

    /**
     * Method to set integer value of gold on player's person
     * @param goldPieces int gold to set
     */
    public void setGoldPieces(int goldPieces) {
        this.goldPieces = goldPieces;
    }

    /**
     * Method to acquire integer value of player experience points
     * @return integer experience points
     */
    public int getExperiencePoints() {
        return experiencePoints;
    }

    /**
     * Method to set integer value of player experience points
     * @param experiencePoints integer experience points
     */
    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    /*
    public int attackValue(main.Equipment equipment){
        return (equipment.totalAttack()*(equipment.getWeaponDurability()/100));
        //returns a partial value of attack based on durability of weapon
    }
    public void attack(main.Enemy enemy){
        enemy.setHealth(enemy.getHealth()-attackValue();
        //figure how to pass attackValue into this method
    }*/

    /**
     * Method to return health, goldPieces, name, and experience points as a formatted String.
     * @return health, goldPieces, name, experiencePoints
     */
    @Override
    public String toString(){
        String text = String.format("Health: [%d/100]/Gold: %d/Name: %s XP:%d", health,
                goldPieces, name, experiencePoints);
        return text;
    }
}
