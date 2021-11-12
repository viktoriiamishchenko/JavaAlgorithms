import org.junit.Test;
import org.testng.Assert;

public class StringToUpperCaseTest {

    @Test
    public void testStringToUpperCase () {

        String result = "";
        result = StringToUpperCase.stringToUpperCase("QA For  Everyone ");
        Assert.assertEquals(result, "QA FOR EVERYONE");

        result = StringToUpperCase.stringToUpperCase("Java lessons  are fun");
        Assert.assertEquals(result, "JAVA LESSONS ARE FUN");
    }
}
