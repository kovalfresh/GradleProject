import Pages.*;

import static com.codeborne.selenide.Condition.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.IOException;

public class LoginTest {

        String basicURL;
        String login;
        String password;

    public HomePage homePage;

    @BeforeClass
    public void loginTest() {

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
    }

    @Test
    public void configTest() {

        ConfigPage configPage = PageFactory.openConfigPage();

        configPage
                .getConfigPageMarker()
                .shouldBe(visible);

        configPage.inputSaveConfigValue(ConfigPage.configTitleFieldTest);
        configPage.inputSaveConfigValue(ConfigPage.configTitleFieldDefault);
    }
}
