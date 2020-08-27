import pages.*;
import java.io.IOException;
import static com.codeborne.selenide.Selenide.open;

public class PageFactory {

    public static LoginPage openLoginPage() {
        open(RunConfig.getStartURL() + "/auth/login");
        return new LoginPage();
    }

    public static ConfigPage openConfigPage() {
        open(RunConfig.getStartURL() + "/sections/config/list");
        return new ConfigPage();
    }


    public static AdminCreatePage openAdminCreatePage() {
        open(RunConfig.getStartURL() + "/sections/administrator/admin/create");
        return new AdminCreatePage();
    }

    public static AdminTablePage openAdminTablePage() {
        open(RunConfig.getStartURL() + "/sections/administrator/admin/table");
        return new AdminTablePage();
    }
}
