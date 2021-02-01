package day11.task2;

import day11.task2.interfaces.MagicAttack;
import day11.task2.interfaces.PhysAttack;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    public int magicAtt;


    public Magician() {
        physDef = 0;
        magicDef = 80;
        physAtt = 5;
        magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackScore = magicAtt - (magicAtt * hero.magicDef / 100);
        if (hero.health - attackScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }
    }


    public String toString() {
        return "Magician{health=" + health + "}";
    }
}
