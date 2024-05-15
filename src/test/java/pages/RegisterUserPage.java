package pages;

import elements.RegisterUserElements;
import utility.ConfigReader;

public class RegisterUserPage extends  PageBase{
  RegisterUserElements registerUserElements=new RegisterUserElements();

  public String[] RegisterUser() {

    navigateToSingInPage();
    performLogin();
    return getLoginVerificationTexts();

  }

  private void navigateToSingInPage(){
      clickElement( registerUserElements.SingInLink);

  }
  private void performLogin(){
      String userLoginName =ConfigReader.getProperty("name");
      sendKeyToElement(registerUserElements.signUpName,userLoginName);


      String userLoginEmail=getFaker().internet().emailAddress();
      sendKeyToElement(registerUserElements.email,userLoginEmail);
      clickElement(registerUserElements.signInButton);
  }

  public String[] getLoginVerificationTexts(){
      String actualResult=getTextElement(registerUserElements.accountCheck);
     // String actualWelcomeMessage= getTextElement(registerUserElements.welcomeMessage);

    return new String[]{actualResult};
  }
}
