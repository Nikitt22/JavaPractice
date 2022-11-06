package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int numberMaxOfThree = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] >= numberMaxOfThree)
                    numberMaxOfThree = array[i] + array[i];

            }

        }
        System.out.println("Максимальное число среди трех рядом стоящих: " + numberMaxOfThree);
    }
}