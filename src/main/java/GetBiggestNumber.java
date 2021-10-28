public class GetBiggestNumber {

    public static int getBiggestNumber (int a, int b) {

        if (a == b) {
            return -1;
        } else if(a > b) {
            return a;
        } else {
            return b;
        }
    }
}
