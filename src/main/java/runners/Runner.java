package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/htmlreports" }, // Reports to be produced.
	glue = { "steps" }, // Name of folder that contains the steps.
	monochrome = true, // For code readability.
	strict = true, // Always set to true to check every undefined/pending steps.
	dryRun = false, // Checking of steps if implemented or not.
	tags = { "@WIP" }, // @WIP = Work in Progress. @Regression = For Repeating Testing. Comment this
	// line for testing multiple feature files.
	features = "src/main/resources/features/WIP.feature" // Feature file to use for WIP.
// features = "src/main/resources/features/Regression/SampleModule/" // Feature file to use for Regression.
)

public class Runner {

}