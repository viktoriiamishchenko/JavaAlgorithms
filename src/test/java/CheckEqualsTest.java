import org.junit.Assert;
import org.junit.Test;

public class CheckEqualsTest {

    @Test
    public void checkEqualsTest () {

        int result;
        result = CheckEquals.checkEquals(89, 89);
        Assert.assertEquals(result, 0);

        result = CheckEquals.checkEquals(-89, 89);
        Assert.assertEquals(result, -1);

        result = CheckEquals.checkEquals(89, -89);
        Assert.assertEquals(result, 1);
    }
}
