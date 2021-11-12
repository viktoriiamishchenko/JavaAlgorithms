import java.util.Locale;

public class DeleteSpaceAndMakeLowerCase {

    //Написать метод, который удалит все пробелы из входящей строки, и заменит все большие буквы на маленькие.

    public static String deleteSpaceAndMakeLowerCase (String str) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                stringBuilder.append(str.charAt(i));

            }
        }
        result = String.valueOf(stringBuilder);
        return result.toLowerCase(Locale.ROOT);
    }
}
