import org.junit.Test;
import org.testng.Assert;

public class CountSpaceTest {

    @Test
    public void testCountSpace () {

        int result;
        result = CountSpace.countSpace("QA For Everyone");
        Assert.assertEquals(result, 2);

        result = CountSpace.countSpace("Java lessons  are fun");
        Assert.assertEquals(result, 4);

    }
}
