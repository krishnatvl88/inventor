package steps;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import pages.LoginPage;

public class LoginSteps extends BaseSteps{

    private WebDriver getDriver() {
        return getDriverInstanceFor();
    }

    @Given("^User access Google Login page$")
    public void accessLogin() {
        new LoginPage(getDriver()).accessPage();
    }

}
