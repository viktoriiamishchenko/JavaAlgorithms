import java.util.ArrayList;
import java.util.List;

public class Task_19_4_List {

    private String checkUnique (String str) {
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (!chars.contains(str.charAt(i))) {
                chars.add(str.charAt(i));
            }
        }

        String result = "";
        for (Character c : chars) {
            result = result.concat(c.toString());
        }

        return result;
    }
}
