package day4;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }

        for (int x : array) {
            System.out.print(x + " ");
        }
        //      System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);

        for (int y : array) {
            int count = 0;
            if (y > 8) {
                count++;
                System.out.println("Количество чисел больше 8: " + count);
            }


        }

    }
}

