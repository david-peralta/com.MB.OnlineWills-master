package utilities;

import cucumber.api.Scenario;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.imageio.ImageIO;
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
	static Actions action = new Actions(driver);
	static JavascriptExecutor js = (JavascriptExecutor) driver;
	static WebDriverWait wait;

	public CommonFunctions(WebDriver dr) {

	}

	// ================================================== Input Functions ==================================================
	public static void attachToUploadElement(WebElement we, String filePaths) {
		try {
			we.sendKeys(filePaths);
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void clearThenEnterElementValue(WebElement we, String value) {
		try {
			elementDisplayed(we);
			we.clear();
			LogFunctions.info("Value in \"" + getElementXPath(we) + "\" element cleared.");
			enterElementValue(we, value);
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void clickElement(WebElement we) {
		wait = new WebDriverWait(driver, 30);

		try {
			if (wait.until(ExpectedConditions.elementToBeClickable(we)) != null) {
				we.click();
				LogFunctions.info("Element \"" + getElementXPath(we) + "\" clicked.");
			}
			else {
				LogFunctions.info("Element \"" + getElementXPath(we) + "\" not clicked.");
			}
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void clickKeys(String keys) { // Use Keys.chord(KEY1, KEY2, ...) for the value to be passed.
		try {
			action.sendKeys(keys).perform();
			LogFunctions.info("\"" + keys + "\" keys pressed.");
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
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
		wait = new WebDriverWait(driver, 30);

		try {
			if (wait.until(ExpectedConditions.elementToBeClickable(we)) != null) {
				action.doubleClick(we).build().perform();
				LogFunctions.info("Element \"" + getElementXPath(we) + "\" double clicked.");
			}
			else {
				LogFunctions.info("Element \"" + getElementXPath(we) + "\" not double clicked.");
			}

		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void dragAndDrop(WebElement sourceWE, WebElement destinationWE) {
		wait = new WebDriverWait(driver, 30);

		try {
			if (wait.until(ExpectedConditions.elementToBeClickable(sourceWE)) != null && wait.until(ExpectedConditions.elementToBeClickable(destinationWE)) != null) {
				action.clickAndHold(sourceWE).pause(2500).moveToElement(destinationWE).release().build().perform();
			}
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void enterElementValue(WebElement we, String value) {
		try {
			elementDisplayed(we);

			for (int i = 0; i < value.length(); i++) {
				we.sendKeys(value.substring(i, i + 1));
			}

			LogFunctions.info("Finished entering value \"" + value + "\" into \"" + getElementXPath(we) + "\".");
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void highlightElement(WebElement we) {
		try {
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", we);
			Thread.sleep(500);
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void hoverOverElement(WebElement we) {
		try {
			elementDisplayed(we);
			action.moveToElement(we).build().perform();
			LogFunctions.info("Hovered over \"" + getElementXPath(we) + "\" element.");
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void rightClickElement(WebElement we) {
		wait = new WebDriverWait(driver, 30);

		try {
			if (wait.until(ExpectedConditions.elementToBeClickable(we)) != null) {
				action.contextClick(we).build().perform();
				LogFunctions.info("Element \"" + getElementXPath(we) + "\" right clicked.");
			}
			else {
				LogFunctions.info("Element \"" + getElementXPath(we) + "\" not right clicked.");
			}
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void screenshotFailedTest(Scenario scenario) {
		try {
			if (scenario.isFailed()) {
				Calendar calendar = Calendar.getInstance();
				SimpleDateFormat sdtf = new SimpleDateFormat("MM.dd.yyyy_HHmm");

				// TakesScreenshot ts = (TakesScreenshot) driver;
				// File fileSource = ts.getScreenshotAs(OutputType.FILE);
				// FileUtils.copyFile(fileSource, new File("target/failedscreenshots/" + scenario.getId().substring(0, scenario.getId().split(";")[0].indexOf(":")).toUpperCase() + "_S" +
				// scenario.getName().substring(0, scenario.getName().indexOf(":")) + "-" + sdtf.format(calendar.getTime()) + ".png"));

				BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
				ImageIO.write(image, "png", new File("target/failedscreenshots/" + scenario.getId().substring(0, scenario.getId().split(";")[0].indexOf(":")).toUpperCase() + "_S" + scenario.getName().substring(0, scenario.getName().indexOf(":")) + "-" + sdtf.format(calendar.getTime()) + ".png"));

				LogFunctions.info("Test Failed. Screenshot taken.");
			}
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void scrollToBottomOfPage() {
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		wait(5000, false);
		LogFunctions.info("Scrolled to bottom.");
	}

	public static void scrollToElement(WebElement we) {
		// js.executeScript("arguments[0].scrollIntoView(true);", we);
		js.executeScript("window.scrollTo(" + we.getLocation().getX() + ", " + (we.getLocation().getY() - 100) + ")");
		wait(5000, false);
		LogFunctions.info("Scrolled to top.");
	}

	public static void scrollToTopOfPage() {
		js.executeScript("window.scrollTo(0,0)");
		wait(5000, false);
		LogFunctions.info("Scrolled to top.");
	}

	public static void selectValueFromDropdown(WebElement we, String value) {
		wait = new WebDriverWait(driver, 30);

		try {
			if (wait.until(ExpectedConditions.elementToBeClickable(we)) != null) {
				Select dropdown = new Select(we);

				dropdown.selectByVisibleText(value);
				LogFunctions.info("Value \"" + value + "\" selected for \"" + getElementXPath(we) + "\" dropdown.");
			}
			else {
				LogFunctions.info("Dropdown element \"" + getElementXPath(we) + "\" not clickable.");
			}

		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void switchFrameByXPath(WebElement we) { // String xPath <- Provide a unique xPath for the desired frame.
		wait = new WebDriverWait(driver, 30);

		try {
			// Integer numberOfFrames = driver.findElements(By.tagName("iframe")).size();
			//
			// for (int i = 0; i <= numberOfFrames; i++) {
			// driver.switchTo().frame(i);
			//
			// if (driver.findElements(By.xpath(xPath)).size() > 0) {
			// LogFunctions.info("Switched to frame \"" + i + "\".");
			// break;
			// }
			// else {
			// driver.switchTo().parentFrame();
			// LogFunctions.info("Frame not switched.");
			// }
			// }

			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(we));
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

	public static void unhighlightElement(WebElement we) {
		try {
			js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", we);
			Thread.sleep(500);
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}
	}

	public static void verifyLinks() {
		try {
			List<WebElement> links = driver.findElements(By.tagName("a"));

			for (int i = 0; i < links.size(); i++) {
				WebElement ele = links.get(i);
				String link = ele.getAttribute("href");
				URL url = new URL(link);
				HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

				httpURLConnect.setConnectTimeout(3000);
				httpURLConnect.connect();

				if (httpURLConnect.getResponseCode() == 200) {
					System.out.println(link + " - " + httpURLConnect.getResponseMessage());
				}
				if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
					System.out.println(link + " - " + httpURLConnect.getResponseMessage() + " - " + HttpURLConnection.HTTP_NOT_FOUND);
				}
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

	public static String assembleFilePathsToUpload(String filePaths, String filePathToBeAdded) {
		try {
			if (filePaths.isBlank()) {
				filePaths = filePathToBeAdded;
			}
			else {
				filePaths = filePaths + "\n" + filePathToBeAdded;
			}
		}
		catch (Exception e) {
			LogFunctions.error("Error found: " + e);
		}

		return filePaths;
	}

	public static String getElementXPath(WebElement we) {
		String xPath = "";

		try {
			return (String) ((JavascriptExecutor) driver).executeScript("function absoluteXPath(element) {" + "var comp, comps = [];" + "var parent = null;" + "var xpath = '';" + "var getPos = function(element) {" + "var position = 1, curNode;" + "if (element.nodeType == Node.ATTRIBUTE_NODE) {" + "return null;" + "}" + "for (curNode = element.previousSibling; curNode; curNode = curNode.previousSibling) {" + "if (curNode.nodeName == element.nodeName) {" + "++position;" + "}" + "}" + "return position;" + "};" +

				"if (element instanceof Document) {" + "return '/';" + "}" +

				"for (; element && !(element instanceof Document); element = element.nodeType == Node.ATTRIBUTE_NODE ? element.ownerElement : element.parentNode) {" + "comp = comps[comps.length] = {};" + "switch (element.nodeType) {" + "case Node.TEXT_NODE:" + "comp.name = 'text()';" + "break;" + "case Node.ATTRIBUTE_NODE:" + "comp.name = '@' + element.nodeName;" + "break;" + "case Node.PROCESSING_INSTRUCTION_NODE:" + "comp.name = 'processing-instruction()';" + "break;" + "case Node.COMMENT_NODE:" + "comp.name = 'comment()';" + "break;" + "case Node.ELEMENT_NODE:" + "comp.name = element.nodeName;" + "break;" + "}" + "comp.position = getPos(element);" + "}" +

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

	// ================================================== Assert Functions ==================================================
	public static void checkAlertIsDisplayed() {
		Boolean result = true;
		wait = new WebDriverWait(driver, 30);

		if (wait.until(ExpectedConditions.alertIsPresent()) != null) {
			LogFunctions.info("Alert is displayed.");
		}
		else {
			result = false;

			LogFunctions.error("Alert is not displayed.");
		}

		Assert.assertTrue(result);
	}

	public static void checkAlertIsNotDisplayed() {
		Boolean result = true;
		wait = new WebDriverWait(driver, 30);

		if (wait.until(ExpectedConditions.alertIsPresent()) == null) {
			LogFunctions.info("Alert is not displayed.");
		}
		else {
			result = false;

			LogFunctions.error("Alert is displayed.");
		}

		Assert.assertTrue(result);
	}

	public static void checkAlertMessageIsDisplayed(String expectedValue) {
		Boolean result = true;

		checkAlertIsDisplayed();

		if (driver.switchTo().alert().getText().contains(expectedValue)) {
			LogFunctions.info("Alert message \"" + expectedValue + "\" is displayed.");
		}
		else {
			result = false;

			LogFunctions.error("Alert message \"" + expectedValue + "\" is not displayed.");
		}

		Assert.assertTrue(result);
	}

	public static void checkDropdownOptionsAvailable(WebElement we, String[] expectedValues) {
		Boolean result = true;
		List<WebElement> options = we.findElements(By.xpath(".//option"));
		int index = 0;

		elementDisplayed(we);

		for (WebElement option: options) {
			if (!option.getText().equals(expectedValues[index])) {
				result = false;

				LogFunctions.error("Option \"" + option.getText() + "\" is not in \"" + getElementXPath(we) + "\" dropdown.");

				break;
			}

			index = index + 1;
		}

		if (result) {
			LogFunctions.info("All options given are in \"" + getElementXPath(we) + "\" dropdown.");
		}

		Assert.assertTrue(result);
	}

	public static void checkFeedbackMessageDisplayed(String expectedValue) {
		Boolean result = true;
		wait = new WebDriverWait(driver, 30);

		if (wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(text(), '" + expectedValue + "')]")))) != null) {
			LogFunctions.info("Feedback message \"" + expectedValue + "\" displayed.");
		}
		else {
			result = false;

			LogFunctions.error("Feedback message \"" + expectedValue + "\" not displayed.");
		}

		Assert.assertTrue(result);
	}

	public static void checkFeedbackMessageNotDisplayed(String expectedValue) {
		Boolean result = true;
		List<WebElement> wes = driver.findElements(By.xpath("//span[contains(text(), '" + expectedValue + "')]"));

		if (wes.size() > 0) {
			for (int i = 1; i <= wes.size(); i++) {
				WebElement we = wes.get(i - 1);

				if (we.isDisplayed()) {
					result = false;

					LogFunctions.error("Feedback message \"" + expectedValue + "\" displayed.");
					break;
				}
			}
		}

		if (result) {
			LogFunctions.info("Feedback message \"" + expectedValue + "\" not displayed.");
		}

		Assert.assertTrue(result);
	}

	public static void checkIfCheckboxIsNotToggled(WebElement we) {
		Boolean result = true;
		wait = new WebDriverWait(driver, 30);

		if (!wait.until(ExpectedConditions.elementToBeSelected(we))) {
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
		wait = new WebDriverWait(driver, 30);

		if (wait.until(ExpectedConditions.elementToBeSelected(we))) {
			LogFunctions.info("Checkbox \"" + getElementXPath(we) + "\" is toggled.");
		}
		else {
			result = false;

			LogFunctions.error("Checkbox \"" + getElementXPath(we) + "\" is not toggled.");
		}

		Assert.assertTrue(result);
	}

	public static void checkPageTitle(String expected) {
		Boolean result = true;
		wait = new WebDriverWait(driver, 30);

		if (wait.until(ExpectedConditions.titleContains(expected))) {
			LogFunctions.info("Page title \"" + expected + "\" is displayed.");
		}
		else {
			result = false;

			LogFunctions.error("Page title \"" + expected + "\" is not displayed.");
		}

		Assert.assertTrue(result);
	}

	public static void checkPopupOnPage(String expectedPageTitle, String expectedPopupHeader) {
		Boolean result = true;
		wait = new WebDriverWait(driver, 30);

		if (wait.until(ExpectedConditions.titleContains(expectedPageTitle))) {
			if (wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[contains(text(), '" + expectedPopupHeader + "')]")))).isDisplayed()) {
				LogFunctions.info("Popup with header \"" + expectedPopupHeader + "\" on page \"" + expectedPageTitle + "\" is displayed.");
			}
			else {
				result = false;

				LogFunctions.error("Popup with header \"" + expectedPopupHeader + "\" on page \"" + expectedPageTitle + "\" is not displayed.");
			}
		}
		else {
			result = false;

			LogFunctions.error("Not on page \"" + expectedPageTitle + "\".");
		}

		Assert.assertTrue(result);
	}

	public static void elementAttributeContainsValue(WebElement we, String expectedAttribute, String expectedValue) {
		Boolean result = true;
		wait = new WebDriverWait(driver, 30);

		if (wait.until(ExpectedConditions.attributeContains(we, expectedAttribute, expectedValue))) {
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" attribute \"" + expectedAttribute + "\" contains the value \"" + expectedValue + "\".");
		}
		else {
			result = false;

			LogFunctions.error("Element \"" + getElementXPath(we) + "\" attribute \"" + expectedAttribute + "\" does not contain the value \"" + expectedValue + "\".");
		}

		Assert.assertTrue(result);
	}

	public static void elementAttributeDoesNotContainValue(WebElement we, String expectedAttribute, String expectedValue) {
		Boolean result = true;
		wait = new WebDriverWait(driver, 30);

		if (!wait.until(ExpectedConditions.attributeContains(we, expectedAttribute, expectedValue))) {
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" attribute \"" + expectedAttribute + "\" does not contain the value \"" + expectedValue + "\".");
		}
		else {
			result = false;

			LogFunctions.error("Element " + getElementXPath(we) + " attribute " + expectedAttribute + " contains value " + expectedValue + ".");
		}

		Assert.assertTrue(result);
	}

	public static void elementAttributeIsNotPresent(WebElement we, String expectedAttribute) {
		Boolean result = true;

		elementDisplayed(we);

		if (we.getAttribute(expectedAttribute) == null) {
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" attribute \"" + expectedAttribute + "\" is not present.");
		}
		else {
			result = false;

			LogFunctions.error("Element \"" + getElementXPath(we) + "\" attribute \"" + expectedAttribute + "\" is present.");
		}

		Assert.assertTrue(result);
	}

	public static void elementAttributePresent(WebElement we, String expectedAttribute) {
		Boolean result = true;

		elementDisplayed(we);

		if (we.getAttribute(expectedAttribute) != null) {
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" attribute \"" + expectedAttribute + "\" is present.");
		}
		else {
			result = false;

			LogFunctions.error("Element \"" + getElementXPath(we) + "\" attribute \"" + expectedAttribute + "\" is not present.");
		}

		Assert.assertTrue(result);
	}

	public static void elementCssValueContains(WebElement we, String expectedProperty, String expectedValue) {
		Boolean result = true;

		elementDisplayed(we);

		if (we.getCssValue(expectedProperty).contains(expectedValue)) {
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" that contains the css \"" + expectedProperty + "\" value \"" + expectedValue + "\".");
		}
		else {
			result = false;

			LogFunctions.error("Element \"" + getElementXPath(we) + "\" that does not contain the css \"" + expectedProperty + "\" value \"" + expectedValue + "\".");
		}

		Assert.assertTrue(result);
	}

	public static void elementContainsText(WebElement we, String expectedValue) {
		Boolean result = true;
		wait = new WebDriverWait(driver, 30);

		if (wait.until(ExpectedConditions.textToBePresentInElement(we, expectedValue))) {
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" that contains the text \"" + expectedValue + "\" is found.");
		}
		else {
			result = false;

			LogFunctions.error("Element \"" + getElementXPath(we) + "\" that contains the text \"" + expectedValue + "\" is not found.");
		}

		Assert.assertTrue(result);
	}

	public static void elementDisplayed(WebElement we) {
		Boolean result = true;
		wait = new WebDriverWait(driver, 30);

		if (wait.until(ExpectedConditions.visibilityOf(we)).isDisplayed()) {
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
		wait = new WebDriverWait(driver, 30);

		if (wait.until(ExpectedConditions.visibilityOf(we)).isEnabled()) {
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" is enabled.");
		}
		else {
			result = false;

			LogFunctions.error("Element \"" + getElementXPath(we) + "\" is disabled.");
		}

		Assert.assertTrue(result);
	}

	public static void elementHidden(WebElement we) { // Experimental.
		Boolean result = true;

		try {
			if (we.isDisplayed()) {
				result = false;

				LogFunctions.error("Element \"" + getElementXPath(we) + "\" displayed in page.");
			}
			else {
				LogFunctions.info("Element \"" + getElementXPath(we) + "\" not displayed in page.");
			}
		}
		catch (Exception e) {
			LogFunctions.info("Element \"" + getElementXPath(we) + "\" not displayed in page.");
		}
		finally {
			Assert.assertTrue(result);
		}
	}

	public static void textDisplayedInPage(String expectedValue) {
		Boolean result = false;
		List<WebElement> wes = driver.findElements(By.xpath("//*[contains(text(), '" + expectedValue + "')]"));

		if (wes.size() > 0) {
			for (int i = 1; i <= wes.size(); i++) {
				WebElement we = wes.get(i - 1);

				if (we.isDisplayed()) {
					result = true;

					LogFunctions.info("Text \"" + expectedValue + "\" displayed.");
					break;
				}
			}
		}

		if (!result) {
			LogFunctions.error("Text \"" + expectedValue + "\" not displayed.");
		}

		Assert.assertTrue(result);
	}

	public static void textNotDisplayedInPage(String expectedValue) {
		Boolean result = true;
		List<WebElement> wes = driver.findElements(By.xpath("//*[contains(text(), '" + expectedValue + "')]"));

		if (wes.size() > 0) {
			for (int i = 1; i <= wes.size(); i++) {
				WebElement we = wes.get(i - 1);

				if (we.isDisplayed()) {
					result = false;

					LogFunctions.error("Text \"" + expectedValue + "\" displayed.");
					break;
				}
			}
		}

		if (result) {
			LogFunctions.info("Text \"" + expectedValue + "\" not displayed.");
		}

		Assert.assertTrue(result);
	}
}