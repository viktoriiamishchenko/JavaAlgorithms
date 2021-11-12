import java.util.Locale;

public class PrintChars {
    //Написать метод, который принимает на вход строку и печатает все буквы “q”, “o” и “r” из этой строки:
    //
    //Test Data
    //“QAForEveryone”
    //“Java lessons are fun”

    public static String printChars (String str) {
        String printChars = "";
        str.toLowerCase(Locale.ROOT);
        for (int i = 0; i < str.length() - 1; i ++) {
            if (str.charAt(i) == 'g' || str.charAt(i) == 'o' || str.charAt(i) == 'r') {
                printChars += str.charAt(i);
            }
        }

        return printChars;
    }


}
