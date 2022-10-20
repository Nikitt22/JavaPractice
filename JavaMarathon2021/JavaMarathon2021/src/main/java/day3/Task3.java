package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            double x1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            if (x2 == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            double x3 = x1 / x2;
            System.out.println(x3);

        }
    }
}


