import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class AscendingSequenceTest {

    @Test
    public void TestAscendingSequence () {
        int [] result;
        result = AscendingSequence.ascendingSequence(10, 25, 5);
        Assert.assertArrayEquals(result, new int []{10, 15, 20, 25});

        result = AscendingSequence.ascendingSequence(10, -25, -5);
        Assert.assertArrayEquals(result, new int []{-1});

        result = AscendingSequence.ascendingSequence(10, 10, 2);
        Assert.assertArrayEquals(result, new int []{-1});










    }
}
