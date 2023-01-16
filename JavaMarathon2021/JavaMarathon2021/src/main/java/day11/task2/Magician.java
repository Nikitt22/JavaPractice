package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{

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
}
