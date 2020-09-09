import static com.codeborne.selenide.Condition.*;

import org.testng.annotations.*;
import pages.*;
import services.AuthService;
import other.PageFactory;

public class ConfigTest extends BasicTestExecutor {

    private ConfigPage configPage;

    @BeforeClass
    public void beforeClass() { configPage = PageFactory.openConfigPage(); }

    @AfterClass
    public void afterClass() {
        configPage.inputSaveConfigValue(configPage.getConfigTitleFieldDefault());
        configPage
                .getConfigTitleField()
                .shouldHave(exactValue(configPage.getConfigTitleFieldDefault()));
    }

    @Test
    public void configTest() {

        configPage
                .getConfigPageMarker()
                .shouldBe(visible);

        String configTitleFieldTest = "autotitle";

        configPage.inputSaveConfigValue(configTitleFieldTest);
        configPage
                .getConfigTitleField()
                .shouldHave(exactValue(configTitleFieldTest));
    }
}
