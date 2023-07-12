package SeleniumExamples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ScreenShot;

public class practice2 {
	static ScreenShot ss= new ScreenShot();
	static String url="https://www.mycontactform.com/";
	static WebDriver driver;
	
	@BeforeTest
	public void openweb() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	} 
	
  @Test
  public void test3() throws IOException {
	  
	  driver.findElement(By.name("user")).sendKeys("qatrainer");
	  ss.capturescreen(driver, "user");
	  driver.findElement(By.name("pass")).sendKeys("admin123");
	  ss.capturescreen(driver, "pass");
	   driver.findElement(By.name("btnSubmit")).click();
		  ss.capturescreen(driver, "btnSubmit");
	   driver.findElement(By.xpath("//a[text()='Logout']")).click();
	   
	driver.close();  
	System.out.println("passed test3");
  } 
  
}
