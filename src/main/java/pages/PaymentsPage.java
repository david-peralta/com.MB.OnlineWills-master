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
	@FindBy(xpath = "//input[contains(@value,'Proceed')]")
	WebElement btn_proceed;
	@FindBy(xpath = "//input[contains(@value,'Download Costs Disclosure and T&Cs')]")
	WebElement btn_DownloadCostDisclosure;

	@FindBy(xpath = "//div[contains(text(),'$440.00')]//parent::div//parent::div[contains(@class,'all')]")
	WebElement txt_Addons;

	@FindBy(xpath = "//div[contains(text(),'$0.00')]")
	WebElement dsplay_amount;
	@FindBy(xpath = "//span[contains(text(),'$0.00')]")
	WebElement dsplay_total;

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

	public void checkAddonsDisplayed() {
		CommonFunctions.elementDisplayed(txt_Addons);
		CommonFunctions.wait(3000, false);

	}

	public void clickProceedPayment() {
		CommonFunctions.clickElement(btn_proceed);
		CommonFunctions.wait(3000, false);
	}

	public void displaySWLDAmount() {
		CommonFunctions.elementDisplayed(dsplay_amount);
	}

	public void displaySWLDTotal() {
		CommonFunctions.elementDisplayed(dsplay_total);
		CommonFunctions.wait(3000, false);
	}

	public CheckOutPage ClickProceed() {
		CommonFunctions.clickElement(btn_proceed);
		return new CheckOutPage();
	}

	public void clickCostDisclosure() {
		CommonFunctions.clickElement(btn_DownloadCostDisclosure);
		CommonFunctions.wait(3000, false);
	}

}