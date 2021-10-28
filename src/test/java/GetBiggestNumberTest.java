import org.junit.Assert;
import org.junit.Test;

public class GetBiggestNumberTest {

    @Test
    public void getBiggestNumberTest () {
        int result;
        result = GetBiggestNumber.getBiggestNumber(3333, 9999);
        Assert.assertEquals(result, 9999);

        result = GetBiggestNumber.getBiggestNumber(3333, 3333);
        Assert.assertEquals(result, -1);


    }
}
