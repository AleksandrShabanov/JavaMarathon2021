package day11.task2;

import day11.task2.interfaces.Healer;
import day11.task2.interfaces.MagicAttack;
import day11.task2.interfaces.PhysAttack;

public class Shaman extends Hero implements Healer, MagicAttack, PhysAttack {

    public Shaman(){

        health = 100;
        physDef = 20;
        magicDef = 20;
        physAtt = 10;
        magicAtt = 15;
    }


    @Override
    public void healHimself() {
        health += 50;
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 30;

        if (hero.health > 100)
            hero.health = 100;
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

        hero.health -= physAtt - (physAtt * hero.physDef/100);

        if (hero.health < 0)
            hero.health = 0;
    }

    public String toString(){
        return "Shaman {health=" + health + "}";
    }
}
