package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class MedicalDecisionsPage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//input[contains(@id,'AddPOAButtonSingle')]")
	WebElement AddPOAButton;
	@FindBy(xpath = "//input[contains(@value,'Next')]")
	WebElement btn_Next;
	@FindBy(xpath = "//span[text()='Both financial and personal matters']//preceding-sibling::input")
	WebElement BothFinancialAndPersonalMatters;
	@FindBy(xpath = "//span[text()='Only financial matters']//preceding-sibling::input")
	WebElement OnlyFinancialMatters;
	@FindBy(xpath = "//span[text()='Only personal matters']//preceding-sibling::input")
	WebElement OnlyPersonalMatters;
	@FindBy(xpath = "//span[text()='Only personal matters']//following::span[text()='Required Field']")
	WebElement EnduringPOAReq;
	@FindBy(xpath = "//select[contains(@id,'AttorneyWhenToActComboBox')]")
	WebElement AttorneyWhenToActDropdown;
	@FindBy(xpath = "//select[contains(@id,'AttorneyWhenToActComboBox')]//following::a//following::span//following::span[text()='Required field']")
	WebElement AttorneyWhenToActDropdownReq;
	@FindBy(xpath = "//textarea[contains(@id,'LimitationsInput')]")
	WebElement LimitationsInput;

	// ================================================== Initializing the Page Objects ==================================================
	public MedicalDecisionsPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================

	public void clickAddPOAButton() {
		CommonFunctions.clickElement(AddPOAButton);
	}

	public void clickNextWithPOA() {
		CommonFunctions.clickElement(btn_Next);
	}

	public MedicalDecisionsPage ClickNextButton() {
		CommonFunctions.clickElement(btn_Next);

		return new MedicalDecisionsPage();
	}

}