import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int busHeight = sc.nextInt();
        int bridgeNumbers = sc.nextInt();
        int bridgeCrush = 0;

        for (int i = 1; i <= bridgeNumbers; i++) {
            int bridgeHeight = sc.nextInt();
            if (busHeight >= bridgeHeight) {
                bridgeCrush = i;
                break;
            }
        }

        if (bridgeCrush != 0) {
            System.out.println("Will crash on bridge " + bridgeCrush);
        } else {
            System.out.println("Will not crash");
        }
    }
}