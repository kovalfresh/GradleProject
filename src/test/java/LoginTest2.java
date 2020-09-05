import org.testng.annotations.Test;
import other.PageFactory;
import pages.*;

import static com.codeborne.selenide.Condition.visible;

public class LoginTest2 extends BasicTestExecutor {

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
