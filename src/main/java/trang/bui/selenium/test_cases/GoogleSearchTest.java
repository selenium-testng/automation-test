package trang.bui.selenium.test_cases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import trang.bui.selenium.common.Log;
import trang.bui.selenium.framework.BaseTest;
import trang.bui.selenium.page_objects.GoogleSearchPage;

public class GoogleSearchTest extends BaseTest {
    private GoogleSearchPage googleSearchPage;

    @BeforeMethod
    public void setup(){
        Log.info("Run @BeforeMethod");
        googleSearchPage = new GoogleSearchPage(driver);
    }

    @Test
    public void test(){
        Log.info("Run @Test");
        googleSearchPage.goToGoogleSearchPage();
        googleSearchPage.doSearch("selenium page objects model");
    }

    @AfterMethod
    public void teardown(){
        Log.info("Run @AfterMethod");
        System.out.println("After Method");
    }
}
