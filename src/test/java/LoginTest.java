import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.*;
import pages.*;
import services.AuthService;
import other.PageFactory;

import static com.codeborne.selenide.Condition.visible;

public class LoginTest extends BasicTestExecutor {

    @BeforeClass
    public void BeforeClass() {
        WebDriverRunner.clearBrowserCache();
    }

    @Test
    public void loginTest() {

        LoginPage loginPage = PageFactory.openLoginPage();

        loginPage
                .getLoginButton()
                .shouldBe(visible);

        loginPage
                .typeLogin( login )
                .typePassword( password )
                .clickLoginButton();

        HomePage homePage = loginPage.clickLoginButton();

        homePage
                .getHomepageMarker()
                .shouldBe(visible);
    }
}