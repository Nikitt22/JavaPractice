package day18;

public class Task2 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(count7(717771237));
    }

    public static int count7(int digit) {
        if (digit == 0)
            return 0;

        if (digit % 10 == 7)
            return 1 + count7(digit / 10);
        else
            return count7(digit / 10);
    }
}
