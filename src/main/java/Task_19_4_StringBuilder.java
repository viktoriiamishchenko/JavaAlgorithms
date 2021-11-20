public class Task_19_4_StringBuilder {

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
