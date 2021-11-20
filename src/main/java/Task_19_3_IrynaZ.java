import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_19_3_IrynaZ {

    private static List<String> getMinMaxEquWords (String str) {
        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;
        int count;
        int eqLength = 0;

        List <String> strAsList = Arrays.asList(str.trim().replaceAll("^a-aZ-Z\\s", "").split(" "));
        String [] result = new String [3];
        result[2] = "0";

        for (int i = 0; i < strAsList.size(); i++) {
            int iWordLength = strAsList.get(i).length();
            count = 1;

            if(minLength > iWordLength) {
                minLength = iWordLength;
                result[0] = strAsList.get(i);
            }
            if(maxLength < iWordLength) {
                maxLength = iWordLength;
                result[1] = strAsList.get(i);
            }

            if (eqLength < iWordLength) {
                for (int j = i + 1; j < strAsList.size(); j++) {
                    int jWordLength = strAsList.get(j).length();

                    if (iWordLength == jWordLength) {
                        count++;
                    }
                }
            }
        }

        return new ArrayList<>(Arrays.asList(result));
    }
}
