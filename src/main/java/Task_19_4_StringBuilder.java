public class Task_19_4_StringBuilder {
    //Написать метод, который принимает на вход строку букв,  и  возвращает строку, в которой только уникальные буквы
    //
    //Пример:
    //method(“abcaczdbdakcazdbaz”)
    // Вернуть
    //“abczdk"

    private String returnUniqueLetters (String str) {
        StringBuilder referenceString = new StringBuilder();

        for (char letter : str.toCharArray()) {
            if(!referenceString.toString().contains(String.valueOf(letter))) {
                referenceString.append(letter);
            }
        }

        return referenceString.toString();
    }
}
