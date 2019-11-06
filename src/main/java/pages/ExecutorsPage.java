package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class ExecutorsPage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//input[contains(@id,'FutureChildren_True')]")
	WebElement YesQuestion1;
	@FindBy(xpath = "//input[contains(@id,'FutureChildren_False')]")
	WebElement NoQuestion1;

	@FindBy(xpath = "NextButton")
	WebElement NextButton;
	@FindBy(xpath = "BackButton")
	WebElement BackButton;

	// ================================================== Initializing the Page Objects ==================================================
	public ExecutorsPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void ClickYesQuestion1() {
		CommonFunctions.clickElement(YesQuestion1);
	}

	public void ClickNoQuestion1() {
		CommonFunctions.clickElement(NoQuestion1);
	}

	public ExecutorsPage ClickNextButton() {
		CommonFunctions.clickElement(NextButton);

		return new ExecutorsPage();
	}

}