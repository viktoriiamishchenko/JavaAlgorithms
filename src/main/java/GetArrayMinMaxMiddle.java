import java.util.Arrays;

public class GetArrayMinMaxMiddle {

    public static int [] getArrayMinMaxMiddle (int [] arr) {
        int sum = 0;
        int average = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int res = 0;

        if (arr.length == 1) {
            return new int [] {arr[0], arr[0], arr[0]};
        }

        if (arr.length == 2) {
            if (arr[0] > arr[1]) {
                return new int [] {arr[1], arr[0], ((arr[0] + arr[1]) / 2)};
            } else if (arr[0] < arr[1]) {
                return new int [] {arr[0], arr[1], ((arr[0] + arr[1]) / 2)};
            } else {
                return new int[] {arr[0], arr[0], arr[0]};
            }
        }

        int [] arr2 = new int[3];
        for (int i = 0; i < arr.length; i++) {
            res = arr[i];
            sum += res;
            average = sum / arr.length;
            arr2[2] = average;

            if (res > max) {
                max = res;
                arr2[0] = res;
            }

            if (res < min) {
                min = res;
                arr2[1] = res;
            }
        }

        return arr2;
    }

    public static void main (String [] args) {
        System.out.println(Arrays.toString(getArrayMinMaxMiddle(new int[] {1, 2, 3, 4, 5})));
    }
}
