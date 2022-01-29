import java.util.Arrays;

public class AscendingSequence {

    public static int [] ascendingSequence (int a, int b, int n) {
        int count = 0;
        int [] array1 = {-1};

        if (b < a || b - a == 0 || n < 0 || a == b) {
           return array1;
        } else {
            int[] array = new int[((b - a) / n) + 1];
            for (int i = a; i <= b; i += n) {
                array[count] = i;
                count++;
            }

            return array;
        }
    }

    public static void main (String [] args) {
        System.out.println(Arrays.toString(ascendingSequence(10,25,5)));

    }


}



