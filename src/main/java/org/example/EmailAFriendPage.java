package org.example;

import org.openqa.selenium.By;

public class EmailAFriendPage extends Utils {
    By _typeFriendEmailAdd = By.id("FriendEmail");
    By _typePersonalMessage = By.id("PersonalMessage");
    By _clickOnSendEmailButton = By.xpath("//div[@class='buttons']/button");
    public void enterDetailsOnFieldForEmailAFriend()
    {
        //Type friend email address
        typeText(_typeFriendEmailAdd,"xyz@gmail.com");
        //Type personal message
        typeText(_typePersonalMessage,"This product is very good");
        //Click on send email
        clickOnElement(_clickOnSendEmailButton);
    }
}
