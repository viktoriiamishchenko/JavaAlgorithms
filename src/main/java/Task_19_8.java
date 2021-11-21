public class Task_19_8 {
    //Find the non-repeating length of the longest substring in a string
    //Example :  aabcb        Output expected: 3
    //Example2: aaaaa        Output expected: 1

    public int maxSubstringLength (String str) {

        StringBuilder subString = new StringBuilder();
        int maxLength = 0;
        boolean isLetterPresent = false;
        int indexOfSameLetter = -1;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < subString.length(); j++) {
                if (str.charAt(i) == subString.charAt(j)) {
                    isLetterPresent = true;
                    indexOfSameLetter = j;
                    break;
                } else {
                    isLetterPresent = false;
                }
            }
            if (isLetterPresent) {
                if (subString.length() > maxLength) {
                   maxLength = subString.length();
                }

                for (int k = indexOfSameLetter; k >= 0; k--) {
                    subString.deleteCharAt(k);
                }
            }
            subString.append(str.charAt(i));
        }

        return maxLength;
    }
}
