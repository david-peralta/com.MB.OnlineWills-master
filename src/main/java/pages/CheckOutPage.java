package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class CheckOutPage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath="//ol[contains(@id,'card_type_selection')]")
	WebElement Selection_CardType;
	@FindBy(xpath="//input[contains(@id,'card_type_001')]")
	WebElement Visa_CardType;
	@FindBy(xpath="//input[contains(@id,'card_type_002')]")
	WebElement Master_CardType;
	@FindBy(xpath="//input[contains(@id,'card_type_003')]")
	WebElement Amex_CardType;
	@FindBy(xpath="//div[@id = 'card_type_error']")
	WebElement CardTypeError;
	@FindBy(xpath="//div[@id = 'card_number_error']")
	WebElement CardNumberError;
	@FindBy(xpath="//div[@id = 'card_expiry_date_error']")
	WebElement CardExpError;
	@FindBy(xpath="//input[@id='card_number']")
	WebElement Field_CardNumber;
	@FindBy(xpath="//select[contains(@id,'card_expiry_month')]")
	WebElement Select_ExpMonth;
	@FindBy(xpath="//select[contains(@id,'card_expiry_year')]")
	WebElement Select_ExpYear;
	@FindBy(xpath="//input[@id = 'card_cvn']")
	WebElement Field_CVN;
	@FindBy(xpath="//input[@value='Pay']")
	WebElement Btn_Pay;
	@FindBy(xpath="//input[@value='Cancel']")
	WebElement Btn_Cancel;
	@FindBy(xpath="//span[text()='Yes']//parent::button")
	WebElement Btn_Yes;
	@FindBy(xpath="//span[text()='No']//parent::button")
	WebElement Btn_No;
	@FindBy(xpath="//*[text()='Cancel Order']")
	WebElement PopupCancelOrder;
	@FindBy(xpath="//a[text() = ' Return to Website']")
	WebElement Btn_Return;
	@FindBy(xpath="//option[@value='01']")
	WebElement SelectMonth;
	@FindBy(xpath="//option[@value='2025']")
	WebElement SelectYear;
	
	
	
	
	// ================================================== Initializing the Page Objects ==================================================
	public CheckOutPage() {
		PageFactory.initElements(driver, this);

	}

	// ============================================================= Actions =============================================================

	//Error message
	public void displayCardTypeErrorMessage() {
		CommonFunctions.elementDisplayed(CardTypeError);
		CommonFunctions.wait(5000, false);
	}
	public void displayCardNumberErrorMessage() {
		CommonFunctions.elementDisplayed(CardNumberError);
		CommonFunctions.wait(5000, false);
	}
	public void displayCardExpirationErrorMessage() {
		CommonFunctions.elementDisplayed(CardExpError);
		CommonFunctions.wait(5000, false);
	}
	//Field Display
	public void displayCardType() {
		CommonFunctions.elementDisplayed(Selection_CardType);
		CommonFunctions.wait(5000, false);
	}
	public void displayVisaCardType() {
		CommonFunctions.elementDisplayed(Visa_CardType);
	}
	public void displayMasterCardType() {
		CommonFunctions.elementDisplayed(Master_CardType);
	}
	public void displayAmexCardType() {
		CommonFunctions.elementDisplayed(Amex_CardType);
	}
	public void displayCardNumber() {
		CommonFunctions.elementDisplayed(Field_CardNumber);
		CommonFunctions.wait(5000, false);
	}
	public void displayExpMonth() {
		CommonFunctions.elementDisplayed(Select_ExpMonth);
	}
	public void displayYearMonth() {
		CommonFunctions.elementDisplayed(Select_ExpYear);
	}
	public void displayCVN() {
		CommonFunctions.elementDisplayed(Field_CVN);
	}

	
	
	//Payment Details
	public void fillUpPaymentDetails() {
		CommonFunctions.clickElement(Visa_CardType);
		CommonFunctions.wait(3000, false);
		CommonFunctions.clearThenEnterElementValue(Field_CardNumber, "4111111111111111");
		CommonFunctions.wait(3000, false);
		CommonFunctions.clearThenEnterElementValue(Field_CVN, "132");
		CommonFunctions.wait(3000, false);
	}
	
	public void selectMonth() {
		CommonFunctions.clickElement(SelectMonth);
		CommonFunctions.wait(5000, false);
	}
	public void selectYear() {
		CommonFunctions.clickElement(SelectYear);
		CommonFunctions.wait(5000, false);
	}
	
	//Buttons
	public void ClickPayButton() {
		CommonFunctions.clickElement(Btn_Pay);
	}
	public PaymentsPage ClickCancelButton() {
		CommonFunctions.clickElement(Btn_Cancel);
		return new PaymentsPage();
	}
	
	public HomePage ClickReturn() {
		CommonFunctions.clickElement(Btn_Return);
		return new HomePage();
	}
	
	
	//Pop-up
	
	public void displayCancelOrderPopup() {
		CommonFunctions.elementDisplayed(PopupCancelOrder);
	}
	
	public void clickYesCancelOrder() {
		CommonFunctions.switchFrameByXPath("//*[text()='Cancel Order']");
		CommonFunctions.clickElement(Btn_Yes);

	}
	
	public void clickNoCancelOrder() {
		CommonFunctions.switchFrameByXPath("//*[text()='Cancel Order']");
		CommonFunctions.clickElement(Btn_No);

	}




}