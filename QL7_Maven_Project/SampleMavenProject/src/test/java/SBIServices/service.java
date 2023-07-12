package SBIServices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class service extends SBIlogin {
	
	WebDriver driver;
	//BrowserFactory browser = new BrowserFactory();
	
	SBIlogin lo;
	
  @Test
  public void fd() {
	  
	  SBIlogin loginpage;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	  service te = new service();
		
		
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		lo=PageFactory.initElements(driver, SBIlogin.class);
		lo.getbutton().getuname("maueW").getpassword("JHS").getcaptcha().clicksubmit();
  }
}
