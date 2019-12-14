package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class HomePage extends Base {
	// ========================================================== Page Objects ===========================================================
	/* CSS Property */
	@FindBy(xpath = "//div[contains (@class, 'menu-item  background-red OSInline')]")
	WebElement css_Red;

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

	//@FindBy(xpath = "//span[text() = 'Single']")
	@FindBy(xpath = "//input[@value = '2']")
	WebElement SinglesProduct;
	@FindBy(xpath = "//span[text() = 'Couple']")
	WebElement CouplesProduct;
	@FindBy(xpath = "//input[contains(@id,'StandardCoupleGetStarted')]")
	//@FindBy(xpath = "//input[@value='Get Started'][1]")
	WebElement CouplesProductStandardWillBtn;
	@FindBy(xpath = "//input[contains(@id,'StandardSingleGetStarted3')]")
	//@FindBy(xpath = "//input[@value='Get Started']")
	WebElement SinglesProductStandardWillBtn;
	@FindBy(xpath = "//input[contains(@id,'StandardSingleGetStarted')]")
	WebElement SinglesProductStandardWillVicBtn;
	@FindBy(xpath = "//input[contains(@id,'MyLifeSingleGetStarted')]")
	WebElement SinglesProductMyLifeWillBtn;
	@FindBy(xpath = "//input[contains(@id,'MyLifeCoupleGetStarted')]")
	WebElement CouplesProductMyLifeWillBtn;
	@FindBy(xpath = "//input[@value='New Order']")
	WebElement NewOrderPopUp;
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement ContinueOrderPopUp;
	@FindBy(xpath = "//div[contains(@id,'VoucherUnion_block_wtTitle')]")
	WebElement PopupHeader;
	@FindBy(xpath = "//a[contains(text(),'Union members click here')]")
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
	@FindBy(xpath = "//span[text() = '$0.00']")
	WebElement TotalCost;
	@FindBy(xpath = "//span[text() = '$440.00']")
	WebElement TotalCostWithPOA;
	@FindBy(xpath = "//span[text() = '$839.00']")
	WebElement TotalStandardWillCostWithPOA;

	/* View Text */
	@FindBy(xpath = "//span[contains(text(),'Standard Single Will')]")
	WebElement StandardSingleWill;
	@FindBy(xpath = "//span[contains(text(),'It takes only 30 mins to provide us with all the information we need to draft your Will. ')]")
	WebElement SingleWillBodyText;
	@FindBy(xpath = "//span[contains(text(),'Standard Couple Will')]")
	WebElement StandardCoupleWill;
	@FindBy(xpath = "//span[contains(text(),'It takes only 30 mins to provide us with all the information we need to draft a Will for you and your spouse/partner. ')]")
	WebElement CoupleWillBodyText;
	@FindBy(xpath = "(//span[contains(text(),'A Will for you')])[1]")
	WebElement CoupleWillTypeText1;
	@FindBy(xpath = "//span[contains(text(),'A Will for your spouse/partner')]")
	WebElement CoupleWillTypeText2;

	/* Footer */
	@FindBy(xpath = "//div[contains(text(),'© Copyright 2019 Maurice Blackburn. All Rights Reserved.')]")
	WebElement Footer_MB;

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
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_UP));
		CommonFunctions.wait(1500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_UP));
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
		CommonFunctions.wait(5000, false);
		return new PersonalPage();
	}

	public PersonalPage clickSinglesProductStandardWillBtn() {
		CommonFunctions.elementDisplayed(SinglesProductStandardWillBtn);
		CommonFunctions.clickElement(SinglesProductStandardWillBtn);

		return new PersonalPage();
	}

	public PersonalPage clickSinglesProductStandardWillVicBtn() {
		CommonFunctions.clickElement(SinglesProductStandardWillVicBtn);

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
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_DOWN));
		CommonFunctions.wait(3000, false);
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
	public void DisplayedTotalCost() {
		CommonFunctions.elementDisplayed(TotalCost);

	}
	
	public void DisplayedTotalCostWithPOA() {
		CommonFunctions.elementDisplayed(TotalCostWithPOA);

	}

	public PaymentsPage ClickContiueButtonPopUp() {
		CommonFunctions.clickElement(ContinueOrderPopUp);
		return new PaymentsPage();

	}

	public void checkCSSColor() {
		CommonFunctions.elementCssValueContains(css_Red, "background-color", "rgba(201, 42, 42, 1)");
		// CommonFunctions.elementCssValueContains(css_Red, "font-size", "20px");
	}

	public void checkStandardSingleWillText() {
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(StandardSingleWill);
	}

	public void checkSingleWillBodyText() {
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(SingleWillBodyText);
	}

	public void checkStandardCoupleWillText() {
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(StandardCoupleWill);
	}

	public void checkCoupleWillBodyText1() {
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(CoupleWillBodyText);
	}

	public void checkCoupleWillBodyText2() {
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(CoupleWillTypeText1);
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(CoupleWillTypeText2);
	}

	public void checkFooterIfDisplayed() {
		CommonFunctions.scrollToBottomOfPage();
		CommonFunctions.wait(2500, false);
		CommonFunctions.elementDisplayed(Footer_MB);
	}

}