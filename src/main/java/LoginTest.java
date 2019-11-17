import com.codeborne.selenide.Condition;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertTrue;

public class LoginTest {

    //String basicURL = "http://forge.f-d.com.ua";
    String basicURL;
    String login;
    String password;

    Properties prop = new Properties();

    @Test
    void loginTest() throws InterruptedException {

        try {
            basicURL = RunConfig.readFromConfig("basicURL");
            login = RunConfig.readFromConfig("login");
            password = RunConfig.readFromConfig("password");
        } catch (IOException e) {
            e.printStackTrace();
            throw new InterruptedException();
        }

        open(basicURL);
        $(By.name("loginButton")).shouldBe(Condition.visible);
        $(By.cssSelector("#adminloginform-email")).setValue(login);
        $(By.cssSelector("#adminloginform-password")).setValue(password);
        $(By.name("loginButton")).click();
        $(By.className("user")).shouldBe(Condition.visible);

        Thread.sleep(5000);
    }
}
