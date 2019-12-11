package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class PersonalPage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//select[contains(@id,'PersonalTitle_ComboBox')]")
	WebElement TitleDropdown;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfoFirstname_Input')]")
	WebElement FirstName;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_Middlename_Input')]")
	WebElement MiddleName;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_Familyname_Input')]")
	WebElement FamilyName;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_DateOfBirth_Input')]")
	WebElement DateOfBirth;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_Phone_Input')]")
	WebElement PhoneNumber;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_Occupation_Input')]")
	WebElement Occupation;

	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_Line1ResAddress_Input')]")
	WebElement ResidentialAddressLine1;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_Line2ResAddress_Input')]")
	WebElement ResidentialAddressLine2;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_SubsurfRes_Input')]")
	WebElement ResidentialSuburb;
	@FindBy(xpath = "//select[contains(@id,'PersonalInfo_StateId_Input')]")
	WebElement ResidentialState;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_PostcodePost_Input')]")
	WebElement ResidentialPostCode;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_IsPostAddDetails_CheckBox')]")
	WebElement ResidentialAddressSameAsResidential;

	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_Line1PostAddress_Input')]")
	WebElement PostalAddressLine1;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_Line2PostAddress_Input')]")
	WebElement PostalAddressLine2;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_SubsurfPost_Input')]")
	WebElement PostalSuburb;
	@FindBy(xpath = "//select[contains(@id,'PersonalInfo_StateIdPost_ComboBox')]")
	WebElement PostalState;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_PostcodeRes_Input')]")
	WebElement PostalPostCode;

	@FindBy(xpath = "//label[text()='Are you currently in hospital?']")
	WebElement AdditionalQuestion1;
	@FindBy(xpath = "//input[contains(@id,'Hospital_Yes')]")
	WebElement YesQuestion1;
	@FindBy(xpath = "//input[contains(@id,'Hospital_No')]")
	WebElement NoQuestion1;
	@FindBy(xpath = "//label[text()='Have you been diagnosed with any physical, cognitive or mental impairments or disorders that may impact your ability to draft or sign your Will?']")
	WebElement AdditionalQuestion2;
	@FindBy(xpath = "//input[contains(@id,'Diagnosed_Yes')]")
	WebElement YesQuestion2;
	@FindBy(xpath = "//input[contains(@id,'Diagnosed_No')]")
	WebElement NoQuestion2;
	@FindBy(xpath = "//input[@value='Save and Continue']")
	WebElement NextButton;
	@FindBy(xpath = "//input[contains(@value, 'Cancel')]")
	WebElement CancelButton;

	@FindBy(xpath = "//button[text()='Today']")
	WebElement Today;

	@FindBy(xpath = "//div[contains(@id,'PostalAddress_Container')]")
	WebElement PostalContainer;

	/* Progess Bar */
	@FindBy(xpath = "//div[text()='About You']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAbout;
	@FindBy(xpath = "//div[text()='Assets']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAssets;
	@FindBy(xpath = "//div[text()='Beneficiaries']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressBeneficiaries;
	@FindBy(xpath = "//div[text()='Executors']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressExecutors;
	@FindBy(xpath = "//div[text()='ID Docs']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressIDDocs;
	@FindBy(xpath = "//div[text()='Review & Confirm']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressReviewConfirm;
	@FindBy(xpath = "//div[text()='Add-ons']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAddOns;

	// ================================================== Initializing the Page Objects =================================================
	public PersonalPage() {
		PageFactory.initElements(driver, this);
	}

	// ================================================== Initializing the Page Objects ==================================================
	public void MaxlengthPhoneNumber() {
		CommonFunctions.elementAttributeContainsValue(PhoneNumber, "maxlength", "10");
	}

	public void MaxlengthResPostcode() {
		CommonFunctions.elementAttributeContainsValue(ResidentialPostCode, "maxlength", "10");
	}

	public void MaxlengthPostalPostcode() {
		CommonFunctions.elementAttributeContainsValue(PostalPostCode, "maxlength", "10");
	}

	public void MaxlengthFirstName() {
		CommonFunctions.elementAttributeContainsValue(FirstName, "maxlength", "50");
	}

	public void MaxlengthOccupation() {
		CommonFunctions.elementAttributeContainsValue(Occupation, "maxlength", "50");
	}

	public void MaxlengthResSuburb() {
		CommonFunctions.elementAttributeContainsValue(ResidentialSuburb, "maxlength", "50");
	}

	public void MaxlengthPostalSuburb() {
		CommonFunctions.elementAttributeContainsValue(PostalSuburb, "maxlength", "50");
	}

	public void MaxlengthResidentialAddressLine1() {
		CommonFunctions.elementAttributeContainsValue(ResidentialAddressLine1, "maxlength", "50");
	}

	public void MaxlengthResidentialAddressLine2() {
		CommonFunctions.elementAttributeContainsValue(ResidentialAddressLine2, "maxlength", "50");
	}

	public void MaxlengthPostalAddressLine2() {
		CommonFunctions.elementAttributeContainsValue(PostalAddressLine2, "maxlength", "50");
	}

	public void MaxlengthPostalAddressLine1() {
		CommonFunctions.elementAttributeContainsValue(PostalAddressLine1, "maxlength", "50");
	}

	public void CheckDOBPlaceholder() {
		CommonFunctions.elementAttributeContainsValue(DateOfBirth, "placeholder", "DD/MM/YYYY");
	}

	public void MaxlengthMiddleName() {
		CommonFunctions.elementAttributeContainsValue(MiddleName, "maxlength", "50");
	}

	public void MaxlengthFamilyName() {
		CommonFunctions.elementAttributeContainsValue(FamilyName, "maxlength", "50");
	}

	public void SetInvalidDOB() {
		String InvalidDate = "19900905";
		CommonFunctions.clearThenEnterElementValue(DateOfBirth, InvalidDate);
	}

	public void ClearFirstName() {
		String blank = "";
		CommonFunctions.clearThenEnterElementValue(FirstName, blank);
	}

	public void ClearFamilyName() {
		String blank = "";
		CommonFunctions.clearThenEnterElementValue(FamilyName, blank);
	}

	public AboutPage ClickNextButton() {
		CommonFunctions.clickElement(NextButton);

		return new AboutPage();
	}

	public HomePage ClickCancelButton() {
		CommonFunctions.clickElement(CancelButton);

		return new HomePage();
	}

	public ReviewConfirmPage clickNextToReviewConfirm() {
		CommonFunctions.clickElement(NextButton);

		return new ReviewConfirmPage();
	}

	public void HiddenPostalDetailFields() {
		CommonFunctions.elementCssValueContains(PostalContainer, "display", "none");
		// CommonFunctions.elementAttributeContainsValue(PostalContainer, "style", "display:none");
		// CommonFunctions.elementHidden(PostalAddressLine1);
		// CommonFunctions.elementHidden(PostalAddressLine2);
		// CommonFunctions.elementHidden(PostalSuburb);
		// CommonFunctions.elementHidden(PostalState);
		// CommonFunctions.elementHidden(PostalPostCode);

	}

	public void DisplayedPostalDetailFields() {
		CommonFunctions.elementDisplayed(PostalAddressLine1);
		CommonFunctions.elementDisplayed(PostalAddressLine2);
		CommonFunctions.elementDisplayed(PostalSuburb);
		CommonFunctions.elementDisplayed(PostalState);
		CommonFunctions.elementDisplayed(PostalPostCode);

	}

	public void ClickNoFirstQuestion() {
		CommonFunctions.clickElement(NoQuestion1);
		CommonFunctions.wait(2000, false);
	}

	public void ClickYesFirstQuestion() {
		CommonFunctions.clickElement(YesQuestion1);

	}

	public void ClickNoSecondQuestion() {
		CommonFunctions.clickElement(NoQuestion2);
		CommonFunctions.wait(2000, false);
	}

	public void ClickYesSecondQuestion() {
		CommonFunctions.clickElement(YesQuestion2);
	}

	public void ClickPostalAddressSameAsResidential() {
		CommonFunctions.wait(5000, false);
		// CommonFunctions.scrollToElement(ResidentialAddressSameAsResidential);
		// CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(ResidentialAddressSameAsResidential);
	}

	public void CheckAdditionalQuestion1() {
		CommonFunctions.elementDisplayed(AdditionalQuestion1);
	}

	public void SelectTitlePersonalPage(String value) {
		CommonFunctions.selectValueFromDropdown(TitleDropdown, value);
	}

	public void SelectResStatePersonalPage(String value) {
		CommonFunctions.selectValueFromDropdown(ResidentialState, value);
	}

	public void CheckNextButton() {
		CommonFunctions.elementDisplayed(NextButton);
	}

	public void CheckCancelButton() {
		CommonFunctions.elementDisplayed(CancelButton);
	}

	public void CheckYesQuestion1() {
		CommonFunctions.elementDisplayed(YesQuestion1);
	}

	public void CheckNoQuestion1() {
		CommonFunctions.elementDisplayed(NoQuestion1);
	}

	public void CheckAdditionalQuestion2() {
		CommonFunctions.elementDisplayed(AdditionalQuestion2);
	}

	public void CheckYesQuestion2() {
		CommonFunctions.elementDisplayed(YesQuestion2);
	}

	public void CheckNoQuestion2() {
		CommonFunctions.elementDisplayed(NoQuestion2);
	}

	public void CheckTitleDropdown() {
		CommonFunctions.elementDisplayed(TitleDropdown);
	}

	public void CheckResidentialAddressSameAsResidential() {
		CommonFunctions.elementDisplayed(ResidentialAddressSameAsResidential);
	}

	public void CheckResidentialPostCode() {
		CommonFunctions.elementDisplayed(ResidentialPostCode);
	}

	public void CheckResidentialSuburb() {
		CommonFunctions.elementDisplayed(ResidentialSuburb);
	}

	public void CheckResidentialState() {
		CommonFunctions.elementDisplayed(ResidentialState);
	}

	public void CheckResidentialAddressLine1() {
		CommonFunctions.elementDisplayed(ResidentialAddressLine1);
	}

	public void CheckResidentialAddressLine2() {
		CommonFunctions.elementDisplayed(ResidentialAddressLine2);
	}

	public void CheckOccupation() {
		CommonFunctions.elementDisplayed(Occupation);
	}

	public void CheckPhoneNumber() {
		CommonFunctions.elementDisplayed(PhoneNumber);
	}

	public void CheckDateOfBirth() {
		CommonFunctions.elementDisplayed(DateOfBirth);
	}

	public void CheckFirstName() {
		CommonFunctions.elementDisplayed(FirstName);
	}

	public void CheckMiddleName() {
		CommonFunctions.elementDisplayed(MiddleName);
	}

	public void CheckFamilyName() {
		CommonFunctions.elementDisplayed(FamilyName);
	}

	public void CheckTitleDropdownValues(String[] expectedValues) {
		CommonFunctions.checkDropdownOptionsAvailable(TitleDropdown, expectedValues);
	}

	public void CheckResStateDropdownValues(String[] expectedValues) {
		CommonFunctions.checkDropdownOptionsAvailable(ResidentialState, expectedValues);
	}

	public void CheckPostalStateDropdownValues(String[] expectedValues) {
		CommonFunctions.checkDropdownOptionsAvailable(PostalState, expectedValues);
	}

	public void CheckTitleDefaultValue(String expectedValue) {
		CommonFunctions.checkSingleSelectDropdownSelectedOption(TitleDropdown, expectedValue);
	}

	public void CheckResStateDefaultValue(String expectedValue) {
		CommonFunctions.checkSingleSelectDropdownSelectedOption(ResidentialState, expectedValue);
	}

	public void CheckPostalStateDefaultValue(String expectedValue) {
		CommonFunctions.checkSingleSelectDropdownSelectedOption(PostalState, expectedValue);
	}

	public void CheckFirstNameMandatory() {
		CommonFunctions.elementDisplayed(FirstName.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckOccupationMandatory() {
		CommonFunctions.elementDisplayed(Occupation.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void SelectDateToday() {
		CommonFunctions.clickElement(DateOfBirth);
		CommonFunctions.wait(5000, false);
		// CommonFunctions.switchFrameByXPath("//button[text()='Today']");
		CommonFunctions.clickElement(Today);
	}

	public void SetDateOfBirth(String value) {
		CommonFunctions.clearThenEnterElementValue(DateOfBirth, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.wait(5000, false);

	}

	public void FillUpDateOfBirth(String birth) {
		CommonFunctions.clickElement(DateOfBirth);
		CommonFunctions.wait(2500, false);
		CommonFunctions.enterElementValue(DateOfBirth, birth);
	}

	public void CheckResSuburbMandatory() {
		CommonFunctions.elementDisplayed(ResidentialSuburb.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void SetPhoneNumber(String value) {
		CommonFunctions.clearThenEnterElementValue(PhoneNumber, value);;
	}

	public void SetOccupation(String value) {
		CommonFunctions.clearThenEnterElementValue(Occupation, value);;
	}

	public void SelectResPostcodePersonalPage(String value) {
		CommonFunctions.clearThenEnterElementValue(ResidentialPostCode, value);;
	}

	public void SetResAddressline1(String value) {
		CommonFunctions.clearThenEnterElementValue(ResidentialAddressLine1, value);;
	}

	public void SetResSuburb(String value) {
		CommonFunctions.clearThenEnterElementValue(ResidentialSuburb, value);;
	}

	public void CheckPostalSuburbMandatory() {
		CommonFunctions.elementDisplayed(PostalSuburb.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckPhoneNumberMandatory() {
		CommonFunctions.elementDisplayed(PhoneNumber.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckResPostcodeMandatory() {
		CommonFunctions.elementDisplayed(ResidentialPostCode.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckPostalPostcodeMandatory() {
		CommonFunctions.elementDisplayed(PostalPostCode.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckFirstQuestionMandatory() {
		CommonFunctions.elementDisplayed(NoQuestion1.findElement(By.xpath(".//following::label//following::div[text()='Required field']")));
	}

	public void CheckSecondQuestionMandatory() {
		CommonFunctions.elementDisplayed(NoQuestion2.findElement(By.xpath(".//following::label//following::div[text()='Required field']")));
	}

	public void CheckResidentialAddressLine1Mandatory() {
		CommonFunctions.elementDisplayed(ResidentialAddressLine1.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckPostalAddressLine1Mandatory() {
		CommonFunctions.elementDisplayed(PostalAddressLine1.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckPostalAddressLine2Mandatory() {
		CommonFunctions.elementDisplayed(PostalAddressLine2.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckResidentialAddressLine2NotMandatory() {
		CommonFunctions.elementDisplayed(ResidentialAddressLine1.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckDOBMandatory() {
		CommonFunctions.elementDisplayed(DateOfBirth.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckInvalidDOBValidation() {
		CommonFunctions.elementDisplayed(DateOfBirth.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));
	}

	public void CheckMiddleNameNotMandatory() {
		CommonFunctions.elementHidden(MiddleName.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckFamilyNameMandatory() {
		CommonFunctions.elementDisplayed(FamilyName.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckTitleDropdownMandatory() {
		CommonFunctions.elementDisplayed(TitleDropdown.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckResStateDropdownMandatory() {
		CommonFunctions.elementDisplayed(ResidentialState.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckPostalStateDropdownMandatory() {
		CommonFunctions.elementDisplayed(PostalState.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public AboutPage ProgressChangeAbout() {
		CommonFunctions.clickElement(ProgressAbout);

		return new AboutPage();
	}

	public AssetsPage ProgressChangeAssets() {
		CommonFunctions.clickElement(ProgressAssets);

		return new AssetsPage();
	}

	public BeneficiariesPage ProgressChangeBeneficiaries() {
		CommonFunctions.clickElement(ProgressBeneficiaries);

		return new BeneficiariesPage();
	}

	public ExecutorsPage ProgressChangeExecutors() {
		CommonFunctions.clickElement(ProgressExecutors);

		return new ExecutorsPage();
	}

	public IDdocsPage ProgressChangeIDdocs() {
		CommonFunctions.clickElement(ProgressIDDocs);

		return new IDdocsPage();
	}

	public ReviewConfirmPage ProgressChangeReviewConfirm() {
		CommonFunctions.clickElement(ProgressReviewConfirm);

		return new ReviewConfirmPage();
	}

	public AddOnsPage ProgressChangeAddOns() {
		CommonFunctions.clickElement(ProgressAddOns);

		return new AddOnsPage();
	}

	public void CheckProgressAbout() {
		CommonFunctions.elementDisplayed(ProgressAbout.findElement(By.xpath(".//following-sibling::a[contains(text(),'Change')]")));
	}

	public void CheckProgressAsset() {
		CommonFunctions.elementDisplayed(ProgressAbout.findElement(By.xpath(".//following-sibling::a[contains(text(),'Change')]")));
	}

}