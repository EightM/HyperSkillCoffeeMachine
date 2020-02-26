import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int n = sc.nextInt();
        while (n != 0) {
            max = Math.max(max, n);
            n = sc.nextInt();
        }

        System.out.println(max);
    }
}