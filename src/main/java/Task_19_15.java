public class Task_19_15 {

    //Написать метод, который генерирует строку слов случайной длины, состоящую из случайных букв английского алфавита.

    public static String generateRandomEnglishLetters () {

        StringBuilder result = new StringBuilder();
        int length = (int) ((Math.random() * 100) + 1);

        for (int i = 0; i < length; i++) {
            result.append((char) ((Math.random() * 26) + 97));
        }

        return result.toString();
    }
}
