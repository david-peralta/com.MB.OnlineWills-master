package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class HomePage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//span[text() = 'Create Post']")
	WebElement button_CreatePost;

	@FindBy(xpath = "//*[text() = 'Share']//parent::button")
	WebElement button_ShareNewPost;

	@FindBy(xpath = "//input[@type = 'file' and @aria-label='Add Photo or Video']")
	WebElement button_UploadPhotoVideo;

	@FindBy(xpath = "//div[contains(@aria-label, 'What') and contains(@aria-label, 's on your mind,')]//div//div//div")
	WebElement input_NewPostText;

	// ================================================== Initializing the Page Objects ==================================================
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void clickCreatePostButton() {
		CommonFunctions.clickElement(button_CreatePost);
	}

	public void clickShareNewPostButton(String filePaths) {
		if (filePaths != "") {
			CommonFunctions.attachToUploadElement(button_UploadPhotoVideo, filePaths);
		}

		CommonFunctions.clickElement(button_ShareNewPost);
		CommonFunctions.wait(15000, false);
	}

	public void setNewPostTextInput(String textPost) {
		CommonFunctions.clickElement(input_NewPostText);
		CommonFunctions.clickKeys(textPost);
	}
}