import org.junit.Test;
import org.testng.Assert;

public class Task_19_9_Test {

    @Test
    public void testReverseString () {

        String result = "";
        result = Task_19_9.reverseString("Hello!");
        Assert.assertEquals(result, "!olleH");
    }
}
