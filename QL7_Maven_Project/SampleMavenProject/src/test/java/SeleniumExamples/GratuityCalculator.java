package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GratuityCalculator {
  @Test
  public void Gratuitycalculator() throws InterruptedException {
  
  WebDriverManager.chromedriver().setup();
  WebDriver driver= new ChromeDriver();
  driver.manage().window().maximize();
  
  double salary=5000;
  double years=5;
  double total=Math.round((salary*years*15/26)*100)/100.0;
  
  System.out.println(total);
  
  
  driver.get("https://www.moneycontrol.com/personal-finance/tools/gratuity-calculator.html");
  
 
  
	  driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click(); 
	  driver.findElement(By.xpath("//span[@class='rdbx openblock']")).click();
	  
	 String sal=String.valueOf(salary);
	 String yr=String.valueOf(years);
	 
	  driver.findElement(By.xpath("//input[@ id='salary']")).sendKeys(sal);
	  driver.findElement(By.xpath("//input[@id='year']")).sendKeys(yr);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[@id='graduity_calc_btn']")).click();
	 
	String amt=  driver.findElement(By.id("graduity_amt")).getText();
	
	 // String y=amt.replace("","", "");
	   String x= amt.replace(",", "");
	    
	   	     System.out.println(x);
	     double y=Double.parseDouble(x);



	     if(total==y) {
	          System.out.println("passed");
	      }else {
	          System.out.println("failed");
	      }
	      
	  
	  
	  
	  driver.close();        
  
  
  }
  
  
  
}
