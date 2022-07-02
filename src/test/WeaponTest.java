package test;

import main.items.AttackGem;
import main.weapons.Dagger;
import org.junit.jupiter.api.Assertions;

class WeaponTest {
    /**
     * tests the destroy method by creating an object and destroying it
     */
    @org.junit.jupiter.api.Test
    void testDestroy() {
        Dagger d = new Dagger();
        d.destroy();
        Assertions.assertEquals("Weapon shards", d.getName());
    }

    /**
     * tests the equip method using the equip boolean
     */
    @org.junit.jupiter.api.Test
    void testEquip() {
        Dagger d = new Dagger();
        d.equip();
        Assertions.assertEquals(true, d.isEquipped());
    }

    /**
     * test the repair method and the setDurability method simultaneously
     */
    @org.junit.jupiter.api.Test
    void testRepair() {
        Dagger d = new Dagger();
        d.setDurability(46);
        d.repair();
        Assertions.assertEquals(100,d.getDurability());
    }

    /**
     * tests the repair and setDurability methods again
     */
    @org.junit.jupiter.api.Test
    void testRepair2() {
        Dagger d = new Dagger();
        d.setDurability(20);
        d.repair();
        Assertions.assertEquals(100,d.getDurability());
    }

    /**
     * tests the upgrade method by socketing a gem and checking the new attackRating
     */
    @org.junit.jupiter.api.Test
    void testUpgrade() {
        Dagger d = new Dagger();
        AttackGem g = new AttackGem("gem",15,15);
        d.upgrade(g);
        Assertions.assertEquals(50, d.getAttackRating());
    }

    /**
     * same test as before with different integer values
     */
    @org.junit.jupiter.api.Test
    void testUpgrade2() {
        Dagger d = new Dagger();
        AttackGem g = new AttackGem("gem",15,20);
        d.upgrade(g);
        Assertions.assertEquals(50, d.getAttackRating());
    }
}