package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    String homepageClassName = "user";

    public SelenideElement getHomepageMarker() {
        return $(By.className(homepageClassName));
    }
}
