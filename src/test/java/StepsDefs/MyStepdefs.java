package StepsDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;

public class MyStepdefs extends PageObject {
    @Given("the user is on {string}")
    public void theUserIsOn(String arg0) {
        openAt(arg0);
    }

    @When("he click on accept all")
    public void heClickOnAcceptAll() {
    }

    @Then("The cookies windows vanish")
    public void theCookiesWindowsVanish() {
    }

    @When("the user click on {string} on the nav bar")
    public void theUserClickOnOnTheNavBar(String arg0) {
    }

    @Then("he arrives on the right page")
    public void heArrivesOnTheRightPage() {
    }
}
