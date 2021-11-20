public class Task_19_5_StringBuilder {
    //Написать метод, который проверяет строку на уникальность символов в ней.

    private boolean isUnique (String str) {
        StringBuilder referenceString = new StringBuilder();

        for (char letter: str.toCharArray()) {
            if(!referenceString.toString().contains(String.valueOf(letter))) {
                referenceString.append(letter);
            }
        }

        return referenceString.toString().equals(str);
    }
}
