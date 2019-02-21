package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Driver {

    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver","//Users//krishnamoorthy//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
