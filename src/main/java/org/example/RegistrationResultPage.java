package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.BasePage.driver;
import static org.example.Utils.getTextFromElement;

public class RegistrationResultPage{
    public void verifyUserIsOnRegistrationSuccessPage()
    {
        //verify user is on registration success page
        Assert.assertTrue(driver.getCurrentUrl().contains("registerresult"));
    }
    public void userIsSuccessfullyRegister()
    {
        //store actual result
        String actualRegisterSuccessMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        //Store expected result
        String expectedRegisterSuccessMessage ="Your registration completed";
        //Compare actual result and expected result
        Assert.assertEquals(actualRegisterSuccessMessage,expectedRegisterSuccessMessage,"Register success is incorrect");

    }
}
