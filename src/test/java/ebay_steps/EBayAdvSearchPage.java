package ebay_steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EBayAdvSearchPage {

	WebDriver driver;
	
	public EBayAdvSearchPage(CommonSteps commonsteps) {
		this.driver = commonsteps.getWebDriver();
	}


	@Given("I am on Ebay Advanced Search Page")
	public void i_am_on_ebay_advanced_search_page() {
		System.out.println("I am on Ebay Advanced Search Page");
	}

	@When("I Click on EBay Logo")
	public void i_click_on_e_bay_logo() {
		System.out.println("I Click on EBay Logo");
		driver.findElement(By.id("gh-la")).click();
	}

	@Then("I am navigated to EBay Home Page")
	public void i_am_navigated_to_e_bay_home_page() {
		System.out.println("I am navigated to EBay Home Page");
		String actURL = driver.getCurrentUrl();
		String expURL = "https://www.ebay.com/";
		if (!expURL.equals(actURL)) {
			fail("Page doesn't navigated to Home page");
		}
	}

}
