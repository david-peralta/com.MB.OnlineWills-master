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
	@FindBy(xpath = "//*[text()='Updated']//parent::th")
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

	/* Row Actions */
	@FindBy(xpath = "(//table[contains(@id,'FormItemTable')]//following-sibling::tr)[2]")
	WebElement tablerow_NewestRow;
	@FindBy(xpath = "(//table[contains(@id,'FormItemTable')]//following-sibling::tr)[11]")
	WebElement tablerow_OldestRow;
	@FindBy(xpath = "(//select[contains(@id,'FormItemTable_List_Current_Actions_Id')])[1]")
	WebElement dropdown_Action;
	@FindBy(xpath = "(//input[contains(@id,'ActionDate2')])[1]")
	WebElement input_ActionDate;

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

	public void displayedNewestRow() {
		CommonFunctions.elementDisplayed(tablerow_NewestRow);
		CommonFunctions.wait(3000, false);
	}

	public void displayedOldestRow() {
		CommonFunctions.elementDisplayed(tablerow_OldestRow);
		CommonFunctions.wait(3000, false);
	}

	public void checksDashboardRows() {
		CommonFunctions.elementDisplayed(tablerow_Name);
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(tablerow_Surname);
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(tablerow_Update);
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(tablerow_Phone);
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(tablerow_Email);
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(tablerow_Single);
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(tablerow_Union);
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(tablerow_State);
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(tablerow_Status);
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(tablerow_Action);
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(tablerow_ActionDate);
		CommonFunctions.wait(3000, false);
	}

	public void SearchDashboardUser() {
		CommonFunctions.clearThenEnterElementValue(input_SearchDashboard, "Email");
		CommonFunctions.wait(3000, false);
		CommonFunctions.clickElement(button_Search);
		CommonFunctions.wait(3000, false);

	}

	public void UpdateUserActions() {
		CommonFunctions.selectValueFromDropdown(dropdown_Action, "Made contact");
		CommonFunctions.wait(3000, false);
		CommonFunctions.clearThenEnterElementValue(input_ActionDate, "05/09/2001");
		CommonFunctions.wait(3000, false);
	}

	public void enterInvalidDate() {
		CommonFunctions.clearThenEnterElementValue(input_ActionDate, "05/09/111");
		CommonFunctions.wait(3000, false);
	}

	public void SortsColumnInDashboardTable() {
		CommonFunctions.clickElement(tablerow_Update);
		CommonFunctions.wait(3000, false);
	}

	public DashboardPage clickLoginDashboard() {
		CommonFunctions.clickElement(button_Search);
		return new DashboardPage();
	}
}