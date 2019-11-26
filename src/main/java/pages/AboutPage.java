package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class AboutPage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//select[contains(@id,'Select_PartnerRelationshipId')]")
	WebElement RelationshipStatus;
	@FindBy(xpath = "//input[contains(@value,'Save and Continue')]")
	WebElement NextButton;
	@FindBy(xpath = "//input[contains(@id,'Cancel_Input')]")
	WebElement CancelButton;
	@FindBy(xpath = "//input[contains(@id,'PropertySettlementRadioNo')]")
	WebElement LawNoButton;
	@FindBy(xpath = "//input[contains(@id,'PropertySettlementRadioYes')]")
	WebElement LawYesButton;
	@FindBy(xpath = "//input[contains(@id,'PropertySettlementRadioNA')]")
	WebElement LawNAButton;
	@FindBy(xpath = "(//input[contains(@id,'PropertySettlementRadioNA')]//following::div[text()='Required field'])[1]")
	WebElement LawNAButtonRequired;
	@FindBy(xpath = "//span[text()='select a file']")
	WebElement SelectFile;

	@FindBy(xpath = "//select[contains(@id,'Partner_TitleId')]")
	WebElement Question1;
	@FindBy(xpath = "//input[contains(@id,'Partner_FirstName')]")
	WebElement Question2;
	@FindBy(xpath = "//input[contains(@id,'Partner_MiddleName')]")
	WebElement Question3;
	@FindBy(xpath = "//input[contains(@id,'Partner_LastName')]")
	WebElement Question4;
	@FindBy(xpath = "//input[contains(@id,'LengthOfRelationship')]")
	WebElement Question5;
	@FindBy(xpath = "//label[text()='Do you plan to marry or re-marry?']")
	WebElement Question6;
	@FindBy(xpath = "//input[contains(@id,'WillMarryRadioYes')]")
	WebElement WillMarryYes;
	@FindBy(xpath = "//input[contains(@id,'WillMarryRadioNo')]")
	WebElement WillMarryNo;
	@FindBy(xpath = "//span[text()='Note : Your Will will be revoked once you marry or re-marry.']")
	WebElement WillMarryNote;
	@FindBy(xpath = "//label[text()='Do you want to do your will together with your spouse or partner']")
	WebElement Question7;
	@FindBy(xpath = "//input[contains(@id,'WillTogetherRadioYes')]")
	WebElement WillTogetherRadioYes;
	@FindBy(xpath = "//input[contains(@id,'WillTogetherRadioNo')]")
	WebElement WillTogetherRadioNo;
	@FindBy(xpath = "//input[contains(@id,'Partner_Email')]")
	WebElement Question8;
	@FindBy(xpath = "//label[text()='Have you had a family law property settlement?']")
	WebElement Question10;
	@FindBy(xpath = "//input[contains(@id,'YearSettlement')]")
	WebElement Question11;
	@FindBy(xpath = "//label[text()='What year did you separated or get divorced?']//following-sibling::input")
	WebElement Question12;

	@FindBy(xpath = "//input[contains(@id,'ChildrenRadioYes')]")
	WebElement ChildrenYes;
	@FindBy(xpath = "//input[contains(@id,'ChildrenRadioNo')]")
	WebElement ChildrenNo;
	@FindBy(xpath = "(//input[contains(@id,'ChildrenRadioNo')]//following::div[text()='Required field'])[1]")
	WebElement ChildrenNoRequired;

	@FindBy(xpath = "//input[contains(@id,'OtherDependentRadioYes')]")
	WebElement DependentsYes;
	@FindBy(xpath = "//input[contains(@id,'OtherDependentNo')]")
	WebElement DependentsNo;
	@FindBy(xpath = "//*[text()='Add Guardian']")
	WebElement AddGuardian;
	@FindBy(xpath = "(//div[text()='Primary Guardian']//parent::div//parent::div//following::a[text()='Edit'])[1]")
	WebElement EditPrimaryGuardian;
	@FindBy(xpath = "//div[text()='Secondary Guardian']//parent::div//parent::div//following::a[text()='Edit']")
	WebElement EditSecondaryGuardian;
	@FindBy(xpath = "(//a[text()='Delete'])[3]")
	WebElement DeleteSecondaryGuardian;
	@FindBy(xpath = "//*[text()='Add Child']")
	WebElement AddChild;
	@FindBy(xpath = "//select[contains(@id,'ChildTitle')]")
	WebElement AddChildQuestion4;
	@FindBy(xpath = "//input[contains(@id,'ChildFirstName')]")
	WebElement AddChildQuestion5;
	@FindBy(xpath = "//input[contains(@id,'ChildMiddleName')]")
	WebElement AddChildQuestion6;
	@FindBy(xpath = "//input[contains(@id,'ChildLastName')]")
	WebElement AddChildQuestion7;
	@FindBy(xpath = "//input[contains(@id,'DobInput')]")
	WebElement AddChildQuestion8;
	@FindBy(xpath = "//label[text()='Does your child have any significant circumstance that we should be aware of?']")
	WebElement AddChildQuestion9;
	@FindBy(xpath = "//input[contains(@id,'SpecialConditionRadioButtonYes')]")
	WebElement AddChildQuestion9Yes;
	@FindBy(xpath = "//input[contains(@id,'SpecialConditionRadioButtonNo')]")
	WebElement AddChildQuestion9No;
	@FindBy(xpath = "//input[contains(@id,'IsStepChild')]")
	WebElement AddChildQuestion10;
	@FindBy(xpath = "//input[contains(@id,'IsFromFormerRelationship')]")
	WebElement AddChildQuestion11;
	@FindBy(xpath = "//input[contains(@id,'SpecialConditionRadioButtonYes')]")
	WebElement AddChildQuestion11Yes;
	@FindBy(xpath = "//input[contains(@id,'SpecialConditionRadioButtonNo')]")
	WebElement AddChildQuestion11No;

	@FindBy(xpath = "//input[contains(@id,'GuardianRadioYes')]")
	WebElement GuardianYes;
	@FindBy(xpath = "//input[contains(@id,'GuardianRadioNo')]")
	WebElement GuardianNo;

	@FindBy(xpath = "//select[contains(@id,'ParentTitle')]")
	WebElement AddChildQuestion12;
	@FindBy(xpath = "//input[contains(@id,'ParentFirstName')]")
	WebElement AddChildQuestion13;
	@FindBy(xpath = "//input[contains(@id,'ParentMiddleName')]")
	WebElement AddChildQuestion14;
	@FindBy(xpath = "//input[contains(@id,'ParentFamilyName')]")
	WebElement AddChildQuestion15;

	@FindBy(xpath = "//input[contains(@id,'ChildSaveButton')]")
	WebElement AddChildSave;
	@FindBy(xpath = "//input[contains(@id,'ChildCancelButton')]")
	WebElement AddChildCancel;

	@FindBy(xpath = "(// select[contains(@id,'ChildTitle')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddChildQuestion4Req;
	@FindBy(xpath = "(//input[contains(@id,'ChildFirstName')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddChildQuestion5Req;
	@FindBy(xpath = "(//input[contains(@id,'ChildLastName')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddChildQuestion7Req;
	@FindBy(xpath = "(//input[contains(@id,'DobInput')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddChildQuestion8Req;
	@FindBy(xpath = "//input[contains(@id,'SpecialConditionRadioButtonNo')]//following::span//following::div[text()='Required field']")
	WebElement AddChildQuestion9Req;

	@FindBy(xpath = "(//select[contains(@id,'ParentTitle')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddChildQuestion12Req;
	@FindBy(xpath = "(//input[contains(@id,'ParentFirstName')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddChildQuestion13Req;
	@FindBy(xpath = "(//input[contains(@id,'ParentLastName')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddChildQuestion14Req;
	@FindBy(xpath = "//a[text()='Delete']")
	WebElement RemoveChild;
	@FindBy(xpath = "//a[text()='Edit']")
	WebElement EditChild;
	@FindBy(xpath = "(//a[text()='Edit'])[1]")
	WebElement EditFirstChild;
	@FindBy(xpath = "(//a[text()='Delete'])[2]")
	WebElement RemoveSecondChild;

	@FindBy(xpath = "//select[contains(@id,'GuardianTitle')]")
	WebElement GuardianTitle;
	@FindBy(xpath = "(//select[contains(@id,'GuardianTitle')]//following::a//following::span/following::span[text()='Required field'])[1]")
	WebElement GuardianTitleReq;
	@FindBy(xpath = "//input[contains(@id,'GuardianFirstName')]")
	WebElement GuardianFirstName;
	@FindBy(xpath = "(//input[contains(@id,'GuardianFirstName')]//following::a//following::span/following::span[text()='Required field'])[1]")
	WebElement GuardianFirstNameReq;
	@FindBy(xpath = "//input[contains(@id,'GuardianMiddleName')]")
	WebElement GuardianMiddleName;
	@FindBy(xpath = "//input[contains(@id,'GuardianLastName')]")
	WebElement GuardianLastName;
	@FindBy(xpath = "(//input[contains(@id,'GuardianLastName')]//following::a//following::span/following::span[text()='Required field'])[1]")
	WebElement GuardianLastNameReq;
	@FindBy(xpath = "//select[contains(@id,'GuardianInfo_Relationship')]")
	WebElement GuardianRelationship;
	@FindBy(xpath = "//span[contains(@id,'GuardianInfo_Relationship') and text()='Required field']")
	WebElement GuardianRelationshipReq;
	@FindBy(xpath = "//select[contains(@id,'GuardianInfo_Country')]")
	WebElement GuardianCountry;
	@FindBy(xpath = "//input[contains(@id,'GuardianInfo_Line1ResAddress_Input')]")
	WebElement GuardianAddress1;
	@FindBy(xpath = "(//input[contains(@id,'GuardianInfo_Line1ResAddress_Input')]//following::a//following::span/following::span[text()='Required field'])[1]")
	WebElement GuardianAddress1req;
	@FindBy(xpath = "//input[contains(@id,'GuardianInfo_Line2ResAddress_Input')]")
	WebElement GuardianAddress2;
	@FindBy(xpath = "//input[contains(@id,'GuardianInfo_SubsurfRes_Input')]")
	WebElement GuardianSuburb;
	@FindBy(xpath = "(//input[contains(@id,'GuardianInfo_SubsurfRes_Input')]//following::a//following::span/following::span[text()='Required field'])[1]")
	WebElement GuardianSuburbReq;
	@FindBy(xpath = "//select[contains(@id,'GuardianInfo_StateId_Input')]")
	WebElement GuardianState;
	@FindBy(xpath = "(//select[contains(@id,'GuardianInfo_StateId_Input')]//following::a//following::span/following::span[text()='Required field'])[1]")
	WebElement GuardianStateReq;
	@FindBy(xpath = "//input[contains(@id,'GuardianInfo_PostcodePost_Input')]")
	WebElement GuardianPostCode;
	@FindBy(xpath = "(//input[contains(@id,'GuardianInfo_PostcodePost_Input')]//following::a//following::span/following::span[text()='Required field'])[1]")
	WebElement GuardianPostCodeReq;
	@FindBy(xpath = "//input[contains(@id,'GuardianCancelButton')]")
	WebElement GuardianCancel;
	@FindBy(xpath = "//input[contains(@id,'GuardianSaveButton')]")
	WebElement GuardianSave;
	@FindBy(xpath = "//input[contains(@id,'OtherDependentSaveButton')]")
	WebElement DependentSave;
	@FindBy(xpath = "//input[contains(@id,'OtherDependentCancelButton')]")
	WebElement DependentCancel;
	@FindBy(xpath = "//*[text()='Add Dependent']")
	WebElement AddDependent;

	@FindBy(xpath = "(//*[text()='Edit'])[2]")
	WebElement EditfirstDependent;
	@FindBy(xpath = "(//*[text()='Delete'])[2]")
	WebElement DeletefirstDependent;

	@FindBy(xpath = "//select[contains(@id,'OtherDependentTitle')]")
	WebElement DependentTitle;
	@FindBy(xpath = "(//select[contains(@id,'OtherDependentTitle')]//following::span//following::span[text()='Required field'])[1]")
	WebElement DependentTitleReq;

	@FindBy(xpath = "//input[contains(@id,'OtherDependentFirstName')]")
	WebElement DependentFName;
	@FindBy(xpath = "(//input[contains(@id,'OtherDependentFirstName')]//following::span//following::span[text()='Required field'])[1]")
	WebElement DependentFNameReq;

	@FindBy(xpath = "//input[contains(@id,'OtherDependentMiddleName')]")
	WebElement DependentMName;

	@FindBy(xpath = "//input[contains(@id,'OtherDependentLastName')]")
	WebElement DependentLName;
	@FindBy(xpath = "(//input[contains(@id,'OtherDependentLastName')]//following::span//following::span[text()='Required field'])[1]")
	WebElement DependentLNameReq;

	@FindBy(xpath = "//select[contains(@id,'OtherDependent_Relationship')]")
	WebElement DependentRel;
	@FindBy(xpath = "(//select[contains(@id,'OtherDependent_Relationship')]//following::span//following::span[text()='Required field'])[1]")
	WebElement DependentRelReq;
	@FindBy(xpath = "//select[contains(@id,'OtherDependent_Country')]")
	WebElement DependentCountry;

	@FindBy(xpath = "//input[contains(@id,'OtherDependent_Line1ResAddress_Input')]")
	WebElement DependentAddress1;
	@FindBy(xpath = "(//input[contains(@id,'OtherDependent_Line1ResAddress_Input')]//following::span//following::span[text()='Required field'])[1]")
	WebElement DependentAddress1Req;

	@FindBy(xpath = "//input[contains(@id,'OtherDependent_Line2ResAddress_Input')]")
	WebElement DependentAddress2;

	@FindBy(xpath = "//input[contains(@id,'OtherDependent_SubsurfRes_Input')]")
	WebElement DependentSuburb;
	@FindBy(xpath = "(//input[contains(@id,'OtherDependent_SubsurfRes_Input')]//following::span//following::span[text()='Required field'])[1]")
	WebElement DependentSuburbReq;

	@FindBy(xpath = "//select[contains(@id,'GuardianInfo_StateId_Input')]")
	WebElement DependentStateDropdown;
	@FindBy(xpath = "(//select[contains(@id,'GuardianInfo_StateId_Input')]//following::span//following::span[text()='Required field'])[1]")
	WebElement DependentStateDropdownReq;

	@FindBy(xpath = "//input[contains(@id,'GuardianInfo_StateText_Input')]")
	WebElement DependentState;
	@FindBy(xpath = "(//input[contains(@id,'GuardianInfo_StateText_Input')]//following::span//following::span[text()='Required field'])[1]")
	WebElement DependentStateReq;

	@FindBy(xpath = "//input[contains(@id,'OtherDependent_PostcodePost_Input')]")
	WebElement DependentPostCode;
	@FindBy(xpath = "(//input[contains(@id,'OtherDependent_PostcodePost_Input')]//following::span//following::span[text()='Required field'])[1]")
	WebElement DependentPostCodeReq;
	@FindBy(xpath = "//a[text()='Remove']")
	WebElement RemoveAttachment;

	/* Progess Bar */
	@FindBy(xpath = "//div[text()='Personal Details']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressPersonal;
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

	@FindBy(xpath = "//div[contains(@id,'SpousePartner_Tooltip')]")
	WebElement SpousePartner_Tooltip;
	@FindBy(xpath = "// div[contains(@id,'Significant_Tooltip')]")
	WebElement Significant_Tooltip;
	@FindBy(xpath = "// div[contains(@id,'Dependents_Tooltip')]")
	WebElement Dependents_Tooltip;
	@FindBy(xpath = "// div[contains(@id,'UploadWill_Tooltip')]")
	WebElement UploadWill_Tooltip;
	@FindBy(xpath = "// div[contains(@id,'Guardian_Tooltip')]")
	WebElement Guardian_Tooltip;
	@FindBy(xpath = "// div[contains(@id,'Guardian_TooltipVideo')]")
	WebElement Guardian_TooltipVideo;

	// ================================================== Initializing the Page Objects ==================================================
	public AboutPage() {
		PageFactory.initElements(driver, this);

	}

	// ============================================================= Actions =============================================================
	public void ClickAddDependent() {
		CommonFunctions.clickElement(AddDependent);
	}

	public void ClickEditFirstDependent() {
		CommonFunctions.clickElement(EditfirstDependent);
	}

	public void ClickDeleteFirstDependent() {
		CommonFunctions.clickElement(DeletefirstDependent);
	}

	public void DisplayMandatoryFieldDependent() {
		CommonFunctions.elementDisplayed(DependentTitleReq);
		CommonFunctions.elementDisplayed(DependentFNameReq);
		CommonFunctions.elementDisplayed(DependentLNameReq);
		CommonFunctions.elementDisplayed(DependentRelReq);
		CommonFunctions.elementDisplayed(DependentAddress1Req);
		CommonFunctions.elementDisplayed(DependentSuburbReq);
		CommonFunctions.elementDisplayed(DependentStateDropdownReq);
		CommonFunctions.elementDisplayed(DependentPostCodeReq);
		CommonFunctions.selectValueFromDropdown(DependentCountry, "BAHRAIN");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(DependentSave);
		CommonFunctions.elementDisplayed(DependentStateReq);
	}

	public void AddAUDependent() {
		CommonFunctions.selectValueFromDropdown(DependentTitle, "Dr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentFName, "AUDependent First Name");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentMName, "AUDependent Middle Name");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentLName, "AUDependent Last Name");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(DependentRel, "Mother");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(DependentCountry, "AUSTRALIA");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentAddress1, "AUDependent Address line 1");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentAddress2, "AUDependent Address line 2");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentSuburb, "AUDependent Suburb");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(DependentStateDropdown, "VIC");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentPostCode, "6666");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(DependentSave);
		CommonFunctions.wait(5000, false);
	}

	public void AddNonAUDependent() {
		CommonFunctions.selectValueFromDropdown(DependentTitle, "Dr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentFName, "Dependent First Name");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentMName, "Dependent Middle Name");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentLName, "Dependent Last Name");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(DependentRel, "Mother");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(DependentCountry, "PHILIPPINES");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentAddress1, "Dependent Address line 1");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentAddress2, "Dependent Address line 2");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentSuburb, "Dependent Suburb");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentState, "INTRAMUROS, MANILA");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentPostCode, "1002");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(DependentSave);
		CommonFunctions.wait(5000, false);
	}

	public void ClickSaveAddDependent() {
		CommonFunctions.clickElement(DependentSave);
	}

	public void ClickEditFirstChild() {
		CommonFunctions.clickElement(EditFirstChild);
	}

	public void ClickGuardianSave() {
		CommonFunctions.clickElement(GuardianSave);
	}

	public void ClickGuardianCancel() {
		CommonFunctions.clickElement(GuardianCancel);
	}

	public void AddGuardian() {
		CommonFunctions.selectValueFromDropdown(GuardianTitle, "Reverend");
		CommonFunctions.wait(5000, false);

		CommonFunctions.enterElementValue(GuardianFirstName, "Guardian");
		CommonFunctions.wait(5000, false);

		CommonFunctions.enterElementValue(GuardianMiddleName, "Arch");
		CommonFunctions.wait(5000, false);

		CommonFunctions.enterElementValue(GuardianLastName, "Angel");
		CommonFunctions.wait(5000, false);

		CommonFunctions.selectValueFromDropdown(GuardianRelationship, "Friend");
		CommonFunctions.wait(5000, false);

		CommonFunctions.enterElementValue(GuardianAddress1, "Heaven");
		CommonFunctions.wait(5000, false);

		CommonFunctions.enterElementValue(GuardianAddress2, "Above");
		CommonFunctions.wait(5000, false);

		CommonFunctions.enterElementValue(GuardianSuburb, "City");
		CommonFunctions.wait(5000, false);

		CommonFunctions.selectValueFromDropdown(GuardianState, "VIC");
		CommonFunctions.wait(5000, false);

		CommonFunctions.enterElementValue(GuardianPostCode, "123");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(GuardianSave);
		CommonFunctions.wait(5000, false);
	}

	public void AddGuardian2() {
		CommonFunctions.selectValueFromDropdown(GuardianTitle, "Reverend");
		CommonFunctions.wait(5000, false);

		CommonFunctions.enterElementValue(GuardianFirstName, "2Guardian");
		CommonFunctions.wait(5000, false);

		CommonFunctions.enterElementValue(GuardianMiddleName, "2Arch");
		CommonFunctions.wait(5000, false);

		CommonFunctions.enterElementValue(GuardianLastName, "2Angel");
		CommonFunctions.wait(5000, false);

		CommonFunctions.selectValueFromDropdown(GuardianRelationship, "Friend");
		CommonFunctions.wait(5000, false);

		CommonFunctions.enterElementValue(GuardianAddress1, "2Heaven");
		CommonFunctions.wait(5000, false);

		CommonFunctions.enterElementValue(GuardianAddress2, "2Above");
		CommonFunctions.wait(5000, false);

		CommonFunctions.enterElementValue(GuardianSuburb, "2City");
		CommonFunctions.wait(5000, false);

		CommonFunctions.selectValueFromDropdown(GuardianState, "VIC");
		CommonFunctions.wait(5000, false);

		CommonFunctions.enterElementValue(GuardianPostCode, "1234");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(GuardianSave);
		CommonFunctions.wait(5000, false);
	}

	public void DisplayMandatoryFieldsOnGuardian() {
		CommonFunctions.elementDisplayed(GuardianTitleReq);
		CommonFunctions.elementDisplayed(GuardianFirstNameReq);
		CommonFunctions.elementDisplayed(GuardianLastNameReq);
		CommonFunctions.elementDisplayed(GuardianRelationshipReq);
		CommonFunctions.elementDisplayed(GuardianAddress1req);
		CommonFunctions.elementDisplayed(GuardianSuburbReq);
		CommonFunctions.elementDisplayed(GuardianStateReq);
		CommonFunctions.elementDisplayed(GuardianPostCodeReq);

	}

	public void ClickDeleteSecondChild() {
		CommonFunctions.clickElement(RemoveSecondChild);
	}

	public void ClickGuardianYes() {
		CommonFunctions.clickElement(GuardianYes);
	}

	public void GuardianRequiredDisplayed() {
		CommonFunctions.elementDisplayed(GuardianNo.findElement(By.xpath(".//following::label//following::div[text()='Required field']")));
	}

	public void AddChildrenFromPrevious() {
		CommonFunctions.selectValueFromDropdown(AddChildQuestion4, "Dr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion5, "Little Dim");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion7, "Camuin");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion8, "05/09/1990");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddChildQuestion11Yes);
		CommonFunctions.wait(5000, false);

		CommonFunctions.selectValueFromDropdown(AddChildQuestion12, "Dr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion13, "Demeth");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion15, "Camuin");
		CommonFunctions.wait(5000, false);

		CommonFunctions.clickElement(AddChildSave);
		CommonFunctions.wait(5000, false);

	}

	public void AddChildrenToggleOffOn() {
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(ChildrenYes);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddChild);
		CommonFunctions.wait(5000, false);
	}

	public void AddChildrenClickAddChild() {
		CommonFunctions.clickElement(AddChild);
		CommonFunctions.wait(5000, false);
	}

	public void AddGauardianClickAddGuardian() {
		CommonFunctions.clickElement(AddGuardian);
		CommonFunctions.wait(5000, false);
	}

	public void EditSecondaryGuardian() {
		CommonFunctions.clickElement(EditSecondaryGuardian);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(GuardianAddress1, "THIS ADDRESS IS EDITED");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(GuardianSave);
		CommonFunctions.wait(5000, false);

	}

	public void DeleteSecondaryGuardian() {
		CommonFunctions.clickElement(DeleteSecondaryGuardian);
		CommonFunctions.wait(5000, false);

	}

	public void AddChildrenLegitimate() {

		CommonFunctions.selectValueFromDropdown(AddChildQuestion4, "Dr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion5, "Little Dim");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion7, "Camuin");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion8, "05/09/2010");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddChildQuestion11No);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddChildSave);
		CommonFunctions.wait(5000, false);
	}

	public void CheckAddChildrenRequired() {
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(ChildrenYes);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddChild);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddChildQuestion11);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddChildSave);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(AddChildQuestion4Req);
		CommonFunctions.elementDisplayed(AddChildQuestion5Req);
		CommonFunctions.elementDisplayed(AddChildQuestion7Req);
		CommonFunctions.elementDisplayed(AddChildQuestion8Req);
		CommonFunctions.elementDisplayed(AddChildQuestion9Req);
		CommonFunctions.elementDisplayed(AddChildQuestion12Req);
		CommonFunctions.elementDisplayed(AddChildQuestion13Req);
		CommonFunctions.elementDisplayed(AddChildQuestion14Req);
		CommonFunctions.clickElement(AddChildCancel);

	}

	public void AddChildrenStepChild() {
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(ChildrenYes);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddChild);
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(AddChildQuestion4, "Dr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion5, "Little Dim");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion7, "Camuin");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion8, "05/09/1990");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddChildQuestion11Yes);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddChildQuestion10);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddChildSave);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.wait(5000, false);
	}

	public void CheckContentAddChildren() {
		CommonFunctions.elementDisplayed(AddChild);
		CommonFunctions.clickElement(AddChild);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(AddChildQuestion4);
		CommonFunctions.elementDisplayed(AddChildQuestion5);
		CommonFunctions.elementDisplayed(AddChildQuestion6);
		CommonFunctions.elementDisplayed(AddChildQuestion7);
		CommonFunctions.elementDisplayed(AddChildQuestion8);
		CommonFunctions.elementDisplayed(AddChildQuestion9);
		CommonFunctions.elementDisplayed(AddChildQuestion10);
		CommonFunctions.elementDisplayed(AddChildQuestion11);
		CommonFunctions.clickElement(AddChild);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(AddChildSave);
		CommonFunctions.elementDisplayed(AddChildCancel);
	}

	public void YesChildren() {
		CommonFunctions.clickElement(ChildrenYes);
		CommonFunctions.wait(5000, false);
	}

	public void AddChildrenLinkDisplayed() {
		CommonFunctions.elementDisplayed(AddChild);
	}

	public void AdditionalQuestionsForSingleSinglesPackage() {
		// Only 2 question will be additional
		CommonFunctions.elementDisplayed(Question10);
		CommonFunctions.clickElement(LawYesButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(Question11);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementHidden(Question11);
		CommonFunctions.clickElement(LawNAButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementHidden(Question11);
		// Other questions is hidden
		CommonFunctions.elementHidden(Question1);
		CommonFunctions.elementHidden(Question2);
		CommonFunctions.elementHidden(Question3);
		CommonFunctions.elementHidden(Question4);
		CommonFunctions.elementHidden(Question5);
		CommonFunctions.elementHidden(Question6);
		CommonFunctions.elementHidden(Question7);
		CommonFunctions.elementHidden(Question8);
		CommonFunctions.elementHidden(Question12);
	}

	public void RequiredValidationOnAboutPage() {
		CommonFunctions.elementDisplayed(RelationshipStatus.findElement(By.xpath(".//following::span//following::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(ChildrenNoRequired);
		CommonFunctions.elementDisplayed(DependentsNo.findElement(By.xpath(".//following::div[text()='Required field']")));
	}

	public void RequiredValidationOnAboutPageWidowed() {
		CommonFunctions.elementDisplayed(ChildrenNoRequired);
		CommonFunctions.elementDisplayed(DependentsNo.findElement(By.xpath(".//following::div[text()='Required field']")));
	}

	public void RequiredValidationOnAboutPageSingle() {
		CommonFunctions.elementDisplayed(LawNAButtonRequired);

		CommonFunctions.elementDisplayed(ChildrenNoRequired);
		CommonFunctions.elementDisplayed(DependentsNo.findElement(By.xpath(".//following::div[text()='Required field']")));

	}

	public void RequiredValidationOnAboutPageMarried() {
		CommonFunctions.elementDisplayed(Question1.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question2.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question4.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question5.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(WillTogetherRadioNo.findElement(By.xpath(".//parent::div[contains(@id, 'InputsAndLabels')]//label[text() = 'No']//parent::div//following-sibling::div")));

		CommonFunctions.elementDisplayed(LawNAButtonRequired);
		CommonFunctions.elementDisplayed(ChildrenNoRequired);
		CommonFunctions.elementDisplayed(DependentsNo.findElement(By.xpath(".//following::div[text()='Required field']")));
	}

	public void RequiredValidationOnAboutPageSeparated() {
		CommonFunctions.elementDisplayed(Question1.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question2.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question4.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));

		CommonFunctions.elementDisplayed(LawNAButtonRequired);
		CommonFunctions.elementDisplayed(ChildrenNoRequired);
		CommonFunctions.elementDisplayed(DependentsNo.findElement(By.xpath(".//following::div[text()='Required field']")));
	}

	public void RequiredValidationOnAboutPageDefacto() {
		CommonFunctions.elementDisplayed(Question1.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question2.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question4.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question5.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(WillMarryNo.findElement(By.xpath(".//parent::div[contains(@id, 'InputsAndLabels')]//label[text() = 'No']//parent::div//following-sibling::div")));
		CommonFunctions.elementDisplayed(WillTogetherRadioNo.findElement(By.xpath(".//parent::div[contains(@id, 'InputsAndLabels')]//label[text() = 'No']//parent::div//following-sibling::div")));

		CommonFunctions.elementDisplayed(LawNAButtonRequired);
		CommonFunctions.elementDisplayed(ChildrenNoRequired);
		CommonFunctions.elementDisplayed(DependentsNo.findElement(By.xpath(".//following::div[text()='Required field']")));
	}

	public void AdditionalQuestionsForSingleCouplesPackage() {
		// Only 2 question will be additional
		CommonFunctions.elementDisplayed(Question8);
		CommonFunctions.elementDisplayed(Question10);
		CommonFunctions.clickElement(LawYesButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(Question11);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementHidden(Question11);
		CommonFunctions.clickElement(LawNAButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementHidden(Question11);
		// Other questions is hidden
		CommonFunctions.elementHidden(Question1);
		CommonFunctions.elementHidden(Question2);
		CommonFunctions.elementHidden(Question3);
		CommonFunctions.elementHidden(Question4);
		CommonFunctions.elementHidden(Question5);
		CommonFunctions.elementHidden(Question6);
		CommonFunctions.elementHidden(Question7);
		CommonFunctions.elementHidden(Question12);
	}

	public void AdditionalQuestionsForWidowedCouple() {
		// All Questions are hidden
		CommonFunctions.elementHidden(Question1);
		CommonFunctions.elementHidden(Question2);
		CommonFunctions.elementHidden(Question3);
		CommonFunctions.elementHidden(Question4);
		CommonFunctions.elementHidden(Question5);
		CommonFunctions.elementHidden(Question6);
		CommonFunctions.elementHidden(Question7);
		CommonFunctions.elementDisplayed(Question8);
		CommonFunctions.elementHidden(Question10);
		CommonFunctions.elementHidden(Question11);
		CommonFunctions.elementHidden(Question12);
	}

	public void AdditionalQuestionsForWidowedSingle() {
		// All Questions are hidden
		CommonFunctions.elementHidden(Question1);
		CommonFunctions.elementHidden(Question2);
		CommonFunctions.elementHidden(Question3);
		CommonFunctions.elementHidden(Question4);
		CommonFunctions.elementHidden(Question5);
		CommonFunctions.elementHidden(Question6);
		CommonFunctions.elementHidden(Question7);
		CommonFunctions.elementHidden(Question8);
		CommonFunctions.elementHidden(Question10);
		CommonFunctions.elementHidden(Question11);
		CommonFunctions.elementHidden(Question12);
	}

	public void AdditionalQuestionsForMarried() {
		// Questions that are hidden
		CommonFunctions.elementHidden(Question6);
		CommonFunctions.elementHidden(Question12);

		// Questions displayed
		CommonFunctions.elementDisplayed(Question1);
		CommonFunctions.elementDisplayed(Question2);
		CommonFunctions.elementDisplayed(Question3);
		CommonFunctions.elementDisplayed(Question4);
		CommonFunctions.elementDisplayed(Question5);
		// Check if yes and no
		CommonFunctions.elementDisplayed(Question7);
		CommonFunctions.clickElement(WillTogetherRadioYes);
		CommonFunctions.elementDisplayed(Question8);
		CommonFunctions.clickElement(WillTogetherRadioNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementHidden(Question8);
		// Check if yes and no
		CommonFunctions.elementDisplayed(Question10);
		CommonFunctions.clickElement(LawYesButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(Question11);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementHidden(Question11);
		CommonFunctions.clickElement(LawNAButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementHidden(Question11);
	}

	public void AdditionalQuestionsForDefactoAndEngaged() {
		// Questions that are hidden
		CommonFunctions.elementHidden(Question12);
		// Questions displayed
		CommonFunctions.elementDisplayed(Question1);
		CommonFunctions.elementDisplayed(Question2);
		CommonFunctions.elementDisplayed(Question3);
		CommonFunctions.elementDisplayed(Question4);
		CommonFunctions.elementDisplayed(Question5);
		// Check if yes and no
		CommonFunctions.elementDisplayed(Question6);
		CommonFunctions.clickElement(WillMarryYes);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(WillMarryNote);
		CommonFunctions.clickElement(WillMarryNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementHidden(WillMarryNote);

		// Check if yes and no
		CommonFunctions.elementDisplayed(Question7);
		CommonFunctions.clickElement(WillTogetherRadioYes);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(Question8);
		CommonFunctions.clickElement(WillTogetherRadioNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementHidden(Question8);
		// Check if yes and no
		CommonFunctions.elementDisplayed(Question10);
		CommonFunctions.clickElement(LawYesButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(Question11);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementHidden(Question11);
		CommonFunctions.clickElement(LawNAButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementHidden(Question11);
	}

	public void AdditionalQuestionsForSeparatedAndDivorced() {
		// Questions that are hidden
		CommonFunctions.elementHidden(Question5);
		CommonFunctions.elementHidden(Question6);
		CommonFunctions.elementHidden(Question7);
		CommonFunctions.elementHidden(Question8);
		// Questions displayed
		CommonFunctions.elementDisplayed(Question1);
		CommonFunctions.elementDisplayed(Question2);
		CommonFunctions.elementDisplayed(Question3);
		CommonFunctions.elementDisplayed(Question4);
		// Check if yes and no
		CommonFunctions.elementDisplayed(Question10);
		CommonFunctions.clickElement(LawYesButton);
		CommonFunctions.elementDisplayed(Question11);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.elementHidden(Question11);
		CommonFunctions.elementDisplayed(Question12);
	}

	public void DisplayedRelationshipStatus() {
		CommonFunctions.elementDisplayed(RelationshipStatus);
	}

	public void HiddenYearSettlement() {
		CommonFunctions.elementHidden(Question11);
	}

	public void FillUpMandatoryFieldsSingle() {
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpMandatoryFieldsSingleWithChild() {
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(ChildrenYes);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddChild);
		CommonFunctions.selectValueFromDropdown(AddChildQuestion4, "Dr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion5, "Little Dim");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion7, "Camuin");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion8, "05/09/1990");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddChildQuestion11No);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddChildSave);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpMandatoryFieldsSingleWithMinorChild() {
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(ChildrenYes);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddChild);
		CommonFunctions.selectValueFromDropdown(AddChildQuestion4, "Dr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion5, "Little Dim");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion7, "Camuin");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion8, "05/09/2015");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddChildQuestion11No);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddChildSave);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.wait(5000, false);
	}

	public void DisplayMandatoryFieldsDependent() {
		CommonFunctions.elementDisplayed(DependentsNo.findElement(By.xpath(".//following::div[text()='Required field']")));

	}

	public void FillUpMandatoryFieldsWidowed() {
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.wait(5000, false);
	}

	public void ClickDependentsNo() {
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.wait(5000, false);
	}

	public void ClickDependentsYes() {
		CommonFunctions.clickElement(DependentsYes);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpMandatoryFieldsDefacto() {
		CommonFunctions.selectValueFromDropdown(Question1, "Dr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question2, "Dim");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question4, "Camuin");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question5, "5");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(WillMarryNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(WillTogetherRadioNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpMandatoryFieldsEngaged() {
		CommonFunctions.selectValueFromDropdown(Question1, "Dr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question2, "Dim");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question4, "Camuin");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question5, "5");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(WillMarryNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(WillTogetherRadioNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpMandatoryFieldsMarried() {
		CommonFunctions.selectValueFromDropdown(Question1, "Dr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question2, "Dim");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question4, "Camuin");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question5, "5");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(WillMarryNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(WillTogetherRadioNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpMandatoryFieldsMarriedWithChildren() {
		CommonFunctions.selectValueFromDropdown(Question1, "Dr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question2, "Dim");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question4, "Camuin");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question5, "5");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(WillMarryNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(WillTogetherRadioNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(ChildrenYes);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddChild);
		CommonFunctions.selectValueFromDropdown(AddChildQuestion4, "Dr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion5, "Little Dim");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion7, "Camuin");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion8, "05/09/1990");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddChildQuestion11No);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(AddChildSave);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpMandatoryFieldsSeparated() {
		CommonFunctions.selectValueFromDropdown(Question1, "Dr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question2, "Dim");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question4, "Camuin");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question5, "5");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(WillMarryNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(WillTogetherRadioNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpMandatoryFieldsDivorced() {
		CommonFunctions.selectValueFromDropdown(Question1, "Dr");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question2, "Dim");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question4, "Camuin");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question5, "5");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(WillMarryNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(WillTogetherRadioNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.wait(5000, false);
	}

	public void DisplayedYearSettlement() {
		CommonFunctions.elementDisplayed(Question11);
	}

	public void clickNoBtnLaw() {
		CommonFunctions.clickElement(LawNoButton);
	}

	public void clickYesBtnLaw() {
		CommonFunctions.clickElement(LawYesButton);
	}

	public void clickNABtnLaw() {
		CommonFunctions.clickElement(LawNAButton);
	}

	public void DisplayedNextBtn() {
		CommonFunctions.elementDisplayed(NextButton);
	}

	public void DisplayedCancelBtn() {
		CommonFunctions.elementDisplayed(CancelButton);
	}

	public void SelectRelationshipStatusPersonalPage(String value) {
		CommonFunctions.selectValueFromDropdown(RelationshipStatus, value);
	}

	public void CheckRelationshipStatusDropdownValues(String[] expectedValues) {
		CommonFunctions.checkDropdownOptionsAvailable(RelationshipStatus, expectedValues);
	}

	public void CheckRelStatusDefaultValue(String expectedValue) {
		CommonFunctions.checkSingleSelectDropdownSelectedOption(RelationshipStatus, expectedValue);
	}

	public void CheckGuardianCountryDefaultValue() {
		String country = "AUSTRALIA";
		CommonFunctions.checkSingleSelectDropdownSelectedOption(GuardianCountry, country);
	}

	public AssetsPage ClickNextButton() {
		CommonFunctions.clickElement(NextButton);

		return new AssetsPage();
	}

	public PersonalPage ClickBackButton() {
		CommonFunctions.clickElement(CancelButton);

		return new PersonalPage();
	}

	public void CheckRelationshipStatusDropdownMandatory() {
		CommonFunctions.elementDisplayed(RelationshipStatus.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void clickWillTogetherRadioYesRadioButton() {
		CommonFunctions.clickElement(WillTogetherRadioYes);
	}

	public void clickWillTogetherRadioNoRadioButton() {
		CommonFunctions.clickElement(WillTogetherRadioNo);
	}

	public void setQuestion8Input(String value) {
		CommonFunctions.clearThenEnterElementValue(Question8, value);
	}

	public void UploadWill10MBPLUS() {
		// CommonFunctions.assembleFilePathsToUpload(GoodPath, "C:/Users/CLOUD-Demeth/Desktop/Maurice Blackburn/For Upload/12.84MB.jpg");
		// CommonFunctions.attachToUploadElement(driver.findElement(By.xpath(".//input[@id='Upload_file']")), GoodPath);

		driver.findElement(By.xpath(".//input[@id='Upload_file']")).sendKeys("C:/Users/CLOUD-Demeth/Desktop/Maurice Blackburn/For Upload/12.84MB.jpg");

	}

	public void UploadValidWill() {
		driver.findElement(By.xpath(".//input[@id='Upload_file']")).sendKeys("C:/Users/CLOUD-Demeth/Desktop/Maurice Blackburn/For Upload/SampleWill.pdf");

	}

	public void UploadMoreWills() {
		driver.findElement(By.xpath(".//input[@id='Upload_file']")).sendKeys("C:/Users/David Peralta/Desktop/Uploads/WillInstructions1.pdf");
		CommonFunctions.wait(5000, false);
		driver.findElement(By.xpath(".//input[@id='Upload_file']")).sendKeys("C:/Users/David Peralta/Desktop/Uploads/WillInstructions2.pdf");
		CommonFunctions.wait(5000, false);
	}

	public void UploadWillInvalidFileFormat() {
		// driver.findElement(By.xpath(".//input[@id='Upload_file']")).sendKeys("C:/Users/CLOUD-Demeth/Desktop/Maurice Blackburn/For Upload/Proposed MB Online Will Form V1.4.xlsx");
		driver.findElement(By.xpath(".//input[@id='Upload_file']")).sendKeys("C:/Users/David Peralta/Desktop/Uploads/Proposed MB Online Will Form V1.4.xlsx");

	}

	public void ClickRemoveAttachment() {
		CommonFunctions.clickElement(RemoveAttachment);
	}

	public PersonalPage ProgressChangePersonal() {
		CommonFunctions.clickElement(ProgressPersonal);

		return new PersonalPage();
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

	public void DisplayTooltipForSpouse() {
		CommonFunctions.elementDisplayed(SpousePartner_Tooltip);
	}

	public void DisplayTooltipSignificant() {
		CommonFunctions.elementDisplayed(Significant_Tooltip);
	}

	public void DisplayTooltipDependents() {
		CommonFunctions.elementDisplayed(Dependents_Tooltip);
	}

	public void DisplayTooltipUploadWill() {
		CommonFunctions.elementDisplayed(UploadWill_Tooltip);
	}

	public void ClickTooltipUploadWill() {
		CommonFunctions.clickElement(UploadWill_Tooltip);
	}

	public void ClickTooltipForSpouse() {
		CommonFunctions.clickElement(SpousePartner_Tooltip);
	}

	public void ClickTooltipSignificant() {
		CommonFunctions.clickElement(Significant_Tooltip);
	}

	public void ClickTooltipDependents() {
		CommonFunctions.clickElement(Dependents_Tooltip);
	}

	public void ClickChildrenYes() {
		CommonFunctions.clickElement(ChildrenYes);
		CommonFunctions.wait(5000, false);
	}

	public void ClickAddChild() {
		CommonFunctions.clickElement(AddChild);
		CommonFunctions.wait(5000, false);
	}

	public void DisplayTooltipGuardian() {
		CommonFunctions.elementDisplayed(Guardian_Tooltip);
	}

	public void DisplayTooltipGuardianVideo() {
		CommonFunctions.elementDisplayed(Guardian_TooltipVideo);
	}

	public void ClickTooltipGuardian() {
		CommonFunctions.clickElement(Guardian_Tooltip);
	}
}