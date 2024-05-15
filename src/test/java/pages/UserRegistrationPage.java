package pages;

import elements.UserRegistrationElements;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import utility.ConfigReader;

public class UserRegistrationPage extends PageBase {
    //logger print kullanmamak için yaptık
    private static final Logger logger= LogManager.getLogger(UserRegistrationPage.class);
    UserRegistrationElements userRegistrationElements;

    public void createNewRegistration()  {
        logger.info("creating random user started");
        userRegistrationElements =new UserRegistrationElements();
        clickElement(userRegistrationElements.mrButton);
        clickElement(userRegistrationElements.loginPassword);
        sendKeyToElement(userRegistrationElements.loginPassword,"123a");
        selectElementByValue(userRegistrationElements.loginDays,"10");
        selectElementByValue(userRegistrationElements.loginMonths,"1");
        selectElementByValue(userRegistrationElements.loginYears,"2000");
        //clickElement(userRegistrationElements.newLetterClick);
        isClickable(userRegistrationElements.newLetterClick,2);
        clickElement(userRegistrationElements.partnersClick);
        String firstName=getFaker().name().firstName();
        sendKeyToElement(userRegistrationElements.firstName,firstName);
        String lastName=getFaker().name().lastName();
        sendKeyToElement(userRegistrationElements.lastName,lastName);
        String fakerAddress=getFaker().address().streetAddress();
        sendKeyToElement(userRegistrationElements.address,fakerAddress);
        String city=getFaker().address().city();
        sendKeyToElement(userRegistrationElements.city,city);
        selectElementByValue(userRegistrationElements.country,"India");
        String state=getFaker().address().state();
        sendKeyToElement(userRegistrationElements.state,state);
        String zip=getFaker().address().zipCode();
        sendKeyToElement(userRegistrationElements.zipcode,zip);
        String phone=getFaker().phoneNumber().phoneNumber();
        sendKeyToElement(userRegistrationElements.mobileNumber,phone);
        clickElement(userRegistrationElements.createAccount);

        Assert.assertEquals(userRegistrationElements.createAccountverification.getText(),"ACCOUNT CREATED!");

        clickElement(userRegistrationElements.continueButton);

        Assert.assertEquals(userRegistrationElements.loginloggetVerification.getText(),"Logged in as testing");

        clickElement(userRegistrationElements.deleteAccount);

        Assert.assertEquals(userRegistrationElements.deleteAccountverification.getText(),"ACCOUNT DELETED!");

        clickElement(userRegistrationElements.continueButtonDelete);



    }
}
