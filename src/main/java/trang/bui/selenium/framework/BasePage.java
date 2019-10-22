package trang.bui.selenium.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import trang.bui.selenium.common.Constants;
import trang.bui.selenium.common.Log;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Constants.WAIT_10, Constants.WAIT_120);
    }

    protected void wait(int seconds) {
        try {
            wait(seconds);
        } catch (Exception e) {
            Log.debug(e.getMessage());
        }
    }

    protected void waitForElementToAppear(By element) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
    }


    protected void waitForElementToDisappear(By element) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
    }

    protected void writeText(By element, String text) {
        waitForElementToAppear(element);
        driver.findElement(element).sendKeys(text);
    }

    protected String readText(By element) {
        waitForElementToAppear(element);
        return driver.findElement(element).getText();
    }

    protected void click (By element) {
        waitForElementToAppear(element);
        driver.findElement(element).click();
    }

    protected void assertEquals(By element, String expectedText) {
        waitForElementToAppear(element);
        Assert.assertEquals(readText(element), expectedText);
    }

    // Other Utilities

    public String getTitle() {
        return driver.getTitle();
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }
}
