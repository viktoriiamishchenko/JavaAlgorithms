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
        str = str.toLowerCase(Locale.ROOT).trim().replaceAll(" ", "");
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        if (str.equals(result.toString())) {
            res = true;
        } else {
            res = false;
        }

        return res;
    }

    //public static <T> boolean isPalindrome1 (T data)
}