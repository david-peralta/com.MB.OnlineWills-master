package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class PaymentPage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//input[contains(@id,'AddPOAButtonSingle')]")
	WebElement AddPOAButton;
	@FindBy(xpath = "//input[contains(@value,'Next')]")
	WebElement btn_Next;

	// ================================================== Initializing the Page Objects ==================================================
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================

	public void clickAddPOAButton() {
		CommonFunctions.clickElement(AddPOAButton);
	}

	public FinancialDecisionsPage clickNextWithPOA() {
		CommonFunctions.clickElement(btn_Next);
		return new FinancialDecisionsPage();
	}

}