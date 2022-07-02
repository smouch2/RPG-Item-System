package test;
/**
 @author Stephen Mouch
 @version 0.1
 */
import main.items.DefenseGem;
import main.items.Gem;
import main.armor.Shield;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShieldTest {
    /**
     * tests the destroy method by checking the new item name
     */
    @Test
    void testDestroy() {
        Shield s = new Shield();
        s.destroy();
        Assertions.assertEquals("Armor Fragments", s.getName());
    }

    /**
     * tests the equip method
     */
    @Test
    void testEquip() {
        Shield s = new Shield();
        s.equip();
        Assertions.assertTrue(s.isEquipped());
    }

    /**
     * tests the repair method
     */
    @Test
    void testRepair() {
        Shield s = new Shield();
        s.repair();
        Assertions.assertEquals(100,s.getDurability());
    }

    /**
     * test the upgrade method by creating a gem object and testing both the socketed value and the
     * resultant defense rating from the upgrade
     */
    @Test
    void testUpgradeIncrease() {
        Shield s = new Shield();
        Gem g = new DefenseGem("gem",15, 10);
        s.upgrade(g);
        Assertions.assertEquals(40, s.getDefenseRating());
        Assertions.assertTrue(g.socketed());
    }

}