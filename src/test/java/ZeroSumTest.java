import org.junit.Test;
import org.testng.Assert;

public class ZeroSumTest {

    @Test
    public void testZeroSum () {

        int [] result;
        result = ZeroSum.zeroSum(new int [] {35, 23, 12, 89, -23, -48, 100});
        Assert.assertEquals(result, new int [] {23, -23});

    }
}
