package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        parseFileToStringList(file);
    }

    public static void parseFileToStringList(File file) {
        List<String> people = new ArrayList<>();
            try {
                Scanner scanner = new Scanner(file);
               while (scanner.hasNextLine()) {
               String line = scanner.nextLine();
               String[] ar = line.split(" ");

               if (Integer.parseInt(ar[1]) < 0)
                   throw  new NumberFormatException();

                people.add(line);

           }
                scanner.close();
                System.out.println(people);
            } catch (FileNotFoundException e) {
                System.out.println("File not found");;
            }
            catch (NumberFormatException e){
                System.out.println("Incorrect input file");
            }
    }
}


