package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class RegisterUserElements {
    public RegisterUserElements() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//a[@href='/login']")
    public WebElement SingInLink;

    @FindBy(xpath="//input[@data-qa='signup-name']")
    public WebElement signUpName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement email;



    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signInButton;

    @FindBy(xpath = "//b[contains(text(),'Enter Account Information')]")
    public WebElement accountCheck;

    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    public WebElement welcomeMessage;



}
