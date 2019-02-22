package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    private WebDriver driver;

    @FindBy(id="identifierId")
    private WebElement userName;

    @FindBy(name="password")
    private WebElement userPassword;

    @FindBy(xpath="//span[contains(text(),'Next')]")
    private WebElement nextButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void accessPage() {
        driver.get("http://gmail.com");
    }

    public void enterUsernameandNext() {
        userName.sendKeys("");
        nextButton.click();
    }

    public void enterPasswordLogin() {
        userPassword.sendKeys("");
        nextButton.click();
    }
}
