 import org.openqa.selenium.*;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class LoginTest {

    String basicURL = "http://forge.f-d.com.ua";
    String login = "info@fresh-design.com.ua";
    String password = "info@fresh-design.com.ua";

    @Test
    void loginTest() throws InterruptedException {

        open(basicURL);
        $(By.name("loginButton")).isDisplayed();
        $(By.cssSelector("#adminloginform-email")).setValue(login);
        $(By.cssSelector("#adminloginform-password")).setValue(password);
        $(By.name("loginButton")).click();
        $(By.className("user")).isDisplayed();

        Thread.sleep(5000);
    }
}
