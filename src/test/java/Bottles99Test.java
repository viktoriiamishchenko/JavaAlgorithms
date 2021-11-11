import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Bottles99Test {
    private WebDriver driver;
    private static final String URL = "http://www.99-bottles-of-beer.net/lyrics.html";
    private static final String BOTTLES = " bottles of beer";
    private static final String BOTTLE = " bottle of beer";
    private static final String WALL = " on the wall";
    private static final String COMMA_SPACE = ", ";
    private static final String DOT = ".";
    private static final String TAKE= "Take one down and pass it around";
    private static final String NO_MORE = "No more";
    private static final String GO_TO_THE_STORE = "Go to the store and buy some more";
    private static final String NEW_LINE = "\n";

    private String getBottles (int index, String bottles) {
        StringBuilder result = new StringBuilder();

        return String.valueOf(result.append(index).append(bottles));
    }

    private  String getBottles (String noMore, String bottles) {
        StringBuilder result = new StringBuilder();

        return String.valueOf(result.append(noMore).append(bottles));
    }

    public  String getWall (String punctuation) {
        StringBuilder result = new StringBuilder();
        return String.valueOf(result.append(WALL).append(punctuation));
    }

    public  String getText (int i, String bottles) {
        StringBuilder result = new StringBuilder();
        return String.valueOf(
                result
                .append(TAKE)
                .append(COMMA_SPACE)
                .append(getBottles(i, bottles))
                .append(getWall(DOT))
                .append(getBottles(i, bottles))
                .append(getWall(COMMA_SPACE))
                .append(getBottles(i, bottles))
                .append(DOT)
                .append(NEW_LINE)
        );
    }

    public  String getText () {
        StringBuilder result = new StringBuilder();
        return String.valueOf(
                result
                        .append(TAKE)
                        .append(COMMA_SPACE)
                        .append(getBottles(NO_MORE.toLowerCase(Locale.ROOT), BOTTLES))
                        .append(getWall(DOT))
                        .append(getBottles(NO_MORE, BOTTLES))
                        .append(getWall(COMMA_SPACE))
                        .append(getBottles(NO_MORE.toLowerCase(Locale.ROOT), BOTTLES))
                        .append(DOT)
                        .append(NEW_LINE)
        );
    }

    private String songLyric () {
        StringBuilder expectedResult = new StringBuilder();
        for (int i = 99; i >= 0; i--) {
            if (i == 99) {
                expectedResult
                        .append(getBottles(i, BOTTLES))
                        .append(getWall(COMMA_SPACE))
                        .append(getBottles(i, BOTTLES))
                        .append(DOT)
                        .append(NEW_LINE);
            } else if (i == 0) {
                expectedResult
                        .append(getText());
                expectedResult
                        .append(GO_TO_THE_STORE)
                        .append(COMMA_SPACE)
                        .append(getBottles(99, BOTTLES))
                        .append(getWall(DOT));
            } else {
                if (i != 1) {
                    expectedResult
                            .append(getText(i, BOTTLES));
                } else if (i == 1) {
                    expectedResult
                            .append(getText(i, BOTTLE));
                }
            }
        }

        return String.valueOf(expectedResult);
    }

    @BeforeMethod
    public void setUp () {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void setDown () {
        driver.quit();
    }

    @Test
    public void testBottles99Song () {

        driver.get(URL);
        List <WebElement> pAllTags = driver.findElements(By.xpath("//div[@id = 'main']/p"));
        String expectedResult = songLyric();

//        List<String> songLyrics = new ArrayList<>();
//        for (int i = 0; i < songLyrics.size(); i++) {
//            songLyrics.add(pAllTags.get(i).getText());
//        }

        String actualResult = "";
        for (int i = 0; i < pAllTags.size(); i++) {
            actualResult += pAllTags.get(i).getText();
        }

        System.out.println(actualResult);
        Assert.assertEquals(actualResult, expectedResult);
    }


}
