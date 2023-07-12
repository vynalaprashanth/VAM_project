package AppTestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BrowserConfig.BrowserDriver;
import appBase.BaseClass;
import appObjects.LoginAppObjects;
import appUtils.PropertyLoader;

public class loginAppService extends BaseClass {
	
	LoginAppObjects login; 
	PropertyLoader readproperty;
	
	@BeforeSuite
	public void setupSuite() {
		login = new LoginAppObjects();
		readproperty = new PropertyLoader();
	}
	
	@BeforeTest
	public void startLoginPage() {
		
		login = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginAppObjects.class);
		
	}
	
	
	@Test(priority=1)
	public void verifyValidLogin() {
		
		login.InsertUserName(readproperty.getUserName()).InsertPassword(readproperty.getvalidPassword()).clickSubmit().clickLogOut();
		
	}
	
	
	@Test(priority=0)
	public void verifyInvalidLogin() {
		
		login.InsertUserName(readproperty.getUserName()).InsertPassword(readproperty.getInvalidPassword()).clickSubmit().clickLogOut();
		
	}
	

}
