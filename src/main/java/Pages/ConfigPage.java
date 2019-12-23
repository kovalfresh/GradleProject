package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class ConfigPage {

    String configPageCSS = "div.row.page-tit > h2";
    String configTitleFieldCSS = "#configsectionmodel-main___site__title";
    String configSubmitButtonCSS = "a.btn.btn-green.btn-submit";
    public static String configTitleFieldTest = "autotitle";
    public static String configTitleFieldDefault = "Название сайта";

    public SelenideElement getConfigPageMarker() {
        return $(By.cssSelector(configPageCSS));
    }

    public ConfigPage inputSaveConfigValue(String value) {
        $(By.cssSelector(configTitleFieldCSS)).val(value);
        $(By.cssSelector(configSubmitButtonCSS)).click();
        $(By.cssSelector(configTitleFieldCSS)).waitUntil(Condition.value(value), 100);
        return this;
    }

}
