package day11.task2;

public class Paladin extends Hero implements Healer {

    static final int MAX_HEALTH = 100;
    static final int HEAL_AMOUNT = 25;
    static final int HEAL_TEAMMATE_AMOUNT = 10;


    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }


    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                 '}';
    }


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




