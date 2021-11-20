public class Task_19_3 {
    //Напишите метод, который в строке находит слова минимальной и максимальной длины,
    // и количество слов одинаковой длины (максимально одинаковой).
    //“What a wonderful day!” -> [“a”, “wonderful”, “0”]
    //       “I love to learn Java!” -> [“I”, “learn”, “2”]

    public static String[] getStatistic (String str) {
        if (str.length() == 0) return null;

        int countSpace = 0;
        for (int i = 0; i < str.length(); i++ ) {
            if (str.charAt(i) == ' ') {
                countSpace++;
            }
        }

        String[] array = new String[3];
        int[] arrayCount = new int[countSpace + 1];
        int minLength = str.length();
        int maxLength = 0;
        int leftMin = 0;
        int rightMin = 0;
        int leftMax = 0;
        int rightMax = 0;
        int i = 0;
        int j = 0;

        while (i < str.length() - 1) {
            int count = 0;
            while (i < str.length() - 1 && str.charAt(i) != ' ') {
                count++;
                i++;
            }
            if(count < minLength) {
                minLength = count;
                leftMin = i - count;
                rightMin = i - 1;
            }
            if(count > maxLength) {
                maxLength = count;
                leftMax = i - count;
                rightMax = i - 1;
            }
            arrayCount[j] = count;
            j++;
            i += 1;
        }

        int max = arrayCount[0];
        int maxCount = 0;
        int result = 0;
        for (int k = 0; k < countSpace; k++) {
            for (int n = k; n < countSpace + 1; n++ ) {
                if (arrayCount[k] == arrayCount[n]) {
                    result++;
                }
            }
            if(result > maxCount) {
                max = arrayCount[k];
                maxCount = result;
            }
            result = 0;

            if (maxCount == 1) {
                maxCount = 0;
            }
        }

        array[0] = str.substring(leftMin, rightMin + 1);
        array[1] = str.substring(leftMax, rightMax + 1);
        array[2] = String.valueOf(maxCount);

        return array;

    }




}
