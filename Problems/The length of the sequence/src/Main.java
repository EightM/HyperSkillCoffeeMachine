import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        while (n != 0) {
            count++;
            n = sc.nextInt();
        }

        System.out.println(count);
    }
}