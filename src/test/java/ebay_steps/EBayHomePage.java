package ebay_steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

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

	@When("I Search for {string}")
	public void i_search_for_iphone(String item) {

		driver.findElement(By.id("gh-ac")).sendKeys(item);
		driver.findElement(By.id("gh-btn")).click();

	}

	@Then("Verify atlease {int} items are present")
	public void verify_atlease_items_are_present(int count) {
		String str = driver.findElement(By.xpath("//h1/span")).getText();
		String str2 = str.replace(",", "");
		int itemCount = Integer.parseInt(str2);
		if (itemCount < count) {
			fail("Item count is lessthen 1000");
		}
	}

	@When("I Search for {string} in {string} category")
	public void i_search_for_in_category(String item, String string2) {
		driver.findElement(By.id("gh-ac")).sendKeys(item);
		new Select(driver.findElement(By.name("_sacat"))).selectByVisibleText(string2);
		driver.findElement(By.id("gh-btn")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("I clikc on {string}")
	public void i_clikc_on(String string) {		
		driver.findElement(By.linkText(string)).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("I Validate that page nagivates to {string} and title contains {string}")
	public void i_validate_that_page_nagivates_to_and_title_contains(String string, String string2) {
		
		String actUrl = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		
		String expUrl = driver.getCurrentUrl();
		String expTitle = driver.getTitle();
		
		if (!actUrl.equals(expUrl)) {
			fail("Actual URL is not matching with the expected URL.");
		}
		
		if (!actTitle.contains(expTitle)) {
			fail("Actual Title is not matching with the expected Title.");
		}
	   
	}
}
