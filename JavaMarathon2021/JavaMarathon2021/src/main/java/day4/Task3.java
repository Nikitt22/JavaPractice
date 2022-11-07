package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][12];  // не получается сделать размерность [12][8], выдает ошибку ArrayIndexOutOfBoundsException, не могу понять почему
        Random random = new Random();
        int countString1 = 0;
        int countString2 = 0;
        int countString3 = 0;
        int countString4 = 0;
        int countString5 = 0;
        int countString6 = 0;
        int countString7 = 0;
        int countString8 = 0;
        int countString9 = 0;
        int countString10 = 0;
        int countString11 = 0;
        int countString12 = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int x = 0; x < array.length; x++) {
            countString1 += array[0][x];
            countString2 += array[1][x];
            countString3 += array[2][x];
            countString4 += array[3][x];
            countString5 += array[4][x];
            countString6 += array[5][x];
            countString7 += array[6][x];
            countString8 += array[7][x];
            countString8 += array[8][x];
            countString8 += array[9][x];
            countString8 += array[10][x];
            countString8 += array[11][x];

        }
        int[] arraySum = new int[]{countString1, countString2, countString3, countString4, countString5, countString6,
                countString7, countString8, countString9, countString10, countString11, countString12};

        int maxSumString = arraySum[0];
        int numberString = 0;

        for (int i = 1; i < arraySum.length; i++) {

            if (arraySum[i] >= maxSumString)
                maxSumString = arraySum[i];

            if (arraySum[i] == maxSumString)
                numberString = i;
        }
        System.out.println("Номер строки с максимальной суммой равен: " + numberString);
    }

}
