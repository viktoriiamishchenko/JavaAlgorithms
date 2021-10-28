import java.util.Arrays;

public class GetOddNumbers {

    public static int [] getOddNumbers (int [] arr) {
        int count = 1;
        int newLength = 0;
        newLength = arr.length / 2;

        int [] arr2 = new int [newLength];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[count];
            count += 2;
        }

        return arr2;
    }

    public static void main (String [] args) {
        System.out.println(Arrays.toString(getOddNumbers(new int[] {-45, 590, 234, 985, 12, 68})));
    }
}
