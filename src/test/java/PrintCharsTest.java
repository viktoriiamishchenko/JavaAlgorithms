import org.testng.Assert;
import org.testng.annotations.Test;

public class PrintCharsTest {

    @Test
    public void testPrintChars () {

        String result = "";
        result = PrintChars.printChars("QAForEveryone");
        Assert.assertEquals(result, "orro");

        result = PrintChars.printChars("Java lessons are fun");
        Assert.assertEquals(result, "or");





    }
 }
