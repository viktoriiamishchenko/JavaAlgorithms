import java.util.Locale;

public class Task_19_11 {

    //Write a method, which checks if two given strings are Anagram of each other.
    // Two String is said to be an anagram of each other, if they contain exactly the same characters but in a different order.
    //
    //Пример:
    //method("O, Draconian devil!", "!Leonardo Da Vinci,")  -> true
    //method("Oh, lame saint!", "The Mona Lisa,!") -> true

    public static boolean isAnagram (String one, String two) {
        one = one.toLowerCase(Locale.ROOT).trim().replaceAll(" ", "");
        two = two.toLowerCase(Locale.ROOT).trim().replaceAll(" ", "");
        char [] arr1 = new char[one.length() + 1];
        char [] arr2 = new char[two.length() + 1];
        int count = 0;

        for (int i = 0; i < one.length(); i++) {
            arr1[i] = one.charAt(i);
        }

        for (int i = 0; i < two.length(); i++) {
            arr2[i] = two.charAt(i);
        }

        if (one.length() == two.length()) {
            for (int i = 0; i < arr1.length - 1; i++ ) {
               for (int j = 0; j < arr2.length - 1; j++) {
                   if(arr1[i] == arr2[j]) {
                      count++;
                      arr2[j] = ' ';
                      break;
                   }
               }
            }
            if (one.length() == count) {
                return true;
            }
        }

        return false;
    }

}
