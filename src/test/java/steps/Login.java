package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	@Given("I am on HRM Login Page")
	public void i_am_on_hrm_login_page() {
		System.out.println("In i_am_on_hrm_login_page Method");
	}

	@When("Enter username")
	public void enter_username() {
		System.out.println("In enter_username Method");

	}

	@When("Enter Password")
	public void enter_password() {
		System.out.println("in enter_Password Method");

	}

	@When("click on Login button")
	public void click_on_login_button() {
		System.out.println("In click_on_login_button Method");
	}

	@Then("Verify we are on Home Page")
	public void verify_we_are_on_home_page() {
	}

}
