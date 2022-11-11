package ebay_steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonSteps {

	WebDriver driver;

	@Before(order =1)
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "browserDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		System.out.println("###### BROWSER OPENED #######");
	}

	@After(order = -2)
	public void tearDown() {
		System.out.println("###### BROWSER CLOSED #######");
		driver.quit();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public WebDriver getWebDriver() {
		return driver;
	}

}
