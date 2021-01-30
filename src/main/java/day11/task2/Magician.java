package day11.task2;

import day11.task2.interfaces.MagicAttack;
import day11.task2.interfaces.PhysAttack;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    public Magician(){
        health = 100;
        physDef = 0;
        magicDef = 80;
        physAtt = 5;
        magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.health > 100)
            hero.health = 100;

        hero.health -= magicAtt - (magicAtt * hero.magicDef/100);

        if (hero.health < 0)
            hero.health = 0;
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.health > 100)
            hero.health = 100;

        hero.health -= physAtt - (physAtt * (hero.physDef/100));

        if (hero.health < 0)
            hero.health = 0;
    }

    public String toString(){
        return "Magician{health=" + health + "}";
    }
}
