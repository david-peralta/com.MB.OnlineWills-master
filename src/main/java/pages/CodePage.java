package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class CodePage extends Base {
	// ========================================================= Page Objects ===========================================================
	@FindBy(xpath = "//input[contains(@id, 'PasswordInput')]")
	WebElement input_Password;
	@FindBy(xpath = "(//table[contains(@id, 'UserAccountTable')]//tbody//tr//td[contains(text(), 'reset@password.com')]//following-sibling::td)[2]//a")
	WebElement CodeResetPasswordLink;

	// ================================================== Initializing the Page Objects ==================================================
	public CodePage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public ChangePasswordPage clickResetPasswordLink() {
		CommonFunctions.clickElement(CodeResetPasswordLink);
		return new ChangePasswordPage();
	}

	public ChangePasswordPage xxxx() {
		CommonFunctions.clickElement(driver.findElement(By.xpath("")));
		return new ChangePasswordPage();
	}

	public LoginPage clickActivationLink(String RegisteredEmail) {
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//table[contains(@id, 'UserAccountTable')]//tbody//tr//td[contains(text(), '" + RegisteredEmail + "')]//following-sibling::td)[1]//a")));
		return new LoginPage();
	}
}