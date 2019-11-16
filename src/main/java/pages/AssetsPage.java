package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class AssetsPage extends Base {
	// ========================================================= Page Objects ===========================================================
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
	@FindBy(xpath = "// div[contains(@id,'InputsAndLabels')]//following::div//following::div[text()='Required field']")
	WebElement FuneralWishesReq;

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

	@FindBy(xpath = "//input[contains(@id,'RadioButton_RightsYes')]")
	WebElement RightsYes;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_RightsNo')]")
	WebElement RightsNo;
	@FindBy(xpath = "//*[text()='Add Additional Superannuation Fund']")
	WebElement AddSuper;
	@FindBy(xpath = "//input[contains(@id,'Button_SuperAdd')]")
	WebElement SuperSave;
	@FindBy(xpath = "//input[contains(@id,'Button_SuperCancel')]")
	WebElement SuperCancel;

	@FindBy(xpath = "//*[text()='Add Nominated Beneficiary']")
	WebElement AddSuperBenef;
	@FindBy(xpath = "(//*[text()='Edit'])[3]")
	WebElement EditSuperBenef;
	@FindBy(xpath = "(//*[text()='Delete'])[3]")
	WebElement DeleteSuperBenef;
	@FindBy(xpath = "//input[contains(@id,'SuperBenefAdd')]")
	WebElement AddSuperBenefSave;
	@FindBy(xpath = "//input[contains(@id,'SuperBenefCancel')]")
	WebElement AddSuperBenefCancel;

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

	// Asset - Debt
	@FindBy(xpath = "(//input[contains(@id,'RadioButton_DebtNo')]//following::label//following::div[text()='Required field'])[1]")
	WebElement NoQuestion2Required;
	@FindBy(xpath = "//div[contains(@id,'SectionTitle')]//span[text()='Please add debt']")
	WebElement NoQuestion2AddDebt;
	@FindBy(xpath = "//a[contains(@id,'AssetAddDebt')]")
	WebElement AddDebt;
	@FindBy(xpath = "//input[contains(@id,'DebtOwedTo')]")
	WebElement DebtOwedTo;
	@FindBy(xpath = "//input[contains(@id,'DebtApproxValue')]")
	WebElement DebtApproxValue;
	@FindBy(xpath = "(//a[contains(@id,'DebtDelete')])[1]")
	WebElement DebtDelete1;
	@FindBy(xpath = "(//a[contains(@id,'DebtDelete')])[2]")
	WebElement DebtDelete2;
	@FindBy(xpath = "//a[contains(@id,'DebtEdit')]")
	WebElement DebtEdit;
	@FindBy(xpath = "//input[contains(@value,'Save')]")
	WebElement DebtSave;
	@FindBy(xpath = "(//input[contains(@value,'Cancel')])[2]")
	WebElement DebtCancel;

	// buttons
	@FindBy(xpath = "//input[contains(@id,'Button_AssetsNext')]")
	WebElement NextButton;
	@FindBy(xpath = "//input[contains(@id,'Button_AssetsBack')]")
	WebElement BackButton;
	@FindBy(xpath = "//input[contains(@id,'SuperFundName')]")
	WebElement SuperFundName;
	@FindBy(xpath = "//input[contains(@id,'SuperBindingYes')]")
	WebElement BindingYes;
	@FindBy(xpath = "//input[contains(@id,'SuperBindingNo')]")
	WebElement BindingNo;
	@FindBy(xpath = "//input[contains(@id,'SuperBindingUnsure')]")
	WebElement BindingUnsure;

	@FindBy(xpath = "//input[contains(@id,'RadioButton_SuperDeathBenefUnsure')]")
	WebElement SuperDeathBenefUnsure;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_SuperDeathBenefNo')]")
	WebElement SuperDeathBenefNo;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_SuperDeathBenefYes')]")
	WebElement SuperDeathBenefYes;

	@FindBy(xpath = "//select[contains(@id,'BenefTitle')]")
	WebElement BenefTitle;
	@FindBy(xpath = "(//select[contains(@id,'BenefTitle')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement BenefTitleReq;
	@FindBy(xpath = "//input[contains(@id,'BenefFirstName')]")
	WebElement BenefFName;
	@FindBy(xpath = "(//input[contains(@id,'BenefFirstName')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement BenefFNameReq;
	@FindBy(xpath = "//input[contains(@id,'BenefMiddleName')]")
	WebElement BenefMName;
	@FindBy(xpath = "//input[contains(@id,'BenefLastName')]")
	WebElement BenefLName;
	@FindBy(xpath = "(//input[contains(@id,'BenefLastName')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement BenefLNameReq;
	@FindBy(xpath = "//select[contains(@id,'BenefRelationship')]")
	WebElement BenefRelationship;
	@FindBy(xpath = "(//select[contains(@id,'BenefRelationship')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement BenefRelationshipReq;
	@FindBy(xpath = "//input[contains(@id,'NominatedPortion')]")
	WebElement BenefNominatedPortion;
	@FindBy(xpath = "(//input[contains(@id,'NominatedPortion')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement BenefNominatedPortionReq;

	// ================================================== Initializing the Page Objects ==================================================
	public AssetsPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void ClickBindingYes() {
		CommonFunctions.clickElement(BindingYes);
	}

	public void ClickRightsNo() {
		CommonFunctions.clickElement(RightsNo);
	}

	public void ClickRightsYes() {
		CommonFunctions.clickElement(RightsYes);
	}

	public void DisplayedFuneralRequired() {
		CommonFunctions.elementDisplayed(FuneralWishesReq);
	}

	public void DisplayValidationOnMandatoryFieldsForNominatedDeathBenef() {
		CommonFunctions.elementDisplayed(BenefTitleReq);
		CommonFunctions.elementDisplayed(BenefFNameReq);
		CommonFunctions.elementDisplayed(BenefLNameReq);
		CommonFunctions.elementDisplayed(BenefRelationshipReq);
		CommonFunctions.elementDisplayed(BenefNominatedPortionReq);
	}

	public void NominateBeneficiary() {
		CommonFunctions.selectValueFromDropdown(BenefTitle, "Miss");
		CommonFunctions.wait(2000, false);
		CommonFunctions.clearThenEnterElementValue(BenefFName, "Nominate Beneficiary FirstName");
		CommonFunctions.wait(2000, false);
		CommonFunctions.clearThenEnterElementValue(BenefMName, "Nominate Beneficiary MiddleName");
		CommonFunctions.wait(2000, false);
		CommonFunctions.clearThenEnterElementValue(BenefLName, "Nominate Beneficiary LastName");
		CommonFunctions.wait(2000, false);
		CommonFunctions.selectValueFromDropdown(BenefRelationship, "Aunt");
		CommonFunctions.wait(2000, false);
		CommonFunctions.clearThenEnterElementValue(BenefNominatedPortion, "Nominate Portion");
	}

	public void EditNominateBeneficiary() {
		CommonFunctions.selectValueFromDropdown(BenefTitle, "Dr");
		CommonFunctions.wait(2000, false);
		CommonFunctions.clearThenEnterElementValue(BenefFName, "Nominate Beneficiary FirstName Edit");
		CommonFunctions.wait(2000, false);
		CommonFunctions.clearThenEnterElementValue(BenefMName, "Nominate Beneficiary MiddleName Edit");
		CommonFunctions.wait(2000, false);
		CommonFunctions.clearThenEnterElementValue(BenefLName, "Nominate Beneficiary LastName Edit");
		CommonFunctions.wait(2000, false);
		CommonFunctions.selectValueFromDropdown(BenefRelationship, "Sister");
		CommonFunctions.wait(2000, false);
		CommonFunctions.clearThenEnterElementValue(BenefNominatedPortion, "Nominate Portion Edit");
	}

	public void ClickBindingUnsure() {
		CommonFunctions.clickElement(BindingUnsure);
	}

	public void ClickBindingNo() {
		CommonFunctions.clickElement(BindingNo);
	}

	public void SuperDeathBenefSave() {
		CommonFunctions.clickElement(AddSuperBenefSave);
	}

	public void ClickAddSuper() {
		CommonFunctions.clickElement(AddSuper);
	}

	public void ClickAddSuperBenef() {
		CommonFunctions.clickElement(AddSuperBenef);
	}

	public void ClickEditSuperBenef() {
		CommonFunctions.clickElement(EditSuperBenef);
	}

	public void ClickDeleteSuperBenef() {
		CommonFunctions.clickElement(DeleteSuperBenef);
	}

	public void ClickDeathBenefYes() {
		CommonFunctions.clickElement(SuperDeathBenefYes);
	}

	public void ClickDeathBenefNo() {
		CommonFunctions.clickElement(SuperDeathBenefNo);
	}

	public void ClickDeathBenefUnsure() {
		CommonFunctions.clickElement(SuperDeathBenefUnsure);
	}

	public void AddSuperWithDeathBenefUnsure() {
		CommonFunctions.clearThenEnterElementValue(SuperFundName, "Super Unsure");
		CommonFunctions.clickElement(SuperDeathBenefUnsure);
		CommonFunctions.clickElement(SuperSave);
	}

	public void AddSuperWithDeathBenefNo() {
		CommonFunctions.clearThenEnterElementValue(SuperFundName, "Super No");
		CommonFunctions.clickElement(SuperDeathBenefNo);
		CommonFunctions.clickElement(SuperSave);
	}

	public void AddSuperWithDeathBenefYes() {
		CommonFunctions.clearThenEnterElementValue(SuperFundName, "Super Yes");
		CommonFunctions.clickElement(SuperDeathBenefYes);
	}

	public void MandatoryfieldsAddSuper() {
		CommonFunctions.elementDisplayed(SuperFundName.findElement(By.xpath(".//following::span//following::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(SuperDeathBenefUnsure.findElement(By.xpath(".//following::span//following::div[text()='Required field']")));
	}

	public void ClickAddSuperSave() {
		CommonFunctions.clickElement(SuperSave);
	}

	public void ClickAddSuperCancel() {
		CommonFunctions.clickElement(SuperCancel);
	}

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

	public void ClickDeleteDebt1() {
		CommonFunctions.clickElement(DebtDelete1);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
	}

	public void ClickDeleteDebt2() {
		CommonFunctions.clickElement(DebtDelete2);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
	}

	public void ClickCancelDebt() {
		CommonFunctions.clickElement(DebtCancel);
	}

	public void DisplayedAddAsset() {
		CommonFunctions.elementDisplayed(AddAsset);
	}

	public void DisplayedSelectAssetDropdownRequired() {
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.elementDisplayed(SelectAssetDropdownRequired);
	}

	public void clickAddDebt() {
		CommonFunctions.clickElement(AddDebt);
	}

	public void DisplayedAddDebt() {
		CommonFunctions.elementDisplayed(AddDebt);
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

	public void CheckRequiredDebtFields() {
		CommonFunctions.clickElement(DebtSave);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(NoQuestion2Required);
	}

	public void CheckRequiredDebtOwedTo() {
		CommonFunctions.clickElement(DebtSave);
		CommonFunctions.wait(5000, false);
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

	public void FillUpDebtFields() {
		CommonFunctions.enterElementValue(DebtOwedTo, "Sample");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(DebtApproxValue, "100");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(DebtSave);
		CommonFunctions.wait(5000, false);
	}

	public void FillUpDebtFields2() {
		CommonFunctions.enterElementValue(DebtOwedTo, "User");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(DebtApproxValue, "50");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(DebtSave);
		CommonFunctions.wait(5000, false);
	}

	public void UpdateDebtFields() {
		CommonFunctions.clickElement(DebtEdit);
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(DebtOwedTo, "Update");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(DebtApproxValue, "150");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(DebtSave);
		CommonFunctions.wait(5000, false);
	}

	public void UpdateDebtFields2() {
		CommonFunctions.clickElement(DebtEdit);
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(DebtOwedTo, "Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(DebtApproxValue, "200");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickElement(DebtSave);
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