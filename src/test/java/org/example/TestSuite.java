package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest{
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    NewsCommentPage newsCommentPage = new NewsCommentPage();
    NewsCommentResultPage newsCommentResultPage = new NewsCommentResultPage();
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    ReferAFriendResultPage referAFriendResultPage = new ReferAFriendResultPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    @Test
    public void toVerifyUserShouldBeAbleToRegisterSuccessfully()
    {
     //Click on register
        homePage.clickOnRegistration();
        //verify user is on registration page
        registrationPage.verifyUserIsOnRegistrationPage();
        //Enter registration details
        registrationPage.userEntersRegistrationDetails();
        //Verify user is on registration successfully page
        registrationResultPage.verifyUserIsOnRegistrationSuccessPage();
        //to verify user is successfully register
        registrationResultPage.userIsSuccessfullyRegister();
    }
@Test
public void toVerifyUserShouldBeAbleToPostNewCommentOnNewsDetailPage()
{
    //Click on details underneath news underneath New online store is open!
    homePage.clickOnDetailUnderNews();
    //Verify user is on new comment page
    newsCommentPage.verifyUserIsOnNewsCommentPage();
    //User enters comment title and comment text
    newsCommentPage.userEntersComment();
    //verify user added comment successfully
    newsCommentResultPage.NewsCommentIsSuccessfullyAdded();
    //verify user is on news comment is successfully added page
    newsCommentResultPage.verifyUserIsOnCommentSuccessfullyAddedPage();
}
@Test
public void toVerifyUserShouldBeAbleToNavigateToDesktopPage()
{
    //click on computer menu
    homePage.clickOnComputerMenu();
    //verify user is on computer page
    computerPage.verifyUserIsOnComputerPage();
    //Click on desktop category
    computerPage.userCanClickOnDesktopInComputerPage();
    //Verify user is on desktop page
    desktopPage.verifyUserIsOnDesktopPage();
}

@Test
public void toVerifyRegisterUserShouldBeAbleToReferAProductToFriend()
{
    //Method called User should be able to register successfully method called
    toVerifyUserShouldBeAbleToRegisterSuccessfully();
    //method called user should be able to navigate to desktop page
    toVerifyUserShouldBeAbleToNavigateToDesktopPage();
    //Click on build your own computer on desktop page
    desktopPage.clickOnBuildYourOwnComputer();
    //Verify user is on build your computer page
    buildYourOwnComputer.verifyUseIsOnBuildYourOwnComputerPage();
    //click on email a friend
    buildYourOwnComputer.clickOnEmailAFriend();
    //Type detail on field
    emailAFriendPage.enterDetailsOnFieldForEmailAFriend();
    //To verify user refer a product to a friend successfully
    referAFriendResultPage.toVerifyUserReferAProductToAFriendSuccessfully();
}
}
