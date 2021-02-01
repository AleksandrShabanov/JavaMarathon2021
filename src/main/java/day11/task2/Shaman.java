package day11.task2;

import day11.task2.interfaces.Healer;
import day11.task2.interfaces.MagicAttack;
import day11.task2.interfaces.PhysAttack;

public class Shaman extends Hero implements Healer, MagicAttack, PhysAttack {

    public int magicAtt;


    public Shaman() {
        physDef = 20;
        magicDef = 20;
        physAtt = 10;
        magicAtt = 15;
    }


    @Override
    public void healHimself() {
        if (health + 50 > 100) {
            health = 100;
        } else {
            health += 50;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 30 > 100) {
            hero.health = 100;
        } else {
            hero.health += 30;
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackScore = magicAtt - (magicAtt * hero.magicDef/100);
        if (hero.health - attackScore < MIN_HEALTH){
            hero.health = MIN_HEALTH;
        }
        else {
            hero.health -= attackScore;
        }
    }


    public String toString() {
        return "Shaman {health=" + health + "}";
    }
}
