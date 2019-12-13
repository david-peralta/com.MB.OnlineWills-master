package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class ReviewConfirmPage extends Base {
	// ========================================================== Page Objects ===========================================================

	// Element - Checkbox

	@FindBy(xpath = "//input[contains(@type,'checkbox')]")
	WebElement Question1;

	@FindBy(xpath = "//input[contains(@id,'CB_Confirm')]")
	WebElement chk_Confirm;

	// Element - Button

	@FindBy(xpath = "//input[contains(@value,'Save and Continue')]")
	WebElement btn_Next;

	@FindBy(xpath = "//input[contains(@value,'Back')]")
	WebElement btn_Back;

	@FindBy(xpath = "(//input[contains(@value,'Edit')])[1]")
	WebElement btn_EditPersonal;

	@FindBy(xpath = "(//input[contains(@value,'Edit')])[2]")
	WebElement btn_EditAbout;

	@FindBy(xpath = "(//input[contains(@value,'Edit')])[3]")
	WebElement btn_EditAssets;

	@FindBy(xpath = "(//input[contains(@value,'Edit')])[4]")
	WebElement btn_EditBeneficiaries;

	@FindBy(xpath = "(//input[contains(@value,'Edit')])[5]")
	WebElement btn_EditExecutors;

	// Element - Dropdown

	@FindBy(xpath = "(//select[contains(@id,'IdentificationTypeInput')])[1]")
	WebElement Question2A;
	@FindBy(xpath = "(//span[text()='Are you currently in hospital?']//following::div[text()='No'])[1]")
	WebElement PersonalInfoHospitalQuestionWithNo;
	@FindBy(xpath = "(//span[text()='Are you currently in hospital?']//following::div[text()='Yes'])[1]")
	WebElement PersonalInfoHospitalQuestionWithYes;
	@FindBy(xpath = "(//span[contains(text(),'Have you been diagnosed with any conditions that affect your cognition or your physical ability to read and sign your Will?')]//following::div[text()='Yes'])[1]")
	WebElement PersonalInfoDiagnosedQuestionWithYes;
	@FindBy(xpath = "(//span[contains(text(),'Have you been diagnosed with any conditions that affect your cognition or your physical ability to read and sign your Will?')]//following::div[text()='No'])[1]")
	WebElement PersonalInfoDiagnosedQuestionWithNo;
	@FindBy(xpath = "//td[text()='Have you had a family law property settlement?']//following::td[text()='No']")
	WebElement FamilyLawPropertyNo;

	@FindBy(xpath = "//td[text()='Have you had a family law property settlement?']//following::td[text()='Yes']")
	WebElement FamilyLawPropertyYes;

	@FindBy(xpath = "(//select[contains(@id,'IdentificationTypeInput')])[2]")
	WebElement Question2B;

	@FindBy(xpath = "//select[contains(@id,'LicenseStateDropdown')]")
	WebElement Question4;

	@FindBy(xpath = "//select[contains(@id,'MedicareCardColour')]")
	WebElement Question10;

	@FindBy(xpath = "//select[contains(@id,'ForeignPassportCountryOfIssue')]")
	WebElement Question21;

	/* Not Mandatory */
	@FindBy(xpath = "//select[contains(@id,'AusPassportGender')]")
	WebElement AusPassportGender;

	// Element - Input

	/* Drivers License */
	@FindBy(xpath = "//input[contains(@id,'LicenseNo')]")
	WebElement Question3;

	@FindBy(xpath = "//input[contains(@id,'LicenseFname')]")
	WebElement Question5;

	@FindBy(xpath = "//input[contains(@id,'LicenseMname')]")
	WebElement Question6;

	@FindBy(xpath = "//input[contains(@id,'LicenseSurName')]")
	WebElement Question7;

	@FindBy(xpath = "//input[contains(@id,'LicenseDOBInput')]")
	WebElement Question8;

	/* Medicare */
	@FindBy(xpath = "//input[contains(@id,'MedicareGivenName')]")
	WebElement Question9;

	@FindBy(xpath = "//input[contains(@id,'MedicareNo')]")
	WebElement Question11;

	@FindBy(xpath = "//input[contains(@id,'MedicareIndividualReferenceNumber')]")
	WebElement Question12;

	@FindBy(xpath = "//input[contains(@id,'MedicareExpiryDateInput')]")
	WebElement Question13;

	@FindBy(xpath = "//input[contains(@id,'MedicareDOBInput')]")
	WebElement Question14;

	/* Australian Passport */
	@FindBy(xpath = "//input[contains(@id,'AusPassportNo')]")
	WebElement Question15;

	@FindBy(xpath = "//input[contains(@id,'AusPassportFname')]")
	WebElement Question16;

	@FindBy(xpath = "//input[contains(@id,'AusPassportMname')]")
	WebElement Question17;

	@FindBy(xpath = "//input[contains(@id,'AusPassportSurName')]")
	WebElement Question18;

	@FindBy(xpath = "//input[contains(@id,'PassportDOBInput')]")
	WebElement Question19;

	@FindBy(xpath = "//input[contains(@id,'AusPassportNo')]")
	WebElement Question20;

	/* Foreign Passport */
	@FindBy(xpath = "//input[contains(@id,'ForeignPassportFname')]")
	WebElement Question22;

	@FindBy(xpath = "//input[contains(@id,'ForeignPassportMname')]")
	WebElement Question23;

	@FindBy(xpath = "//input[contains(@id,'ForeignPassportSurname')]")
	WebElement Question24;

	@FindBy(xpath = "//input[contains(@id,'ForeignPassportDOBInput')]")
	WebElement Question25;
	@FindBy(xpath = "(//*[text()='Do you have any children?']//following::div[text()='Yes'])[1]")
	WebElement HaveChildrenYes;
	@FindBy(xpath = "(//*[text()='Do you have any children?']//following::div[text()='No'])[1]")
	WebElement HaveChildrenNo;

	@FindBy(xpath = "(//span[contains(text(),'Do you have any other dependents?')]//following::div[text()='Yes'])[1]")
	WebElement HaveDependentsYes;
	@FindBy(xpath = "(//span[contains(text(),'Do you have any other dependents?')]//following::div[text()='No'])[1]")
	WebElement HaveDependentsNo;

	@FindBy(xpath = "(//span[contains(text(),'Do you already have a Will?')]//following::div[text()='None'])[1]")
	WebElement HaveWillNone;

	@FindBy(xpath = "(//span[contains(text(),'Do you have any assets?')]//following::div[text()='Yes'])[1]")
	WebElement HaveAssetsYes;
	@FindBy(xpath = "(//span[contains(text(),'Do you have any assets?')]//following::div[text()='No'])[1]")
	WebElement HaveAssetsNo;
	@FindBy(xpath = "(//span[contains(text(),'Do you have any debts?')]//following::div[text()='Yes'])[1]")
	WebElement HaveDebtsYes;
	@FindBy(xpath = "(//span[contains(text(),'Do you have any debts?')]//following::div[text()='No'])[1]")
	WebElement HaveDebtsNo;
	@FindBy(xpath = "(//span[contains(text(),'Do you have any superannuation?')]//following::div[text()='Yes'])[1]")
	WebElement HaveSuperYes;
	@FindBy(xpath = "(//span[contains(text(),'Do you have any superannuation?')]//following::div[text()='No'])[1]")
	WebElement HaveSuperNo;
	@FindBy(xpath = "(//span[contains(text(),'Do you have life insurance separate from your superannuation?')]//following::div[text()='Yes'])[1]")
	WebElement HaveLifeInsuranceSuperYes;
	@FindBy(xpath = "(//span[contains(text(),'Do you have life insurance separate from your superannuation?')]//following::div[text()='No'])[1]")
	WebElement HaveLifeInsuranceSuperNo;
	@FindBy(xpath = "(//span[contains(text(),'Do you control a trust?')]//following::div[text()='Yes'])[1]")
	WebElement HaveTrustYes;
	@FindBy(xpath = "(//span[contains(text(),'Do you control a trust?')]//following::div[text()='No'])[1]")
	WebElement HaveTrustNo;
	@FindBy(xpath = "(//span[contains(text(),'Do you control a self-managed superannuation fund?')]//following::div[text()='Yes'])[1]")
	WebElement HaveSuperFundYes;
	@FindBy(xpath = "(//span[contains(text(),'Do you control a self-managed superannuation fund?')]//following::div[text()='No'])[1]")
	WebElement HaveSuperFundNo;
	@FindBy(xpath = "(//span[contains(text(),'Do you own your own business, or are you a partner in a partnership?')]//following::div[text()='Yes'])[1]")
	WebElement HaveBusinessYes;
	@FindBy(xpath = "(//span[contains(text(),'Do you own your own business, or are you a partner in a partnership?')]//following::div[text()='No'])[1]")
	WebElement HaveBusinessNo;

	@FindBy(xpath = "(//span[contains(text(),'Do you want to give the whole of your estate equally to any children you have in the future?')]//following::div[text()='Yes'])[1]")
	WebElement BenefFutureChildrenQuestionYes;
	@FindBy(xpath = "(//span[contains(text(),'Do you want to give the whole of your estate equally to any children you have in the future?')]//following::div[text()='No'])[1]")
	WebElement BenefFutureChildrenQuestionNo;

	@FindBy(xpath = "(//span[contains(text(),'If any of your children predecease you, do you want to divide it equally amongst their children?')]//following::div[text()='Yes'])[1]")
	WebElement BenefDisasterQuestionYes;
	@FindBy(xpath = "(//span[contains(text(),'If any of your children predecease you, do you want to divide it equally amongst their children?')]//following::div[text()='No'])[1]")
	WebElement BenefDisasterQuestionNo;
	@FindBy(xpath = "(//div[contains(@id,'Content')])[120]")
	WebElement BenefDisasterQuestionField;

	@FindBy(xpath = "(//span[contains(text(),'Do you wish to leave any gifts?')]//following::div[text()='Yes'])[1]")
	WebElement HaveGiftYes;
	@FindBy(xpath = "(//span[contains(text(),'Do you wish to leave any gifts?')]//following::div[text()='No'])[1]")
	WebElement HaveGiftNo;

	@FindBy(xpath = "(//span[contains(text(),'Would you like Maurice Blackburn to assist with Managing your estate?')]//following::div[text()='Yes'])[1]")
	WebElement MBAssistManageEstateYes;
	@FindBy(xpath = "(//span[contains(text(),'Would you like Maurice Blackburn to assist with Managing your estate?')]//following::div[text()='No'])[1]")
	WebElement MBAssistManageEstateNo;

	@FindBy(xpath = "//input[contains(@id,'CB_Confirm')]")
	WebElement ConfirmAcknowledgement;
	@FindBy(xpath = "(//input[@value='Edit'])[1]")
	WebElement EditEnduringPowerofAttorney;
	@FindBy(xpath = "(//input[@value='Edit'])[2]")
	WebElement EditMedicalPowerofAttorney;
	@FindBy(xpath = "(//input[@value='Edit'])[1]")
	WebElement EditPersonalInfoSummary;
	@FindBy(xpath = "(//input[@value='Edit'])[2]")
	WebElement EditAboutYouSummary;
	@FindBy(xpath = "(//input[@value='Edit'])[3]")
	WebElement EditAssetsSummary;
	@FindBy(xpath = "(//input[@value='Edit'])[4]")
	WebElement EditBeneficiariesSummary;
	@FindBy(xpath = "(//input[@value='Edit'])[5]")
	WebElement EditExecutorsSummary;

	@FindBy(xpath = "//span[text()='I do not want to appoint a Medical Decision Maker']//following::div[text()='Yes']")
	WebElement YesIDoNotWantToAppointAMedicalDecisionMaker;
	@FindBy(xpath = "//span[text()='I do not want to appoint a Medical Decision Maker']//following::div[text()='No']")
	WebElement NoIDoNotWantToAppointAMedicalDecisionMaker;

	/* Progess Bar */
	@FindBy(xpath = "//div[text()='Personal Details']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressPersonal;
	@FindBy(xpath = "//div[text()='About You']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAbout;
	@FindBy(xpath = "//div[text()='Assets']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAssets;
	@FindBy(xpath = "//div[text()='Executors']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressExecutors;
	@FindBy(xpath = "//div[text()='Beneficiaries']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressBeneficiaries;
	@FindBy(xpath = "//div[text()='ID Docs']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressIDDocs;
	@FindBy(xpath = "//div[text()='Add-ons']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAddOns;

	// Element Labels
	// Personal Details
	@FindBy(xpath = "//div[contains(@id,'Title') and . /text()='Personal Details']")
	WebElement Label_PersonalDetails;
	@FindBy(xpath = "//div[contains(@id,'Column1')]//td[contains(text(),'Title:')]")
	WebElement Label_PersonalDetails_Title;
	@FindBy(xpath = "//div[contains(@id,'Column1')]//td[contains(text(),'First Name:')]")
	WebElement Label_PersonalDetails_Fname;
	@FindBy(xpath = "//div[contains(@id,'Column1')]//td[contains(text(),'Middle Name:')]")
	WebElement Label_PersonalDetails_Mname;
	@FindBy(xpath = "//div[contains(@id,'Column1')]//td[contains(text(),'Family Name:')]")
	WebElement Label_PersonalDetails_Sname;
	@FindBy(xpath = "//div[contains(@id,'Column1')]//td[contains(text(),'Residential Address:')]")
	WebElement Label_PersonalDetails_RAddess;
	@FindBy(xpath = "//div[contains(@id,'Column1')]//td[contains(text(),'Postal Address:')]")
	WebElement Label_PersonalDetails_PAddess;
	@FindBy(xpath = "//div[contains(@id,'Column2')]//td[contains(text(),'Date of Birth:')]")
	WebElement Label_PersonalDetails_Birth;
	@FindBy(xpath = "(//div[contains(@id,'Column2')]//td[contains(text(),'Email:')])[1]")
	WebElement Label_PersonalDetails_Email;
	@FindBy(xpath = "//div[contains(@id,'Column2')]//td[contains(text(),'Phone Number:')]")
	WebElement Label_PersonalDetails_PhoneNo;
	@FindBy(xpath = "//div[contains(@id,'Column2')]//td[contains(text(),'Occupation:')]")
	WebElement Label_PersonalDetails_Occupation;
	// About You
	@FindBy(xpath = "//div[contains(@id,'Column1')]//td[contains(text(),'Current Marital Status:')]")
	WebElement Label_About_You_Status;
	@FindBy(xpath = "//div[contains(@id,'Column1')]//td[contains(text(),'Length of relationship (years):')]")
	WebElement Label_About_You_Years;
	@FindBy(xpath = "//div[contains(@id,'Column1')]//td[contains(text(),'Do you want to do your Will together with your spouse/partner?')]")
	WebElement Label_About_You_Will_With_Partner;
	@FindBy(xpath = "//div[contains(@id,'Column2')]//td[contains(text(),'Title:')]")
	WebElement Label_About_You_Title;
	@FindBy(xpath = "//div[contains(@id,'Column2')]//td[contains(text(),'First Name:')]")
	WebElement Label_About_You_Fname;
	@FindBy(xpath = "//div[contains(@id,'Column2')]//td[contains(text(),'Middle Name(s):')]")
	WebElement Label_About_You_Mname;
	@FindBy(xpath = "//div[contains(@id,'Column2')]//td[contains(text(),'Family Name:')]")
	WebElement Label_About_You_Sname;

	// Executors
	@FindBy(xpath = "(//div[@class='card Display']//span[contains(text(),'Name:')])[1]")
	WebElement Label_Executors_Name;
	@FindBy(xpath = "(//div[@class='card Display']//span[contains(text(),'Relationship:')])[1]")
	WebElement Label_Executors_Relationship;
	@FindBy(xpath = "//div[contains(@id,'Column1')]//span[contains(text(),'When I pass away, I wish to be:')]")
	WebElement Label_Executors_Wish;

	// ================================================== Initializing the Page Objects ==================================================
	public ReviewConfirmPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public PaymentsPage clickNextPaymentButton() {
		CommonFunctions.clickElement(btn_Next);

		return new PaymentsPage();
	}

	public PaymentsPage clickNextAddOnsButton() {
		CommonFunctions.clickElement(btn_Next);

		return new PaymentsPage();
	}

	public ThankYouPage clickNextThankYou() {
		CommonFunctions.clickElement(btn_Next);

		return new ThankYouPage();
	}

	public void clickNextButton() {
		CommonFunctions.clickElement(btn_Next);
	}

	public void clickQuestion1() {
		CommonFunctions.clickElement(chk_Confirm);
	}

	public ExecutorsPage ClickEditExecutorsSummary() {
		CommonFunctions.clickElement(EditExecutorsSummary);
		return new ExecutorsPage();
	}

	public BeneficiariesPage ClickEditBeneficiariesSummary() {
		CommonFunctions.clickElement(EditBeneficiariesSummary);
		return new BeneficiariesPage();
	}

	public AssetsPage ClickEditAssetsSummary() {
		CommonFunctions.clickElement(EditAssetsSummary);
		return new AssetsPage();
	}

	public AboutPage ClickEditAboutYouSummary() {
		CommonFunctions.clickElement(EditAboutYouSummary);
		return new AboutPage();
	}

	public PersonalPage ClickEditPersonalInfoSummary() {
		CommonFunctions.clickElement(EditPersonalInfoSummary);
		return new PersonalPage();
	}

	public void ClickConfirmAcknowledgement() {
		CommonFunctions.clickElement(ConfirmAcknowledgement);
	}

	public void BenefDisasterQuestionYes() {
		CommonFunctions.elementDisplayed(BenefDisasterQuestionYes);
	}

	public void BenefDisasterQuestionNo() {
		CommonFunctions.elementDisplayed(BenefDisasterQuestionNo);
	}

	public void HaveGiftYes() {
		CommonFunctions.elementDisplayed(HaveGiftYes);
	}

	public void HaveGiftNo() {
		CommonFunctions.elementDisplayed(HaveGiftNo);
	}

	public void BenefDisasterQuestionField() {
		CommonFunctions.elementDisplayed(BenefDisasterQuestionField);
	}

	public void BenefFutureChildrenQuestionYes() {
		CommonFunctions.elementDisplayed(BenefFutureChildrenQuestionYes);
	}

	public void BenefFutureChildrenQuestionNo() {
		CommonFunctions.elementDisplayed(BenefFutureChildrenQuestionNo);
	}

	public void HaveBusinessYes() {
		CommonFunctions.elementDisplayed(HaveBusinessYes);
	}

	public void HaveBusinessNo() {
		CommonFunctions.elementDisplayed(HaveBusinessNo);
	}

	public void HaveSuperFundYes() {
		CommonFunctions.elementDisplayed(HaveTrustYes);
	}

	public void HaveSuperFundNo() {
		CommonFunctions.elementDisplayed(HaveTrustNo);
	}

	public void HaveTrustYes() {
		CommonFunctions.elementDisplayed(HaveTrustYes);
	}

	public void HaveTrustNo() {
		CommonFunctions.elementDisplayed(HaveTrustNo);
	}

	public void HaveLifeInsuranceSuperNo() {
		CommonFunctions.elementDisplayed(HaveLifeInsuranceSuperNo);
	}

	public void HaveLifeInsuranceSuperYes() {
		CommonFunctions.elementDisplayed(HaveLifeInsuranceSuperYes);
	}

	public void validatesFields() {
		CommonFunctions.textDisplayedInPage("Personal Details");
		CommonFunctions.textDisplayedInPage("About You");
		CommonFunctions.textDisplayedInPage("Assets");
		CommonFunctions.textDisplayedInPage("Beneficiaries");
		CommonFunctions.textDisplayedInPage("ID Docs");
	}
	
	public void validatePersonalDetailsMyLifeWill() {
		CommonFunctions.scrollToBottomOfPage();
		CommonFunctions.wait(2500, false);
		CommonFunctions.textDisplayedInPage("Personal Details");
		CommonFunctions.textDisplayedInPage("Title");
		CommonFunctions.textDisplayedInPage("First Name");
		CommonFunctions.textDisplayedInPage("Middle Name");
		CommonFunctions.textDisplayedInPage("Family Name");
		CommonFunctions.textDisplayedInPage("Residential Address");
		CommonFunctions.textDisplayedInPage("Postal Address");
		CommonFunctions.textDisplayedInPage("Date of Birth");
		CommonFunctions.textDisplayedInPage("Email");
		CommonFunctions.textDisplayedInPage("Phone Number");
		CommonFunctions.textDisplayedInPage("Occupation");
	}

	public void validatePersonalDetails() {
		CommonFunctions.scrollToBottomOfPage();
		CommonFunctions.wait(2500, false);
		CommonFunctions.textDisplayedInPage("Personal Details");
		CommonFunctions.textDisplayedInPage("Title");
		CommonFunctions.textDisplayedInPage("First Name");
		CommonFunctions.textDisplayedInPage("Middle Name");
		CommonFunctions.textDisplayedInPage("Family Name");
		CommonFunctions.textDisplayedInPage("Residential Address");
		CommonFunctions.textDisplayedInPage("Postal Address");
		CommonFunctions.textDisplayedInPage("Date of Birth");
		CommonFunctions.textDisplayedInPage("Email");
		CommonFunctions.textDisplayedInPage("Phone Number");
		CommonFunctions.textDisplayedInPage("Occupation");
		CommonFunctions.textDisplayedInPage("Personal Details");
		CommonFunctions.textDisplayedInPage("Title:");
		CommonFunctions.textDisplayedInPage("First Name:");
		CommonFunctions.textDisplayedInPage("Middle Name:");
		CommonFunctions.textDisplayedInPage("Family Name:");
		CommonFunctions.textDisplayedInPage("Residential Address:");
		CommonFunctions.textDisplayedInPage("Postal Address:");
		CommonFunctions.textDisplayedInPage("Date of Birth:");
		CommonFunctions.textDisplayedInPage("Email:");
		CommonFunctions.textDisplayedInPage("Phone Number:");
		CommonFunctions.textDisplayedInPage("Occupation:");
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_DOWN));
		CommonFunctions.textDisplayedInPage("Current Marital Status:");
		CommonFunctions.textDisplayedInPage("Do you want to do your Will together with your spouse/partner?");
		CommonFunctions.textDisplayedInPage("Title:");
		CommonFunctions.textDisplayedInPage("First Name:");
		CommonFunctions.textDisplayedInPage("Middle Name(s):");
		CommonFunctions.textDisplayedInPage("Family Name:");
		CommonFunctions.textDisplayedInPage("Email:");
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_DOWN));
		CommonFunctions.textDisplayedInPage("Name:");
		CommonFunctions.textDisplayedInPage("Relationship:");

	}

	public void validateVicPersonalDetails() {
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_DOWN));
		CommonFunctions.wait(2500, false);
		CommonFunctions.textDisplayedInPage("Personal Details");
		CommonFunctions.textDisplayedInPage("Title");
		CommonFunctions.textDisplayedInPage("First Name");
		CommonFunctions.textDisplayedInPage("Middle Name");
		CommonFunctions.textDisplayedInPage("Family Name");
		CommonFunctions.textDisplayedInPage("Residential Address");
		CommonFunctions.textDisplayedInPage("Postal Address");
		CommonFunctions.textDisplayedInPage("Date of Birth");
		CommonFunctions.textDisplayedInPage("Email");
		CommonFunctions.textDisplayedInPage("Phone Number");
		CommonFunctions.textDisplayedInPage("Occupation");
	}

	public void FamilyLawPropertyNo() {
		CommonFunctions.elementDisplayed(FamilyLawPropertyNo);
	}

	public void HaveWillNone() {
		CommonFunctions.elementDisplayed(HaveWillNone);
	}

	public void HaveSuperNo() {
		CommonFunctions.elementDisplayed(HaveSuperNo);
	}

	public void HaveSuperYes() {
		CommonFunctions.elementDisplayed(HaveSuperYes);
	}

	public void HaveDebtsNo() {
		CommonFunctions.elementDisplayed(HaveDebtsNo);
	}

	public void HaveDebtsYes() {
		CommonFunctions.elementDisplayed(HaveDebtsYes);
	}

	public void HaveAssetsNo() {
		CommonFunctions.elementDisplayed(HaveAssetsNo);
	}

	public void HaveAssetsYes() {
		CommonFunctions.elementDisplayed(HaveAssetsYes);
	}

	public void HaveDependentsNo() {
		CommonFunctions.elementDisplayed(HaveDependentsNo);
	}

	public void HaveDependentsYes() {
		CommonFunctions.elementDisplayed(HaveDependentsYes);
	}

	public void HaveChildrenNo() {
		CommonFunctions.elementDisplayed(HaveChildrenNo);
	}

	public void HaveChildrenYes() {
		CommonFunctions.elementDisplayed(HaveChildrenYes);
	}

	public void FamilyLawPropertyYes() {
		CommonFunctions.elementDisplayed(FamilyLawPropertyYes);
	}

	public void HospitalNoSummary() {
		CommonFunctions.elementDisplayed(PersonalInfoHospitalQuestionWithNo);
	}

	public void HospitalYesSummary() {
		CommonFunctions.elementDisplayed(PersonalInfoHospitalQuestionWithYes);
	}

	public void DiagnosedYesSummary() {
		CommonFunctions.elementDisplayed(PersonalInfoDiagnosedQuestionWithYes);
	}

	public void DiagnosedNoSummary() {
		CommonFunctions.elementDisplayed(PersonalInfoDiagnosedQuestionWithNo);
	}

	public AddOnsPage ClickNextButton() {
		CommonFunctions.clickElement(btn_Next);

		return new AddOnsPage();
	}

	public MedicalDecisionsPage ClickBackButtonMedical() {
		CommonFunctions.clickElement(btn_Back);

		return new MedicalDecisionsPage();
	}

	public PaymentsPage ClickNextButtonPayment() {
		CommonFunctions.clickElement(btn_Next);

		return new PaymentsPage();
	}

	public FinancialDecisionsPage clickEditEnduringPowerofAttorney() {
		CommonFunctions.clickElement(EditEnduringPowerofAttorney);

		return new FinancialDecisionsPage();
	}

	public MedicalDecisionsPage clickEditMedicalPowerofAttorney() {
		CommonFunctions.clickElement(EditMedicalPowerofAttorney);

		return new MedicalDecisionsPage();
	}

	public void DisplayYesIDoNotWantToAppointAMedicalDecisionMaker() {
		CommonFunctions.clickElement(YesIDoNotWantToAppointAMedicalDecisionMaker);
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

	public AboutPage ProgressChangeReviewConfirm() {
		CommonFunctions.clickElement(ProgressAbout);

		return new AboutPage();
	}

	public AddOnsPage ProgressChangeAddOns() {
		CommonFunctions.clickElement(ProgressAddOns);

		return new AddOnsPage();
	}

	public void ValidateLabels() {
		CommonFunctions.elementDisplayed(Label_PersonalDetails_Email);
		CommonFunctions.elementDisplayed(Label_PersonalDetails_Birth);
		CommonFunctions.elementDisplayed(Label_PersonalDetails);
		CommonFunctions.elementDisplayed(Label_PersonalDetails_Fname);
		CommonFunctions.elementDisplayed(Label_PersonalDetails_Mname);
		CommonFunctions.elementDisplayed(Label_PersonalDetails_Occupation);
		CommonFunctions.elementDisplayed(Label_PersonalDetails_PAddess);
		CommonFunctions.elementDisplayed(Label_PersonalDetails_PhoneNo);
		CommonFunctions.elementDisplayed(Label_PersonalDetails_RAddess);
		CommonFunctions.elementDisplayed(Label_PersonalDetails_Sname);
		CommonFunctions.elementDisplayed(Label_PersonalDetails_Title);
		CommonFunctions.elementDisplayed(Label_About_You_Fname);
		CommonFunctions.elementDisplayed(Label_About_You_Mname);
		CommonFunctions.elementDisplayed(Label_About_You_Sname);
		CommonFunctions.elementDisplayed(Label_About_You_Status);
		CommonFunctions.elementDisplayed(Label_About_You_Title);
		CommonFunctions.elementDisplayed(Label_About_You_Years);
		CommonFunctions.elementDisplayed(Label_About_You_Will_With_Partner);
		CommonFunctions.elementDisplayed(Label_Executors_Name);
		CommonFunctions.elementDisplayed(Label_Executors_Relationship);
		CommonFunctions.elementDisplayed(Label_Executors_Wish);

	}

}