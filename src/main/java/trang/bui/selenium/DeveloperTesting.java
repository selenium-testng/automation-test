package trang.bui.selenium;

import trang.bui.selenium.common.Constants;
import trang.bui.selenium.common.Log;

public class DeveloperTesting {
    public static void main(String[] arg) {
        Log.configure();
        Log.startTestCase("TestSuite 1", "MAC", "Chrome");
        Log.startSection("Test Home Page");
        Log.startSection("Test Login Page");
        Log.info("Browser from config: " + Constants.BROWSER);
        Log.warn("This is a warning message");
        Log.error("This is an error message");
        Log.endTestCase();
    }
}
