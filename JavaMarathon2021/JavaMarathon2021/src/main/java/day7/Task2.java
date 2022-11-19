package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(100) + 90;
        Player player1 = new Player(90);
//        Player player2 = new Player(x);
//        Player player3 = new Player(x);
        System.out.println(player1.getStamina());
        System.out.println(x);

    }

}
