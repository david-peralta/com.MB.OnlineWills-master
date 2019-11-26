package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class AddOnsPage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//input[contains(@id,'AddPOAButtonSingle')]")
	WebElement AddPOAButton;
	@FindBy(xpath = "//input[contains(@value,'Next')]")
	WebElement btn_Next;

	/* Progess Bar */
	@FindBy(xpath = "//div[text()='Personal Details']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressPersonal;
	@FindBy(xpath = "//div[text()='About You']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAbout;
	@FindBy(xpath = "//div[text()='Assets']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAssets;
	@FindBy(xpath = "//div[text()='Executors']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressExecutors;
	@FindBy(xpath = "//div[text()='Beneficiaries']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressBeneficiaries;
	@FindBy(xpath = "//div[text()='ID Docs']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressIDDocs;
	@FindBy(xpath = "//div[text()='Review & Confirm']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressReviewConfirm;
	@FindBy(xpath = "//div[text()='Will']//parent::div[text()='Confirmed']")
	WebElement ProgressConfirmed;

	@FindBy(xpath = "//div[contains(@id,'PowerOfAttorney_Tooltip2')]")
	WebElement PowerOfAttorney_Tooltip2;
	@FindBy(xpath = "//div[contains(@id,'PowerOfAttorney_TooltipVideo2')]")
	WebElement PowerOfAttorney_Tooltip2Video;

	// ================================================== Initializing the Page Objects ==================================================
	public AddOnsPage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================

	public void clickAddPOAButton() {
		CommonFunctions.clickElement(AddPOAButton);
	}

	public FinancialDecisionsPage clickNextWithPOA() {
		CommonFunctions.clickElement(btn_Next);
		return new FinancialDecisionsPage();
	}

	public PaymentsPage clickNextWithoutPOA() {
		CommonFunctions.clickElement(btn_Next);
		return new PaymentsPage();
	}

	public AboutPage ProgressChangeAbout() {
		CommonFunctions.clickElement(ProgressAbout);

		return new AboutPage();
	}

	public AssetsPage ProgressChangeAssets() {
		CommonFunctions.clickElement(ProgressAssets);

		return new AssetsPage();
	}

	public BeneficiariesPage ProgressChangeBeneficiaries() {
		CommonFunctions.clickElement(ProgressBeneficiaries);

		return new BeneficiariesPage();
	}

	public ExecutorsPage ProgressChangeExecutors() {
		CommonFunctions.clickElement(ProgressExecutors);

		return new ExecutorsPage();
	}

	public IDdocsPage ProgressChangeIDdocs() {
		CommonFunctions.clickElement(ProgressIDDocs);

		return new IDdocsPage();
	}

	public ReviewConfirmPage ProgressChangeReviewConfirm() {
		CommonFunctions.clickElement(ProgressReviewConfirm);

		return new ReviewConfirmPage();
	}

	public PersonalPage ProgressChangeAddOns() {
		CommonFunctions.clickElement(ProgressPersonal);

		return new PersonalPage();
	}

	public void CheckProgressConfirmed() {
		CommonFunctions.elementDisplayed(ProgressConfirmed.findElement(By.xpath(".//following-sibling::a[contains(text(),'Change')]")));
	}

	public void CheckWillConfirmed() {
		CommonFunctions.elementDisplayed(ProgressConfirmed);
		CommonFunctions.wait(2500, false);
	}

	public void clickPowerOfAttorney_Tooltip2() {
		CommonFunctions.clickElement(PowerOfAttorney_Tooltip2);
	}

	public void DisplayPowerOfAttorney_Tooltip2() {
		CommonFunctions.elementDisplayed(PowerOfAttorney_Tooltip2);
	}

	public void DisplayPowerOfAttorney_Tooltip2Video() {
		CommonFunctions.elementDisplayed(PowerOfAttorney_Tooltip2Video);
	}

}