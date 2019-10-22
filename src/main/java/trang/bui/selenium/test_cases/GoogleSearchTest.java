package trang.bui.selenium.test_cases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import trang.bui.selenium.common.Log;
import trang.bui.selenium.common.TestUtils;
import trang.bui.selenium.framework.BaseTest;
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
        Log.info("Search with keywords: " + keywords);
        googleSearchPage
                .setKeywords(keywords)
                .clickSearch();
    }

    @AfterMethod
    public void teardown(){
        Log.info("End GoogleSearch page");
    }
}
