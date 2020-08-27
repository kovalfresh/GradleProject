package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.*;
import com.codeborne.selenide.Condition;

public class AdminTablePage {

    private String markerXPath = "//h2[contains(text(),'Список администраторов')]";
    private String createButtonCSS = "btn.btn-green";
    private String newAdmin = "testFirst testLast";
    private String newAdminLoc = "//a[contains(text(),'testFirst testLast')]";
    private String deleteScript = "http://forge.f-d.com.ua/sections/administrator/admin/delete/";
    public SelenideElement getAdminTableMarker() {
        return $(xpath(markerXPath));
    }

    public void checkNewAdmin() {
        $(xpath(newAdminLoc)).waitUntil(Condition.visible, 10000);
    }

    public void deleteNewAdmin() {
        String AdminLink = $(xpath(newAdminLoc)).getAttribute("href");
        String AdminId = AdminLink.substring(AdminLink.lastIndexOf("/") + 1);
        open(deleteScript + AdminId);
    }
}