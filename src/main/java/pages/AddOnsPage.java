package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class AddOnsPage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//input[@value = 'Next']")
	WebElement button_Next;

	// ================================================== Initializing the Page Objects ==================================================
	public AddOnsPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public PaymentsPage clickNextButton() {
		CommonFunctions.clickElement(button_Next);

		return new PaymentsPage();
	}
}