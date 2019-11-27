import Pages.*;
import java.io.IOException;
import static com.codeborne.selenide.Selenide.open;

public class PageFactory {

    public static LoginPage openLoginPage() throws IOException {
        open(RunConfig.readFromConfig("basicURL"));
        return new LoginPage();
    }
}
