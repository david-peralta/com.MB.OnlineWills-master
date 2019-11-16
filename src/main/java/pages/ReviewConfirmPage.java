package pages;

import org.openqa.selenium.By;
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

	@FindBy(xpath = "//input[contains(@value,'Next')]")
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
	@FindBy(xpath = "(//span[contains(text(),'Have you been diagnosed with any physical, cognitive or mental impairments or disorders that may impact your ability to draft or sign your Will?')]//following::div[text()='Yes'])[1]")
	WebElement PersonalInfoDiagnosedQuestionWithYes;
	@FindBy(xpath = "(//span[contains(text(),'Have you been diagnosed with any physical, cognitive or mental impairments or disorders that may impact your ability to draft or sign your Will?')]//following::div[text()='No'])[1]")
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
	WebElement EditPersonalInfoSummary;
	@FindBy(xpath = "(//input[@value='Edit'])[2]")
	WebElement EditAboutYouSummary;
	@FindBy(xpath = "(//input[@value='Edit'])[3]")
	WebElement EditAssetsSummary;
	@FindBy(xpath = "(//input[@value='Edit'])[4]")
	WebElement EditBeneficiariesSummary;
	@FindBy(xpath = "(//input[@value='Edit'])[5]")
	WebElement EditExecutorsSummary;

	// ================================================== Initializing the Page Objects ==================================================
	public ReviewConfirmPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public PaymentsPage clickNextPaymentButton() {
		CommonFunctions.clickElement(btn_Next);

		return new PaymentsPage();
	}

	public AddOnsPage clickNextAddOnsButton() {
		CommonFunctions.clickElement(btn_Next);

		return new AddOnsPage();
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
		CommonFunctions.textDisplayedInPage("Personal Info");
		CommonFunctions.textDisplayedInPage("About You");
		CommonFunctions.textDisplayedInPage("Assets");
		CommonFunctions.textDisplayedInPage("Beneficiaries");
		// CommonFunctions.textDisplayedInPage("Executors");
	}

	public void validatePersonalDetails() {
		CommonFunctions.scrollToBottomOfPage();
		CommonFunctions.wait(2500, false);
		CommonFunctions.textDisplayedInPage("Personal Info");
		CommonFunctions.textDisplayedInPage("Title");
		CommonFunctions.textDisplayedInPage("First name");
		CommonFunctions.textDisplayedInPage("Middle name");
		CommonFunctions.textDisplayedInPage("Family name");
		CommonFunctions.textDisplayedInPage("Residential address");
		CommonFunctions.textDisplayedInPage("Postal address");
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
}