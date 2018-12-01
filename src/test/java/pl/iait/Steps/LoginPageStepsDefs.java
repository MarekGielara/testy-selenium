package pl.iait.Steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pl.iait.selenium1.Init;

public class LoginPageStepsDefs
{
	
	WebDriver driver = null;
	
	
	@Given("^I open main page$")
	public void i_open_main_page() throws Throwable {
	    driver = Init.getDriver();
	}

	@When("^I fill the login form with login \"([^\"]*)\" and pass \"([^\"]*)\"$")
	public void i_fill_the_login_form_with_login_and_pass(String arg1, String arg2) throws Throwable 
	{
	    LoginPage loginPage = new LoginPage();
	    loginPage.goToLoginPage();
	    loginPage.loginAs(arg1, arg2);
	    
	}

	
	@Then("^I should see the flight reservation form$")
	public void i_should_see_the_flight_reservation_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}