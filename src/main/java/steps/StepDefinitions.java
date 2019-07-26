package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.LoginPage;
import utilities.Base;
import utilities.CommonFunctions;
import utilities.LogFunctions;

public class StepDefinitions extends Base {
	String filePathsForUpload = "";
	LoginPage loginPage;
	HomePage homePage;

	// ================================================== Universal Functions ==================================================
	@Before
	public void setup(Scenario scenario) {
		LogFunctions.startLog(scenario);
	}

	@After
	public void tearDown(Scenario scenario) {
		CommonFunctions.testResults(scenario);
		CommonFunctions.screenshotFailedTest(scenario);
		LogFunctions.endLog(scenario);
		driver.quit();
	}

	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		Base.initialization();

		loginPage = new LoginPage();
	}

	@Then("^user is on \"([^\"]*)\" page$")
	public void user_is_on_page(String arg1) throws Throwable {
		CommonFunctions.checkPageTitle(arg1);
	}

	@Then("^user is on \"([^\"]*)\" popup in page \"([^\"]*)\"$")
	public void user_is_on_popup_in_page(String arg1, String arg2) throws Throwable {
		CommonFunctions.checkPopupOnPage(arg2, arg1);
	}

	@Then("^user sees feedback message \"([^\"]*)\"$")
	public void user_sees_feedback_message(String arg1) throws Throwable {
		CommonFunctions.checkFeedbackMessageDisplayedEqualsToString(arg1);
	}

	@Then("^user does not see feedback message \"([^\"]*)\"$")
	public void user_does_not_see_feedback_message(String arg1) throws Throwable {
		CommonFunctions.checkFeedbackMessageHidden(arg1);
	}

	@When("^user becomes inactive for \"([^\"]*)\" minutes$")
	public void user_becomes_inactive_for_minutes(Integer arg1) throws Throwable {
		CommonFunctions.wait(arg1, true);
	}

	@Then("^user sees no results in the table$")
	public void user_sees_no_results_in_the_table() throws Throwable {
		CommonFunctions.textVisibleInPage("No matching records found.");
	}

	@When("^user sees alert message \"([^\"]*)\" and clicks on \"([^\"]*)\"$")
	public void user_sees_alert_message_and_clicks_on(String arg1, String arg2) throws Throwable {
		CommonFunctions.checkAlertMessageIsDisplayed(arg1);
		CommonFunctions.clickOnPopUp(arg2);
	}

	@Then("^user sees alert message \"([^\"]*)\"$")
	public void user_sees_alert_message(String arg1) throws Throwable {
		CommonFunctions.checkAlertMessageIsDisplayed(arg1);
	}

	@Then("^user does not see alert$")
	public void user_does_not_see_alert(String arg1) throws Throwable {
		CommonFunctions.checkAlertIsNotDisplayed();
	}

	@Then("^user sees error message \"([^\"]*)\"$")
	public void user_sees_error_message(String arg1) throws Throwable {
		CommonFunctions.textVisibleInPage(arg1);
	}

	@Then("^user does not see the error message \"([^\"]*)\"$")
	public void user_does_not_see_the_error_message(String arg1) throws Throwable {
		CommonFunctions.textNotInPage(arg1);
	}

	@When("^user hits the tab key$")
	public void user_hits_the_tab_key() throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}

	@When("^user hits the escape key$")
	public void user_hits_the_escape_key() throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}

	@When("^user hits the enter key$")
	public void user_hits_the_enter_key() throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
	}
}