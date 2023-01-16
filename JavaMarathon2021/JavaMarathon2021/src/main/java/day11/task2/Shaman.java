package day11.task2;

public class Shaman extends Hero implements PhysAttack,MagicAttack,Healer{
    public Shaman() {
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
        magicAtt = 15;
    }
    static final int MAX_HEALTH = 100;
    static final int HEAL_AMOUNT = 50;
    static final int HEAL_TEAMMATE_AMOUNT = 30;


    @Override
    public void healHimself() {
        if (health + HEAL_AMOUNT > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {

            health += HEAL_AMOUNT;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEAL_TEAMMATE_AMOUNT > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += HEAL_TEAMMATE_AMOUNT;
        }
    }
}
