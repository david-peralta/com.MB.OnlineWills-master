package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class OrdersPage extends Base {
	// ========================================================== Page Objects ===========================================================

	@FindBy(xpath = "//select[contains(@id,'InputUser')]")
	WebElement SelectUser;
	@FindBy(xpath = "//select[contains(@id,'OrderStatus')]")
	WebElement OrderStatus;
	@FindBy(xpath = "//input[contains(@id,'ButtonAddOrder')]")
	WebElement AddOrderButton;
	@FindBy(xpath = "//span[contains(@id,'DeleteAllBtn')]")
	WebElement DeleteAllButton;
	@FindBy(xpath = "//input[@value='Delete All']")
	WebElement DeleteAllButtonValue;

	// ================================================== Initializing the Page Objects ===========S=======================================
	public OrdersPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void SetSelectUser(String value) {
		CommonFunctions.selectValueFromDropdown(SelectUser, value);
		CommonFunctions.wait(5000, false);
	}

	public void SetOrderStatus(String value) {
		CommonFunctions.selectValueFromDropdown(OrderStatus, value);
	}

	public void ClickAddOrderButton() {
		CommonFunctions.clickElement(AddOrderButton);
	}

	public void ClickDeleteAllButton() {
		CommonFunctions.clickElement(DeleteAllButton);
		CommonFunctions.wait(5000, false);
	}
}