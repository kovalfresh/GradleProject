package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.*;

public class LoginPage {

    String usernameField = "#adminloginform-email";
    String passwordField = "#adminloginform-password";
    String loginButton = "loginButton";

    public LoginPage typeLogin(String login) {
        $(cssSelector(usernameField)).val(login);
        return this;
    }

    public LoginPage typePassword(String password) {
        $(cssSelector(passwordField)).val(password);
        return this;
    }

    public SelenideElement getLoginButton() {
        return $(name(loginButton));
    }

    public HomePage clickLoginButton() {
        $(name(loginButton)).click();
        return new HomePage();
    }

}
