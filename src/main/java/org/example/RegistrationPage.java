package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage extends Utils{
    By _firstNameField = By.id("FirstName");
    By _lastNameField = By.id("LastName");
    By _emailField = By.id("Email");
    By _passwordField = By.id("Password");
    By _confirmPassword =By.id("ConfirmPassword");
    By _clickOnRegistrationButton = By.id("register-button");

    public void verifyUserIsOnRegistrationPage()
    {
        //Verify user is on registration page
       Assert.assertTrue(driver.getCurrentUrl().contains("register"),"User is not on registration page");
    }
    public void userEntersRegistrationDetails()
    {
        //enter the first name
        typeText(_firstNameField, "Navya");

        //enter the lastname
        typeText(_lastNameField, "Patel");

        //Enter day of birth
        Select selectDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
        selectDay.selectByVisibleText("21");
        //Enter month of birth
        Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        selectMonth.selectByValue("6");
        //Enter year of birth
        Select selectYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
        selectYear.selectByValue("2021");

        //Enter email address
        typeText(_emailField, "def+" + currentTimeStamp() + "@gmail.com");

        //Enter password
        typeText(_passwordField, "abc123");By.id("register-button");

        //Confirm password
        typeText(_confirmPassword, "abc123");

        //click on Register
        waitForClickable(_clickOnRegistrationButton, 20);
        clickOnElement(_clickOnRegistrationButton);
    }
}
