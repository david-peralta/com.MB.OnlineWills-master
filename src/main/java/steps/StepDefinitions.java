package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
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
		CommonFunctions.waitTitleIs(arg1);
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

	// ================================================== Login Page Functions ==================================================
	@When("^user enters the \"([^\"]*)\" and \"([^\"]*)\" for the login credentials$")
	public void user_enters_the_and_for_the_login_credentials(String arg1, String arg2) throws Throwable {
		loginPage.setEmailInput(arg1);
		loginPage.setPasswordInput(arg2);

		homePage = loginPage.clickLoginButton();
	}

	// =================================================== Home Page Functions ==================================================
	@When("^user decides to create a new post$")
	public void user_decides_to_create_a_new_post() throws Throwable {
		homePage.clickCreatePostButton();
	}

	@When("^user selects \"([^\"]*)\" as the photo/video to be uploaded$")
	public void user_selects_as_the_photo_video_to_be_uploaded(String arg1) throws Throwable {
		filePathsForUpload = CommonFunctions.assembleFilePathsToUpload(filePathsForUpload, arg1);
	}

	@When("^user puts \"([^\"]*)\" as the text contents for the post$")
	public void user_puts_as_the_text_contents_for_the_post(String arg1) throws Throwable {
		homePage.setNewPostTextInput(arg1);
	}

	@When("^user shares the new post$")
	public void user_shares_the_new_post() throws Throwable {
		homePage.clickShareNewPostButton(filePathsForUpload);
	}

	@Then("^user sees the new \"([^\"]*)\" post with the photos/videos$")
	public void user_sees_the_new_post_with_the_photos_videos(String arg1) throws Throwable {
		String[] filePaths = filePathsForUpload.split("\\r\\n|\\r|\\n");
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//p[text() = '" + arg1 + "']//ancestor::div[contains(@class, 'userContentWrapper')]//div[@data-testid = 'post_message']")));
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("(//p[text() = '" + arg1 + "']//ancestor::div[contains(@class, 'userContentWrapper')]//div[@data-testid = 'post_message']//following-sibling::div//a)[" + filePaths.length + "]")));
	}

	@When("^user decides to delete the new \"([^\"]*)\" post with the photos/videos$")
	public void user_decides_to_delete_the_new_post_with_the_photos_videos(String arg1) throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//p[text() = 'Test Upload']//ancestor::div[contains(@class, 'userContentWrapper')]//a[@aria-label = 'Story options']")));
		CommonFunctions.wait(2500, false);
		CommonFunctions.clickElement(driver.findElement(By.xpath("//span[text() = 'Delete']//ancestor::a")));
		CommonFunctions.wait(2500, false);
		CommonFunctions.switchFrameByXPath("//*[text() = 'Delete Post?']");
	}

	@Then("^user sees the delete post confirmation message$")
	public void user_sees_the_delete_post_confirmation_message() throws Throwable {
		CommonFunctions.textVisibleInPage("Delete Post?");
	}

	@When("^user confirms the deletion of the post$")
	public void user_confirms_the_deletion_of_the_post() throws Throwable {
		CommonFunctions.clickElement(driver.findElement(By.xpath("//button[text() = 'Delete']")));
		CommonFunctions.wait(2500, false);
	}

	@Then("^user does not see the new \"([^\"]*)\" post with the photos/videos$")
	public void user_does_not_see_the_new_post_with_the_photos_videos(String arg1) throws Throwable {
		CommonFunctions.elementNotExistingByXPath("//div[contains(@class, 'userContentWrapper')]//div[@data-testid = 'post_message']//p[text() = '" + arg1 + "']");
	}
}