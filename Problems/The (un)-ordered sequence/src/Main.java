import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ordered = true;
        boolean desc = false;
        boolean asc = false;

        while (n != 0) {
            int previous = n;
            n = sc.nextInt();
            if (n == 0) {
                break;
            }

            if (n - previous == 0) {
                continue;
            }

            if (n - previous < 0) {
                desc = true;
            } else {
                asc = true;
            }

            if (asc && desc) {
                ordered = false;
                break;
            }
        }

        if (ordered) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}