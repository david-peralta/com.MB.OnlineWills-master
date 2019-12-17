package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class ExecutorsPage extends Base {
	// ========================================================== Page Objects ===========================================================

	// Element - Display

	@FindBy(xpath = "//span[text()='Who do you want to manage your estate?']")
	WebElement Question1;

	// Element - Link

	// @FindBy(xpath = "//*[contains(@id,'lnkAddExecutor')]//parent::div")
	@FindBy(xpath = "//span[@class='fa fa-fw fa-plus']")
	WebElement Question2;

	// Element - PopUp
	// Are you sure you want to remove this entry from the list?

	// Element - Button

	@FindBy(xpath = "//input[contains(@value,'Add')]")
	WebElement btn_Add;
	@FindBy(xpath = "(//input[contains(@value,'Add')])[3]")
	WebElement btn_add3;
	@FindBy(xpath = "(//input[contains(@value,'Cancel')])[2]")
	WebElement btn_Cancel;

	@FindBy(xpath = "(//a[contains(text(),'Delete')])[1]")
	WebElement btn_Delete;

	@FindBy(xpath = "(//a[contains(text(),'Edit')])[1]")
	WebElement btn_Edit;

	@FindBy(xpath = "//input[contains(@value,'Save and Continue')]")
	WebElement btn_Next;

	@FindBy(xpath = "//input[contains(@value,'Back')]")
	WebElement btn_Back;

	// Element - Radio Button
	/* FirstOption & Backup */
	@FindBy(xpath = "//input[contains(@id,'FirstOption')]")
	WebElement Question14A;

	@FindBy(xpath = "//input[contains(@id,'InputsAndLabels_wtBackup')]")
	WebElement Question14B;

	/* Would you like Maurice Blackburn to help your Executor(s) manage your estate? */
	@FindBy(xpath = "//input[contains(@id,'Probate_Yes')]")
	WebElement Question16A;

	@FindBy(xpath = "//input[contains(@id,'Probate_No')]")
	WebElement Question16B;

	/* Funeral Wishes */
	@FindBy(xpath = "//input[contains(@id,'FuneralWish_Buried')]")
	WebElement Question17A;

	@FindBy(xpath = "//input[contains(@id,'FuneralWish_Cremated')]")
	WebElement Question17B;

	@FindBy(xpath = "//input[contains(@id,'FuneralWish_Other')]")
	WebElement Question17C;

	@FindBy(xpath = "//input[contains(@id,'FuneralWish_NoWish')]")
	WebElement Question17D;

	// Element - Dropdown
	@FindBy(xpath = "//select[contains(@id,'ExecutorTitle')]")
	WebElement Question3;

	@FindBy(xpath = "//select[contains(@id,'ExecutorRelationship')]")
	WebElement Question7;

	@FindBy(xpath = "//select[contains(@id,'ExecutorCountry')]")
	WebElement Question8;

	@FindBy(xpath = "//select[contains(@id,'ExecutorStateCombo')]")
	WebElement Question12A;

	// Element - Input

	@FindBy(xpath = "//input[contains(@id,'ExecutorFirstName')]")
	WebElement Question4;

	@FindBy(xpath = "//input[contains(@id,'ExecutorMiddleName')]")
	WebElement Question5;

	@FindBy(xpath = "//input[contains(@id,'ExecutorLastName')]")
	WebElement Question6;

	@FindBy(xpath = "//input[contains(@id,'ExecutorAddressLine1')]")
	WebElement Question9;

	@FindBy(xpath = "//input[contains(@id,'ExecutorAddressLine2')]")
	WebElement Question10;

	@FindBy(xpath = "//input[contains(@id,'ExecutorSuburb')]")
	WebElement Question11;

	@FindBy(xpath = "//input[contains(@id,'Executor_StateText_Input')]")
	WebElement Question12B;

	@FindBy(xpath = "//input[contains(@id,'ExecutorPostCode')]")
	WebElement Question13;

	/* I want body buried at: */
	@FindBy(xpath = "//input[contains(@id,'WishDetail_Input')]")
	WebElement Question18;

	/* I wish for my ashes to be: */
	@FindBy(xpath = "//input[contains(@id,'WishDetail_Input')]")
	WebElement Question19;

	/* I want... */
	@FindBy(xpath = "//input[contains(@id,'WishDetail_Input')]")
	WebElement Question20;

	/* Progess Bar */
	@FindBy(xpath = "//div[text()='Personal Details']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressPersonal;
	@FindBy(xpath = "//div[text()='About You']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAbout;
	@FindBy(xpath = "//div[text()='Assets']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAssets;
	@FindBy(xpath = "//div[text()='Add-ons']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAddOns;
	@FindBy(xpath = "//div[text()='Beneficiaries']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressBeneficiaries;
	@FindBy(xpath = "//div[text()='ID Docs']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressIDDocs;
	@FindBy(xpath = "//div[text()='Review & Confirm']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressReviewConfirm;

	@FindBy(xpath = "//div[contains(@id,'Executors_Tooltip')]")
	WebElement Executors_tooltip;

	@FindBy(xpath = "//div[contains(@id,'LawyersOfEstate_Tooltip')]")
	WebElement LawyersOfEstate_Tooltip;

	@FindBy(xpath = "//label[contains(@id,'WishDetail')]")
	WebElement BuriedWishDetails;

	// ================================================== Initializing the Page Objects ==================================================
	public ExecutorsPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void displayQuestion1() {
		CommonFunctions.elementDisplayed(Question1);
	}

	public void displayQuestion2() {
		CommonFunctions.elementDisplayed(Question2);
	}

	public void displayQuestion3() {
		CommonFunctions.elementDisplayed(Question3.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion4() {
		CommonFunctions.elementDisplayed(Question4.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion6() {
		CommonFunctions.elementDisplayed(Question6.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion7() {
		CommonFunctions.elementDisplayed(Question7.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion9() {
		CommonFunctions.elementDisplayed(Question9.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion11() {
		CommonFunctions.elementDisplayed(Question11.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public IDdocsPage ClickNextButton() {
		CommonFunctions.clickElement(btn_Next);

		return new IDdocsPage();
	}

	public void displayQuestion12A() {
		CommonFunctions.elementDisplayed(Question12A.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion12B() {
		CommonFunctions.elementDisplayed(Question12B.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion13() {
		CommonFunctions.elementDisplayed(Question13.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void clickEditExecutor() {
		CommonFunctions.clickElement(btn_Edit);

	}

	public void clickAddExecutorButton() {

		CommonFunctions.clickElement(btn_Add);

	}

	public void clickDeleteExecutor() {
		CommonFunctions.clickElement(btn_Delete);
		CommonFunctions.wait(2500, false);
		// CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
	}

	public void UpdateFromBackUpToFirstOption() {

	}

	/* Add Executor */
	public void clickQuestion2() {
		CommonFunctions.clickElement(Question2);
	}

	/* FirstOption & Backup */
	public void clickQuestion14A() {
		CommonFunctions.clickElement(Question14A);
	}

	public void clickBTNAdd3() {
		CommonFunctions.clickElement(btn_add3);
	}

	public void clickQuestion14B() {
		CommonFunctions.clickElement(Question14B);
	}

	/* Would you like Maurice Blackburn to help your Executor(s) manage your estate? */
	public void clickQuestion16A() {
		CommonFunctions.clickElement(Question16A);
	}

	public void clickQuestion16B() {
		CommonFunctions.clickElement(Question16B);
	}

	/* Funeral Wishes */
	public void clickQuestion17A() {
		CommonFunctions.clickElement(Question17A);
	}

	public void clickQuestion17B() {
		CommonFunctions.clickElement(Question17B);
	}

	public void clickQuestion17C() {
		CommonFunctions.clickElement(Question17C);
	}

	public void clickQuestion17D() {
		CommonFunctions.clickElement(Question17D);
	}

	public void setQuestion4(String firstname) {
		CommonFunctions.clearThenEnterElementValue(Question4, firstname);
	}

	public void setQuestion5(String middlename) {
		CommonFunctions.clearThenEnterElementValue(Question5, middlename);
	}

	public void setQuestion6(String lastname) {
		CommonFunctions.clearThenEnterElementValue(Question6, lastname);
	}

	public void setQuestion9(String address1) {
		CommonFunctions.clearThenEnterElementValue(Question9, address1);
	}

	public void setQuestion10(String address2) {
		CommonFunctions.clearThenEnterElementValue(Question10, address2);
	}

	public void setQuestion11(String suburb) {
		CommonFunctions.clearThenEnterElementValue(Question11, suburb);
	}

	public void setQuestion12B(String statetext) {
		CommonFunctions.clearThenEnterElementValue(Question12B, statetext);
	}

	public void setQuestion13(String postcode) {
		CommonFunctions.clearThenEnterElementValue(Question13, postcode);
	}

	public void setQuestion18(String buried) {
		CommonFunctions.clearThenEnterElementValue(Question18, buried);
	}

	public void setQuestion19(String ashes) {
		CommonFunctions.clearThenEnterElementValue(Question19, ashes);
	}

	public void setQuestion20(String want) {
		CommonFunctions.clearThenEnterElementValue(Question20, want);
	}

	public void DisplayQuestion20() {
		CommonFunctions.elementDisplayed(Question20);
	}

	public void selectQuestion3(String titleDropdown) {
		CommonFunctions.wait(2500, false);
		CommonFunctions.selectValueFromDropdown(Question3, titleDropdown);
		// CommonFunctions.clickElement(Question3.findElement(By.xpath(".//option[text()='" + titleDropdown + "']")));
		CommonFunctions.wait(2500, false);
	}

	public void selectQuestion7(String relationshipDropdown) {
		CommonFunctions.wait(2500, false);
		CommonFunctions.selectValueFromDropdown(Question7, relationshipDropdown);
		// CommonFunctions.clickElement(Question3.findElement(By.xpath(".//option[text()='" + titleDropdown + "']")));
		CommonFunctions.wait(2500, false);
	}

	public void selectQuestion8(String countryDropdown) {
		CommonFunctions.wait(2500, false);
		CommonFunctions.selectValueFromDropdown(Question8, countryDropdown);
		// CommonFunctions.clickElement(Question3.findElement(By.xpath(".//option[text()='" + titleDropdown + "']")));
		CommonFunctions.wait(2500, false);
	}

	public void selectQuestion12A(String stateDropdown) {
		CommonFunctions.wait(2500, false);
		CommonFunctions.selectValueFromDropdown(Question12A, stateDropdown);
		// CommonFunctions.clickElement(Question3.findElement(By.xpath(".//option[text()='" + titleDropdown + "']")));
		CommonFunctions.wait(2500, false);
	}

	public void FillUpExecutorFirstOption() {
		CommonFunctions.selectValueFromDropdown(Question3, "Mr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "First");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Option");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Father");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question12A, "QLD");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "1234");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.wait(5000, false);
	}

	public void UpdateExecutorFirstOption() {
		CommonFunctions.selectValueFromDropdown(Question3, "Mr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "First");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Option");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Father");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question12A, "QLD");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question13, "1234");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpExecutorFirstBackup() {
		CommonFunctions.selectValueFromDropdown(Question3, "Ms");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "First");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Backup");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Cousin");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(Question14B);
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question8, "GREECE");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question12B, "GRE");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "4321");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.wait(5000, false);
	}

	public void UpdateExecutorBackup() {
		CommonFunctions.selectValueFromDropdown(Question3, "Ms");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "Backup");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Upback");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Cousin");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question8, "GREECE");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question12B, "GRE");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "4321");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpWhenBuried() {
		CommonFunctions.clickElement(Question17A);
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question18, "Buried Here");
		CommonFunctions.wait(5000, false);
	}

	public void FillUpWhenCremated() {
		CommonFunctions.clickElement(Question17B);
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question19, "Cremated Here");
		CommonFunctions.wait(5000, false);
	}

	public void FillUpWhenOther() {
		CommonFunctions.clickElement(Question17C);
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question20, "Other Here");
		CommonFunctions.wait(5000, false);
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

	public PersonalPage ProgressChangePersonal() {
		CommonFunctions.clickElement(ProgressPersonal);

		return new PersonalPage();
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

	public void DisplayExecutors_Tooltip() {
		CommonFunctions.elementDisplayed(Executors_tooltip);
	}

	public void ClickExecutors_Tooltip() {
		CommonFunctions.clickElement(Executors_tooltip);
	}

	public void DisplayLawyersOfEstate_Tooltip() {
		CommonFunctions.elementDisplayed(LawyersOfEstate_Tooltip);
	}

	public void ClickLawyersOfEstate_Tooltip() {
		CommonFunctions.clickElement(LawyersOfEstate_Tooltip);
	}

	public void displayBuriedWishDetails() {
		CommonFunctions.elementDisplayed(BuriedWishDetails);
	}

	public void checkMandatoryFields() {
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(Question3.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(Question4.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(Question6.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(Question7.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(Question9.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(Question11.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(Question12A.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.wait(3000, false);
		CommonFunctions.elementDisplayed(Question13.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.wait(3000, false);

	}

	public void FillUpExecutorSecondOption() {
		CommonFunctions.selectValueFromDropdown(Question3, "Mr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "Second");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Option");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Father");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question12A, "QLD");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "1234");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpExecutorThirdOption() {
		CommonFunctions.selectValueFromDropdown(Question3, "Mr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "Third");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Option");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Father");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question12A, "QLD");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "1234");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpExecutorFourthOption() {
		CommonFunctions.selectValueFromDropdown(Question3, "Mr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "Fourth");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Option");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Father");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question12A, "QLD");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "1234");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpExecutorFifthOption() {
		CommonFunctions.selectValueFromDropdown(Question3, "Mr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "Fifth");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Option");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Father");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question12A, "QLD");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "1234");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpExecutorSecondBackup() {
		CommonFunctions.selectValueFromDropdown(Question3, "Ms");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "Second");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Backup");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Cousin");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(Question14B);
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question8, "GREECE");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question12B, "GRE");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "4321");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpExecutorThirdBackup() {
		CommonFunctions.selectValueFromDropdown(Question3, "Ms");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "Third");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Backup");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Cousin");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(Question14B);
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question8, "GREECE");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question12B, "GRE");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "4321");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpExecutorFourthBackup() {
		CommonFunctions.selectValueFromDropdown(Question3, "Ms");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "Fourth");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Backup");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Cousin");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(Question14B);
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question8, "GREECE");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question12B, "GRE");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "4321");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpExecutorFifthBackup() {
		CommonFunctions.selectValueFromDropdown(Question3, "Ms");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "Fifth");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Backup");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Cousin");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(Question14B);
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question8, "GREECE");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question12B, "GRE");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "4321");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.wait(5000, false);
	}

}