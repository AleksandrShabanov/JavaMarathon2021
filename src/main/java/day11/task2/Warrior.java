package day11.task2;

import day11.task2.interfaces.PhysAttack;

public class Warrior extends Hero implements PhysAttack {

    public Warrior(){
        health = 100;
        physDef = 80;
        magicDef = 0;
        physAtt = 30;
    }

    @Override
    public void physicalAttack(Hero hero) {

        if (hero.health > 100)
            hero.health = 100;

        hero.health -= physAtt - (physAtt * hero.physDef/100);

        if (hero.health <= 0)
            hero.health = 0;
    }

    public String toString(){
        return "Warrior {health=" + health + "}";
    }
}
