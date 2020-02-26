public class Main {

    public static void main(String[] args) {
        Secret[] secretEnums = Secret.values();
        int count = 0;

        for (Secret sc : secretEnums) {
            String str = sc.toString();
            if (str.startsWith("STAR")) {
                count++;
            }
        }

        System.out.println(count);
    }
}

/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
*/