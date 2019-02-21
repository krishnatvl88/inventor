package helpers;

import enums.Browser;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.Runner;

public class BrowserHelper {

    static Browser browser = Browser.valueOf(Runner.config.get("browser"));

    static String browserVersion = Runner.config.get("browserVersion");

    public static DesiredCapabilities selectBrowser(DesiredCapabilities cap) {
        switch (browser) {
            case Chrome:
                cap.setCapability("browserName", "chrome");
                break;
            case Firefox:
                cap.setCapability("browserName", "firefox");
                break;
            case IE:
                cap.setCapability("browserName", "internet explorer");
                break;
            case Opera:
                cap.setCapability("browserName", "opera");
            case Safari:
                cap.setCapability("browserName", "safari");
                break;
            default:
                throw new WebDriverException("No browser specified");
            }
        cap.setCapability("version", browserVersion);
        return cap;

    }
}
