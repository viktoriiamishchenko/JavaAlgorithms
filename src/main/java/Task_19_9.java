public class Task_19_9 {
    //Write a method that will take one string as an argument and will return the reverse version of this string.

    public static String reverseString (String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    public static void main (String [] args) {
        System.out.println(reverseString("Hello!"));
    }


}
