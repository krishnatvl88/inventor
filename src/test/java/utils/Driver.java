package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.ChromeDriverManager;

public class Driver {

    private static Driver instanceOfDriver = null;
    private WebDriver driver;

    private Driver() {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
    }

    public static Driver getInstanceDriverFor(){
        if(instanceOfDriver==null){
            instanceOfDriver = new Driver();
        }
        return instanceOfDriver;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
