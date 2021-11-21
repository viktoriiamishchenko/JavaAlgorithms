import org.junit.Test;
import org.testng.Assert;

import java.util.Locale;

public class Task_19_11_Test {

    @Test
    public void testIsAnagram () {

        boolean result;
        result = Task_19_11.isAnagram("O, Dro", "Dor, O");
        Assert.assertTrue(result);

        result = Task_19_11.isAnagram("O, Draconian devil!", "!Leonardo Da Vinci,");
        Assert.assertTrue(result);

        result = Task_19_11.isAnagram("Oh, lame saint!", "The Mona Lisa,!");
        Assert.assertTrue(result);

    }

}
