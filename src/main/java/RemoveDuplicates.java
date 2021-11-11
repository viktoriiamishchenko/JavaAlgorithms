public class RemoveDuplicates {

    public static int [] RemoveDuplicates (int [] array) {
        int count = 1;
        int [] tempArray = new int[array.length];
        tempArray[0] = array[0];

        for (int i = 1; i < array.length;) {
            for (int j = 0; j < i;) {
                if (array[i] == tempArray[j]) {
                    i++;
                    break;
                }
                if (j == i && tempArray[j] == 0 || array[i] == 0 && j < i) {
                    tempArray[i] = array[i];
                    i ++;
                    j = -1;
                    count++;
                }
                j++;
            }
        }

        int [] result = new int [count];
        for (int j = 0; j < count; j++) {
            result[j] = tempArray[j];
        }

        return result;
    }
}
