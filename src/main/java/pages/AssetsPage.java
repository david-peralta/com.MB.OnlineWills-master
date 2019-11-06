package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class AssetsPage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//input[contains(@id,'RadioButton_AssetYes')]")
	WebElement YesQuestion1;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_AssetNo')]")
	WebElement NoQuestion1;

	@FindBy(xpath = "//input[contains(@id,'RadioButton_DebtYes')]")
	WebElement YesQuestion2;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_DebtNo')]")
	WebElement NoQuestion2;

	@FindBy(xpath = "//input[contains(@id,'RadioButton_SuperYes')]")
	WebElement YesQuestion3;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_SuperNo')]")
	WebElement NoQuestion3;

	@FindBy(xpath = "//input[contains(@id,'RadioButton_InsuranceNo')]")
	WebElement YesQuestion4;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_InsuranceNo')]")
	WebElement NoQuestion4;

	@FindBy(xpath = "//input[contains(@id,'RadioButton_TrustYes')]")
	WebElement YesQuestion5;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_TrustNo')]")
	WebElement NoQuestion5;

	@FindBy(xpath = "//input[contains(@id,'RadioButton_SelfYes')]")
	WebElement YesQuestion6;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_SelfNo')]")
	WebElement NoQuestion6;

	@FindBy(xpath = "//input[contains(@id,'RadioButton_OwnBusinessYes')]")
	WebElement YesQuestion7;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_OwnBusinessNo')]")
	WebElement NoQuestion7;

	@FindBy(xpath = "(//input[contains(@id,'RadioButton_AssetNo')]//following::label//following::div[text()='Required field'])[1]")
	WebElement NoQuestion1Required;
	@FindBy(xpath = "//a[contains(@id,'AssetAddAsset')]")
	WebElement AddAsset;
	@FindBy(xpath = "//a[text()='Edit']")
	WebElement EditAsset;
	@FindBy(xpath = "//a[text()='Delete']")
	WebElement DeleteAsset;
	@FindBy(xpath = "//select[contains(@id,'DropDown_Asset')]")
	WebElement SelectAssetDropdown;
	@FindBy(xpath = "(//select[contains(@id,'DropDown_Asset')]//following::a//following::span//following::span)[1]")
	WebElement SelectAssetDropdownRequired;
	@FindBy(xpath = "//input[contains(@id,'Button_AssetListCancel')]")
	WebElement CancelAddAsset;
	@FindBy(xpath = "//input[contains(@id,'Button_AssetListSave')]")
	WebElement SaveAddAsset;

	// Property
	@FindBy(xpath = "//select[contains(@id,'DropDown_Ownership')]")
	WebElement PropertyOwnership;
	@FindBy(xpath = "(//select[contains(@id,'DropDown_Ownership')]//following::span//following::span[text()='Required field'])[1]")
	WebElement PropertyOwnershipReq;
	@FindBy(xpath = "//input[contains(@id,'Input_Value')]")
	WebElement PropertyApproxValue;
	@FindBy(xpath = "//select[contains(@id,'DropDown_Country')]")
	WebElement PropertyCountry;
	@FindBy(xpath = "//input[contains(@id,'Input_Address1')]")
	WebElement PropertyAddress1;
	@FindBy(xpath = "//input[contains(@id,'Input_Address2')]")
	WebElement PropertyAddress2;
	@FindBy(xpath = "(//input[contains(@id,'Input_Address1')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement PropertyAddress1Req;
	@FindBy(xpath = "//input[contains(@id,'Input_Suburb')]")
	WebElement PropertySuburb;
	@FindBy(xpath = "(//input[contains(@id,'Input_Suburb')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement PropertySuburbReq;
	@FindBy(xpath = "//select[contains(@id,'DropDown_State')]")
	WebElement PropertyState;
	@FindBy(xpath = "(//select[contains(@id,'DropDown_State')]//following::span//following::span[text()='Required field'])[1]")
	WebElement PropertyStateReq;
	@FindBy(xpath = "//input[contains(@id,'Input_PostCode')]")
	WebElement PropertyPostCode;
	@FindBy(xpath = "(//input[contains(@id,'Input_PostCode')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement PropertyPostCodeReq;
	@FindBy(xpath = "//input[contains(@id,'Input_AssetDetails')]")
	WebElement BankAccountFinancialInstitution;
	@FindBy(xpath = "(//input[contains(@id,'Input_AssetDetails')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement BankAccountFinancialInstitutionReq;
	// buttons
	@FindBy(xpath = "//input[contains(@id,'Button_AssetsNext')]")
	WebElement NextButton;
	@FindBy(xpath = "//input[contains(@id,'Button_AssetsBack')]")
	WebElement BackButton;

	// ================================================== Initializing the Page Objects ==================================================
	public AssetsPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void ClickYesQuestion1() {
		CommonFunctions.clickElement(YesQuestion1);
	}

	public void ClickNoQuestion2() {
		CommonFunctions.clickElement(NoQuestion2);
	}

	public void ClickYesQuestion2() {
		CommonFunctions.clickElement(YesQuestion2);
	}

	public void ClickNoQuestion3() {
		CommonFunctions.clickElement(NoQuestion3);
	}

	public void ClickYesQuestion3() {
		CommonFunctions.clickElement(YesQuestion3);
	}

	public void ClickNoQuestion4() {
		CommonFunctions.clickElement(NoQuestion4);
	}

	public void ClickYesQuestion4() {
		CommonFunctions.clickElement(YesQuestion4);
	}

	public void ClickNoQuestion5() {
		CommonFunctions.clickElement(NoQuestion5);
	}

	public void ClickYesQuestion5() {
		CommonFunctions.clickElement(YesQuestion5);
	}

	public void ClickNoQuestion6() {
		CommonFunctions.clickElement(NoQuestion6);
	}

	public void ClickYesQuestion6() {
		CommonFunctions.clickElement(YesQuestion6);
	}

	public void ClickNoQuestion7() {
		CommonFunctions.clickElement(NoQuestion7);
	}

	public void ClickYesQuestion7() {
		CommonFunctions.clickElement(YesQuestion7);
	}

	public void ClickNoQuestion1() {
		CommonFunctions.clickElement(NoQuestion1);
	}

	public void DisplayedNoQuestion1Required() {
		CommonFunctions.elementDisplayed(NoQuestion1Required);
	}

	public void CheckSelectAssetDropdownValues() {
		String[] Values = { "Select one", "Property", "Bank Account", "Vehicle", "Shares", "Other" };
		CommonFunctions.checkDropdownOptionsAvailable(SelectAssetDropdown, Values);
	}

	public void CheckSelectAssetDropdownDefaultValue() {
		CommonFunctions.checkSingleSelectDropdownSelectedOption(SelectAssetDropdown, "Select one");
	}

	public void ClickSaveAsset() {
		CommonFunctions.clickElement(SaveAddAsset);
	}

	public void ClickCancelAsset() {
		CommonFunctions.clickElement(CancelAddAsset);
	}

	public void ClickAddAsset() {
		CommonFunctions.clickElement(AddAsset);
	}

	public void ClickEditAsset() {
		CommonFunctions.clickElement(EditAsset);
	}

	public void ClickDeleteAsset() {
		CommonFunctions.clickElement(DeleteAsset);
	}

	public void DisplayedAddAsset() {
		CommonFunctions.elementDisplayed(AddAsset);
	}

	public void DisplayedSelectAssetDropdownRequired() {
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.elementDisplayed(SelectAssetDropdownRequired);
	}

	public void CheckRequiredPropertyFields() {
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(PropertyOwnershipReq);
		CommonFunctions.elementDisplayed(PropertyAddress1Req);
		CommonFunctions.elementDisplayed(PropertySuburbReq);
		CommonFunctions.elementDisplayed(PropertyStateReq);
		CommonFunctions.elementDisplayed(PropertyPostCodeReq);
	}

	public void CheckRequiredBankAccountFields() {
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(PropertyOwnershipReq);
		CommonFunctions.elementDisplayed(BankAccountFinancialInstitutionReq);
	}

	public void CheckRequiredVehicleFields() {
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(PropertyOwnershipReq);
		CommonFunctions.elementDisplayed(BankAccountFinancialInstitutionReq);
	}

	public void CheckRequiredSharesFields() {
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(PropertyOwnershipReq);
		CommonFunctions.elementDisplayed(BankAccountFinancialInstitutionReq);
	}

	public void CheckRequiredOtherFields() {
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(BankAccountFinancialInstitutionReq);
	}

	public void FillUpAllBankAccountFields() {
		CommonFunctions.selectValueFromDropdown(PropertyOwnership, "Sole");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(PropertyApproxValue, "1111");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(BankAccountFinancialInstitution, "This is a test Financial Institution");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpAllVehicleFields() {
		CommonFunctions.selectValueFromDropdown(PropertyOwnership, "Sole");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(PropertyApproxValue, "1111");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(BankAccountFinancialInstitution, "This is a test Vehicle Year, make and model");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpAllSharesFields() {
		CommonFunctions.selectValueFromDropdown(PropertyOwnership, "Sole");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(PropertyApproxValue, "1111");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(BankAccountFinancialInstitution, "This is a test Shares");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpAllOtherFields() {
		CommonFunctions.enterElementValue(BankAccountFinancialInstitution, "This is a test Other Asset input");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.wait(5000, false);
	}

	public void EditFillUpAllOtherFields() {
		CommonFunctions.enterElementValue(BankAccountFinancialInstitution, " (EDITED)");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpAllPropertyFields() {
		CommonFunctions.selectValueFromDropdown(PropertyOwnership, "Sole");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(PropertyApproxValue, "1111");
		CommonFunctions.wait(5000, false);
		CommonFunctions.checkSingleSelectDropdownSelectedOption(PropertyCountry, "AUSTRALIA");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(PropertyCountry, "AUSTRALIA");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(PropertyAddress1, "Heaven");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(PropertyAddress2, "City");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(PropertySuburb, "Suburb");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(PropertyState, "VIC");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(PropertyPostCode, "6666");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.wait(5000, false);
	}

	public void SelectAssetonDropdown(String value) {
		CommonFunctions.selectValueFromDropdown(SelectAssetDropdown, value);
	}

	public BeneficiariesPage ClickNextButton() {
		CommonFunctions.clickElement(NextButton);

		return new BeneficiariesPage();
	}

	public AboutPage ClickBackButton() {
		CommonFunctions.clickElement(BackButton);
		return new AboutPage();
	}

}