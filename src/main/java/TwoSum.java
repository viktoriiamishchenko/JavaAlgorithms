public class TwoSum {

    public static  int [] twoSum (int [] array, int targetNumber) {
        int [] newArray = new int [2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == targetNumber) {
                    newArray[0] = j;
                    newArray[1] = i;
                }
            }
        }

        return newArray;
    }
}
