public class Task_19_14 {
    //Написать метод, который генерирует строку случайных букв русского алфавита.

    public static String generateRandomRussianLetters () {

        StringBuilder result = new StringBuilder();
        int length = (int) ((Math.random() * 100) + 1);

        for (int i = 0; i < length; i++) {
            result.append((char) ((Math.random() * 32) + 1072));
        }

        return result.toString();
    }
}
