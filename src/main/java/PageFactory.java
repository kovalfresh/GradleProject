import Pages.*;
import java.io.IOException;
import static com.codeborne.selenide.Selenide.open;

public class PageFactory {

    public static LoginPage openLoginPage() throws InterruptedException {

        try {
            open(RunConfig.getStartURL() + "/auth/login");
        } catch (IOException e) {
            e.printStackTrace();
            throw new InterruptedException();
        }

        return new LoginPage();
    }
}
