import Pages.*;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import static com.codeborne.selenide.Selenide.*;

public class LoginTest {

    String basicURL;
    String login;
    String password;

    Properties prop = new Properties();

    @Test
    void loginTest() throws InterruptedException {

        try {
            basicURL = RunConfig.readFromConfig("basicURL");
            login = RunConfig.readFromConfig("login");
            password = RunConfig.readFromConfig("password");
        } catch (IOException e) {
            e.printStackTrace();
            throw new InterruptedException();
        }

        open(basicURL);

        LoginPage loginPage = new LoginPage();

        loginPage
                .getLoginButton()
                .shouldBe(visible);
        loginPage
                .typeLogin(login)
                .typePassword(password)
                .clickLoginButton();

        HomePage homePage = loginPage.clickLoginButton();

        homePage
                .getHomepageMarker()
                .shouldBe(visible);

        Thread.sleep(5000);
    }
}
