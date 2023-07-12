package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeExamples {
	
	static String url="https://www.mycontactform.com/";
	static WebDriver driver;
	
	@BeforeTest
	public void openweb() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
  @Test(priority=1,description="Valid Login")
  public void test1() {
	  
	  driver.findElement(By.name("user")).sendKeys("qatrainer");
	  driver.findElement(By.name("pass")).sendKeys("admin123");
	   driver.findElement(By.name("btnSubmit")).click();
	   driver.findElement(By.xpath("//a[text()='Logout']")).click();
	   
	  System.out.println("Passed Test1");
  }  
		
	  @Test(priority=0,description="InValid Login")
	  public void test2() {
		  
		  driver.findElement(By.name("user")).sendKeys("qatrainer");
		  driver.findElement(By.name("pass")).sendKeys("admin12");
		   driver.findElement(By.name("btnSubmit")).click();
		   
		   try{
			   
			   driver.findElement(By.xpath("//a[text()='Logout']")).click();
			   
		   }catch(NoSuchElementException e) {
//			   e.printStackTrace();
			   System.out.println("Failed test2");
		   }
		   
	  }
	  
  
  @AfterTest
  public void closeweb() {
	  driver.close();
  }
}
