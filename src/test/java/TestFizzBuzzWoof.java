import org.junit.Assert;
import org.junit.Test;

public class TestFizzBuzzWoof {

    @Test
    public void testFizzBuzzWoof () {

        int n = 35;
        String [] expectedResult = {"1", "2", "FizzFizz", "4", "BuzzBuzz", "Fizz", "WoofWoof", "8", "Fizz", "Buzz",
        "11", "Fizz", "Fizz", "Woof", "FizzBuzzBuzz", "16", "Woof", "Fizz", "19", "Buzz", "FizzWoof", "22", "Fizz",
        "Fizz", "BuzzBuzz", "26", "FizzWoof", "Woof", "29", "FizzFizzBuzz", "Fizz", "Fizz", "FizzFizz", "Fizz",
        "FizzBuzzBuzzWoof"};

        FizzBuzzWoof fizzBuzzWoof = new FizzBuzzWoof();
        String [] actualResult = fizzBuzzWoof.fizzBuzzWoof(n);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
