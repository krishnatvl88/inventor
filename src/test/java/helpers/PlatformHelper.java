package helpers;

import enums.Platform;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.Runner;

public class PlatformHelper {
    static Platform platform = Platform.valueOf(Runner.config.get("platform"));

    static String platformVersion = Runner.config.get("platformVersion");

    public static DesiredCapabilities selectPlatform(DesiredCapabilities cap) {
        switch (platform) {
            case Windows:
                cap.setCapability("os", "Windows");
                cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
                break;
            case OSX:
                cap.setCapability("platform", "OS X");
                cap.setPlatform(org.openqa.selenium.Platform.MAC);
                break;
            case Ubuntu:
                cap.setCapability("os", "Ubuntu");
                cap.setPlatform(org.openqa.selenium.Platform.LINUX);
                break;
            default:
                throw new WebDriverException("No platform found");
        }
        cap.setCapability("os_version", platformVersion);

        return cap;
    }
}
