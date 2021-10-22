package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mm.utils.ConfigReader;
import com.mm.utils.IConstants;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
	
	public static WebDriver driver = null;
	public ConfigReader cfgRdr = null;
	
	@Before
	public void setupBrowser() {
		cfgRdr = new ConfigReader();
		cfgRdr.readConfig();
		String browser = cfgRdr.getBrowser();
		if(browser.equalsIgnoreCase("chrome"))
			openChrome();
		else if(browser.equalsIgnoreCase("firefox"))
			openFirefox();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void openChrome() {
		System.setProperty("webdriver.chrome.driver", IConstants.chromeDriverPath);
		driver = new ChromeDriver();
	}

	public void openFirefox() {
		System.setProperty("webdriver.gecko.driver", IConstants.chromeDriverPath);
		driver = new FirefoxDriver();
	}
	
	@After
	public void quitBrowser() {
		driver.quit();
	}
	
	public static String getTitle() {
		return driver.getTitle();
	}
	
}
