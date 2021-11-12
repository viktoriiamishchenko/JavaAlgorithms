import org.junit.Test;
import org.testng.Assert;

public class DeleteSpaceAndMakeLowerCaseTest {

    @Test
    public void testDeleteSpaceAndMakeLowerCase () {

        String result = "";
        result = DeleteSpaceAndMakeLowerCase.deleteSpaceAndMakeLowerCase("QA For  Everyone ");
        Assert.assertEquals(result, "qaforeveryone");

        result = DeleteSpaceAndMakeLowerCase.deleteSpaceAndMakeLowerCase("Java lessons  are fun");
        Assert.assertEquals(result, "javalessonsarefun");
    }
}
