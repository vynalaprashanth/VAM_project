package SeleniumUtils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class BrowserFactory {
	
	static WebDriver driver;
	
	public WebDriver getBrowser(String browserName,String browserUrl) {
		
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
						
		}
		
		
		driver.get(browserUrl);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		if(browserUrl.equals(driver.getCurrentUrl())) {
			System.out.println("URL verified");
		}else
		{
			System.out.println("Does not verified");
		}
		
		if(driver.getPageSource().contains("Gmail")) {
			System.out.println("Link verified");
		}else
		{
			System.out.println("Does not");
		}
		
		
		if(driver.getPageSource().contains("Images")) {
			System.out.println("Link verified");
		}else
		{
			System.out.println("Does not");
		}
		
		
		
		
		
		return driver;
		
		
		
		
	}
	
	//To close browser
	public void closeBrowser() {
		driver.close();
	}
	
	

}
