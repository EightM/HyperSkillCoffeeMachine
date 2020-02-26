import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sq = i * i;
        while (sq <= n) {
            System.out.println(sq);
            i++;
            sq = i * i;
        }
    }
}