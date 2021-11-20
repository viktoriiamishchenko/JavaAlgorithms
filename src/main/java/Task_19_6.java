import java.util.Locale;

public class Task_19_6 {

    //Даны две строки. Определите, можно ли из некоторых символов первой строки составить вторую строку.
    //
    //      Пример:
    //method( “QAForEveryone”, “Verona”) -> true
    //method( “QAForEveryone”, “frog”) -> false

    private boolean createSecondString (String str1, String str2) {

        if (str1.length() < str2.length()) {
            return false;
        }

        StringBuilder result = new StringBuilder(str1.toLowerCase(Locale.ROOT));

        boolean isSymbolPresent = false;

        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < result.length(); j++) {
                if (str2. toLowerCase(Locale.ROOT).charAt(i) == result.charAt(j)) {
                    isSymbolPresent = true;
                    result.deleteCharAt(j);
                    break;
                }
            }
            if (!isSymbolPresent) {
                return false;
            } else {
                isSymbolPresent = false;
            }
        }

        return true;
    }
}
