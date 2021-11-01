import java.util.Locale;

public class Bottles99 {


    public void printBottles99 () {
        String newResult = "";
        String bottles = " bottles of beer";
        String wall = " on the wall";
        String commaSpace = ", ";
        String dot = ". ";
        String take = "Take one down and pass it around";
        String noMore = "No more";
        String goToTheStore = "Go to the store and buy some more";

        for (int i = 0; i < bottles.length(); i++) {
            if (bottles.charAt(i) != 's') {
                newResult += bottles.charAt(i);
            }
        }

        for (int i = 99; i >= 0; i-- ) {
            if (i == 0) {
                System.out.println(noMore+ bottles + wall + commaSpace + noMore.toLowerCase(Locale.ROOT) + bottles + dot);
                System.out.println(goToTheStore + commaSpace + (i + 99) + bottles + wall + dot);
            } else if (i == 1) {
                System.out.println(i + newResult + wall + commaSpace + i + newResult + dot);
                System.out.println(take + commaSpace + noMore.toLowerCase(Locale.ROOT) + bottles + wall + dot);
                System.out.println();
            } else if (i == 2) {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + newResult + wall + dot);
                System.out.println();
            } else {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + bottles + wall + dot);
                System.out.println();
            }
        }
    }
}

