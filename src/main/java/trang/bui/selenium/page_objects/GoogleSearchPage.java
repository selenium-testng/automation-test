package trang.bui.selenium.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import trang.bui.selenium.framework.BasePage;

public class GoogleSearchPage extends BasePage {

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    String baseURL = "https://www.google.com/";
    By txtKeywords = By.name("q");
    By btnSearch = By.name("btnK");

    // Launch
    public GoogleSearchPage launch() {
        driver.get(baseURL);
        return this;
    }

    // Getter & Setter
    public GoogleSearchPage setKeywords(String value) {
        writeText(txtKeywords, value);
        return this;
    }

    public GoogleSearchPage clickSearch() {
        click(btnSearch);
        return this;
    }
}
