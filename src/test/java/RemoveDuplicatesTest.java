import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates () {

        int [] result;
        result = RemoveDuplicates.RemoveDuplicates(new int [] {3, 4, 2, 6, 4, 3, 3, 3, 2, 2});
        Assert.assertEquals(result, new int [] {3, 4, 2, 6});

        result = RemoveDuplicates.RemoveDuplicates(new int [] {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0});
        Assert.assertEquals(result, new int [] {0, 1, 2, 3, 4, 5});
    }
}
