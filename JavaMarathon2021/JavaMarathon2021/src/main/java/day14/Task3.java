package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToObjList(file));
    }

   public static List<Person> parseFileToObjList(File file) {

        List<Person> person = new ArrayList<>();
        try {
           Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] ar = line.split(" ");
                if (Integer.parseInt(ar[1]) < 0)
                    throw  new NumberFormatException();
                 person.add(new Person((ar[0]), Integer.parseInt(ar[1])));}
            return person;
            } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (NumberFormatException e){
            System.out.println("Incorrect input file");
        }
       return null;
    }

    static class Person {
        private String name;
        private int age;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
