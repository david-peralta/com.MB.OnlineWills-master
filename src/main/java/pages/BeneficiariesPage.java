package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class BeneficiariesPage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//input[contains(@id,'FutureChildren_True')]")
	WebElement YesQuestion1;
	@FindBy(xpath = "//input[contains(@id,'FutureChildren_False')]")
	WebElement NoQuestion1;
	@FindBy(xpath = "//input[contains(@id,'GrandChildren_True')]")
	WebElement YesQuestion2;
	@FindBy(xpath = "//input[contains(@id,'GrandChildren_False')]")
	WebElement NoQuestion2;
	@FindBy(xpath = "//input[contains(@id,'ImmediateChildren_True')]")
	WebElement YesQuestion1SingleWithChildren;
	@FindBy(xpath = "//input[contains(@id,'ImmediateChildren_False')]")
	WebElement NoQuestion1SingleWithChildren;
	@FindBy(xpath = "//input[contains(@id,'Partner_True')]")
	WebElement YesQuestion1WithSpouse;
	@FindBy(xpath = "//input[contains(@id,'Partner_False')]")
	WebElement NoQuestion1WithSpouse;

	@FindBy(xpath = "// *[contains(text(), 'If all of your listed beneficiaries pass away, what would you like us to do with their share?')]")
	WebElement DisasterQuestion;
	@FindBy(xpath = "//input[contains(@id,'OtherInstruction')]")
	WebElement DisasterQuestionField;

	@FindBy(xpath = "// *[contains(text(), 'What do you want us to do with it?')]")
	WebElement BeneficiaryQuestion;
	@FindBy(xpath = "//a[text()='Add Beneficiary']")
	WebElement AddBeneficiary;
	@FindBy(xpath = "//input[contains(@id,'Button_BenefSave')]")
	WebElement SaveBeneficiaries;
	@FindBy(xpath = "//input[contains(@id,'Button_BenefCancel')]")
	WebElement CancelBeneficiaries;
	@FindBy(xpath = "(//a[contains(@id,'BeneficiaryListEdit')])[1]")
	WebElement Edit1stBeneficiary;
	@FindBy(xpath = "(//a[contains(@id,'BeneficiaryListDelete')])[1]")
	WebElement Delete1stBeneficiary;
	@FindBy(xpath = "//select[contains(@id,'BenefTitle')]")
	WebElement AddBeneficiariesTitle;
	@FindBy(xpath = "(//select[contains(@id,'BenefTitle')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddBeneficiariesTitleReq;
	@FindBy(xpath = "//input[contains(@id,'BenefFirstName')]")
	WebElement AddBeneficiariesFName;
	@FindBy(xpath = "(//input[contains(@id,'BenefFirstName')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddBeneficiariesFNameReq;
	@FindBy(xpath = "//input[contains(@id,'BenefMiddleName')]")
	WebElement AddBeneficiariesMName;
	@FindBy(xpath = "//input[contains(@id,'BenefLastName')]")
	WebElement AddBeneficiariesLName;
	@FindBy(xpath = "(//input[contains(@id,'BenefLastName')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddBeneficiariesLNameReq;
	@FindBy(xpath = "//select[contains(@id,'BenefRelationship2')]")
	WebElement AddBeneficiariesRelationship;
	@FindBy(xpath = "(//select[contains(@id,'BenefRelationship2')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddBeneficiariesRelationshipReq;
	@FindBy(xpath = "//select[contains(@id,'BenefCountry')]")
	WebElement AddBeneficiariesCountry;
	@FindBy(xpath = "//input[contains(@id,'BeneftAddressLine1')]")
	WebElement AddBeneficiariesAddressLine1;
	@FindBy(xpath = "(//input[contains(@id,'BeneftAddressLine1')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddBeneficiariesAddressLine1Req;
	@FindBy(xpath = "//input[contains(@id,'BeneftAddressLine2')]")
	WebElement AddBeneficiariesAddressLine2;
	@FindBy(xpath = "//input[contains(@id,'BenefSuburb')]")
	WebElement AddBeneficiariesSuburb;
	@FindBy(xpath = "(//input[contains(@id,'BenefSuburb')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddBeneficiariesSuburbReq;
	@FindBy(xpath = "//select[contains(@id,'BenefState')]")
	WebElement AddBeneficiariesState;
	@FindBy(xpath = "(//select[contains(@id,'BenefState')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddBeneficiariesStateReq;
	@FindBy(xpath = "//input[contains(@id,'BenefPostcode')]")
	WebElement AddBeneficiariesPostcode;
	@FindBy(xpath = "(//input[contains(@id,'BenefPostcode')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddBeneficiariesPostcodeReq;

	@FindBy(xpath = "//input[contains(@id,'BenefShareTypeAmount')]")
	WebElement AddBeneficiariesAmountRadioButton;
	@FindBy(xpath = "//input[contains(@id,'BenefShareTypePercentage')]")
	WebElement AddBeneficiariesPercentageRadioButton;

	@FindBy(xpath = "//input[contains(@id,'BenefShareAmount')]")
	WebElement AddBeneficiariesAmountField;
	@FindBy(xpath = "//input[contains(@id,'BenefShareAmount')]//following::a//following::span//following::span[text()='Required Field']")
	WebElement AddBeneficiariesAmountFieldReq;
	@FindBy(xpath = "//input[contains(@id,'BenefSharePercentage')]")
	WebElement AddBeneficiariesPercentageField;
	@FindBy(xpath = "//input[contains(@id,'BenefSharePercentage')]//following::a//following::span//following::span[text()='Required Field']")
	WebElement AddBeneficiariesPercentageFieldReq;
	@FindBy(xpath = "// input[contains(@id,'BenefSharePercentage')]//following::div//following::div[text()='Required Field']")
	WebElement AddBeneficiariesShareTypeReq;

	@FindBy(xpath = "//input[contains(@id,'RadioButton_Person')]")
	WebElement PersonAddBeneficiary;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_Charity')]")
	WebElement CharityAddBeneficiary;

	@FindBy(xpath = "//input[contains(@id,'BeneftCharityName')]")
	WebElement AddBeneficiariesCharityName;
	@FindBy(xpath = "//input[contains(@id,'BeneftCharityName')]//following::a//following::span//following::span[text()='Required Field']")
	WebElement AddBeneficiariesCharityNameReq;
	@FindBy(xpath = "//input[contains(@id,'Next_Input')]")
	WebElement NextButton;
	@FindBy(xpath = "//input[contains(@id,'Cancel_Input')]")
	WebElement BackButton;
	@FindBy(xpath = "//input[contains(@id,'Gifts_True')]")
	WebElement GiftsYes;
	@FindBy(xpath = "//input[contains(@id,'Gifts_False')]")
	WebElement GiftsNo;

	// ================================================== Initializing the Page Objects ==================================================
	public BeneficiariesPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void ClickPersonAddBeneficiary() {
		CommonFunctions.clickElement(PersonAddBeneficiary);
		CommonFunctions.wait(5000, false);
	}

	public void ClickGiftYes() {
		CommonFunctions.clickElement(GiftsYes);
		CommonFunctions.wait(5000, false);
	}

	public void ClickGiftNo() {
		CommonFunctions.clickElement(GiftsNo);
		CommonFunctions.wait(5000, false);
	}

	public void ClickCharityAddBeneficiary() {
		CommonFunctions.clickElement(CharityAddBeneficiary);
		CommonFunctions.wait(5000, false);
	}

	public void MandatoryFieldsInAddingBeneficiaryCharity() {
		CommonFunctions.clickElement(CharityAddBeneficiary);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(SaveBeneficiaries);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(AddBeneficiariesCharityNameReq);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddBeneficiariesAmountFieldReq);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddBeneficiariesPercentageRadioButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(SaveBeneficiaries);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddBeneficiariesPercentageFieldReq);
		CommonFunctions.wait(5000, false);

	}

	public void MandatoryFieldsInAddingBeneficiaryPerson() {
		CommonFunctions.clickElement(SaveBeneficiaries);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(AddBeneficiariesTitleReq);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(AddBeneficiariesFNameReq);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(AddBeneficiariesLNameReq);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(AddBeneficiariesRelationshipReq);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(AddBeneficiariesAddressLine1Req);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(AddBeneficiariesSuburbReq);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(AddBeneficiariesStateReq);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(AddBeneficiariesPostcodeReq);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(AddBeneficiariesShareTypeReq);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddBeneficiariesAmountRadioButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(SaveBeneficiaries);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddBeneficiariesAmountFieldReq);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddBeneficiariesPercentageRadioButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(SaveBeneficiaries);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddBeneficiariesPercentageFieldReq);
		CommonFunctions.wait(5000, false);
	}

	public void AddBeneficiaryPersonWithAmount() {
		CommonFunctions.selectValueFromDropdown(AddBeneficiariesTitle, "Dr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddBeneficiariesFName, "A Demeth Rey");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddBeneficiariesMName, "A Cañete");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddBeneficiariesLName, "A Camuin");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(AddBeneficiariesRelationship, "Father");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(AddBeneficiariesCountry, "AUSTRALIA");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddBeneficiariesAddressLine1, "A This is a test address line 1");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddBeneficiariesAddressLine2, "A This is a test address line 2");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddBeneficiariesSuburb, "A This is a Suburb");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(AddBeneficiariesState, "VIC");
		CommonFunctions.wait(10000, false);
		CommonFunctions.selectValueFromDropdown(AddBeneficiariesPostcode, "1111");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddBeneficiariesAmountRadioButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(AddBeneficiariesAmountField, "9999999999");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(SaveBeneficiaries);
	}

	public void EditBeneficiaryPersonWithAmount() {
		CommonFunctions.selectValueFromDropdown(AddBeneficiariesTitle, "Dr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddBeneficiariesFName, " Update");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddBeneficiariesMName, " Update");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddBeneficiariesLName, " Update");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(AddBeneficiariesRelationship, "Father");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(AddBeneficiariesCountry, "AUSTRALIA");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddBeneficiariesAddressLine1, " Update");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddBeneficiariesAddressLine2, " Update");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddBeneficiariesSuburb, " Update");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(AddBeneficiariesState, "VIC");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(AddBeneficiariesPostcode, "1111");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddBeneficiariesAmountRadioButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(AddBeneficiariesAmountField, "9999999999");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(SaveBeneficiaries);
	}

	public void AddBeneficiaryPersonWithPercentage() {
		CommonFunctions.selectValueFromDropdown(AddBeneficiariesTitle, "Dr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddBeneficiariesFName, "Demeth Rey");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddBeneficiariesMName, "Cañete");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddBeneficiariesLName, "Camuin");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(AddBeneficiariesRelationship, "Father");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(AddBeneficiariesCountry, "AUSTRALIA");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddBeneficiariesAddressLine1, "This is a test address line 1");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddBeneficiariesAddressLine2, "This is a test address line 2");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddBeneficiariesSuburb, "This is a Suburb");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(AddBeneficiariesState, "VIC");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(AddBeneficiariesPostcode, "1111");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddBeneficiariesPercentageRadioButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(AddBeneficiariesPercentageField, "9999999999");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(SaveBeneficiaries);
	}

	public void AddBeneficiaryCharityWithPercentage() {
		CommonFunctions.enterElementValue(AddBeneficiariesCharityName, "Demeth Camuin Foundation");
		CommonFunctions.wait(5000, false);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddBeneficiariesPercentageRadioButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(AddBeneficiariesPercentageField, "9999999999");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(SaveBeneficiaries);
	}

	public void AddBeneficiaryCharityWithAmount() {
		CommonFunctions.enterElementValue(AddBeneficiariesCharityName, "Demeth Camuin Foundation");
		CommonFunctions.wait(5000, false);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddBeneficiariesAmountRadioButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(AddBeneficiariesAmountField, "9999999999");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(SaveBeneficiaries);
	}

	public void ClickYesQuestion1SingleWithChildren() {
		CommonFunctions.clickElement(YesQuestion1SingleWithChildren);
	}

	public void ClickNoQuestion1SingleWithChildren() {
		CommonFunctions.clickElement(NoQuestion1SingleWithChildren);
	}

	public void ClickYesQuestion1() {
		CommonFunctions.clickElement(YesQuestion1);
	}

	public void ClickYesQuestion1WithSpouse() {
		CommonFunctions.clickElement(YesQuestion1WithSpouse);
	}

	public void ClickNoQuestion1WithSpouse() {
		CommonFunctions.clickElement(NoQuestion1WithSpouse);
	}

	public void ClickNoQuestion1() {
		CommonFunctions.clickElement(NoQuestion1);
	}

	public void BeneficiaryQuestionDisplayed() {
		CommonFunctions.elementDisplayed(BeneficiaryQuestion);
		CommonFunctions.elementDisplayed(AddBeneficiary);
	}

	public void ClickBeneficiaryQuestion() {
		CommonFunctions.clickElement(AddBeneficiary);
	}

	public void ClickCancelBeneficiary() {
		CommonFunctions.clickElement(CancelBeneficiaries);
	}

	public void ClickEditBeneficiary() {
		CommonFunctions.clickElement(Edit1stBeneficiary);
	}

	public void ClickDeleteBeneficiary() {
		CommonFunctions.clickElement(Delete1stBeneficiary);
	}

	public void DisasterQuestionDisplayed() {
		CommonFunctions.elementDisplayed(DisasterQuestion);
		CommonFunctions.elementDisplayed(DisasterQuestionField);
	}

	public void ClickYesQuestion2() {
		CommonFunctions.clickElement(YesQuestion2);
	}

	public void ClickNoQuestion2() {
		CommonFunctions.clickElement(NoQuestion2);
	}

	public ExecutorsPage ClickNextButton() {
		CommonFunctions.clickElement(NextButton);

		return new ExecutorsPage();
	}

}