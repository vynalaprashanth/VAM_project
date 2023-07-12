package SeleniumExamples;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffMail {
	static String url="https://www.rediff.com/";
	static WebDriver driver;
	
	@BeforeTest
	public void openweb() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
		
  @Test
  public void Account() throws InterruptedException {
	  
	 WebElement ac= driver.findElement(By.xpath("//a[text()='Create Account']"));
	  ac.click();
	  try {
		  if(ac.isDisplayed()) {
			  System.out.println("Opened");
		  }
			  
		  
	  }catch(Exception e){
		  System.out.println("NotOpened");
		  
	  }
	  
	  driver.findElement(By.linkText("terms and conditions")).click();
	
//     driver.findElement(By.xpath("//input[@value='OK']")).click();
	    int links = driver.findElements(By.tagName("a")).size();
      System.out.println(links);
	  
	  
	  
	  
  }
}
