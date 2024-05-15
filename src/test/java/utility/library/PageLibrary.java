package utility.library;


import pages.RegisterUserPage;
import pages.UserRegistrationPage;

public class PageLibrary {
    RegisterUserPage registerUserPage;
    UserRegistrationPage userRegistrationPage;


    public PageLibrary() {

        registerUserPage = new RegisterUserPage();
        userRegistrationPage = new UserRegistrationPage();

    }

    public RegisterUserPage getRegisterUserPage() {
        return registerUserPage;
    }

    public UserRegistrationPage getUserRegistrationPage() {
        return userRegistrationPage;
    }
}
