public class Clock {
    public static int Past(int h, int m, int s) {
        int result = 0;
        int result1 = 0;
        int result2 = 0;

        if (0 <= s && s <= 59) {
            result = s * 1000;
        }
        if (0 <= m && m <= 59) {
            result1 = m * 60 * 1000;
        }
        if (0 <= h && h <= 23) {
            result2 = h * 60 * 60 * 1000;
        }

        return result + result1 + result2;
    }

    public static void main(String[] args) {
        System.out.println(Past(10, 10, 10));

    }
}