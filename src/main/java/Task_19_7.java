public class Task_19_7 {
    //Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".
    //Example 1:
    //Input: String[] strs = {"flower","flow","flight"}
    //Output: "fl"
    //Example 2:
    //Input: String[] strs = {"dog","racecar","car"}
    //Output: ""
    //Explanation: There is no common prefix among the input strings.

    private String commonPrefix (String[] array) {

        int minWordLength = Integer.MAX_VALUE;
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < minWordLength) {
                minWordLength = array[i].length();
            }
        }

        for (int i = 0; i < minWordLength; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].charAt(i) == array[j + 1].charAt(i)) {
                    count++;
                } else {
                    count = 0;
                    break;
                }
            }
            if (count != 0) {
                result.append(array[0].charAt(i));
                count = 0;
            }
        }

        return result.toString();
    }


}
