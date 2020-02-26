import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int countShipped = 0;
        int countFixed = 0;
        int countRejects = 0;

        for (int i = 0; i < count; i++) {
            int size = sc.nextInt();
            switch (size) {
                case 1:
                    countFixed++;
                    break;
                case -1:
                    countRejects++;
                    break;
                case 0:
                    countShipped++;
                    break;
            }
        }

        System.out.println(countShipped + " " + countFixed + " " + countRejects);
    }
}