package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class ReviewConfirmPage extends Base {
	// ========================================================== Page Objects ===========================================================

	// Element - Checkbox

	@FindBy(xpath = "//input[contains(@type,'checkbox')]")
	WebElement Question1;

	// Element - Button

	@FindBy(xpath = "//input[contains(@value,'Next')]")
	WebElement btn_Next;

	@FindBy(xpath = "//input[contains(@value,'Back')]")
	WebElement btn_Back;

	// Element - Dropdown

	@FindBy(xpath = "(//select[contains(@id,'IdentificationTypeInput')])[1]")
	WebElement Question2A;

	@FindBy(xpath = "(//select[contains(@id,'IdentificationTypeInput')])[2]")
	WebElement Question2B;

	@FindBy(xpath = "//select[contains(@id,'LicenseStateDropdown')]")
	WebElement Question4;

	@FindBy(xpath = "//select[contains(@id,'MedicareCardColour')]")
	WebElement Question10;

	@FindBy(xpath = "//select[contains(@id,'ForeignPassportCountryOfIssue')]")
	WebElement Question21;

	/* Not Mandatory */
	@FindBy(xpath = "//select[contains(@id,'AusPassportGender')]")
	WebElement AusPassportGender;

	// Element - Input

	/* Drivers License */
	@FindBy(xpath = "//input[contains(@id,'LicenseNo')]")
	WebElement Question3;

	@FindBy(xpath = "//input[contains(@id,'LicenseFname')]")
	WebElement Question5;

	@FindBy(xpath = "//input[contains(@id,'LicenseMname')]")
	WebElement Question6;

	@FindBy(xpath = "//input[contains(@id,'LicenseSurName')]")
	WebElement Question7;

	@FindBy(xpath = "//input[contains(@id,'LicenseDOBInput')]")
	WebElement Question8;

	/* Medicare */
	@FindBy(xpath = "//input[contains(@id,'MedicareGivenName')]")
	WebElement Question9;

	@FindBy(xpath = "//input[contains(@id,'MedicareNo')]")
	WebElement Question11;

	@FindBy(xpath = "//input[contains(@id,'MedicareIndividualReferenceNumber')]")
	WebElement Question12;

	@FindBy(xpath = "//input[contains(@id,'MedicareExpiryDateInput')]")
	WebElement Question13;

	@FindBy(xpath = "//input[contains(@id,'MedicareDOBInput')]")
	WebElement Question14;

	/* Australian Passport */
	@FindBy(xpath = "//input[contains(@id,'AusPassportNo')]")
	WebElement Question15;

	@FindBy(xpath = "//input[contains(@id,'AusPassportFname')]")
	WebElement Question16;

	@FindBy(xpath = "//input[contains(@id,'AusPassportMname')]")
	WebElement Question17;

	@FindBy(xpath = "//input[contains(@id,'AusPassportSurName')]")
	WebElement Question18;

	@FindBy(xpath = "//input[contains(@id,'PassportDOBInput')]")
	WebElement Question19;

	@FindBy(xpath = "//input[contains(@id,'AusPassportNo')]")
	WebElement Question20;

	/* Foreign Passport */
	@FindBy(xpath = "//input[contains(@id,'ForeignPassportFname')]")
	WebElement Question22;

	@FindBy(xpath = "//input[contains(@id,'ForeignPassportMname')]")
	WebElement Question23;

	@FindBy(xpath = "//input[contains(@id,'ForeignPassportSurname')]")
	WebElement Question24;

	@FindBy(xpath = "//input[contains(@id,'ForeignPassportDOBInput')]")
	WebElement Question25;

	// ================================================== Initializing the Page Objects ==================================================
	public ReviewConfirmPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public PaymentsPage clickNextPaymentButton() {
		CommonFunctions.clickElement(btn_Next);

		return new PaymentsPage();
	}

	public AddOnsPage clickNextAddOnsButton() {
		CommonFunctions.clickElement(btn_Next);

		return new AddOnsPage();
	}

	public void clickQuestion1() {
		CommonFunctions.clickElement(Question1);
	}

	public void displayQuestion1() {
		CommonFunctions.elementDisplayed(Question1);
	}

	/* Drivers License */
	public void displayQuestion3() {
		CommonFunctions.elementDisplayed(Question3.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion4() {
		CommonFunctions.elementDisplayed(Question4.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));
	}

	public void displayQuestion6() {
		CommonFunctions.elementDisplayed(Question5.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion7() {
		CommonFunctions.elementDisplayed(Question7.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion8() {
		CommonFunctions.elementDisplayed(Question8.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	/* Medicare */

	public void displayQuestion9() {
		CommonFunctions.elementDisplayed(Question9.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion10() {
		CommonFunctions.elementDisplayed(Question10.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion11() {
		CommonFunctions.elementDisplayed(Question11.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion12() {
		CommonFunctions.elementDisplayed(Question12.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion13() {
		CommonFunctions.elementDisplayed(Question13.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));
	}

	public void displayQuestion14() {
		CommonFunctions.elementDisplayed(Question14.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));
	}

	/* Australian Passport */

	public void displayQuestion15() {
		CommonFunctions.elementDisplayed(Question15.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion16() {
		CommonFunctions.elementDisplayed(Question16.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));
	}

	public void displayQuestion17() {
		CommonFunctions.elementDisplayed(Question17.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion18() {
		CommonFunctions.elementDisplayed(Question18.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion19() {
		CommonFunctions.elementDisplayed(Question19.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));
	}

	public void displayAusPassportGender() {
		CommonFunctions.elementDisplayed(AusPassportGender.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	/* ForeignPassport */

	public void displayQuestion20() {
		CommonFunctions.elementDisplayed(Question20.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion21() {
		CommonFunctions.elementDisplayed(Question21.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));
	}

	public void displayQuestion22() {
		CommonFunctions.elementDisplayed(Question22.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion23() {
		CommonFunctions.elementDisplayed(Question23.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion24() {
		CommonFunctions.elementDisplayed(Question24.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion25() {
		CommonFunctions.elementDisplayed(Question25.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));
	}

	public void FillUpDriversLicense() {
		CommonFunctions.selectValueFromDropdown(Question2A, "Driver's Licence");
		CommonFunctions.wait(5000, false);
		// CommonFunctions.selectValueFromDropdown(Question2B, "Driver's Licence");
		// CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question3, "First");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question4, "ACT");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question5, "Option");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question6, "Father");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question7, "Address1Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question8, "09/05/1993");
		CommonFunctions.wait(5000, false);
	}

	public void FillUpMedicare() {
		CommonFunctions.selectValueFromDropdown(Question2A, "Medicare");
		CommonFunctions.wait(5000, false);
		// CommonFunctions.selectValueFromDropdown(Question2B, "Medicare");
		// CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question9, "First");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question10, "Green");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question11, "A1111111");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question12, "0123456789");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "15/06/2025");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question14, "09/05/1993");
		CommonFunctions.wait(5000, false);
	}

	public void FillUpAustralianPassport() {
		// CommonFunctions.selectValueFromDropdown(Question2A, "Australian Passport");
		// CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question2B, "Australian Passport");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question15, "ABC1111");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question16, "Dim");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question17, "Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question18, "User");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question19, "09/05/1993");
		CommonFunctions.wait(5000, false);
	}

	public void FillUpForeignPassport() {
		// CommonFunctions.selectValueFromDropdown(Question2A, "Foreign Passport");
		// CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question2B, "Foreign Passport");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question20, "DEF2222");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question21, "ANGOLA");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question22, "Test");
		CommonFunctions.wait(5000, false);
		CommonFunctions.selectValueFromDropdown(Question23, "Dim");
		CommonFunctions.wait(5000, false);
		CommonFunctions.enterElementValue(Question24, "User");
		CommonFunctions.wait(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question25, "09/05/1993");
		CommonFunctions.wait(5000, false);
	}

}