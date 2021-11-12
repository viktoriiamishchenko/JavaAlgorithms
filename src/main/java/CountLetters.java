import java.util.Locale;

public class CountLetters {

    public static int countLetters (String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        int result = 0;

        for (int i = 0; i < lowerCase.length(); i ++) {

            if (lowerCase.charAt(i) == 'a' ||lowerCase.charAt(i) == 'e' || lowerCase.charAt(i) == 'i'|| lowerCase.charAt(i) == 'o'|| lowerCase.charAt(i) == 'u') {
                result ++;
            }
        }

        return result;
    }
}
