package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    String usernameLocator = "#adminloginform-email";
    String passwordLocator = "#adminloginform-password";
    String loginButtonLocator = "loginButton";

    public LoginPage typeLogin(String login) {
        $(By.cssSelector(usernameLocator)).setValue(login);
        return this;
    }

    public LoginPage typePassword(String password) {
        $(By.cssSelector(passwordLocator)).setValue(password);
        return this;
    }

    public SelenideElement getLoginButton() {
        return $(By.name(loginButtonLocator));
    }

    public LoginPage clickLoginButton() {
        $(By.name(loginButtonLocator)).click();
        return this;
    }

}
