import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task_19_3_HashMap {

//    Напишите метод, который в строке находит слова минимальной и максимальной длины, и количество слов одинаковой длины (максимально одинаковой).
//
//            “What a wonderful day!” -> [“a”, “wonderful”, “0”]
//            “I love to learn Java!” -> [“I”, “learn”, “2”]

    public String minAndMax (String str) {
        String [] array = str.replaceAll("[^a-zA-Z\\s]", "").split( " ");
        String [] result = new String [] {array [0], array[0], "0"};
        Map<Integer, Integer> lengths = new HashMap<>();

        for (String string: array) {
            if(string.length() < result[0].length()) {
                result[0] = string;
            }

            if (string.length() > result[1].length()) {
                result[1] = string;
            }

            int lengthOfStr = string.length();
            Integer count = lengths.get(lengthOfStr);
            if (count == null) {
                lengths.put(lengthOfStr, 1);
            } else {
                lengths.put(lengthOfStr, count+1);
            }
        }

        int minLength = result[0].length();

        for (Integer n : lengths.keySet()) {
            if (lengths.get(n) > 1 && n >= minLength) {
                result[2] = String.valueOf(lengths.get(n));
                minLength = n;
            }
        }

        return Arrays.toString(result);
    }

}
