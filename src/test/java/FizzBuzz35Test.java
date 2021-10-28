import org.junit.Assert;
import org.junit.Test;

public class FizzBuzz35Test {

    @Test
    public void fizzBuzz35Test () {

        String result;
        result = FizzBuzz35.fizzBuzz35(15);
        Assert.assertEquals(result,"Good Number");

        result = FizzBuzz35.fizzBuzz35(10);
        Assert.assertEquals(result,"Poor Number");

        result = FizzBuzz35.fizzBuzz35(9);
        Assert.assertEquals(result, "Bad Number");

        result = FizzBuzz35.fizzBuzz35(8);
        Assert.assertEquals(result, "-1");
    }
}
