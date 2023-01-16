package day11.task2;

public abstract class Hero implements PhysAttack, MagicAttack{
int health = 100;
final int HEALTH_MIN = 0;
    int physAtt;
    int magicAtt;
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

    @Override
    public void magicalAttack(Hero hero) {
        double magicAttackScore = magicAtt * (1- hero.magicDef);
        if (hero.health - magicAttackScore < HEALTH_MIN){
            hero.health = HEALTH_MIN;
        } else {
            hero.health -= magicAttackScore;
        }
    }


}
