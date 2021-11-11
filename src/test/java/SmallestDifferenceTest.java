import org.junit.Test;
import org.testng.Assert;

public class SmallestDifferenceTest {

    @Test
    public void  testSmallestDifference () {

        int [] result;
        result = SmallestDifference.SmallestDifference(new int [] {8, 5, 2, 0, 9, 12, 8});
        Assert.assertEquals(result, new int [] {8, 8});

        result= SmallestDifference.SmallestDifference(new int [] {8, -55, 2, -54, -12});
        Assert.assertEquals(result, new int[] {-55, -54});
    }
}
