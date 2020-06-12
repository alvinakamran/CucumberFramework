package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinitions {

    @Given("^User is on landing page$")
    public void landingPage(){
        System.out.println("user is on landing page");
    }

    @When("^User enters the correct username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void enterCredentials(String username, String password){
        System.out.println(username);
        System.out.println(password);
    }

    @Then("^User should be navigated to the Home screen$")
    public void verifyHomeScreen(){
        System.out.println("home screen is verified");
    }

}
