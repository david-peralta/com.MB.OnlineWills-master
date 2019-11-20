package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	@FindBy(xpath = "//input[contains(@id,'WishDetail_Input')]")
	WebElement FuneralWishField;

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

	// Beneficiaries - Gifts
	@FindBy(xpath = "//span[contains(text(),'Do you wish to leave any gifts?')]")
	WebElement Gift_Question;
	@FindBy(xpath = "//a[contains(text(),'Add Gift')]")
	WebElement AddGift;
	@FindBy(xpath = "//input[contains(@id,'GiftDescription')]")
	WebElement Gift_Description;
	@FindBy(xpath = "//input[contains(@id,'GiftsReceiver')]")
	WebElement Gift_Receiver;
	@FindBy(xpath = "//select[contains(@id,'GiftsRelationship')]")
	WebElement Gift_Relationship;
	@FindBy(xpath = "//select[contains(@id,'GiftsCountry')]")
	WebElement Gift_Country;
	@FindBy(xpath = "//input[contains(@id,'GiftsAddressLine1')]")
	WebElement Gift_Address1;
	@FindBy(xpath = "//input[contains(@id,'GiftsAddressLine2')]")
	WebElement Gift_Address2;
	@FindBy(xpath = "//input[contains(@id,'GiftsSuburb')]")
	WebElement Gift_Suburb;
	@FindBy(xpath = "//select[contains(@id,'GiftsState')]")
	WebElement Gift_State;
	@FindBy(xpath = "//input[contains(@id,'GiftsPostcode')]")
	WebElement Gift_PostCode;

	// Beneficiaries - Buttons
	@FindBy(xpath = "//input[contains(@value,'Add')]")
	WebElement Gift_Add;
	@FindBy(xpath = "//input[contains(@value,'Cancel')]")
	WebElement Gift_Cancel;
	// @FindBy(xpath = "//a[contains(text(),'Edit')]")
	@FindBy(xpath = "(//a[contains(@id,'GiftEdit')])[1]")
	WebElement Gift_Edit1;
	@FindBy(xpath = "(//a[contains(@id,'GiftEdit')])[2]")
	WebElement Gift_Edit2;
	// @FindBy(xpath = "//a[contains(text(),'Delete')]")
	@FindBy(xpath = "(//a[contains(@id,'GiftDelete')])[1]")
	WebElement Gift_Delete1;
	@FindBy(xpath = "(//a[contains(@id,'GiftDelete')])[2]")
	WebElement Gift_Delete2;
	@FindBy(xpath = "//input[contains(@value,'Save')]")
	WebElement Gift_Save;

	// Beneficiaries - Error Message
	@FindBy(xpath = "//span[contains(text(),'Please add gift')]")
	WebElement Gift_AddGiftMsg;

	/* Progess Bar */
	@FindBy(xpath = "//div[text()='Personal Details']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressPersonal;
	@FindBy(xpath = "//div[text()='About You']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAbout;
	@FindBy(xpath = "//div[text()='Assets']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAssets;
	@FindBy(xpath = "//div[text()='Executors']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressExecutors;
	@FindBy(xpath = "//div[text()='ID Docs']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressIDDocs;
	@FindBy(xpath = "//div[text()='Review & Confirm']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressReviewConfirm;
	@FindBy(xpath = "//div[text()='Add-ons']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAddOns;

	// ================================================== Initializing the Page Objects ==================================================
	public BeneficiariesPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void checkGiftRadioButton() {
		CommonFunctions.elementDisplayed(GiftsYes);
		CommonFunctions.wait(5000, false);
	}

	public void checkGiftQuestion() {
		CommonFunctions.elementDisplayed(Gift_Question);
		CommonFunctions.wait(5000, false);
	}

	public void CheckGiftDescriptionRequired() {
		CommonFunctions.elementDisplayed(Gift_Description.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckGiftRecieverRequired() {
		CommonFunctions.elementDisplayed(Gift_Receiver.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckGiftRelationshipRequired() {
		CommonFunctions.elementDisplayed(Gift_Relationship.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckGiftCountryRequired() {
		CommonFunctions.elementDisplayed(Gift_Country.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckGiftAddress1Required() {
		CommonFunctions.elementDisplayed(Gift_Address1.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckGiftSuburbRequired() {
		CommonFunctions.elementDisplayed(Gift_Suburb.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckGiftStateRequired() {
		CommonFunctions.elementDisplayed(Gift_State.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckGiftPostcodeRequired() {
		CommonFunctions.elementDisplayed(Gift_PostCode.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckGiftRequiredFields() {
		CommonFunctions.clickElement(AddGift);
		CommonFunctions.wait(5000, false);
		CommonFunctions.scrollToBottomOfPage();
		CommonFunctions.clickElement(Gift_Add);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(Gift_Description.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(Gift_Receiver.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(Gift_Relationship.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		// CommonFunctions.elementDisplayed(Gift_Country.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(Gift_Address1.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(Gift_Suburb.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(Gift_State.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(Gift_PostCode.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.wait(5000, false);
		// CommonFunctions.clickElement(Gift_Add);
	}

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

	public void clickDeleteGift() {
		// CommonFunctions.clickElement(Gift_Delete1);
		CommonFunctions.clickElement(Gift_Delete2);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
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

	public void FillUpGiftSection() {
		CommonFunctions.clickElement(AddGift);
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Gift_Description, "Sample");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Gift_Receiver, "Demeth Camuin Foundation");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Gift_Relationship, "Father");
		CommonFunctions.wait(5000, false);
		// CommonFunctions.selectValueFromDropdown(Gift_Country, "AUSTRALIA");
		CommonFunctions.enterElementValue(Gift_Address1, "Address1");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Gift_Suburb, "Suburb1");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Gift_State, "VIC");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Gift_PostCode, "Postcode1");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(Gift_Add);
		CommonFunctions.wait(5000, false);

	}

	public void FillUpGiftSection2() {
		CommonFunctions.clickElement(AddGift);
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Gift_Description, "Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Gift_Receiver, "Demeth Camuin Foundation");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Gift_Relationship, "Brother");
		CommonFunctions.wait(5000, false);
		// CommonFunctions.selectValueFromDropdown(Gift_Country, "AUSTRALIA");
		CommonFunctions.enterElementValue(Gift_Address1, "Address2");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Gift_Suburb, "Suburb2");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Gift_State, "VIC");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Gift_PostCode, "Postcode2");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(Gift_Add);
		CommonFunctions.wait(5000, false);

	}

	public void UpdatesGiftSection() {
		CommonFunctions.clickElement(Gift_Edit1);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Gift_Description, "Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Gift_Receiver, "Demeth Camuin Foundation");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Gift_Relationship, "Brother");
		CommonFunctions.wait(5000, false);
		// CommonFunctions.selectValueFromDropdown(Gift_Country, "AUSTRALIA");
		CommonFunctions.clearThenEnterElementValue(Gift_Address1, "Address2");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Gift_Suburb, "Suburb2");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Gift_State, "VIC");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Gift_PostCode, "Postcode2");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(Gift_Save);
		CommonFunctions.wait(5000, false);

	}

	public void UpdatesGiftSection2() {
		CommonFunctions.clickElement(Gift_Edit2);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Gift_Description, "Sample");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Gift_Receiver, "Demeth Camuin Foundation");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Gift_Relationship, "Father");
		CommonFunctions.wait(5000, false);
		// CommonFunctions.selectValueFromDropdown(Gift_Country, "AUSTRALIA");
		CommonFunctions.clearThenEnterElementValue(Gift_Address1, "Address1");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Gift_Suburb, "Suburb1");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Gift_State, "VIC");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Gift_PostCode, "Postcode1");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(Gift_Save);
		CommonFunctions.wait(5000, false);

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

	public IDdocsPage clickNextIDDocs() {
		CommonFunctions.clickElement(NextButton);

		return new IDdocsPage();
	}

	public AboutPage ProgressChangeAbout() {
		CommonFunctions.clickElement(NextButton);

		return new AboutPage();
	}

	public PersonalPage ProgressChangePersonal() {
		CommonFunctions.clickElement(NextButton);

		return new PersonalPage();
	}

	public AssetsPage ProgressChangeAssets() {
		CommonFunctions.clickElement(NextButton);

		return new AssetsPage();
	}

	public ExecutorsPage ProgressChangeExecutors() {
		CommonFunctions.clickElement(NextButton);

		return new ExecutorsPage();
	}

	public IDdocsPage ProgressChangeIDdocs() {
		CommonFunctions.clickElement(NextButton);

		return new IDdocsPage();
	}

	public ReviewConfirmPage ProgressChangeReviewConfirm() {
		CommonFunctions.clickElement(NextButton);

		return new ReviewConfirmPage();
	}

	public AddOnsPage ProgressChangeAddOns() {
		CommonFunctions.clickElement(NextButton);

		return new AddOnsPage();
	}

}