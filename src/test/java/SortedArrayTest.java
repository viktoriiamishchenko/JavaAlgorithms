import org.junit.Test;
import org.testng.Assert;

public class SortedArrayTest {

    @Test
    public void testSortedArray () {

        int [] result;
        result = SortedArray.SortedArray(new int [] {12, 2, 3, 4, 5});
        Assert.assertEquals(result, new int [] {2, 3, 4, 5, 12});

        result = SortedArray.SortedArray(new int [] {-3, 0, 155, -39, 1003});
        Assert.assertEquals(result, new int [] {-39, -3, 0, 155, 1003});
    }
}
