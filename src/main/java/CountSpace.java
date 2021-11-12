public class CountSpace {

    public static int countSpace (String str) {
        int result = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ') {
                result++;
            }
        }

        return result;
    }
}
