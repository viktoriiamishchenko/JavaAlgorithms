import org.junit.Assert;
import org.junit.Test;

public class GetOddNumbersTest {

    @Test
    public void getOddNumbersTest () {

        int [] result;
        result = GetOddNumbers.getOddNumbers( new int[] {-45, 590, 234, 985, 12, 68});
        Assert.assertArrayEquals(result, new int []{590, 985, 68});



    }
}
