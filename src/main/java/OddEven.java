public class OddEven {

    public static String oddEven (long a) {
        String result = "null";

        if (a <= -2147483647L || a >= 2147483647L) {
            result = "Undefined";
            } else {
            if (a % 2 == 0) {
                result = "Even";
            } else {
                result = "Odd";
            }
        }

        return result;
    }

    public static void main (String [] args) {
        System.out.println(oddEven(2147483647 + 1));
    }
}
