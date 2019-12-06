package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/htmlreports" }, // Reports to be produced.
	glue = { "steps" }, // Name of folder that contains the steps.
	monochrome = true, // For code readability.
	strict = true, // Always set to true to check every undefined/pending steps.
	dryRun = false, // Checking of steps if implemented or not.
	tags = { "@Sprint" }, // @WIP = Work in Progress. @Regression = For Repeating Testing. @RegressionFail = Comment this line for testing multiple feature files.
	// features = "src/test/resources/features/" // Features used for Regression.
	// features = "src/test/resources/features/Sprint 1/MW - 25 - Single.feature" // Features used for Regression.
	// features = "src/test/resources/features/WIP.feature" // Feature file to use for WIP.
	// features = "src/test/resources/features/Sprint 2/MW - 144.feature" // Feature file to use for Sprint 2.
	features = "src/test/resources/features/Sprint 3/FullRun.feature" // Feature file to use for Sprint 2.
// tags = { "@Sprint" }, // @WIP = Work in Progress. @Regression = For Repeating Testing. @RegressionFail = Comment this line for testing multiple feature files.
// features = "src/test/resources/features/" // Features used for Regression.
// features = "src/test/resources/features/Sprint 2" // Features used for Regression.
// features = "src/test/resources/features/WIP.feature" // Feature file to use for WIP.
// features = "src/test/resources/features/WIP.feature" // Feature file to use for Sprint 2.

)

public class Runner {

}