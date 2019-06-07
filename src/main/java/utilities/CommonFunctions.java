package utilities;

import cucumber.api.Scenario;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions extends Base {
	public CommonFunctions(WebDriver dr) {

	}

	// Helper Functions
	public static void clearThenEnterElementValue(WebElement we, String value) {
		try {
			waitElementVisibility(we);
			we.clear();
			LogFunctions.info("Value in \"" + getElementXPath(we) + "\" element cleared.");
			enterElementValue(we, value);
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void clickElement(WebElement we) {
		try {
			waitElementClickable(we);
			we.click();
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" clicked.");
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void clickKeys(String keys) {
		Actions action = new Actions(driver);

		action.sendKeys(keys).perform();
		LogFunctions.info("\"" + keys + "\" keys pressed.");
	}

	public static void clickOnPopUp(String option) {
		try {
			String popUpMessage = driver.switchTo().alert().getText();

			if (option.equals("OK")) {
				driver.switchTo().alert().accept();
				LogFunctions.info("Pop up with message \"" + popUpMessage + "\" is accepted.");
			}

			if (option.equals("Cancel")) {
				driver.switchTo().alert().dismiss();
				LogFunctions.info("Pop up with message \"" + popUpMessage + "\" is dismissed.");
			}
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void doubleClickOnElement(WebElement we) {
		try {
			waitElementClickable(we);

			Actions action = new Actions(driver).doubleClick(we);

			action.build().perform();
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" double clicked.");
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void enterElementValue(WebElement we, String value) {
		waitElementVisibility(we);

		for (int i = 0; i < value.length(); i++) {
			we.sendKeys(value.substring(i, i + 1));
		}

		LogFunctions.info("Finished entering value \"" + value + "\" into \"" + getElementXPath(we) + "\".");
	}

	public static void hoverElement(WebElement we) {
		try {
			waitElementVisibility(we);

			Actions action = new Actions(driver);

			action.moveToElement(we).build().perform();
			LogFunctions.info("Hovered over \"" + getElementXPath(we) + "\" element.");
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void screenshotFailedTest(Scenario scenario) {
		try {
			if (scenario.isFailed()) {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File fileSource = ts.getScreenshotAs(OutputType.FILE);
				Calendar calendar = Calendar.getInstance();
				SimpleDateFormat sdtf = new SimpleDateFormat("MM.dd.yyyy_HHmm");

				FileUtils.copyFile(fileSource, new File("target/failedscreenshots/" + scenario.getName().substring(0, scenario.getName().indexOf(":")) + "-" + sdtf.format(calendar.getTime()) + ".png"));
				LogFunctions.info("Test Failed. Screenshot taken.");
			}
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void scrollToBottomOfPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		LogFunctions.info("Scrolled to bottom.");
	}

	public static void scrollToElement(WebElement we) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[0].scrollIntoView(true);", we);
		LogFunctions.info("Scrolled to element \"" + getElementXPath(we) + "\".");
	}

	public static void scrollToTopOfPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0,0)");
		LogFunctions.info("Scrolled to top.");
	}

	public static void selectValueFromDropdown(WebElement we, String value) {
		try {
			waitElementClickable(we);

			Select dropdown = new Select(we);

			dropdown.selectByVisibleText(value);
			LogFunctions.info("Value \"" + value + "\" selected for \"" + getElementXPath(we) + "\" dropdown.");
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void switchFrameByXPath(String xPath) {
		try {
			Integer numberOfFrames = driver.findElements(By.tagName("iframe")).size();

			for (int i = 0; i <= numberOfFrames; i++) {
				driver.switchTo().frame(i);

				if (driver.findElements(By.xpath(xPath)).size() > 0) {
					LogFunctions.info("Switched to frame \"" + i + "\".");
					break;
				}
				else {
					driver.switchTo().parentFrame();
					LogFunctions.info("Frame not switched.");
				}
			}
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void testResults(Scenario scenario) {
		try {
			if (scenario.isFailed()) {
				LogFunctions.error("TEST - FAILED");
			}
			else {
				LogFunctions.info("TEST - PASSED");
			}
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void wait(Integer duration, Boolean isMinutes) {
		try {
			if (isMinutes) {
				LogFunctions.info("Waiting for \"" + duration + "\" minutes...");

				duration = duration * 60000;
			}

			Thread.sleep(duration);
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static String getElementXPath(WebElement we) {
		String xPath = "";

		try {
			return (String) ((JavascriptExecutor) driver).executeScript("function absoluteXPath(we) {" + "var comp, comps = [];" + "var parent = null;" + "var xpath = '';" + "var getPos = function(we) {" + "var position = 1, curNode;" + "if (we.nodeType == Node.ATTRIBUTE_NODE) {" + "return null;" + "}" + "for (curNode = we.previousSibling; curNode; curNode = curNode.previousSibling) {" + "if (curNode.nodeName == we.nodeName) {" + "++position;" + "}" + "}" + "return position;" + "};" +

				"if (we instanceof Document) {" + "return '/';" + "}" +

				"for (; we && !(we instanceof Document); we = we.nodeType == Node.ATTRIBUTE_NODE ? we.ownerElement : we.parentNode) {" + "comp = comps[comps.length] = {};" + "switch (we.nodeType) {" + "case Node.TEXT_NODE:" + "comp.name = 'text()';" + "break;" + "case Node.ATTRIBUTE_NODE:" + "comp.name = '@' + we.nodeName;" + "break;" + "case Node.PROCESSING_INSTRUCTION_NODE:" + "comp.name = 'processing-instruction()';" + "break;" + "case Node.COMMENT_NODE:" + "comp.name = 'comment()';" + "break;" + "case Node.ELEMENT_NODE:" + "comp.name = we.nodeName;" + "break;" + "}" + "comp.position = getPos(we);" + "}" +

				"for (var i = comps.length - 1; i >= 0; i--) {" + "comp = comps[i];" + "xpath += '/' + comp.name.toLowerCase();" + "if (comp.position !== null) {" + "xpath += '[' + comp.position + ']';" + "}" + "}" +

				"return xpath;" +

				"} return absoluteXPath(arguments[0]);", we);
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}

		return xPath;
	}

	public static String stringAppendDateTime(String value) {
		String result = "";

		try {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("_MMddyy_HHmm");
			result = value + sdf.format(calendar.getTime());
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}

		return result;
	}

	public static WebElement getElementDisplayedInListByXPath(String xPath) {
		WebElement we = null;

		try {
			List<WebElement> wes = driver.findElements(By.xpath(xPath));

			for (int i = 1; i <= wes.size(); i++) {
				WebElement weDisplayed = wes.get(i - 1);

				if (weDisplayed.isDisplayed()) {
					we = weDisplayed;

					LogFunctions.info("Element with XPath \"" + getElementXPath(we) + "\" visible.");
					break;
				}
			}

			if (we == null) {
				LogFunctions.info("XPath \"" + xPath + "\" not existing.");
			}
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}

		return we;
	}

	public static WebElement getLastElementInListByXPath(String xPath) {
		WebElement we = null;

		try {
			List<WebElement> wes = driver.findElements(By.xpath(xPath));
			we = wes.get(wes.size() - 1);
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}

		return we;
	}

	// Assert Functions
	public static void checkAlertIsNotDisplayed() {
		Boolean result = true;

		if (new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent()) == null) {
			LogFunctions.info("Alert is not displayed.");
		}
		else {
			result = false;

			LogFunctions.error("Alert is displayed.");
		}

		Assert.assertTrue(result);
	}

	public static void checkAlertMessageIsDisplayed(String expectedAlertMessage) {
		Boolean result = true;
		String alertMessage = driver.switchTo().alert().getText();

		if (alertMessage.contains(expectedAlertMessage)) {
			LogFunctions.info("Alert message \"" + expectedAlertMessage + "\" is displayed.");
		}
		else {
			result = false;

			LogFunctions.error("Alert message \"" + expectedAlertMessage + "\" is not displayed.");
		}

		Assert.assertTrue(result);
	}

	public static void checkFeedbackMessageDisplayedContainsString(String feedbackMessage) {
		Boolean result = true;
		WebElement we = driver.findElement(By.xpath("//span[contains(text(), '" + feedbackMessage + "')]"));

		waitElementVisibility(we);

		if (we.isDisplayed()) {
			LogFunctions.info("Feedback message \"" + feedbackMessage + "\" found.");
		}
		else {
			result = false;

			LogFunctions.error("Feedback message \"" + feedbackMessage + "\" not found.");
		}

		Assert.assertTrue(result);
	}

	public static void checkFeedbackMessageDisplayedEqualsToString(String feedbackMessage) {
		Boolean result = true;

		WebElement we = driver.findElement(By.xpath("//span[text() = '" + feedbackMessage + "']"));

		waitElementVisibility(we);

		if (we.isDisplayed()) {
			LogFunctions.info("Feedback message \"" + feedbackMessage + "\" found.");
		}
		else {
			result = false;

			LogFunctions.error("Feedback message \"" + feedbackMessage + "\" not found.");
		}

		Assert.assertTrue(result);
	}

	public static void checkFeedbackMessageHidden(String feedbackMessage) {
		Boolean result = true;

		WebElement we = driver.findElement(By.xpath("//span[text() = '" + feedbackMessage + "']"));

		waitElementInvisible(we);

		if (!we.isDisplayed()) {
			LogFunctions.info("Feedback message \"" + feedbackMessage + "\" not found.");
		}
		else {
			result = false;

			LogFunctions.error("Feedback message \"" + feedbackMessage + "\" found.");
		}

		Assert.assertTrue(result);
	}

	public static void checkIfCheckboxIsNotToggled(WebElement we) {
		Boolean result = true;
		waitElementVisibility(we);
		waitElementNotSelected(we);

		if (!we.isSelected()) {
			LogFunctions.info("Checkbox \"" + getElementXPath(we) + "\" is not toggled.");
		}
		else {
			result = false;

			LogFunctions.error("Checkbox \"" + getElementXPath(we) + "\" is toggled.");
		}

		Assert.assertTrue(result);
	}

	public static void checkIfCheckboxIsToggled(WebElement we) {
		Boolean result = true;

		waitElementVisibility(we);
		waitElementSelected(we);

		if (we.isSelected()) {
			LogFunctions.info("Checkbox \"" + getElementXPath(we) + "\" is toggled.");
		}
		else {
			result = false;

			LogFunctions.error("Checkbox \"" + getElementXPath(we) + "\" is not toggled.");
		}

		Assert.assertTrue(result);
	}

	public static void checkPageTitle(String expectedTitle) {
		Boolean result = true;

		waitTitleIs(expectedTitle);

		if (driver.getTitle().equals(expectedTitle)) {
			LogFunctions.info("Page title \"" + expectedTitle + "\" is displayed.");
		}
		else {
			result = false;

			LogFunctions.error("Page title \"" + expectedTitle + "\" is not displayed.");
		}

		Assert.assertTrue(result);
	}

	public static void checkPopupOnPage(String expectedPageTitle, String popupHeader) {
		Boolean result = true;

		if (driver.getTitle().equals(expectedPageTitle) && driver.findElement(By.xpath("//*[contains(text(), '" + popupHeader + "')]")).isDisplayed()) {
			LogFunctions.info("Popup with header \"" + popupHeader + "\" on page \"" + expectedPageTitle + "\" is displayed.");
		}
		else {
			result = false;

			LogFunctions.error("Popup with header \"" + popupHeader + "\" on page \"" + expectedPageTitle + "\" is not displayed.");
		}

		Assert.assertTrue(result);
	}

	public static void elementAttributeContains(WebElement we, String attribute, String expectedValue) {
		Boolean result = true;

		waitAttributeContains(we, attribute, expectedValue);

		if (we.getAttribute(attribute).contains(expectedValue)) {
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" attribute \"" + attribute + "\" contains the value \"" + expectedValue + "\".");
		}
		else {
			result = false;

			LogFunctions.error("Element \"" + getElementXPath(we) + "\" attribute \"" + attribute + "\" does not contain the value \"" + expectedValue + "\".");
		}

		Assert.assertTrue(result);
	}

	public static void elementAttributeDoesNotContains(WebElement we, String attribute, String value) {
		Boolean result = true;

		if (!we.getAttribute(attribute).contains(value)) {
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" attribute \"" + attribute + "\" does not contain the value \"" + value + "\".");
		}
		else {
			result = false;

			LogFunctions.error("Element " + getElementXPath(we) + " attribute " + attribute + " contains value " + value + ".");
		}

		Assert.assertTrue(result);
	}

	public static void elementAttributeEqualsTo(WebElement we, String attribute, String expectedValue) {
		Boolean result = true;

		waitAttributeContains(we, attribute, expectedValue);

		if (we.getAttribute(attribute).equals(expectedValue)) {
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" attribute \"" + attribute + "\" is equals to value \"" + expectedValue + "\".");
		}
		else {
			result = false;

			LogFunctions.error("Element \"" + getElementXPath(we) + "\" attribute \"" + attribute + "\" is not equals to value \"" + expectedValue + "\".");
		}

		Assert.assertTrue(result);
	}

	public static void elementAttributeDoesNotEqualsTo(WebElement we, String attribute, String value) {
		Boolean result = true;

		if (!we.getAttribute(attribute).equals(value)) {
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" attribute \"" + attribute + "\" is not equals to value \"" + value + "\".");
		}
		else {
			result = false;

			LogFunctions.error("Element \"" + getElementXPath(we) + "\" attribute \"" + attribute + "\" is equals to value \"" + value + "\".");
		}

		Assert.assertTrue(result);
	}

	public static void elementAttributeIsNotPresent(WebElement we, String attribute) {
		Boolean result = true;

		if (we.getAttribute(attribute) == null) {
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" attribute \"" + attribute + "\" is not present.");
		}
		else {
			result = false;

			LogFunctions.error("Element \"" + getElementXPath(we) + "\" attribute \"" + attribute + "\" is present.");
		}

		Assert.assertTrue(result);
	}

	public static void elementAttributePresent(WebElement we, String attribute) {
		Boolean result = true;

		if (we.getAttribute(attribute) != null) {
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" attribute \"" + attribute + "\" is present.");
		}
		else {
			result = false;

			LogFunctions.error("Element \"" + getElementXPath(we) + "\" attribute \"" + attribute + "\" is not present.");
		}

		Assert.assertTrue(result);
	}

	public static void elementCssValueContains(WebElement we, String property, String expectedValue) {
		Boolean result = true;

		if (we.getCssValue(property).contains(expectedValue)) {
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" that contains the css value \"" + expectedValue + "\".");
		}
		else {
			result = false;

			LogFunctions.error("Element \"" + getElementXPath(we) + "\" that does not contain the css value \"" + expectedValue + "\".");
		}

		Assert.assertTrue(result);
	}

	public static void elementContainsText(WebElement we, String text) {
		Boolean result = true;
		String webElementText = we.getText().toString();

		waitTextToBePresentInElement(we, text);

		if (text.isBlank()) {
			text = "blank";
		}

		if (webElementText.contains(text) || (text == "" && (webElementText == null || webElementText == ""))) {
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" that partially contains the text \"" + text + "\" is found.");
		}
		else {
			result = false;

			LogFunctions.error("Element \"" + getElementXPath(we) + "\" that partially contains the text \"" + text + "\" is not found.");
		}

		Assert.assertTrue(result);
	}

	public static void elementEqualsToText(WebElement we, String text) {
		Boolean result = true;
		String webElementText = we.getText().toString();

		waitTextToBePresentInElement(we, text);

		if (text.isBlank()) {
			text = "blank";
		}

		if (webElementText.equals(text) || (text == "" && (webElementText == null || webElementText == ""))) {
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" that contains the text \"" + text + "\" is found.");
		}
		else {
			result = false;

			LogFunctions.error("Element \"" + getElementXPath(we) + "\" that contains the text \"" + text + "\" is not found.");
		}

		Assert.assertTrue(result);
	}

	public static void elementDisplayed(WebElement we) {
		Boolean result = true;

		waitElementVisibility(we);

		if (we.isDisplayed()) {
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" is displayed.");
		}
		else {
			result = false;

			LogFunctions.error("Element \"" + getElementXPath(we) + "\" is not displayed.");
		}

		Assert.assertTrue(result);
	}

	public static void elementEnabled(WebElement we) {
		Boolean result = true;

		waitElementClickable(we);

		if (we.isEnabled()) {
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" is enabled.");
		}
		else {
			result = false;

			LogFunctions.error("Element \"" + getElementXPath(we) + "\" is disabled.");
		}

		Assert.assertTrue(result);
	}

	public static void elementInvisible(WebElement we) {
		Boolean result = true;

		waitElementInvisible(we);

		if (!we.isDisplayed()) {
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" hidden in page.");
		}
		else {
			result = false;

			LogFunctions.error("Element \"" + getElementXPath(we) + "\" found in page.");
		}

		Assert.assertTrue(result);
	}

	public static void elementNotExistingByXPath(String xPath) {
		Boolean result = true;
		List<WebElement> wes = driver.findElements(By.xpath(xPath));

		if (wes.size() == 0) {
			LogFunctions.info("Element with xpath \"" + xPath + "\" not found.");
		}
		else {
			result = false;

			LogFunctions.error("Element with xpath \"" + xPath + "\" found.");
		}

		Assert.assertTrue(result);
	}

	public static void textNotInPage(String value) {
		Boolean result = true;
		List<WebElement> wes = driver.findElements(By.xpath("//*[contains(text(), '" + value + "')]"));

		for (int i = 1; i <= wes.size(); i++) {
			WebElement we = wes.get(i - 1);

			if (we.isDisplayed()) {
				result = false;

				LogFunctions.error("Text \"" + value + "\" visible.");
				break;
			}
		}

		if (result) {
			LogFunctions.info("Text \"" + value + "\" hidden.");
		}

		Assert.assertTrue(result);
	}

	public static void textVisibleInPage(String value) {
		Boolean result = false;
		String xPath = "//*[contains(text(), '" + value + "')]";
		List<WebElement> wes = driver.findElements(By.xpath(xPath));

		waitPresenceOfElement(xPath);

		for (int i = 1; i <= wes.size(); i++) {
			WebElement we = wes.get(i - 1);

			if (we.isDisplayed()) {
				result = true;

				LogFunctions.info("Text \"" + value + "\" visible.");
				break;
			}
		}

		if (!result) {
			LogFunctions.error("Text \"" + value + "\" hidden.");
		}

		Assert.assertTrue(result);
	}

	// Wait Functions
	public static void waitAlertIsPresent() {
		new WebDriverWait(driver, 30).until(ExpectedConditions.alertIsPresent());
	}

	public static void waitAttributeContains(WebElement we, String attribute, String value) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.attributeContains(we, attribute, value));
	}

	public static void waitElementClickable(WebElement we) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(we));
	}

	public static void waitElementInvisible(WebElement we) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.not(ExpectedConditions.invisibilityOf(we)));
	}

	public static void waitElementNotClickable(WebElement we) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(we)));
	}

	public static void waitElementNotSelected(WebElement we) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementSelectionStateToBe(we, false));
	}

	public static void waitElementSelected(WebElement we) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementSelectionStateToBe(we, true));
	}

	public static void waitElementVisibility(WebElement we) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(we));
	}

	public static void waitPresenceOfElement(String xPath) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xPath)));
	}

	public static void waitTextToBePresentInElement(WebElement we, String text) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.textToBePresentInElement(we, text));
	}

	public static void waitTitleIs(String title) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.titleIs(title));
	}
}