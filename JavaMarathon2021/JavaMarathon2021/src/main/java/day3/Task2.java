package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double x1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            if (x2==0){
                break;
            }
            double x3 = x1 / x2;
            System.out.println(x3);

        }
    }
}
