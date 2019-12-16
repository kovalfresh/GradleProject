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

    public static String getConfigTitleFieldTest() {
        return configTitleFieldTest;
    }

    public static String getConfigTitleFieldDefault() {
        return configTitleFieldDefault;
    }

    public ConfigPage inputSaveCheckConfigValue(String value) throws InterruptedException {
        $(By.cssSelector(configTitleFieldCSS)).val(value);
        $(By.cssSelector(configSubmitButtonCSS)).click();
        Thread.sleep(1000);
        $(By.cssSelector(configTitleFieldCSS)).shouldHave(Condition.value(value));
        return new ConfigPage();
    }

}
