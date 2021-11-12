import org.junit.Test;
import org.testng.Assert;

public class CountLettersTest {

    @Test
    public void testCountLetters () {

        int result;
        result = CountLetters.countLetters("QA For Everyone");
        Assert.assertEquals(result, 6);

        result = CountLetters.countLetters("Java lessons are fun");
        Assert.assertEquals(result, 7);
    }
}
