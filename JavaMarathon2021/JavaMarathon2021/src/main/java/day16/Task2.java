package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        float sum = 0;

        File file = new File("C:\\Projects\\JavaMarathon2021\\JavaPractice\\JavaMarathon2021\\JavaPractice\\FILE1");
        File file2 = new File("C:\\Projects\\JavaMarathon2021\\JavaPractice\\JavaMarathon2021\\JavaPractice\\FILE2");
        Random random = new Random();
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        PrintWriter pw = null;
        PrintWriter pw2 = null;

        try {
            pw = new PrintWriter(file);
            pw2 = new PrintWriter(file2);
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось создать файл");
        }

        for (int j : array) pw.print(j + " ");
        pw.close();

        for (int i = 0; i < array.length; i = i + 20) {
            for (int j = i; j < i + 20; j++) {
                sum += array[j] / 20f;
                pw2.print(sum + " ");
            }
            pw2.close();
        }
        try {
            printResult(file2);
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось создать файл");;
        }
    }

    public static void printResult(File file2) throws FileNotFoundException {
        //  List<Integer> numbers = new ArrayList<>();
        String line;
        float totalSum = 0;
        Scanner scanner = new Scanner(file2);
        while (scanner.hasNext()) {
            line = scanner.nextLine();
            String[] ar = line.split(" ");
            int[] numbers = new int[ar.length];
            for (int i = 0; i< ar.length; i++) {
                numbers[i] = (int) Float.parseFloat(ar[i]);
               totalSum += numbers[i];
            }
            System.out.println(totalSum);
        }
    }
}