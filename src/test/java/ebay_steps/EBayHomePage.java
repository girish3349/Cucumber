package ebay_steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EBayHomePage {

	private WebDriver driver;
	
	public EBayHomePage(CommonSteps commonsteps) {
		this.driver = commonsteps.getWebDriver();
	}

	@Given("I am on EBay Home Page")
	public void i_am_on_e_bay_home_page() {
		System.out.println("I am on EBay Home Page");
		System.out.println(System.getProperty("user.dir"));
	}

	@When("I click on Advanced link")
	public void i_click_on_advanced_link() {
		System.out.println("I click on Advanced link");
		driver.findElement(By.linkText("Advanced")).click();
	}

	@Then("I navigate to Advanced Search page")
	public void i_navigate_to_advanced_search_page() {
		System.out.println("I navigate to Advanced Search page");
		String expURL = "https://www.ebay.com/sch/ebayadvsearch";
		String actURL = driver.getCurrentUrl();
		if (!expURL.equals(actURL)) {
			fail("Page doesn't navigated to expected page");
		}
	}

	@When("I Search for Iphone 13")
	public void i_search_for_iphone() {
		
		driver.findElement(By.id("gh-ac")).sendKeys("Iphone 11");
		driver.findElement(By.id("gh-btn")).click();
		
	}

	@Then("Verify atlease 1000 items are present")
	public void verify_atlease_items_are_present() {
		
		String str = driver.findElement(By.xpath("//h1/span")).getText();
		String str2 = str.replace(",", "");
		int itemCount = Integer.parseInt(str2);
		if (itemCount < 1000) {
			fail("Item count is lessthen 1000");
		}
	}

}
