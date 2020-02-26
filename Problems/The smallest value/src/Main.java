import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int i = 1;
        long fac = i;
        while (fac <= n) {
            fac *= ++i;
        }

        System.out.println(i);
    }
}