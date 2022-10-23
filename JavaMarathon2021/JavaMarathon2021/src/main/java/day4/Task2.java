package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10);


        for (int x : array)
            System.out.print(x + " ");


        int max = array[0];
        int min = array[0];

        for (int y : array) {

            if (array[y] > max) {
                array[y]=max;
                System.out.println("Число максимум в массиве равно: " + max);
            }


        }

    }
}
