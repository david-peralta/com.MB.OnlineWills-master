package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class HomePage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//input[@value = 'Yes, logout']")
	WebElement button_LogoutPopup_Yes;

	@FindBy(xpath = "//*[text() = 'Are you sure you want to log out?']")
	WebElement LogoutPopup;

	@FindBy(xpath = "//input[@value = 'Cancel']")
	WebElement button_LogoutPopup_Cancel;

	@FindBy(xpath = "//span[contains(@username, 'UserNameInfo')]")
	WebElement label_UserFullName;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement link_UserFullNameAccordion_Logout;

	@FindBy(xpath = "//span[text() = 'Single']")
	WebElement SinglesProduct;
	@FindBy(xpath = "//span[text() = 'Couple']")
	WebElement CouplesProduct;
	@FindBy(xpath = "//input[contains(@id,'StandardCoupleGetStarted')]")
	WebElement CouplesProductStandardWillBtn;
	@FindBy(xpath = "//input[contains(@id,'StandardSingleGetStarted3')]")
	WebElement SinglesProductStandardWillBtn;
	@FindBy(xpath = "//input[contains(@id,'MyLifeSingleGetStarted')]")
	WebElement SinglesProductMyLifeWillBtn;
	@FindBy(xpath = "//input[contains(@id,'MyLifeCoupleGetStarted')]")
	WebElement CouplesProductMyLifeWillBtn;
	@FindBy(xpath = "//input[@value='New Order']")
	WebElement NewOrderPopUp;
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement Continue;
	@FindBy(xpath = "//div[contains(@id,'VoucherUnion_block_wtTitle')]")
	WebElement PopupHeader;
	@FindBy(xpath = "//a[contains(text(),'Click here to check if you qualify for a free standard Will')]")
	WebElement FreeStandardWill;
	@FindBy(xpath = "//input[contains(@id,'MemberNumberId')]")
	WebElement YourMemberNumber;
	@FindBy(xpath = "//label[contains(text(),'Your member number will be verified on our system')]")
	WebElement MemberNumberFootnote;
	@FindBy(xpath = "(//input[contains(@value,'Cancel')])[2]")
	WebElement CancelBtn;
	@FindBy(xpath = "//input[contains(@value,'Confirm')]")
	WebElement ConfirmBtn;
	@FindBy(xpath = "//span[contains(@id,'AffiliationUnions_Current_Id')]")
	WebElement ValidationMessage1;
	@FindBy(xpath = "//span[contains(@id,'MemberNumberId')]")
	WebElement ValidationMessage2;
	@FindBy(xpath = "//select[contains(@id,'AffiliationUnions_Current_Id')]")
	WebElement AffiliatedUnionsDropdown;
	@FindBy(xpath = "//span[contains(text(),'$0')]")
	WebElement Cost;

	// ================================================== Initializing the Page Objects ==================================================
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================

	public void checkCouplesProductRadioButtonIsToggled() {
		CommonFunctions.elementAttributeContainsValue(CouplesProduct.findElement(By.xpath(".//parent::label//input")), "checked", "true");
	}

	public void clickNewOrderOnPopUp() {
		CommonFunctions.switchFrameByXPath("//div[text()='DEBUG You have an incomplete Order']");
		CommonFunctions.clickElement(NewOrderPopUp);

	}

	public void containsValueUserFullNameLabel(String expectedValue) {
		CommonFunctions.elementContainsText(label_UserFullName, expectedValue);
	}

	public void displayedCouplesProductMyLifeWillBtn() {
		CommonFunctions.elementDisplayed(CouplesProductMyLifeWillBtn);
	}

	public void displayedCouplesProductStandardWillBtn() {
		CommonFunctions.elementDisplayed(CouplesProductStandardWillBtn);
	}

	public void displayedCouplesProduct() {
		CommonFunctions.elementDisplayed(CouplesProduct.findElement(By.xpath(".//parent::label")));
	}

	public void displayedSinglesProduct() {
		CommonFunctions.elementDisplayed(SinglesProduct.findElement(By.xpath(".//parent::label")));
	}

	public void displayedbutton_LogoutPopup_Yes() {
		CommonFunctions.elementDisplayed(button_LogoutPopup_Yes);
	}

	public void displayedLogoutPopup() {
		CommonFunctions.elementDisplayed(LogoutPopup);
	}

	public void NotdisplayedLogoutPopup() {
		CommonFunctions.elementHidden(LogoutPopup);
	}

	public void displayedbutton_LogoutPopup_Cancel() {
		CommonFunctions.elementDisplayed(button_LogoutPopup_Cancel);
	}

	public void clickUserFullNameAccordionLogoutLink() {
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(link_UserFullNameAccordion_Logout);
	}

	public void clickUserFullName(String expectedValue) {
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(driver.findElement(By.xpath("//*[contains(text(), '" + expectedValue + "')]")));
	}

	public void clickLogoutPopupCancelButton() {
		CommonFunctions.clickElement(button_LogoutPopup_Cancel);
	}

	public void clickSinglesProduct() {
		CommonFunctions.clickElement(SinglesProduct.findElement(By.xpath(".//parent::label")));
	}

	public void clickCouplesProduct() {
		CommonFunctions.clickElement(CouplesProduct.findElement(By.xpath(".//parent::label")));
	}

	public void clickMyLifeProduct() {
		CommonFunctions.clickElement(CouplesProduct.findElement(By.xpath(".//parent::label")));
	}

	public LoginPage clickLogoutPopupYesButton() {
		CommonFunctions.clickElement(button_LogoutPopup_Yes);

		return new LoginPage();
	}

	public PersonalPage clickCouplesProductStandardWillBtn() {
		CommonFunctions.clickElement(CouplesProductStandardWillBtn);

		return new PersonalPage();
	}

	public PersonalPage clickSinglesProductStandardWillBtn() {
		CommonFunctions.clickElement(SinglesProductStandardWillBtn);

		return new PersonalPage();
	}

	public PersonalPage clickMyLifeProductStandardSingleWillBtn() {
		CommonFunctions.clickElement(SinglesProductMyLifeWillBtn);

		return new PersonalPage();
	}

	public PersonalPage clickMyLifeProductStandardCoupleWillBtn() {
		CommonFunctions.clickElement(CouplesProductMyLifeWillBtn);

		return new PersonalPage();
	}

	public void ClickFreeStandardWill() {
		CommonFunctions.clickElement(FreeStandardWill);
	}

	public void DisplayedPopupHeader() {
		CommonFunctions.elementDisplayed(PopupHeader);
	}

	public void DisplayedSelectAffliatedUnions() {
		CommonFunctions.elementDisplayed(AffiliatedUnionsDropdown);

	}

	public void DisplayedYourMemberNumber() {
		CommonFunctions.elementDisplayed(YourMemberNumber);

	}

	public void DisplayedMemberNumberFootnote() {
		CommonFunctions.elementDisplayed(MemberNumberFootnote);
	}

	public void DisplayedCancelBtn() {
		CommonFunctions.elementDisplayed(CancelBtn);

	}

	public void DisplayedConfirmBtn() {
		CommonFunctions.clickElement(ConfirmBtn);

	}

	public void ClickCancelBtn() {
		CommonFunctions.clickElement(CancelBtn);

	}

	public void DisplayedValidationMessage1() {
		CommonFunctions.elementDisplayed(ValidationMessage1);

	}

	public void DisplayedValidationMessage2() {
		CommonFunctions.elementDisplayed(ValidationMessage2);

	}

	public void SelectAffiliatedUnion(String value) {
		CommonFunctions.selectValueFromDropdown(AffiliatedUnionsDropdown, value);

	}

	public void SetMemberNumber(String value) {
		CommonFunctions.clearThenEnterElementValue(YourMemberNumber, value);

	}

	public void DisplayedCost() {
		CommonFunctions.elementDisplayed(Cost);

	}

	public PaymentsPage ClickContiueButtonPopUp() {
		CommonFunctions.clickElement(ContinueOrderPopUp);
		return new PaymentsPage();
		
		
	}
	
}