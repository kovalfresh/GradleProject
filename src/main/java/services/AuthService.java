package services;

import other.PageFactory;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.Condition.visible;

public class AuthService {

    public static void login(String login, String password) {
        LoginPage loginPage = PageFactory.openLoginPage();

        loginPage
                .typeLogin(login)
                .typePassword(password)
                .clickLoginButton();

        HomePage homePage = loginPage.clickLoginButton();

        homePage
                .getHomepageMarker()
                .waitUntil( visible, 1000 );
    }
}
