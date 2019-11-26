package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class LoginPage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//input[contains(@value, 'Log In')]")
	WebElement button_Login;

	@FindBy(xpath = "//*[text() = 'Forgotten Password']")
	WebElement ForgottenPasswordLink;

	@FindBy(xpath = "//*[contains(@id,'ButtonResetPassword')]")
	WebElement ForgottenPasswordSubmitBtn;

	@FindBy(xpath = "//input[contains(@id,'User_email')]")
	WebElement ForgottenPasswordEmailField;

	@FindBy(xpath = "//*[text() = 'Create an Account']")
	WebElement RegisterLink;

	@FindBy(xpath = "//input[contains(@id, 'UserNameInput')]")
	WebElement input_Email;

	@FindBy(xpath = "//input[contains(@id, 'UserNameInput')]//following-sibling::span[text()='Required field']")
	WebElement RequiredFieldOninput_Email;

	@FindBy(xpath = "//input[contains(@id, 'PasswordInput')]//following-sibling::span[text()='Required field']")
	WebElement RequiredFieldOninput_Password;

	@FindBy(xpath = "//input[contains(@id, 'PasswordInput')]")
	WebElement input_Password;

	@FindBy(xpath = "//input[contains(@id, 'UsernameInput')]")
	WebElement input_EmailAdmin;
	@FindBy(xpath = "//input[contains(@id, 'PasswordInput')]")
	WebElement input_PasswordAdmin;

	// ================================================== Initializing the Page Objects ==================================================
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void clickForgottenPasswordLink() {
		CommonFunctions.clickElement(ForgottenPasswordLink);
	}

	public RegistrationPage clickForgottenRegisterLink() {
		CommonFunctions.clickElement(RegisterLink);
		return new RegistrationPage();
	}

	public void clickForgottenPasswordSubmitBtn() {
		CommonFunctions.clickElement(ForgottenPasswordSubmitBtn);
	}

	public void setForgottenPasswordEmailField(String VerifyEmail) {
		CommonFunctions.clearThenEnterElementValue(ForgottenPasswordEmailField, VerifyEmail);
	}

	public void displayedForgottenPasswordUserEmail() {
		CommonFunctions.elementDisplayed(ForgottenPasswordEmailField);
	}

	public void displayedForgottenPasswordSubmitBtn() {
		CommonFunctions.elementDisplayed(ForgottenPasswordSubmitBtn);
	}

	public void containsValueEmailInput(String expectedValue) {
		CommonFunctions.elementAttributeContainsValue(input_Email, "value", expectedValue);
	}

	public void PasswordValueNull() {
		String expectedValue = "";
		CommonFunctions.elementAttributeContainsValue(input_Email, "value", expectedValue);
	}

	public void displayedRequiredFieldOninput_Email() {
		CommonFunctions.elementDisplayed(RequiredFieldOninput_Email);
	}

	public void displayedRequiredFieldOninput_Password() {
		CommonFunctions.elementDisplayed(RequiredFieldOninput_Password);
	}

	public void displayedForgottenPasswordLink() {
		CommonFunctions.elementDisplayed(ForgottenPasswordLink);
	}

	public void displayedRegisterLink() {
		CommonFunctions.elementDisplayed(RegisterLink);
	}

	public void displayedPassInput() {
		CommonFunctions.elementDisplayed(input_Password);
	}

	public void displayedButtonLogIn() {
		CommonFunctions.elementDisplayed(button_Login);
	}

	public void displayedEmailInput() {
		CommonFunctions.elementDisplayed(input_Email);
	}

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

	public DashboardPage clickLoginDashboard() {
		CommonFunctions.clickElement(button_Login);
		return new DashboardPage();
	}

	public void setEmailInputAdmin(String password) {
		CommonFunctions.clearThenEnterElementValue(input_EmailAdmin, password);
	}

}