package base;

import Steps.ActionOnPage;
import Steps.StepManager;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {
    //public static final ActionOnPage page = new ActionOnPage();
    public final StepManager page = new StepManager();

    @BeforeEach
    public void options() {
        Configuration.timeout=6000;
        Configuration.browser="chrome";
        Configuration.startMaximized=true;

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        Configuration.browserCapabilities = capabilities;
    }
}
