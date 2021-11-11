public class SmallestDifference {

    public static int [] SmallestDifference (int [] array) {
        if (array.length == 2 || array.length == 1 || array.length == 0) {
            return array;
        }

        int [] array2 = new int[2];
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (Math.abs(array[i] - array[j]) < minimum) {
                    minimum = Math.abs(array[i] - array[j]);
                    array2 = new int[] {array[i], array[j]};
                }
            }
        }

        return array2;
    }
}
