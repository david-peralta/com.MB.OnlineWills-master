package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class LoginPage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//input[contains(@id, 'LoginButton')]")
	WebElement button_Login;

	@FindBy(xpath = "//input[contains(@id, 'UserNameInput')]")
	WebElement input_Email;

	@FindBy(xpath = "//input[contains(@id, 'PasswordInput')]")
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
		CommonFunctions.clickElement(button_Login);

		return new HomePage();
	}
}