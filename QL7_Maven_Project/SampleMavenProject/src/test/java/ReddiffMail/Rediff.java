package ReddiffMail;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff {
	
	String url= "https://money.rediff.com/gainers";
	 WebDriver driver;
  @BeforeTest
  public void validate() {
	 
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get(url);
  }
	  
  @Test
	  public void checkrediff() throws InterruptedException{
	  
	  
	 
	// 
		  
		  List<WebElement>list= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td/a"));
		  int listcount= list.size();
		  System.out.println(listcount);
		  
		  
		 
		  Set<String>set= new HashSet<String>();
		  Set<String>tset= new TreeSet<String>(set);
			
		  for(int i=0;i<10;i++) {
			  
			 
			  WebElement element= list.get(i);
			  String ln= element.getText();
			 
		
			  tset.add(ln)  ;
		  }
		  
//		
//			 for(String linkdata:set) {
//				 System.out.println(linkdata);
//			 }
		  Thread.sleep(3000);
			  for(String linkdata:tset) {
				  
				  driver.findElement(By.linkText(linkdata)).click();
				  driver.navigate().back();
				  System.out.println(linkdata);
			  }
			  
		  
		 
		 }
	  @AfterTest
	  public void close() {
		  driver.close();
	  }
		  
	  }	  
  

