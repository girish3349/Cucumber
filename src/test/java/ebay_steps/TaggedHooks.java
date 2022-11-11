package ebay_steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHooks {

	WebDriver driver;

	public TaggedHooks(CommonSteps commonsteps) {
		this.driver = commonsteps.getWebDriver();
	}

	@After(value = "@Test", order = -3)
	public void testAfterHook() {
		System.out.println("@@@@@@@@@@@@ Inside Test After Hook @@@@@@@@@@@@@@");
	}

	@Before(value = "@setCookies", order = 0)
	public void setCookies() {
		System.out.println("@@@@@@@@@@@@ Inside block set cookies @@@@@@@@@@@@@@");
	}

}
