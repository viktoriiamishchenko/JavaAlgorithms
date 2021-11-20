public class Task_19_5 {
    //Написать метод, который проверяет строку на уникальность символов в ней.

    private boolean checkStringForUniqueCharacters (String str) {

        if (str.length() == 0) return false;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }
}
