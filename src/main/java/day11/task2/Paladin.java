package day11.task2;

import day11.task2.interfaces.Healer;
import day11.task2.interfaces.PhysAttack;

public class Paladin extends Hero implements Healer, PhysAttack {

    public Paladin(){
        health = 100;
        magicDef = 20;
        physDef = 50;
        physAtt = 15;
    }


    @Override
    public void healHimself() {
        health += 25;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health > 100)
            hero.health = 100;

        hero.health += 10;

        if (hero.health < 0)
            hero.health = 0;
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.health > 100)
            hero.health = 100;

        hero.health -= physAtt - (physAtt * hero.physDef/100);

        if (hero.health < 0)
            hero.health = 0;
    }

    public String toString(){
        return "Paladin {health=" + health + "}";
    }
}
