package day11.task2;

import day11.task2.interfaces.Healer;
import day11.task2.interfaces.PhysAttack;

public class Paladin extends Hero implements Healer, PhysAttack {

    public Paladin() {
        magicDef = 20;
        physDef = 50;
        physAtt = 15;
    }


    @Override
    public void healHimself() {
        if (health + 25 > 100) {
            health = 100;
        } else {
            health += 25;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 10 > 100) {
            hero.health = 100;
        } else {
            hero.health += 10;
        }

    }


    public String toString() {
        return "Paladin {health=" + health + "}";
    }
}
