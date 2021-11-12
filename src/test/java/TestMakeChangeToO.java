import org.junit.Test;
import org.testng.Assert;

public class TestMakeChangeToO {

    @Test
    public void testMakeChangeToO () {

        String result = "";
        result = MakeChangeToO.makeChangeToO("QAF0rEvery0ne");
        Assert.assertEquals(result, "QAForEveryone");

    }

}
