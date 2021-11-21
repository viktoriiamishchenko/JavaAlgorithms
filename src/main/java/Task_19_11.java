import java.util.Locale;

public class Task_19_11 {

    //Write a method, which checks if two given strings are Anagram of each other.
    // Two String is said to be an anagram of each other, if they contain exactly the same characters but in a different order.
    //
    //Пример:
    //method("O, Draconian devil!", "!Leonardo Da Vinci,")  -> true
    //method("Oh, lame saint!", "The Mona Lisa,!") -> true

    public static boolean idAnagram (String one, String two) {
        boolean result = true;
        one = one.toLowerCase(Locale.ROOT);
        two = two.toLowerCase(Locale.ROOT);
        int count = 0;

        if (one.length() == two.length()) {
            for (int i = 0; i < one.length() - 1; i++) {
                for (int j = 0; j < two.length() - 1; j++) {
                    if (one.charAt(i) == two.charAt(j)) {
                        count ++;
                    }
                    if (count == one.length()) {
                        result = true;
                    }
                }
            }
        } else {
            result = false;
        }

        return result;
    }

}
