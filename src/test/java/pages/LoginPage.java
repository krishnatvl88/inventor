package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void accessPage() {
        driver.get("http://gmail.com");
    }
}
