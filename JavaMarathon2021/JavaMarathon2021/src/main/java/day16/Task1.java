package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test");
        printResult(file);
    }
    public static void printResult(File file){
        List<Integer> numbers = new ArrayList<>();
        double  sumAverage = 0;
        int numberOfDigits = 0;

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext())
                numbers.add(scanner.nextInt());
            scanner.close();

            for(Integer x: numbers){
                sumAverage = (sumAverage+x);
                numberOfDigits++;}
             sumAverage = sumAverage/numberOfDigits;
            System.out.printf(numberOfDigits + "\n" + "%.3f", sumAverage);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");;
        }
    }
}

