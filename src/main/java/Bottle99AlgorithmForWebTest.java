import java.util.Locale;

public class Bottle99AlgorithmForWebTest {

        private static final String BOTTLES = " bottles of beer";
        private static final String BOTTLE = " bottle of beer";
        private static final String WALL = " on the wall";
        private static final String COMMA_SPACE = ", ";
        private static final String DOT = ".";
        private static final String TAKE= "Take one down and pass it around";
        private static final String NO_MORE = "No more";
        private static final String GO_TO_THE_STORE = "Go to the store and buy some more";
        private static final String NEW_LINE = "\n";

        private String songLyric () {
            StringBuilder expectedResult = new StringBuilder();
            for (int i = 99; i >= 0; i--) {
                if (i == 99) {
                    expectedResult
                            .append(i)
                            .append(BOTTLES)
                            .append(WALL)
                            .append(COMMA_SPACE)
                            .append(i)
                            .append(BOTTLES)
                            .append(DOT)
                            .append(NEW_LINE);
                } else if (i == 0) {
                    expectedResult
                            .append(TAKE)
                            .append(COMMA_SPACE)
                            .append(NO_MORE.toLowerCase(Locale.ROOT))
                            .append(BOTTLES)
                            .append(WALL)
                            .append(DOT)
                            .append(NO_MORE)
                            .append(BOTTLES)
                            .append(WALL)
                            .append(COMMA_SPACE)
                            .append(NO_MORE.toLowerCase(Locale.ROOT))
                            .append(BOTTLES)
                            .append(DOT)
                            .append(NEW_LINE);
                    expectedResult
                            .append(GO_TO_THE_STORE)
                            .append(COMMA_SPACE)
                            .append(99)
                            .append(BOTTLES)
                            .append(WALL)
                            .append(DOT);
                } else {
                    if (i != 1) {
                        expectedResult
                                .append(TAKE)
                                .append(COMMA_SPACE)
                                .append(i)
                                .append(BOTTLES)
                                .append(WALL)
                                .append(DOT)
                                .append(i)
                                .append(BOTTLES)
                                .append(WALL)
                                .append(COMMA_SPACE)
                                .append(i)
                                .append(BOTTLES)
                                .append(DOT)
                                .append(NEW_LINE);
                    } else if (i == 1) {
                        expectedResult
                                .append(TAKE)
                                .append(COMMA_SPACE)
                                .append(i)
                                .append(BOTTLE)
                                .append(WALL)
                                .append(DOT)
                                .append(i)
                                .append(BOTTLE)
                                .append(WALL)
                                .append(COMMA_SPACE)
                                .append(i)
                                .append(BOTTLE)
                                .append(DOT)
                                .append(NEW_LINE);
                    }
                }
            }

            return String.valueOf(expectedResult);
        }

        public static void main (String [] args) {



        }


}
