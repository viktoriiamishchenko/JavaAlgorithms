import java.util.Locale;

public class Task_19_10 {

    //Write a method that will take a string as an argument. The method will return a palindrome.
    // A palindrome is a word, phrase, number, or sequence of words that reads the same backward as forward.
    //
    ////Такие варианты редко дают на интервью
    //a)
    //method(“А роза упала на лапу Азора”) -> “арозА упал ан алапу азор А”      или  “а розА упала на лапу азорА”
    //
    //
    ////Этот вариант чаще дают на интервью
    //b) Написать метод, который проверяет, является ли слово палиндромом.
    //
    //method(“Madam”) -> true    это палиндром
    //method(12321) -> true
    //“?a??m” -> “mazam”
    //
    //“?a??m?” -> true

    public static boolean isPalindrome1 (String str) {
        boolean res;
        String deleteSpace = str.replaceAll("[\\a-zA-Z]", "");
        StringBuilder result = new StringBuilder();
        for (int i = deleteSpace.length() - 1; i >= 0; i--) {
            result.append(deleteSpace.charAt(i));
        }

        if (deleteSpace.toLowerCase(Locale.ROOT).equals(result.toString().toLowerCase(Locale.ROOT))) {
            res = true;
        } else {
            res = false;
        }

        return res;
    }
}
