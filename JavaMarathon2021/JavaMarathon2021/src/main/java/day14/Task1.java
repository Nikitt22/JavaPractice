package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        List<Integer> numbers = new ArrayList<>();
        int sum = 0;
        int numberOfDigits = 0;

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext())
                numbers.add(scanner.nextInt());
            scanner.close();
            System.out.println(numbers);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        for (Integer x : numbers) {
            sum += x;
            numberOfDigits = x;
        }
        if (numberOfDigits == 10)
            System.out.println("The sum of all numbers = " + sum);
        else {
            System.out.println("Invalid incoming file");
        }
        System.out.println(numberOfDigits);
    }
}



