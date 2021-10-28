public class GetSumOrSubtraction {

    public static int getSumOrSubtraction (int a, int n) {
        int result = 0;
        if (a < n) {
            for(int i = a; i <= n; i++) {
                result += i;
            }
        } else {
           for(int i = a; i >= n; i--) {
               result -= i;
           }
        }

        return result;
    }

    public static void main (String [] args) {
        System.out.println(getSumOrSubtraction(1,-10));

    }

}
