package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterUserPage;
import pages.UserRegistrationPage;
import utility.ConfigReader;

public class RegisterUserTest extends TestBase{
    RegisterUserPage registerUserPage = new RegisterUserPage();
    UserRegistrationPage userRegistrationPage = new UserRegistrationPage();

    @Test
    public void loginRegisterUser() {
        String webSiteUrl= ConfigReader.getProperty("url");
        getAppLibrary().getFlowsLibrary().navigateToUrl(webSiteUrl);

        String[] expectedResults = getAppLibrary().getPageLibrary().getRegisterUserPage().RegisterUser();
        String expectedAccountText="ENTER ACCOUNT INFORMATION";
        //String expectedWelcomeMessage= "New User Signup!";

        Assert.assertEquals(expectedResults[0],expectedAccountText);
        //Assert.assertEquals(expectedResults[1],expectedWelcomeMessage);

        getAppLibrary().getPageLibrary().getUserRegistrationPage().createNewRegistration();


    }




}


