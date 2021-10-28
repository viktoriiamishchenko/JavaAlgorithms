public class FizzBuzz35 {

    public static String fizzBuzz35 (int m) {

        if (m % 5 == 0 && m % 3 == 0) {
            return "Good Number";
        } if (m % 3 ==0 && m % 5 != 0) {
            return "Bad Number";
        } else if (m % 5 ==0 && m % 3 != 0) {
            return "Poor Number";
        } else {
            return "-1";
        }
    }
}
