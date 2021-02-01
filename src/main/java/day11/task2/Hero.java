package day11.task2;

import day11.task2.interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {

    final int MIN_HEALTH = 0;
    int health;
    int physDef;
    int magicDef;
    int physAtt;

    public Hero() {
        health = 100;
    }

    public void physicalAttack(Hero hero) {
        double attackScore = physAtt - (physAtt * hero.physDef / 100);
        if (hero.health - attackScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }
    }

}
