import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countD = 0;
        int countC = 0;
        int countB = 0;
        int countA = 0;

        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int number = sc.nextInt();
            switch (number) {
                case 5:
                    countA++;
                    break;
                case 4:
                    countB++;
                    break;
                case 3:
                    countC++;
                    break;
                case 2:
                    countD++;
                    break;
            }
        }

        System.out.println(countD + " " + countC + " " + countB + " " + countA);
    }
}