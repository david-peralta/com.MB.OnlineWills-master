package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class DashboardPage extends Base {
	// ========================================================== Page Objects ===========================================================

	/* Button */
	@FindBy(xpath = "//input[contains(@value, 'Search')]")
	WebElement button_Search;
	@FindBy(xpath = "//input[contains(@value, 'Reset Filter')]")
	WebElement button_Reset;

	/* Input */
	@FindBy(xpath = "//input[contains(@id,'SearchBox')]")
	WebElement input_SearchDashboard;

	/* Link */
	@FindBy(xpath = "//a[contains(@id,'MoreOptions')]")
	WebElement link_MoreOption;

	/* Table Row */
	@FindBy(xpath = "//*[text()='Name']//parent::th")
	WebElement tablerow_Name;
	@FindBy(xpath = "//*[text()='Surname']//parent::th")
	WebElement tablerow_Surname;
	@FindBy(xpath = "//*[text()='Update']//parent::th")
	WebElement tablerow_Update;
	@FindBy(xpath = "//*[text()='Phone']//parent::th")
	WebElement tablerow_Phone;
	@FindBy(xpath = "//*[text()='Phone']//parent::th")
	WebElement tablerow_Email;
	@FindBy(xpath = "//*[text()='Single']//parent::th")
	WebElement tablerow_Single;
	@FindBy(xpath = "//*[text()='Union']//parent::th")
	WebElement tablerow_Union;
	@FindBy(xpath = "//*[text()='State']//parent::th")
	WebElement tablerow_State;
	@FindBy(xpath = "//*[text()='Status']//parent::th")
	WebElement tablerow_Status;
	@FindBy(xpath = "//*[text()='Action']//parent::th")
	WebElement tablerow_Action;
	@FindBy(xpath = "//*[text()='Action Date']//parent::th")
	WebElement tablerow_ActionDate;

	// ================================================== Initializing the Page Objects ==================================================
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void clickSearchDashboard() {
		CommonFunctions.clickElement(button_Search);
	}

	public void setInputSearchField(String searchdash) {
		CommonFunctions.clearThenEnterElementValue(input_SearchDashboard, searchdash);
	}

	public void displayedButtonSearch() {
		CommonFunctions.elementDisplayed(button_Search);
	}

	public void displayedSearchDashboard() {
		CommonFunctions.elementDisplayed(input_SearchDashboard);
	}

	public DashboardPage clickLoginDashboard() {
		CommonFunctions.clickElement(button_Search);
		return new DashboardPage();
	}
}