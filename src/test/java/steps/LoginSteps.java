package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import pages.LoginPage;
import sun.rmi.runtime.Log;

public class LoginSteps extends BaseSteps{

    private WebDriver getDriver() {
        return getDriverInstanceFor();
    }

    @Given("^User access Google Login page$")
    public void accessLogin() {
        new LoginPage(getDriver()).accessPage();
    }

    @When("^User enters Username and clicks on Next$")
    public void enterUsername() {
        new LoginPage(getDriver()).enterUsernameandNext();
    }

    @And("^User enters Passowrd and clicks on Next$")
    public void enterPasswordandLogin() {
        new LoginPage(getDriver()).enterPasswordLogin();
    }


}
