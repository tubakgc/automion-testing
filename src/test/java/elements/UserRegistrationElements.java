package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class UserRegistrationElements  {
    public UserRegistrationElements() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@data-qa='title']")
    public WebElement mrButton;

    @FindBy(xpath="//input[@data-qa='password']")
    public WebElement loginPassword;

    @FindBy(xpath="//select[@data-qa='days']")
    public WebElement loginDays;

    @FindBy(xpath="//select[@data-qa='months']")
    public WebElement loginMonths;

    @FindBy(xpath="//select[@data-qa='years']")
    public WebElement loginYears;

    @FindBy(xpath="//input[@id='newsletter']")
    public WebElement newLetterClick;

    @FindBy(xpath="//input[@id='optin']")
    public WebElement partnersClick;

    @FindBy(xpath="//input[@data-qa='first_name']")
    public WebElement firstName;

    @FindBy(xpath="//input[@data-qa='last_name']")
    public WebElement lastName;

    @FindBy(xpath="//input[@data-qa='address']")
    public WebElement address;

    @FindBy(xpath="//select[@data-qa='country']")
    public WebElement country;

    @FindBy(xpath="//input[@data-qa='state']")
    public WebElement state;

    @FindBy(xpath="//input[@data-qa='city']")
    public WebElement city;

    @FindBy(xpath="//input[@data-qa='zipcode']")
    public WebElement zipcode;

    @FindBy(xpath="//input[@data-qa='mobile_number']")
    public WebElement mobileNumber;

    @FindBy(xpath="//button[@data-qa='create-account']")
    public WebElement createAccount;

    @FindBy(xpath = "//h2[@data-qa='account-created']")
    public WebElement createAccountverification;

    @FindBy(xpath="//a[@data-qa='continue-button']")
    public WebElement continueButton;


    @FindBy(xpath = "//li[10]//a[1]")
    public WebElement loginloggetVerification;

    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    public WebElement deleteAccount;

    @FindBy(xpath = "//h2[@data-qa='account-deleted']")
    public WebElement deleteAccountverification;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButtonDelete;


}
