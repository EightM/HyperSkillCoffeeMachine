import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            count++;
            for (int i = count; i > 0; i--) {
                if (n <= 0) {
                    break;
                }
                System.out.println(count);
                n--;
            }

        }

    }
}