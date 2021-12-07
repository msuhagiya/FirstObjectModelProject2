package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.BasePage.driver;

public class NewsCommentResultPage extends Utils{
    public void verifyUserIsOnCommentSuccessfullyAddedPage()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("new-online-store-is-open"));
    }
    public void NewsCommentIsSuccessfullyAdded()
    {
    String actualText = driver.findElement(By.xpath("//div[@class='notifications']/div")).getText();
    //Expected message result
    String expectedText = "News comment is successfully added.";
    //Comparing message News comment is successfully added with actual message.
    Assert.assertEquals(actualText,expectedText,"News comment has not been added");
    }
}
