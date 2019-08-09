package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class HomePage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//div[contains(@id, 'LoginInfo_username')]")
	WebElement accordion_UserFullName;

	@FindBy(xpath = "//a[contains(text(), 'Logout')]")
	WebElement link_UserFullNameAccordion_Logout;

	// ================================================== Initializing the Page Objects ==================================================
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void containsValueUserFullNameAccordion(String userFullName) {
		CommonFunctions.elementContainsText(accordion_UserFullName, userFullName);
	}

	public LoginPage clickUserFullNameAccordionLogoutLink() {
		CommonFunctions.clickElement(accordion_UserFullName);
		CommonFunctions.clickElement(link_UserFullNameAccordion_Logout);

		return new LoginPage();
	}
}