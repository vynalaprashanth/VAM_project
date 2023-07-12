package appBase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import BrowserConfig.BrowserDriver;


public abstract class BaseClass {
	
	
	
	
	@Parameters({"chrome","url"})
	@BeforeTest
	public void startBrowser(String chrome,String url) {
		
		BrowserDriver.getCurrentDriver(chrome).get(url);
		
	}
	
	
	
	
	@AfterTest
	public void closeTest() {
		BrowserDriver.getCurrentDriver().close();
	}

}
