package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        int sumMaxThree = 0;
        int sumIndex = 0;
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];

                if (sum > sumMaxThree) {
                    sumMaxThree = sum;
                    sumIndex = i;
                }
            }
        }
        System.out.println("Сумма соседних трех элементов равна: " + sumMaxThree);
        System.out.println("Индекс максимальной суммы трех элементов равен: " + sumIndex);
    }

}
