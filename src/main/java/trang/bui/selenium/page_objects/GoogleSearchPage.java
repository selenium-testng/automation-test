package trang.bui.selenium.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import trang.bui.selenium.framework.BasePage;

public class GoogleSearchPage extends BasePage {

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    String baseURL = "https://www.google.com/";
    By searchInput = By.name("q");
    By searchButton = By.name("btnK");

    public GoogleSearchPage goToGoogleSearchPage() {
        driver.get(baseURL);
        return this;
    }

    public void doSearch(String text) {
        writeText(searchInput, text);
        click(searchButton);
    }
}
