package trang.bui.selenium.test_cases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import trang.bui.selenium.common.Log;
import trang.bui.selenium.framework.BaseTest;
import trang.bui.selenium.page_objects.FacebookLoginPage;

public class FacebookLoginTest extends BaseTest {
    private FacebookLoginPage facebookLogin;

    @BeforeMethod
    public void setup() {
        facebookLogin = new FacebookLoginPage(driver);
    }

    @Test
    public void doLogin() {
        Log.runStep("Facebook login");
        facebookLogin.launch()
                .setEmail("abc@def.com")
                .setPassword("ghiklmn")
                .clickLogin();
        Log.info(facebookLogin.getTitle());
    }

    @AfterMethod
    public void teardown() {

    }
}
