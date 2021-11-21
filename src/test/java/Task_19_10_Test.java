import org.testng.Assert;
import org.testng.annotations.Test;

public class Task_19_10_Test {

    @Test
    public void testIsPalindrome () {

        boolean result;
        result = Task_19_10.isPalindrome1("Madam");
        Assert.assertTrue(result);

        result = Task_19_10.isPalindrome1("12321");
        Assert.assertTrue(result);

        result = Task_19_10.isPalindrome1("А роза упала на лапу Азора");
        Assert.assertTrue(result);

    }
}
