import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int max = 0;
        while (count > 0) {
            int n = sc.nextInt();
            if (n % 4 == 0) {
                max = Math.max(max, n);
            }
            count--;
        }

        System.out.println(max);
    }
}