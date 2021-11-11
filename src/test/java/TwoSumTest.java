import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void testTwoSum () {

        int [] result;
        result = TwoSum.twoSum(new int [] {68, 5, 2, 100, 9, 12, 8}, 10);
        Assert.assertArrayEquals(result, new int [] {2, 6});

        result = TwoSum.twoSum(new int [] {1, 20, 40, 60, -40, -20, -1}, -19);
        Assert.assertArrayEquals(result, new int [] {0, 5});

        result = TwoSum.twoSum(new int [] {8, 5, 2, 0, 9, 12, 8}, 12);
        Assert.assertArrayEquals(result, new int [] {3, 5});
    }
}
