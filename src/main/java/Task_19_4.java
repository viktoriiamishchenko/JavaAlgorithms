public class Task_19_4 {
    //Написать метод, который принимает на вход строку букв,  и  возвращает строку, в которой только уникальные буквы
    //
    //Пример:
    //method(“abcaczdbdakcazdbaz”)
    // Вернуть
    //“abczdk"

    private String getUniqueLetter (String str) {
        if (str.length() == 0) return null;

        String result = String.valueOf(str.charAt(0));

        for (int i = 1; i < result.length(); i++) {
            int count = 0;
            for (int j = 0; j < result.length(); j++) {
                if (str.charAt(i) == result.charAt(i)) {
                    count++;
                }
            }
           if (count == 0) {
               result += str.charAt(i);
           }
        }

        return result;
    }


}
