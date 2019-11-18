package trang.bui.selenium.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import trang.bui.selenium.framework.BasePage;

public class FacebookLoginPage extends BasePage {
    public FacebookLoginPage(WebDriver driver) {
        super(driver);
    }

    String baseURL = "https://www.facebook.com/";

    // Page Objects
    By txtEmail = By.xpath("//*[@id=\"email\"]");
    By txtPassword = By.xpath("//*[@id=\"pass\"]");
    By btnLogin = By.xpath("//*[@id=\"u_0_2\"]");


    // Page Method
    public FacebookLoginPage launch() {
        driver.get(baseURL);
        return this;
    }

    /**
     * Fill email with emailValue
     * @param value
     */
    public FacebookLoginPage setEmail(String value) {
        writeText(txtEmail, value);
        return this;
    }

    public String getEmail(String emailValue) {
        return readText(txtEmail);
    }

    public FacebookLoginPage setPassword(String value) {

        writeText(txtPassword, value);
        return this;
    }

    public String getPassword() {
        return readText(txtPassword);
    }

    public FacebookLoginPage clickLogin() {
        click(btnLogin);
        wait(5);
        return this;
    }
}
