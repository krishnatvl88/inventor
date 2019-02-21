package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public WebDriver getDriver() {
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
