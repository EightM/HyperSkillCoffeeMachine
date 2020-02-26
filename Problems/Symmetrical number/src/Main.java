import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.length() == 1) {
            str = "000" + str;
        } else if (str.length() == 2) {
            str = "00" + str;
        } else if (str.length() == 3) {
            str = "0" + str;
        }

        String subStr = new StringBuilder(str.substring(2)).reverse().toString();
        int number = Integer.parseInt(str);
        if (str.substring(0, 2).equals(subStr)) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }

    }
}