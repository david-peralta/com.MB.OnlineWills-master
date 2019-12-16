package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class PendingSpousePage extends Base {
	// ========================================================== Page Objects ===========================================================

	// Element - Checkbox

	@FindBy(xpath = "//span[contains(@type,'CB_Confirm')]")
	WebElement Question1;

	// Element - Button

	@FindBy(xpath = "//input[contains(@value,'Save a copy for your records')]")
	WebElement btn_SaveRecord;

	// Element - Text

	@FindBy(xpath = "//span[text()='Thank you for providing your information.']")
	WebElement txt_ThankYou;

	@FindBy(xpath = "//span[text()='Once your partner has completed their instructions, we will notify you to progress with the payment.']")
	WebElement txt_spousepending;

	// ================================================== Initializing the Page Objects ===========S=======================================
	public PendingSpousePage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public AssetsPage ClickSaveRecord() {
		CommonFunctions.clickElement(btn_SaveRecord);

		return new AssetsPage();
	}

	public void displayThankYou() {
		CommonFunctions.elementDisplayed(txt_ThankYou);
	}

	public void displayPendingSpouse() {
		CommonFunctions.elementDisplayed(txt_spousepending);
	}

}