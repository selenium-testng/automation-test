package trang.bui.selenium.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import trang.bui.selenium.framework.BasePage;

public class GoogleResultsPage extends BasePage {
    public GoogleResultsPage(WebDriver driver) {
        super(driver);
    }

    By txtKeywords = By.xpath("//div[@class='a4bIc']//input[@name='q']");
    //By result = By.cssSelector("h3");

    public String getKeywords() {
        return readText(txtKeywords);
    }

    public GoogleResultsPage setKeywords(String keywords) {
        writeText(txtKeywords, keywords);
        return this;
    }

    public String getFirstResult() {
        return readText(txtKeywords);
    }

    public String getSecondResult() {
        return readText(txtKeywords);
    }
}
