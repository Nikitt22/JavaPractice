package day11.task2;

public abstract class Hero implements PhysAttack {
int health;
final int HEALTH_MIN = 0;
    int physAtt;
    double physDef;
    double magicDef;

    public Hero(){
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackScore = physAtt * (1 - hero.physDef);
        if (hero.health - attackScore < HEALTH_MIN) {
            hero.health = HEALTH_MIN;
        } else {
            hero.health -= attackScore;
        }
    }




}
