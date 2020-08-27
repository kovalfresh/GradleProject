package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.*;

public class AdminCreatePage {

    private String marker = "Общие";
    private String emailField = "//input[@id='dynamicmodel-administrator-email']";
    private String nameField = "//input[@id='dynamicmodel-administratorprofile-first_name']";
    private String surnField = "//input[@id='dynamicmodel-administratorprofile-last_name']";
    private String passField = "//input[@id='dynamicmodel-custom-password']";
    private String checkboxField = "//div[@class='checkbox']//label";
    private String rightsField = "//div[@class='responsive-cont']//a[2]";
    private String submitField = "//button[@name='save_button']";
    private String superAdminCheckboxField = "//div[@class='content-table roles-display_table in_tab']//div[7]//ul[1]//li[1]//span[1]//div[1]";
    private String email = "autotest@autostest.com";
    private String pass = "autotest@autostest.com";
    private String name = "testFirst";
    private String surn = "testLast";

    public SelenideElement getAdminCreateMarker() {
        return $(linkText(marker));
    }

    public AdminCreatePage adminCreateFillForm() {
        $(xpath(emailField)).val(email);
        $(xpath(passField)).val(pass);
        $(xpath(nameField)).val(name);
        $(xpath(surnField)).val(surn);
        $(xpath(checkboxField)).click();
        $(xpath(rightsField)).click();
        $(xpath(superAdminCheckboxField)).click();
        $(xpath(submitField)).click();
        $(xpath(checkboxField)).waitUntil(Condition.enabled, 1000);
        return this;
    }
}
