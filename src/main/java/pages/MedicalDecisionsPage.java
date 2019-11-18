package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class MedicalDecisionsPage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//input[@value='Next']")
	WebElement btn_Next;
	@FindBy(xpath = "//input[@value='Back']")
	WebElement btn_Back;

	@FindBy(xpath = "//input[contains(@id,'NoDecisionMaker')]")
	WebElement DecisionMaker;

	@FindBy(xpath = "//a[contains(@id,'AddDecisionMakerMedical')]")
	WebElement AddDecisionMaker;

	@FindBy(xpath = "//input[contains(@id,'FirstOption')]")
	WebElement POAPDMYes;
	@FindBy(xpath = "//input[contains(@id,'Backup')]")
	WebElement POAPDMNo;
	@FindBy(xpath = "//span[text()='Who do you want to appoint as your decision maker?']//following::span[text()='Required Field']")
	WebElement RequiredField;

	@FindBy(xpath = "//select[contains(@id,'POATitle')]")
	WebElement POATitle;
	@FindBy(xpath = "(//select[contains(@id,'POATitle')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement POATitleReq;
	@FindBy(xpath = "//input[contains(@id,'POAFirstName')]")
	WebElement POAFirstName;
	@FindBy(xpath = "(//input[contains(@id,'POAFirstName')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement POAFirstNameReq;
	@FindBy(xpath = "//input[contains(@id,'POAMiddleName')]")
	WebElement POAMiddleName;
	@FindBy(xpath = "//input[contains(@id,'POALastName')]")
	WebElement POALastName;
	@FindBy(xpath = "(//input[contains(@id,'POALastName')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement POALastNameReq;
	@FindBy(xpath = "//input[contains(@id,'POADateOfBirth')]")
	WebElement POADOB;
	@FindBy(xpath = "(//input[contains(@id,'POADateOfBirth')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement POADOBReq;
	@FindBy(xpath = "//input[contains(@id,'POAPhone')]")
	WebElement POAPhone;
	@FindBy(xpath = "(//input[contains(@id,'POAPhone')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement POAPhoneReq;
	@FindBy(xpath = "//select[contains(@id,'POARelationship')]")
	WebElement POARel;
	@FindBy(xpath = "(//select[contains(@id,'POARelationship')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement POARelReq;
	@FindBy(xpath = "//select[contains(@id,'POACountry')]")
	WebElement POACountry;
	@FindBy(xpath = "//input[contains(@id,'POAAddressLine1')]")
	WebElement POAAddressLine1;
	@FindBy(xpath = "(//input[contains(@id,'POAAddressLine1')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement POAAddressLine1Req;
	@FindBy(xpath = "//input[contains(@id,'POAAddressLine2')]")
	WebElement POAAddressLine2;
	@FindBy(xpath = "//input[contains(@id,'POASuburb')]")
	WebElement POASuburb;
	@FindBy(xpath = "(//input[contains(@id,'POASuburb')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement POASuburbReq;

	@FindBy(xpath = "//select[contains(@id,'POAState')]")
	WebElement POAState;
	@FindBy(xpath = "(//select[contains(@id,'POAState')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement POAStateReq;
	@FindBy(xpath = "//input[contains(@id,'POAPostCode')]")
	WebElement POAPostCode;
	@FindBy(xpath = "(//input[contains(@id,'POAPostCode')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement POAPostCodeReq;

	// ================================================== Initializing the Page Objects ==================================================
	public MedicalDecisionsPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void clickAddDecisionMaker() {
		CommonFunctions.clickElement(AddDecisionMaker);
	}

	public void DecisionMAkerMandatoryFieldsOnAddingOne() {
		CommonFunctions.elementDisplayed(POATitleReq);
		CommonFunctions.elementDisplayed(POAFirstNameReq);
		CommonFunctions.elementDisplayed(POALastNameReq);
		CommonFunctions.elementDisplayed(POADOBReq);
		CommonFunctions.elementDisplayed(POAPhoneReq);
		CommonFunctions.elementDisplayed(POARelReq);
		CommonFunctions.elementDisplayed(POAAddressLine1Req);
		CommonFunctions.elementDisplayed(POASuburbReq);
		CommonFunctions.elementDisplayed(POAStateReq);
		CommonFunctions.elementDisplayed(POAPostCodeReq);
	}

	public void SetDecisionMakerMandatoryFields() {
		CommonFunctions.selectValueFromDropdown(POATitle, "Dr");
		CommonFunctions.enterElementValue(POAFirstName, "POA FirstName");
		CommonFunctions.enterElementValue(POAMiddleName, "POA MiddleName");
		CommonFunctions.enterElementValue(POALastName, "POA LastName");
		CommonFunctions.enterElementValue(POADOB, "05/09/1990");
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.enterElementValue(POAPhone, "4770344");
		CommonFunctions.selectValueFromDropdown(POARel, "Aunt");
		CommonFunctions.selectValueFromDropdown(POACountry, "AUSTRALIA");
		CommonFunctions.enterElementValue(POAAddressLine1, "Australia");
		CommonFunctions.enterElementValue(POAAddressLine2, "Australia");
		CommonFunctions.enterElementValue(POASuburb, "Australia");
		CommonFunctions.selectValueFromDropdown(POAState, "VIC");
		CommonFunctions.enterElementValue(POAPostCode, "1234");
	}

	public void clickIDontWantDecisionMaker() {
		CommonFunctions.clickElement(DecisionMaker);
	}

	public void DisplayedDecisionMakerReq() {
		CommonFunctions.clickElement(RequiredField);
	}

	public ReviewConfirmPage ClickNextButton() {
		CommonFunctions.clickElement(btn_Next);

		return new ReviewConfirmPage();
	}

	public FinancialDecisionsPage ClickBackButton() {
		CommonFunctions.clickElement(btn_Back);

		return new FinancialDecisionsPage();
	}

}