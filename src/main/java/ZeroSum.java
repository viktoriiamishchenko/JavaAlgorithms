public class ZeroSum {

    public static int [] zeroSum (int[] array) {

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i] + array[j] == 0) {
                    return new int []{array[i],array[j]};
                }
            }
        }

        return new int [1];
    }
}
