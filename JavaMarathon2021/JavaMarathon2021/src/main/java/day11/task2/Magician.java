package day11.task2;

public class Magician extends Hero implements MagicAttack{
    int magicAtt;
public Magician(){
    magicDef = 0.8;
    physAtt = 5;
    magicAtt = 20; }


    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                 '}';
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
