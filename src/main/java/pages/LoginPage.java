package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class LoginPage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//input[@value = 'Log In']")
	WebElement button_LogIn;

	@FindBy(xpath = "//input[@id = 'email']")
	WebElement input_Email;

	@FindBy(xpath = "//input[@id = 'pass']")
	WebElement input_Password;

	// ================================================== Initializing the Page Objects ==================================================
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void setEmailInput(String email) {
		CommonFunctions.clearThenEnterElementValue(input_Email, email);
	}

	public void setPasswordInput(String password) {
		CommonFunctions.clearThenEnterElementValue(input_Password, password);
	}

	public HomePage clickLoginButton() {
		CommonFunctions.clickElement(button_LogIn);

		return new HomePage();
	}
}