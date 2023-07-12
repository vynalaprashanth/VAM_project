package SeleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import SeleniumUtils.BrowserFactory;
import appBase.BaseClass;
import appElements.LoginAppObjects;

public class LoginService extends BaseClass {
	
	WebDriver driver;
	//BrowserFactory browser = new BrowserFactory();
	LoginAppObjects loginpage;
	
	String username,password;
	{
		username= "qatrainer";
		password = "admin123";
	}
	
	
	public String getusername() {
		return username;
	}
	public String getpassword() {
		return password;
	}
	
	
	
	
	
	@Test
	public void test1() {
		
		//How to work Page Object Model Frame work
		
		LoginService ls = new LoginService();
		
		
		
		loginpage = PageFactory.initElements(driver, LoginAppObjects.class);
		loginpage.Insertusername(ls.getusername()).Insertpassword(ls.getpassword()).Clicksubmit().clickSignout();
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
  
}
