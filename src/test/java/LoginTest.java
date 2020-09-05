import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.Condition;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import other.PageFactory;
import other.RunConfig;
import pages.*;
import services.AuthService;

public class LoginTest extends BasicTestExecutor{

    private ConfigPage configPage;

    @BeforeClass
    public void beforeClass() {
        AuthService.login(login, password);
        configPage = PageFactory.openConfigPage();
    }

    @AfterClass
    public void afterClass() {
        configPage.inputSaveConfigValue(configPage.getConfigTitleFieldDefault());
    }

    @Test( enabled=false )
    public void configTest() {

        configPage
                .getConfigPageMarker()
                .shouldBe(visible);

        String configTitleFieldTest = "autotitle";

        configPage.inputSaveConfigValue(configTitleFieldTest);

        configPage
                .getConfigTitleField()
                .shouldHave(exactText(configTitleFieldTest));

    }

    @Test(priority=1)
    public void adminCreateTest() {

        AdminCreatePage adminCreatePage = PageFactory.openAdminCreatePage();
        adminCreatePage.adminCreateFillForm();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        AdminTablePage adminTablePage = PageFactory.openAdminTablePage();

        adminTablePage
                .getAdminTableMarker()
                .shouldBe(visible);

        adminTablePage.checkNewAdmin();
        adminTablePage.deleteNewAdmin();

    }
}
