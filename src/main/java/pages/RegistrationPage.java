package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class RegistrationPage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//input[contains(@id,'FirstNameField')]")
	WebElement FirstNameField;
	@FindBy(xpath = "//input[contains(@id,'FamilyNameField')]")
	WebElement FamilyNameField;
	@FindBy(xpath = "//input[contains(@id,'EmailField')]")
	WebElement EmailField;
	@FindBy(xpath = "//input[contains(@id,'PasswordField')]")
	WebElement PasswordField;
	@FindBy(xpath = "//input[contains(@id,'ConfirmPasswordField')]")
	WebElement ConfirmPasswordField;
	@FindBy(xpath = "//input[contains(@id,'CBPrivacy1')]")
	WebElement PrivacyCheckbox;
	@FindBy(xpath = "//select[contains(@id,'StateDropdown')]")
	WebElement StateDropdown;
	@FindBy(xpath = "//select[contains(@id,'SourceDropdown')]")
	WebElement SourceDropdown;
	@FindBy(xpath = "//span[text()='Privacy Policy']")
	WebElement PrivacyPolicyLink;
	@FindBy(xpath = "//input[@value='Create Account']")
	WebElement CreateAccountButton;
	@FindBy(xpath = "//input[contains(@id,'DescriptionField')]")
	WebElement DescriptionField;
	@FindBy(xpath = "//span[text()='Back to Login']")
	WebElement BacktoLogin;
	@FindBy(xpath = "//span[@class='fa fa-fw fa-info-circle']")
	WebElement PasswordPolicyToolTip;

	// RequiredFields ===========================================================
	@FindBy(xpath = "//input[contains(@id, 'FirstNameField')]//following-sibling::span[text()='Required field']")
	WebElement RequiredFirstNameField;
	@FindBy(xpath = "//input[contains(@id, 'FamilyNameField')]//following-sibling::span[text()='Required field']")
	WebElement RequiredFamilyNameField;
	@FindBy(xpath = "//input[contains(@id, 'EmailField')]//following-sibling::span[text()='Required field']")
	WebElement RequiredEmailField;
	@FindBy(xpath = "//input[contains(@id, 'EmailField')]//following-sibling::span[text()='Looks like this email is not valid. Please try again.']")
	WebElement InvalidEmailField;
	@FindBy(xpath = "//input[contains(@id, 'EmailField')]//following-sibling::span[text()='Email address already registered.  Try another']")
	WebElement RegisteredEmailField;
	@FindBy(xpath = "//input[contains(@id, 'PasswordField')]//following-sibling::span[text()='Required field']")
	WebElement RequiredPasswordField;
	@FindBy(xpath = "//input[contains(@id, 'PasswordField')]//following-sibling::span[text()='Password entered does not meet our password policy. Please try again.']")
	WebElement InvalidPasswordField;

	@FindBy(xpath = "//input[contains(@id, 'ConfirmPasswordField')]//following-sibling::span[text()='Passwords do not match, please try again.']")
	WebElement InvalidConfirmPasswordField;

	@FindBy(xpath = "//input[contains(@id, 'ConfirmPasswordField')]//following-sibling::span[text()='Required field']")
	WebElement RequiredConfirmPasswordField;
	@FindBy(xpath = "//select[contains(@id,'StateDropdown')]//following-sibling::span[text()='Required field']")
	WebElement RequiredStateDropdown;
	@FindBy(xpath = "//select[contains(@id,'SourceDropdown')]//following-sibling::span[text()='Required field']")
	WebElement RequiredSourceDropdown;
	@FindBy(xpath = "//input[contains(@id, 'DescriptionField')]//following-sibling::span[text()='Required field']")
	WebElement RequiredDescriptionField;
	// @FindBy(xpath = "//input[contains(@id,'CBPrivacy')]//following-sibling::span[contains(text(),'You must agree to the ')]")
	// WebElement RequiredPrivacyCheckbox;

	// ---
	@FindBy(xpath = "//div[@class = 'balloon-content' and contains(., 'Be a minimum password length: 8 Characters') and contains(., 'Contain characters from three of the following four categories:') and contains(., 'English uppercase characters (A through Z)') and contains(., 'English lowercase characters (a through z)') and contains(., 'Base 10 digits (0 through 9)')and contains(., 'Non-alphabetic characters (for example, !, $, #, %)')]")
	WebElement ToolTipContent1;
	@FindBy(xpath = "//div[@class = 'tool-tex' and contains(., 'Must include an uppercase character')]")
	WebElement ToolTipContent2;
	@FindBy(xpath = "//div[@class = 'tool-tex' and contains(., 'Must include an lowercase character')]")
	WebElement ToolTipContent3;
	@FindBy(xpath = "//div[@class = 'tool-tex' and contains(., 'Must include a number')]")
	WebElement ToolTipContent4;
	@FindBy(xpath = "//div[@class = 'tool-tex' and contains(., 'Must include a special character')]")
	WebElement ToolTipContent5;

	// Privacy Requirements
	@FindBy(xpath = "//span[text()='You must agree to the MyLife WillsTM Terms & Conditions to complete registration.']")
	WebElement required_TermsCondition;
	@FindBy(xpath = "//span[text()='You must agree to the Collection Statement and Privacy Policy to complete registration.']")
	WebElement required_CollectionPolicy;

	// Checkbox
	@FindBy(xpath = "//input[contains(@id,'CBPrivacy2')]")
	WebElement RequiredPrivacyCheckbox2;

	// Links
	@FindBy(xpath = "//*[contains(text(),'Terms and Conditions')]")
	WebElement Link_TermsConditions;
	@FindBy(xpath = "//*[contains(text(),'Collection Statement')]")
	WebElement Link_CollectionStatement;
	@FindBy(xpath = "//*[contains(text(),'Privacy Policy')]")
	WebElement Link_PrivacyPolicy;

	// ================================================== Initializing the Page Objects ==================================================
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void CheckToolTipContent1() {
		CommonFunctions.elementDisplayed(ToolTipContent1);
	}

	public void CheckToolTipContent2() {
		CommonFunctions.elementDisplayed(ToolTipContent2);
	}

	public void CheckToolTipContent3() {
		CommonFunctions.elementDisplayed(ToolTipContent3);
	}

	public void CheckToolTipContent4() {
		CommonFunctions.elementDisplayed(ToolTipContent4);
	}

	public void CheckToolTipContent5() {
		CommonFunctions.elementDisplayed(ToolTipContent5);
	}

	public void clickPrivacyCheckbox() {
		CommonFunctions.clickElement(PrivacyCheckbox);
	}

	public void clickCreateAccountButton() {
		CommonFunctions.clickElement(CreateAccountButton);
	}

	public void clickPrivacyLink() {
		CommonFunctions.clickElement(PrivacyPolicyLink);
	}

	public void displayedFirstNameField() {
		CommonFunctions.elementDisplayed(FirstNameField);
	}

	public void displayedFamilyNameField() {
		CommonFunctions.elementDisplayed(FamilyNameField);
	}

	public void displayedEmailField() {
		CommonFunctions.elementDisplayed(EmailField);
	}

	public void displayedPasswordField() {
		CommonFunctions.elementDisplayed(PasswordField);
	}

	public void displayedConfirmPasswordField() {
		CommonFunctions.elementDisplayed(ConfirmPasswordField);
	}

	public void displayedPrivacyCheckbox() {
		CommonFunctions.elementDisplayed(PrivacyCheckbox);
	}

	public void displayedStateDropdown() {
		CommonFunctions.elementDisplayed(StateDropdown);
	}

	public void displayedSourceDropdown() {
		CommonFunctions.elementDisplayed(SourceDropdown);
	}

	public void displayedPrivacyPolicyLink() {
		CommonFunctions.elementDisplayed(PrivacyPolicyLink);
	}

	public void displayedBacktoLoginLink() {
		CommonFunctions.elementDisplayed(BacktoLogin);
	}

	public void SelectValueOnSourceDropdown(String SelectedValue) {
		CommonFunctions.selectValueFromDropdown(SourceDropdown, SelectedValue);
	}

	public void SelectValueOnStateDropdown(String SelectedValue) {
		CommonFunctions.selectValueFromDropdown(StateDropdown, SelectedValue);
	}

	public void displayedCreateAccountButton() {
		CommonFunctions.elementDisplayed(CreateAccountButton);
	}

	public void displayedDescriptionField() {
		CommonFunctions.elementDisplayed(DescriptionField);
	}

	// RequiredFields ==========================================================
	public void displayedRequiredFirstNameField() {
		CommonFunctions.elementDisplayed(RequiredFirstNameField);
	}

	public void displayedRequiredFamilyNameField() {
		CommonFunctions.elementDisplayed(RequiredFamilyNameField);
	}

	public void displayedRequiredEmailField() {
		CommonFunctions.elementDisplayed(RequiredEmailField);
	}

	public void displayedInvalidEmailField() {
		CommonFunctions.elementDisplayed(InvalidEmailField);
	}

	public void displayedInvalidRegisteredEmailField() {
		CommonFunctions.elementDisplayed(RegisteredEmailField);
	}

	public void displayedInvalidPasswordField() {
		CommonFunctions.elementDisplayed(InvalidPasswordField);
	}

	public void displayedInvalidConfirmPasswordField() {
		CommonFunctions.elementDisplayed(InvalidConfirmPasswordField);
	}

	public void displayedRequiredPasswordField() {
		CommonFunctions.elementDisplayed(RequiredPasswordField);
	}

	public void displayedRequiredConfirmPasswordField() {
		CommonFunctions.elementDisplayed(RequiredConfirmPasswordField);
	}

	public void displayedRequiredStateDropdown() {
		CommonFunctions.elementDisplayed(RequiredStateDropdown);
	}

	public void displayedRequiredSourceDropdown() {
		CommonFunctions.elementDisplayed(RequiredSourceDropdown);
	}

	public void displayedRequiredDescriptionField() {
		CommonFunctions.elementDisplayed(RequiredDescriptionField);
	}

	public void displayedRequiredPrivacyCheckbox() {
		CommonFunctions.elementDisplayed(required_CollectionPolicy);
	}

	public void setFirstNameField(String Value) {
		CommonFunctions.clearThenEnterElementValue(FirstNameField, Value);
	}

	public void setFamilyNameField(String Value) {
		CommonFunctions.clearThenEnterElementValue(FamilyNameField, Value);
	}

	public String setEmailField(String Value) {
		CommonFunctions.clearThenEnterElementValue(EmailField, Value);
		return Value;
	}

	public void setPasswordField(String Value) {
		CommonFunctions.clearThenEnterElementValue(PasswordField, Value);
	}

	public void setConfirmPasswordField(String Value) {
		CommonFunctions.clearThenEnterElementValue(ConfirmPasswordField, Value);
	}

	public void HoverOnPasswordToolTip() {
		CommonFunctions.hoverOverElement(PasswordPolicyToolTip);
	}

	public void clickRequiredCheckbox2() {
		CommonFunctions.clickElement(RequiredPrivacyCheckbox2);
	}

	public void displayedRequiredTermsCondition() {
		CommonFunctions.elementDisplayed(required_TermsCondition);

	}

	public void clickTermsCondition() {
		CommonFunctions.clickElement(Link_TermsConditions);
	}

	public void clickCollectionStatement() {
		CommonFunctions.clickElement(Link_CollectionStatement);
	}

	public void clickPrivacyPolicy() {
		CommonFunctions.clickElement(Link_PrivacyPolicy);
	}

}