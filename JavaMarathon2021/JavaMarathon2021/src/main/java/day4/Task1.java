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
            array[i] = random.nextInt(10);
        }

        for (int x : array) {
            System.out.print(x + " ");
        }

        System.out.println("Длина массива: " + array.length);

        int countEvenIntager = 0;
        int count8 = 0;
        int count1 = 0;
        int countOddNumber = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > 8)
                count8++;
        }

        System.out.println("Количество чисел больше 8: " + count8);

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 1)
                count1++;
        }

        System.out.println("Количество чисел равных 1: " + count1);

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0)
                countEvenIntager++;
        }

        System.out.println("Количество четных чисел : " + countEvenIntager);

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0)
                countOddNumber++;
        }

        System.out.println("Количество нечетных чисел : " + countOddNumber);


        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        System.out.println("Сумма всех элементов массива равна: " + sum);


    }


}


