package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Base {
	public static WebDriver driver;
	public static Properties prop;

	public Base() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("config/Configuration.properties");

			prop.load(fis);
		}
		catch (IOException e) {
			e.getMessage();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();

			options.addArguments("--incognito");
			options.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
			System.setProperty("webdriver.chrome.driver", "/Program Files/Automation Tools/Drivers/chromedriver.exe");

			driver = new ChromeDriver(options);
		}
		else if (browserName.equals("ie")) { // Need to put TabProcGrowth with value 0 in HKEY_CURRENT_USER\Software\Microsoft\Internet Explorer\Main in Registry.
			InternetExplorerOptions options = new InternetExplorerOptions();

			options.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, true);
			options.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
			options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			options.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
			System.setProperty("webdriver.ie.driver", "/Program Files/Automation Tools/Drivers/IEDriverServer.exe");

			driver = new InternetExplorerDriver(options);
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // Not recommended.
		driver.get(prop.getProperty("url"));

		if (browserName.equals("ie")) {
			driver.get("javascript:document.getElementById('overridelink').click();");
		}
	}
}