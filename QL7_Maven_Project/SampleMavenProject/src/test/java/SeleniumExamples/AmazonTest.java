package SeleniumExamples;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
	
	
	static WebDriver driver;
	
	int max=20;
	int min=1;
	int range=max-min+1;
	int rand=(int)((Math.random()*range)+min);
  @Test
  public void am() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.amazon.in/");
	
	  List<WebElement> lst = driver.findElements(By.id("searchDropdownBox"));
	  for(int i = 0;i<lst.size();i++) {
		  String list= lst.get(i).getText();
		  System.out.println(list);
		  
		  Select select= new Select(driver.findElement(By.id("searchDropdownBox")));
		  select.selectByIndex(rand);

//      Random rand= new Random();
//	  int random = (int)(Math.random());
//	   
//	  System.out.println(random);
//	    lst.get(random).click();
		  Thread.sleep(2000);
	    WebElement act= driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]"));
	    Actions ads= new Actions(driver);
	    ads.moveToElement(act).perform();
	    
	    List<WebElement> acts = driver.findElements(By.xpath("//*[@id=\"nav-al-container\"]"));
	    		
		  for(int j = 0;j<acts.size();j++) {
			  String ls= acts.get(j).getText();
			  System.out.println(ls);
	            
			  System.out.println(acts.size());
			  
	  
        	driver.close();
	  
	  
	  }
  }
}
}    

