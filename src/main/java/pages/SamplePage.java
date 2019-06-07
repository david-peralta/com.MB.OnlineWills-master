package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class SamplePage extends Base {
	// Page Objects
	@FindBy(xpath = "XPATH")
	WebElement element_Sample;

	// Initializing the Page Objects
	public SamplePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void doElementNameElementType(String name) {
		CommonFunctions.clearThenEnterElementValue(element_Sample, name);
	}
}