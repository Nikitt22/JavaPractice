package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);


        for (int x : array)
            System.out.print(x + " ");


        int max = array[0];
        int min = array[0];
        int count0 = 0;
        int count0sum = 0;

        for (int y = 0; y < array.length; y++) {

            if (array[y] > max) {
                max = array[y];

            }
            if (array[y] < min) {
                min = array[y];

            }

        }

        for (int z = 0; z < array.length; z++) {
            if (array[z] % 10 == 0) {
                count0++;
                count0sum = count0sum + array[z];
            }

        }

        System.out.println();
        System.out.println("Число максимум в массиве равно: " + max);
        System.out.println("Число минимум в массиве равно: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0 равно: " + count0);
        System.out.println("Сумма элементов массива, оканчивающихся на 0 равно: " + count0sum);

    }
}
