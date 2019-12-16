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

        HomePage homePage;

    @Test
    void loginTest() throws InterruptedException {

        try {
            basicURL = RunConfig.readFromConfig("basicURL");
            login = RunConfig.readFromConfig("login");
            password = RunConfig.readFromConfig("password");
        } catch (IOException e) {
            e.printStackTrace();
        }

        LoginPage loginPage = PageFactory.openLoginPage();

        loginPage
                .getLoginButton()
                .shouldBe(visible);
        loginPage
                .typeLogin(login)
                .typePassword(password)
                .clickLoginButton();

        homePage = loginPage.clickLoginButton();

        homePage
                .getHomepageMarker()
                .shouldBe(visible);

        Thread.sleep(3000);

    }

    @Test (priority = 1)
    void configTest() throws InterruptedException {

        ConfigPage configPage = PageFactory.openConfigPage();

        configPage
                .getConfigPageMarker()
                .shouldBe(visible);

        configPage.inputSaveCheckConfigValue(ConfigPage.getConfigTitleFieldTest());
        configPage.inputSaveCheckConfigValue(ConfigPage.getConfigTitleFieldDefault());

        Thread.sleep(3000);

    }
}
