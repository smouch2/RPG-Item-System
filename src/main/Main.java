package main;

import main.armor.Shield;
import main.items.AttackGem;
import main.items.DefenseGem;
import main.items.Ore;
import main.items.Potion;
import main.weapons.Dagger;

/**@author Stephen Mouch
 * @version 0.1
 * a demonstration of the functionality of the overall API
 */

public class Main {
    public static void main(String[] args){
        System.out.println("Initial Values: ");
        Player hero = new Player();
        Enemy e = new Enemy("Goblin" ,50,20, 10,25);
        Potion p = new Potion(5);
        Dagger d = new Dagger();
        Shield s = new Shield();
        Ore o = new Ore(5);
        System.out.println(p.toString());
        System.out.println(e.toString());
        System.out.println(d.toString());
        System.out.println(s.toString());
        System.out.println(o.toString());
        System.out.println("");

        System.out.println("Upgrade tests: ");
        AttackGem g1 = new AttackGem("gem",10,10);
        DefenseGem g2 = new DefenseGem("gem",10,15);
        d.upgrade(g1);
        s.upgrade(g2);
        System.out.println("");

        System.out.println(d.toString());
        System.out.println(s.toString());
        System.out.println("");

        System.out.println("main.items.Ore mining test: ");
        o.setQuantity(10);
        System.out.println(o.toString());
        System.out.println("Now Mining:");
        o.mine(5);
        System.out.println(o.toString());
        System.out.println("");
        System.out.println("Destroy tests: ");
        p.destroy();
        d.destroy();
        s.destroy();
        System.out.println(p.toString());
        System.out.println(d.toString());
        System.out.println(s.toString());





    }
}
