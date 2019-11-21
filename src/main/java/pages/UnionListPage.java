package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;


public class UnionListPage extends Base {
	// ========================================================= Page Objects ===========================================================
	//Button
	@FindBy(xpath="//input[@value='Add Union']")
	WebElement btn_AddUnion;
	@FindBy(xpath="//div[contains( @id,'Column1')]//following::input[@value='Cancel']")
	WebElement btn_Cancel;
	@FindBy(xpath="//div[contains( @id,'Column1')]//following::input[@value='Save']")
	WebElement btn_Save;
	@FindBy(xpath="//table[contains(@id, 'UnionTable')]//tr//td[text() = 'AlphaNumeric1']//parent::tr//span[contains(@class, 'edit')]//parent::a")
	WebElement btn_Edit;
	@FindBy(xpath="//table[contains(@id, 'UnionTable')]//tr//td[text() = 'AlphaNumeric01']//parent::tr//span[contains(@class, 'edit')]//parent::a")
	WebElement btn_Edit_1;
	@FindBy(xpath="//table[contains(@id, 'UnionTable')]//tr//td[text() = 'AlphaNumeric01']//parent::tr//span[contains(@class, 'trash')]//parent::a")
	WebElement btn_Delete;
	
	
	
	
	//Field
	@FindBy(xpath="//input[contains(@id,'Union_Name')]")
	WebElement field_UnionName;
	@FindBy(xpath="//input[contains(@id,'Union_MinLength')]")
	WebElement field_UnionMinLength;
	@FindBy(xpath="//input[contains(@id,'Union_MaxLength')]")
	WebElement field_UnionMaxLength;
	@FindBy(xpath="//input[contains(@id,'Union_AlphaLength')]")
	WebElement field_AlphaLength;
	
	
	//Select
	@FindBy(xpath="//select[contains(@id,'Union_Stateid')]")
	WebElement select_UnionState;
	@FindBy(xpath="//select[contains(@id,'Union_StringType')]")
	WebElement select_UnionStringType;
	@FindBy(xpath="//select[contains(@id,'Union_AlphaLocation')]")
	WebElement select_AlphaLocation;
	
	
	//Checkbox
	@FindBy(xpath="//input[contains( @id,'HasValidationRuleChk')]")
	WebElement chk_AddRule;
	
	//Validation
	@FindBy(xpath="//span[contains(@id,'Union_Name')]")
	WebElement alert_UnionName;
	@FindBy(xpath="//span[contains(@id,'Union_Stateid')]")
	WebElement alert_UnionState;
	@FindBy(xpath="//span[contains(@id,'Union_MinLength')]")
	WebElement alert_UnionMinLength;
	@FindBy(xpath="//span[contains(@id,'Union_MaxLength')]")
	WebElement alert_UnionMaxLength;
	@FindBy(xpath="//span[contains(@id,'Union_StringType')]")
	WebElement alert_UnionStringType;	
	@FindBy(xpath="//span[contains(@id,'Union_AlphaLocation')]")
	WebElement alert_UnionAlphaLocation;	
	
	//Table Content
	@FindBy(xpath="//table[contains(@id, 'UnionTable')]//tr//td[text() = 'AlphaNumeric1']")
	WebElement display_AlphaNumeric1;
	
	
	
	
	

	// ================================================== Initializing the Page Objects ==================================================
	public UnionListPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================

	public void clickAddUnion() {
		CommonFunctions.clickElement(btn_AddUnion);
		CommonFunctions.wait(5000, false);
	}
	public void clickSaveUnion() {
		CommonFunctions.clickElement(btn_Save);
		CommonFunctions.wait(5000, false);
	}
	public void clickCancelUnion() {
		CommonFunctions.clickElement(btn_Cancel);
		CommonFunctions.wait(5000, false);
	}
	public void checkAddRule() {
		CommonFunctions.clickElement(chk_AddRule);
		CommonFunctions.wait(5000, false);
	}
	
	//Alpha
	public void fillUpUnionDetails_alpha() {
		CommonFunctions.switchFrameByXPath("//*[text()='Add Union']");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionName, "Alpha1");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(select_UnionState, "ACT");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionMinLength, "1");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionMaxLength, "10");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(select_UnionStringType, "Alpha");
		CommonFunctions.wait(5000, false);
	}
	
	//Numeric
	public void fillUpUnionDetails_numeric() {
		CommonFunctions.switchFrameByXPath("//*[text()='Add Union']");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionName, "Numeric1");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(select_UnionState, "ACT");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionMinLength, "1");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionMaxLength, "10");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(select_UnionStringType, "Numeric");
		CommonFunctions.wait(5000, false);
	}
	
	//AlphaNumeric
	public void fillUpUnionDetails_numeric_alphanumeric() {
		CommonFunctions.switchFrameByXPath("//*[text()='Add Union']");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionName, "AlphaNumeric1");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(select_UnionState, "ACT");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionMinLength, "1");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionMaxLength, "10");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(select_UnionStringType, "AlphaNumeric");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(select_AlphaLocation, "Prefix");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_AlphaLength, "3");
		CommonFunctions.wait(5000, false);
	}
	
	//SampleUnion for Min length > Max length
		public void fillUpUnionDetails_SampleUnion1() {
			CommonFunctions.switchFrameByXPath("//*[text()='Add Union']");
			CommonFunctions.wait(5000, false);
			CommonFunctions.clearThenEnterElementValue(field_UnionName, "SampleUnion");
			CommonFunctions.wait(5000, false);
			CommonFunctions.selectValueFromDropdown(select_UnionState, "ACT");
			CommonFunctions.wait(5000, false);
			CommonFunctions.clearThenEnterElementValue(field_UnionMinLength, "10");
			CommonFunctions.wait(5000, false);
			CommonFunctions.clearThenEnterElementValue(field_UnionMaxLength, "5");
			CommonFunctions.wait(5000, false);
			CommonFunctions.selectValueFromDropdown(select_UnionStringType, "AlphaNumeric");
			CommonFunctions.wait(5000, false);
			CommonFunctions.selectValueFromDropdown(select_AlphaLocation, "Prefix");
			CommonFunctions.wait(5000, false);
			CommonFunctions.clearThenEnterElementValue(field_AlphaLength, "3");
			CommonFunctions.wait(5000, false);
		}
	//SampleUnion for Min length is less than zero
		public void fillUpUnionDetails_SampleUnion2() {
			CommonFunctions.clearThenEnterElementValue(field_UnionMinLength, "-1");
			CommonFunctions.wait(5000, false);
		}
	//SampleUnion for alpha length equal to max length
		public void fillUpUnionDetails_SampleUnion3() {
			CommonFunctions.clearThenEnterElementValue(field_UnionMinLength, "1");
			CommonFunctions.wait(5000, false);
			CommonFunctions.clearThenEnterElementValue(field_AlphaLength, "5");
			CommonFunctions.wait(5000, false);
		}
	//SampleUnion for alpha length greater than max length
		public void fillUpUnionDetails_SampleUnion4() {
			CommonFunctions.clearThenEnterElementValue(field_AlphaLength, "10");
			CommonFunctions.wait(5000, false);
		}
	//SampleUnion for alpha length cannot be equal to zero
		public void fillUpUnionDetails_SampleUnion5() {
			CommonFunctions.clearThenEnterElementValue(field_AlphaLength, "0");
			CommonFunctions.wait(5000, false);
		}
	//SampleUnion for alpha length cannot be less than to zero
		public void fillUpUnionDetails_SampleUnion6() {
			CommonFunctions.clearThenEnterElementValue(field_AlphaLength, "-1");
			CommonFunctions.wait(5000, false);
		}
	//SampleUnion for alpha length cannot be less than to zero
		public void fillUpUnionDetails_SampleUnion7() {
			CommonFunctions.clearThenEnterElementValue(field_UnionMaxLength, "99");
			CommonFunctions.wait(5000, false);
			CommonFunctions.clearThenEnterElementValue(field_AlphaLength, "1");
			CommonFunctions.wait(5000, false);
		}
	
	//Validation_Display
	public void alertMessageDisplay() {
		CommonFunctions.elementDisplayed(alert_UnionName);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(alert_UnionState);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(alert_UnionMinLength);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(alert_UnionMaxLength);
		CommonFunctions.wait(5000, false);
		CommonFunctions.elementDisplayed(alert_UnionStringType);
		CommonFunctions.wait(5000, false);
		
	}
	public void selectAlphanumericStringType() {
		CommonFunctions.selectValueFromDropdown(select_UnionStringType, "AlphaNumeric");
		CommonFunctions.wait(5000, false);
	}
	public void alertMessageDisplay_AlphaLocation() {
		CommonFunctions.elementDisplayed(alert_UnionAlphaLocation);
		CommonFunctions.wait(5000, false);
	}
	public void clickEditButton() {
		CommonFunctions.clickElement(btn_Edit);
		CommonFunctions.wait(5000, false);
	}
	public void clickEditButton1() {
		CommonFunctions.clickElement(btn_Edit_1);
		CommonFunctions.wait(5000, false);
	}
	//Edit-Fillup Union
	public void fillUpEditUnionDetails_numeric_alphanumeric() {
		CommonFunctions.switchFrameByXPath("//*[text()='Add Union']");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionName, "AlphaNumeric01");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(select_UnionState, "VIC");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionMinLength, "2");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionMaxLength, "11");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(select_UnionStringType, "Numeric");
		CommonFunctions.wait(5000, false);
//		CommonFunctions.selectValueFromDropdown(select_AlphaLocation, "Prefix");
//		CommonFunctions.wait(5000, false);
//		CommonFunctions.clearThenEnterElementValue(field_AlphaLength, "3");
//		CommonFunctions.wait(5000, false);
	}
	public void clickDeleteButton() {
		CommonFunctions.clickElement(btn_Delete);
	}
	public void displayDeleteAlertMessage() {
		CommonFunctions.checkAlertMessageIsDisplayed("Are you sure you want to delete this Union from the rule engine?");
		CommonFunctions.wait(5000, false);
	}
	
	

	
	
}