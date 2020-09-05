package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.*;

public class HomePage {

    String homepageClassName = "user";

    public SelenideElement getHomepageMarker() {
        return $(className(homepageClassName));
    }
}
