import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int count = 0;

        for (int i = 0; i <= 1000; i++) {
            if (count < 3) {
                if (a * (i * i * i) + b * (i * i) + c * i + d == 0) {
                    System.out.println(i);
                    count++;
                }
            }

        }
    }
}