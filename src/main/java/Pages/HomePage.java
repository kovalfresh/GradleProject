package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    String homeLocator = "user";

    public SelenideElement getHomepageMarker() {
        return $(By.className(homeLocator));
    }
}
