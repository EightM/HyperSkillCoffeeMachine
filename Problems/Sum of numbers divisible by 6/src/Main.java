import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int number = sc.nextInt();
            if (number % 6 == 0) {
                sum += number;
            }
        }

        System.out.println(sum);
    }
}