import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();
        switch (shape) {
            case "triangle": {
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();

                double p = (a + b + c) / 2;

                System.out.println(Math.sqrt(p * (p - a) * (p - c) * (p - b)));
                break;
            }
            case "rectangle": {
                double a = sc.nextDouble();
                double b = sc.nextDouble();

                System.out.println((double) (a*b));
                break;
            }
            case "circle": {
                double r = sc.nextDouble();
                System.out.println(3.14 * r * r);
                break;
            }
        }
    }
}