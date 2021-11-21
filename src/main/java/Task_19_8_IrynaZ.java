public class Task_19_8_IrynaZ {

    private static int countLengthOfUniqueSubstring (String word) {
        StringBuilder result = new StringBuilder();
        int length = 0;

        if (word.length() != 0) {
            length = 1;
        } else {
            return length;
        }

        for (int i = 0; i < word.length() - 1; i++) {
            String letter = String.valueOf(word.charAt(i));
            String nextLetter = String.valueOf(word.charAt(i + 1));
            String lastLetter = String.valueOf(word.charAt(word.length() - 1 ));

            if (!letter.equals(nextLetter) && !result.toString().contains(letter)) {
                result.append(letter);
            }

            if (length < result.length()) {
                length = result.length();
            }

            if (i + 1 == word.length() - 1 && !result.toString().contains(lastLetter)) {
                result.append(lastLetter);
            }
        }

        return length;
    }
}
