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

	@FindBy(xpath = "//a[text()='Add Executor']")
	WebElement Question2;

	// Element - PopUp
	// Are you sure you want to remove this entry from the list?

	// Element - Button

	@FindBy(xpath = "//input[contains(@value,'Add')]")
	WebElement btn_Add;

	@FindBy(xpath = "(//input[contains(@value,'Cancel')])[2]")
	WebElement btn_Cancel;

	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	WebElement btn_Delete;

	@FindBy(xpath = "//a[contains(text(),'Edit')]")
	WebElement btn_Edit;

	@FindBy(xpath = "//input[contains(@value,'Next')]")
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

	// ================================================== Initializing the Page Objects ==================================================
	public ExecutorsPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void displayQuestion1() {
		CommonFunctions.elementDisplayed(Question1);
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

	public void displayQuestion12A() {
		CommonFunctions.elementDisplayed(Question12A.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion12B() {
		CommonFunctions.elementDisplayed(Question12B.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion13() {
		CommonFunctions.elementDisplayed(Question13.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	/* Add Executor */
	public void clickQuestion2() {
		CommonFunctions.clickElement(Question2);
	}

	/* FirstOption & Backup */
	public void clickQuestion14A() {
		CommonFunctions.clickElement(Question14A);
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

}