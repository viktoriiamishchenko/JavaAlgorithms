import org.junit.Test;
import org.testng.Assert;

public class GetOddCharsTest {

    @Test
    public void testGetOddChars () {

        String result = "";
        result = GetOddChars.getOddChars("QAForEveryone");
        Assert.assertEquals(result, "AoEeyn");

        result = GetOddChars.getOddChars("JavaLessonsAreFun");
        Assert.assertEquals(result, "aaesnAeu");
    }
}
