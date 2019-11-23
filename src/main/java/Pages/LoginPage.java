package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    String usernameField = "#adminloginform-email";
    String passwordField = "#adminloginform-password";
    String loginButton = "loginButton";

    public LoginPage typeLogin(String login) {
        $(By.cssSelector(usernameField)).val(login);
        return this;
    }

    public LoginPage typePassword(String password) {
        $(By.cssSelector(passwordField)).val(password);
        return this;
    }

    public SelenideElement getLoginButton() {
        return $(By.name(loginButton));
    }

    public HomePage clickLoginButton() {
        $(By.name(loginButton)).click();
        return new HomePage();
    }

}
