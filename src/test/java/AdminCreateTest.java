import static com.codeborne.selenide.Condition.*;

import org.testng.annotations.*;
import pages.*;
import services.AuthService;
import other.PageFactory;

public class AdminCreateTest extends BasicTestExecutor {

    private AdminCreatePage adminCreatePage;
    private AdminTablePage adminTablePage;

    @BeforeClass
    public void beforeClass() { AuthService.login(login, password); }

    @AfterClass
    public void afterClass() { adminTablePage.deleteNewAdmin(); }

    @Test
    public void adminCreateTest() {

        adminCreatePage = PageFactory.openAdminCreatePage();
        adminCreatePage.adminCreateFillForm();

        SysUtils.sleep(3000);

        adminTablePage = PageFactory.openAdminTablePage();

        adminTablePage
                .getAdminTableMarker()
                .shouldBe(visible);

        adminTablePage.checkNewAdmin();
    }
}
