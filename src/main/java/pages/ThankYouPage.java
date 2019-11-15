package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class ThankYouPage extends Base {
	// ========================================================== Page Objects ===========================================================

	// Element - Checkbox

	@FindBy(xpath = "//span[contains(@type,'CB_Confirm')]")
	WebElement Question1;

	// Element - Button

	@FindBy(xpath = "//input[contains(@value,'Save a copy for your records')]")
	WebElement btn_SaveRecord;

	// Element - Text

	@FindBy(xpath = "//span[text()='Thank you']")
	WebElement txt_ThankYou;

	@FindBy(xpath = "//span[text()='We will call you within 72 hours']")
	WebElement txt_72hrs;

	// ================================================== Initializing the Page Objects ===========S=======================================
	public ThankYouPage() {
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

	public void displayCall72Hrs() {
		CommonFunctions.elementDisplayed(txt_72hrs);
	}

}