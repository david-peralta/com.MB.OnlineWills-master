package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class PaymentsPage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//input[contains(@id,'AddPOAButtonSingle')]")
	WebElement AddPOAButton;
	@FindBy(xpath = "//input[contains(@value,'Next')]")
	WebElement btn_Next;
	@FindBy(xpath = "//input[contains(@value,'Back')]")
	WebElement btn_back;
	@FindBy(xpath = "//input[contains(@value,'Pay Now')]")
	WebElement btn_paynow;

	// ================================================== Initializing the Page Objects ==================================================
	public PaymentsPage() {
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
	public ReviewConfirmPage clickBack() {
		CommonFunctions.clickElement(btn_back);
		return new ReviewConfirmPage();
	}

	public CheckOutPage clickPayNow() {
		CommonFunctions.clickElement(btn_paynow);
		return new CheckOutPage();
	}


}