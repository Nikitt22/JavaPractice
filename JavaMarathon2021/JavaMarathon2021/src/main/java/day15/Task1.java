package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws RuntimeException {
        String pathShoes = "C:\\Projects\\JavaMarathon2021\\JavaPractice\\JavaMarathon2021\\JavaPractice\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\shoes.csv";
        String pathSold = "C:\\Projects\\JavaMarathon2021\\JavaPractice\\JavaMarathon2021\\JavaPractice\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\missing_shoes.txt";
        File file = new File(pathShoes);
        File file2 = new File(pathSold);
    soldShoes(file, file2);
    }

    public static void soldShoes(File file, File file2){
        try {
            Scanner scanner = new Scanner(file);
            PrintWriter pw = new PrintWriter(file2);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] array = line.split(";");
                if (Integer.parseInt(array[2]) == 0)
                    pw.println(line);

            }
            scanner.close();
            pw.close();

        } catch (FileNotFoundException e) {
           //    throw new RuntimeException("File not found");
        }
    }
}
