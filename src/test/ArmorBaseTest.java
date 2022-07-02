package test;
/**
 @author Stephen Mouch
 @version 0.1
 */
import main.armor.*;
import main.items.DefenseGem;
import main.items.Gem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArmorBaseTest {
    /**
     * tests the destroy method by checking the new item name
     */
    @Test
    void testDestroy() {
        Helmet h = new Helmet();
        Breastplate b = new Breastplate();
        LegGuard l = new LegGuard();
        Shield s = new Shield();
        Sabatons f = new Sabatons();
        h.destroy();
        b.destroy();
        l.destroy();
        s.destroy();
        f.destroy();
        Assertions.assertEquals("Armor Fragments", s.getName());
        Assertions.assertEquals("Armor Fragments", b.getName());
        Assertions.assertEquals("Armor Fragments", l.getName());
        Assertions.assertEquals("Armor Fragments", h.getName());
        Assertions.assertEquals("Armor Fragments", f.getName());
    }

    /**
     * tests the equip method
     */
    @Test
    void testEquip() {
        Helmet h = new Helmet();
        Breastplate b = new Breastplate();
        LegGuard l = new LegGuard();
        Shield s = new Shield();
        Sabatons f = new Sabatons();
        h.equip();
        b.equip();
        l.equip();
        s.equip();
        f.equip();
        Assertions.assertTrue(h.isEquipped());
        Assertions.assertTrue(b.isEquipped());
        Assertions.assertTrue(l.isEquipped());
        Assertions.assertTrue(s.isEquipped());
        Assertions.assertTrue(f.isEquipped());
    }

    /**
     * tests the repair method
     */
    @Test
    void testRepair() {
        Helmet h = new Helmet();
        Breastplate b = new Breastplate();
        LegGuard l = new LegGuard();
        Shield s = new Shield();
        Sabatons f = new Sabatons();
        h.setDurability(25);
        b.setDurability(25);
        l.setDurability(25);
        s.setDurability(25);
        f.setDurability(25);
        h.repair();
        b.repair();
        l.repair();
        s.repair();
        f.repair();
        Assertions.assertEquals(100,h.getDurability());
        Assertions.assertEquals(100,b.getDurability());
        Assertions.assertEquals(100,l.getDurability());
        Assertions.assertEquals(100,s.getDurability());
        Assertions.assertEquals(100,f.getDurability());
    }

    /**
     * test the upgrade method by creating a gem object and testing both the socketed value and the
     * resultant defense rating from the upgrade
     */
    @Test
    void testUpgradeIncrease() {
        Helmet h = new Helmet();
        Breastplate b = new Breastplate();
        LegGuard l = new LegGuard();
        Shield s = new Shield();
        Sabatons f = new Sabatons();
        Gem g = new DefenseGem("gem",15, 10);
        Gem g2 = new DefenseGem("gem",15, 10);
        Gem g3 = new DefenseGem("gem",15, 10);
        Gem g4 = new DefenseGem("gem",15, 10);
        Gem g5 = new DefenseGem("gem",15, 10);
        h.upgrade(g);
        b.upgrade(g2);
        l.upgrade(g3);
        s.upgrade(g4);
        f.upgrade(g5);
        Assertions.assertEquals(40, h.getDefenseRating());
        Assertions.assertTrue(g.socketed());
        Assertions.assertEquals(40, b.getDefenseRating());
        Assertions.assertTrue(g2.socketed());
        Assertions.assertEquals(40, l.getDefenseRating());
        Assertions.assertTrue(g3.socketed());
        Assertions.assertEquals(40, s.getDefenseRating());
        Assertions.assertTrue(g4.socketed());
        Assertions.assertEquals(40, f.getDefenseRating());
        Assertions.assertTrue(g5.socketed());
    }

}