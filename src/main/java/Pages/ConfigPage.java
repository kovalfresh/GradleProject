package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.cssSelector;

public class ConfigPage {

    private String configPageCSS = "div.row.page-tit > h2";
    private String configTitleFieldCSS = "#configsectionmodel-main___site__title";
    private String configSubmitButtonCSS = "a.btn.btn-green.btn-submit";
    public static String configTitleFieldTest = "autotitle";
    public static String configTitleFieldDefault = "Название сайта";

    public SelenideElement getConfigPageMarker() {
        return $(cssSelector(configPageCSS));
    }

    public ConfigPage inputSaveConfigValue(String value) {
        $(cssSelector(configTitleFieldCSS)).val(value);
        $(cssSelector(configSubmitButtonCSS)).click();
        $(cssSelector(configTitleFieldCSS)).waitUntil(Condition.value(value), 100);
        return this;
    }

}
