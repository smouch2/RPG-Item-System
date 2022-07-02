package main;

/**
 @author Stephen Mouch
 @version 0.1
 */

/**
 * Class for modeling enemy objects.
 */
public class Enemy {
    protected String name;
    protected int health;
    protected int gpDropped;
    protected int experienceGiven;
    protected int attackPoints;

    /**
      * @param health initial health of the enemy object
     * @param attackPoints initial attack value the enemy holds
     */
    public Enemy(String name, int health, int attackPoints, int gpDropped, int experienceGiven) {
        this.name = name;
        this.health = health;
        this.attackPoints = attackPoints;
        this.gpDropped = gpDropped;
        this.experienceGiven = experienceGiven;
    }

    /**
     * Method to return the integer value for health of the enemy
     * @return integer health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Method to set the integer value for health of the enemy
     * @param health integer health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     *  Method to return the health, attackPoints, and name of the enemy as a formatted String.
     * @return health, attackPoints, name
     */
    @Override
    public String toString(){
        String text = String.format("Health: [%d/100]/AP: %d/Name: %s", health, attackPoints, name);
        return text;
    }

}
