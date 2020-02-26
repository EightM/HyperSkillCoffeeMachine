import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        int number = sc.nextInt();
        while (number != 0) {
            sum += number;
            number = sc.nextInt();
        }

        System.out.println(sum);
    }
}