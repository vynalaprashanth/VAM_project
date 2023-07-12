package appBase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import SeleniumUtils.BrowserFactory;

public class BaseClass {
	
	public static BrowserFactory browser;
	public static WebDriver driver;
	
	@BeforeSuite
	public void setupSuite() {
		browser = new BrowserFactory();
	}
	
	
	@BeforeTest
	public void startBrowser() {
		
		driver = browser.getBrowser("chrome", "http://www.mycontactform.com");
	}

	
	
	
}
