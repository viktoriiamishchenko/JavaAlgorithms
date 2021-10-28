import org.junit.Assert;
import org.junit.Test;

public class OddEvenTest {

    @Test
    public void testOddEven () {

        String result;
        result = OddEven.oddEven(-345);
        Assert.assertEquals(result, "Odd");

        result = OddEven.oddEven(0);
        Assert.assertEquals(result, "Even");

        result = OddEven.oddEven(222222);
        Assert.assertEquals(result, "Even");

        result = OddEven.oddEven(2147483647 + 1);
        Assert.assertEquals(result, "Undefined");







    }
}
