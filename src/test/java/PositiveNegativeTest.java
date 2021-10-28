import org.junit.Assert;
import org.junit.Test;

public class PositiveNegativeTest {

    @Test
    public void positiveNegativeTest () {

        boolean result;

        result = PositiveNegative.positiveNegative(555);
        Assert.assertEquals(result, true);

        result = PositiveNegative.positiveNegative(0);
        Assert.assertEquals(result, true);

        result = PositiveNegative.positiveNegative(-555);
        Assert.assertEquals(result, false);
    }
}
