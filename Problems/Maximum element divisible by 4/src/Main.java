import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;

        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int number = sc.nextInt();
            if (number % 4 == 0) {
                max = Math.max(max, number);
            }
        }

        System.out.println(max);
    }
}