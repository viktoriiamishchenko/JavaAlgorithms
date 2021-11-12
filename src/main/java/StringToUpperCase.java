import java.util.Locale;

public class StringToUpperCase {
    //    Написать метод, который переведет строку в upper case и уберет все ЛИШНИЕ пробелы


    public static String  stringToUpperCase (String str) {
        String result = "";

        for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == ' ') {
                    if (i == 0) {
                        result = str.substring(i);
                    } else if (i == str.length() - 1) {
                        result = str.substring(i);
                    }

                }
              }

        return result.toUpperCase(Locale.ROOT);

    }


}

