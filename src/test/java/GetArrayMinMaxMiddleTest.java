import org.junit.Assert;
import org.junit.Test;

public class GetArrayMinMaxMiddleTest {

    @Test
    public void getArrayMinMaxMiddle () {

        int [] result;
        result = GetArrayMinMaxMiddle.getArrayMinMaxMiddle(new int[]{1, 2, 3, 4, 5});
        Assert.assertArrayEquals(result, new int[]{5, 1, 3});

        result = GetArrayMinMaxMiddle.getArrayMinMaxMiddle(new int [] {-3, 0, 155, -39, 1003});
        Assert.assertArrayEquals(result, new int []{1003, -39, 223});



    }
}
