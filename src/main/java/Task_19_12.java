import java.util.Locale;

public class Task_19_12 {
    //Написать метод, который принимает на вход строку и производит вычисления в этой строке в порядке математических действий.
    //Входные данные:
    //"5*3-9/3"
    //
    //Выходные данные:
    //“12

    private static String getSubstringLeft (String str, int i) {
        int count = 0;

        for (int j = i - 1; j >= 0; j--) {
            if (str.charAt(j) != '+' && str.charAt(j) != '-') {
                count++;
            } else {
                break;
            }
        }
        String substring = str.substring(i - count, i);

        return substring;
    }

    private static  String getSubstringRight (String str, int i) {
        int count = 0;

        for (int j = i + 1; j < str.length(); j++) {
            if (str.charAt(j) != '+' && str.charAt(j) != '-') {
                count++;
            } else {
                break;
            }
        }
        String substring = str.substring(i + 1, i + count + 1);

        return substring;
    }

    private static String calculateSubstring (String str, int i,  String sign) {
        int tempResult = 0;
        int numL = Integer.parseInt(getSubstringLeft(str, i));
        int numR = Integer.parseInt(getSubstringRight(str, i));

        StringBuilder substring = new StringBuilder();
        substring.append(numL).append(sign).append(numR);

        tempResult = sign.equals("*") ? numL * numR
                : sign.equals("/") ? numL / numR
                : sign.equals("+") ? numL + numR
                : numL - numR;

        str = str.replace(substring, String.valueOf(tempResult));

        return str;
    }

    private static String calculateTheExpression (String str) {
        str = str.trim().replaceAll("\\s+", "");

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                str = calculateSubstring(str, i, "*");
                i = -1;
            } else if (str.charAt(i) == '/') {
                str = calculateSubstring(str, i, "/");
                i = -1;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+') {
                str = calculateSubstring(str, i,"+");
                i = -1;
            } else if (str.charAt(i) == '-') {
                str = calculateSubstring(str, i, "-");
                i = -1;
            }
        }

        return str;
    }

    public static void main (String [] args) {
        System.out.println(calculateTheExpression("5*3-9/3"));
    }


}
