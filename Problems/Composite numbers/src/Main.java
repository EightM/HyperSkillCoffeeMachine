import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {

        if (number == 1) {
            return false;
        }


        int d = 2;
        while (number % d != 0) {
            d++;
        }

        return number != d;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}