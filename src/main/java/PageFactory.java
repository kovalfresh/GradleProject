import Pages.*;
import java.io.IOException;
import static com.codeborne.selenide.Selenide.open;

public class PageFactory {

    public static LoginPage openLoginPage() {
        open(RunConfig.getStartURL() + "/auth/login");
        return new LoginPage();
    }
}
