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

	@FindBy(xpath = "// *[contains(text(), 'If all of your listed beneficiaries pass away, what would you like us to do with their share?')]")
	WebElement DisasterQuestion;
	@FindBy(xpath = "//input[contains(@id,'OtherInstruction')]")
	WebElement DisasterQuestionField;

	@FindBy(xpath = "// *[contains(text(), 'What do you want us to do with it?')]")
	WebElement BeneficiaryQuestion;
	@FindBy(xpath = "//a[text()='Add Beneficiary']")
	WebElement AddBeneficiary;

	@FindBy(xpath = "NextButton")
	WebElement NextButton;
	@FindBy(xpath = "BackButton")
	WebElement BackButton;

	// ================================================== Initializing the Page Objects ==================================================
	public BeneficiariesPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void ClickYesQuestion1SingleWithChildren() {
		CommonFunctions.clickElement(YesQuestion1SingleWithChildren);
	}

	public void ClickNoQuestion1SingleWithChildren() {
		CommonFunctions.clickElement(NoQuestion1SingleWithChildren);
	}

	public void ClickYesQuestion1() {
		CommonFunctions.clickElement(YesQuestion1);
	}

	public void ClickNoQuestion1() {
		CommonFunctions.clickElement(NoQuestion1);
	}

	public void BeneficiaryQuestionDisplayed() {
		CommonFunctions.elementDisplayed(BeneficiaryQuestion);
		CommonFunctions.elementDisplayed(AddBeneficiary);
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