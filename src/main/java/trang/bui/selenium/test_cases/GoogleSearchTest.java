package trang.bui.selenium.test_cases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import trang.bui.selenium.common.Log;
import trang.bui.selenium.common.TestUtils;
import trang.bui.selenium.framework.BaseTest;
import trang.bui.selenium.page_objects.GoogleResultsPage;
import trang.bui.selenium.page_objects.GoogleSearchPage;

public class GoogleSearchTest extends BaseTest {
    private GoogleSearchPage googleSearchPage;

    @BeforeMethod
    public void setup(){
        Log.info("Start GoogleSearch page");
        googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.launch();
    }

    @DataProvider
    public Object[][] readTestData() {
        return TestUtils.readTestData("googlesearch");
    }

    @Test(dataProvider = "readTestData")
    public void test(String run, String keywords){
        if(Boolean.valueOf(run)) {
            Log.info("Old URL: " + googleSearchPage.getURL());
            Log.info("Old Title: " + googleSearchPage.getTitle());
            Log.info("Search with keywords: " + keywords);
            googleSearchPage
                    .setKeywords(keywords)
                    .clickSearch();
            GoogleResultsPage resultsPage = new GoogleResultsPage(driver);
            Log.info("New URL: " + resultsPage.getURL());
            Log.info("New Title: " + resultsPage.getTitle());
            Log.info("Keywords: " + resultsPage.getKeywords());
            resultsPage.setKeywords("selenium example");
            Log.info("- First result: " + resultsPage.getFirstResult());
            Log.info("- Second result: " + resultsPage.getSecondResult());
        }
    }

    @AfterMethod
    public void teardown(){
        Log.info("End GoogleSearch page");
    }
}
