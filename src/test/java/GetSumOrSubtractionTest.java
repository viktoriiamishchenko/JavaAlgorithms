import org.junit.Assert;
import org.junit.Test;

public class GetSumOrSubtractionTest {

    @Test
    public void getSumOrSubtractionTest () {

        int result;
        result = GetSumOrSubtraction.getSumOrSubtraction(1, 222);
        Assert.assertEquals(result, 24753);

        result = GetSumOrSubtraction.getSumOrSubtraction(1, -10);
        Assert.assertEquals(result, 54);



    }
}
