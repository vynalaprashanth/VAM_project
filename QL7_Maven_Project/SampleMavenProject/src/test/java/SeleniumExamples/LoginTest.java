package SeleniumExamples;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTest 

{   @Test

   public void VerifyLoginCredentials() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver= new ChromeDriver();
	
	   /* driver.get("https://www.amazon.in/");
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("One Plus");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Thread.sleep(2000); */
	    driver.get("https://www.moneycontrol.com/");
	    driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Inthandam Song");
	    driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
	    Thread.sleep(2000);
        driver.close();
   }
}
