package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {
    BrowserManager browserManager = new BrowserManager();
    @BeforeMethod
    public void setBrowserManager()
    {
        browserManager.openBrowser();
    }
    @AfterMethod
    public void tearDownBrowser(ITestResult result)
    {
        if (!result.isSuccess())
        {
            captureScreenshot(result.getName());
        }
        browserManager.closeBrowser();
    }
}
