package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "ebay_features", // Name of the folder where feature files are located
		glue = { "ebay_steps" }, // Package name where the steps definitions are written
		plugin = { "pretty",
					"html:target/ebay-report/cucumber.html",
					"json:target/ebay-report/cucumber.json",
					"junit:target/ebay-report/cucumber.junit" }, // Report formats
		dryRun = false, // 
		monochrome = true // When monochrome value set to true, 
		//It will make console output for the Cucumber test much more readable and remove any unreadable character
		//tags = "@P44" // Run all the Scenarios which are associated with given tag names 
		//name = {"Logo"} // Runs all the scenarios, which has "Logo" word matching in Scenario names
		)
public class EbayTestRunner {

}
