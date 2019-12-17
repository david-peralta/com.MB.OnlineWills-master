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
	//@FindBy(xpath = "input[value='Add']")
	WebElement AddPOAButton;
	//@FindBy(xpath = "//input[contains(@id,'AddSpouseButtonVic')]|//input[@value=Add]")
	@FindBy(xpath = "//input[contains(@id,'AddSpouseButtonVic')]//parent::span[contains(@id,'IsSpouseEmailNull2')]")
	WebElement AddSpouseButton;
	@FindBy(xpath = "//input[contains(@value,'Next')]")
	WebElement btn_Next;
	@FindBy(xpath = "//input[contains(@id,'AddSpouseButtonVic')]//parent::span[contains(@id,'IsSpouseEmailNull2')]")
	WebElement Btn_AddPartner;

	

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
	@FindBy(xpath = "//div[contains(@id,'Everything')]")
	WebElement TextBody;


	//@FindBy(xpath = "//span[text()='By providing the contact email address, you confirm that you have consent from the relevant person to pass on such details to Maurice Blackburn in connection with the service.']")


	@FindBy(xpath = "//span[text()='By adding your partner now you can take advantage of our bundled price for couples of $599']")
	WebElement Body_spouse;
	@FindBy(xpath = "//input[contains(@id,'SpouseEmailInput')]")
	WebElement Email_spouse;
	@FindBy(xpath = "//input[contains(@value,'Save')]")
	WebElement btn_SaveSpouse;
	@FindBy(xpath = "//input[contains(@value,'Cancel')]")
	WebElement btn_CancelSpouse;

	// POA - Couple
	@FindBy(xpath = "//input[contains(@id,'AddPOAButtonNonCouple')]")
	WebElement AddCouple_POA;


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

	public void TextDisplay() {
		// WebElement element = driver.findElement(By.xpath("//div[contains(@id,'Everything"));
		// System.out.println(element.getText());
		//
		System.out.println(driver.findElement(By.xpath("//div[contains(@id,'Everything')]")).getText().contains("Did you know that both you and your spouse/partner need a Will?  This is the best way to ensure your family is protected and you have the confidence that your estate will be distributed as per your wishes." + "\r\n" + "You should also consider another equally important document that plays a role while you are still here. Power of Attorney documents give you peace of mind knowing that a trusted person can make vital financial and personal decisions for you when you are no longer able to.\n" + "\r\n" + "Maurice Blackburn offers a bundled price for a couple to each have a Will and a huge saving if you include an Enduring Power of Attorney and Appointment of a Medical Treatment Decision Maker documents today."));
	}

	public void CheckText() {
		CommonFunctions.textDisplayedInPage("Save money and include your spouse/partner at the same time.");
		CommonFunctions.textDisplayedInPage("Did you know that both you and your spouse/partner need a Will?");
		CommonFunctions.textDisplayedInPage("This is the best way to ensure your family is protected and you have the confidence that your estate will be distributed as per your wishes. ");

		CommonFunctions.textDisplayedInPage("You should also consider another equally important document that plays a role while you are still here.");
		CommonFunctions.textDisplayedInPage(" Power of Attorney documents give you peace of mind knowing that a trusted person can make vital financial and personal decisions for you when you are no longer able to.");
		CommonFunctions.textDisplayedInPage("Maurice Blackburn offers a bundled price for a couple to each have a Will and a huge saving if you include an Enduring Power of Attorney and Appointment of a Medical Treatment Decision Maker documents today. ");
		CommonFunctions.textDisplayedInPage("By adding your spouse/partner now you can take advantage of our bundled price for couples of $599.  This is a saving of $199 with the online couple price and $280 less than the offline price.");
		CommonFunctions.textDisplayedInPage("Maurice Blackburn offers great value if you include an Enduring Power of Attorney and Appointment of a Medical Treatment Decision Maker documents today. This bundled package is a savings of $220 over the offline price.  If you and your spouse/partner both include these documents, you can take advantage of our bundled price for couples of $560.  This is a saving of $320.");
		// CommonFunctions.textDisplayedInPage("");
		// CommonFunctions.textDisplayedInPage(" Power of Attorney documents give you peace of mind knowing that a trusted person can make vital financial and personal decisions for you when you are
		// no longer able to.");

	}

	public void clickAddSpouse() {
		CommonFunctions.clickElement(AddSpouseButton);
		//CommonFunctions.wait(2500, false);
		//CommonFunctions.switchFrameByXPath("//label[contains(text(),'Spouse/Partner')]");
	}

	public void checkSpouseBody() {
		CommonFunctions.elementDisplayed(Body_spouse);
		CommonFunctions.wait(2500, false);
	}

	public void setSpouseEmailInput() {
		CommonFunctions.enterElementValue(Email_spouse, "wife.spouse@email.com");
		CommonFunctions.wait(2500, false);
	}

	public void clickSaveSpouse() {
		CommonFunctions.clickElement(btn_SaveSpouse);
		CommonFunctions.wait(2500, false);
	}


	public void clickCouplePOA() {
		CommonFunctions.clickElement(AddCouple_POA);
		CommonFunctions.wait(2500, false);
	}

	public PendingSpousePage clickNextSpouse() {
		CommonFunctions.scrollToElement(btn_Next);
		CommonFunctions.wait(4000, false);
		CommonFunctions.clickElement(btn_Next);

		return new PendingSpousePage();
	}


	
	public void clickAddPartner() {
		CommonFunctions.clickElement(Btn_AddPartner);
		CommonFunctions.wait(2500, false);
	}

}