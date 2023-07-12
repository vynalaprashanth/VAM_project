package Cucumber.DemoOrangeHRM;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
	
	WebDriver driver;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {

    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.get(url);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    //recruitment
    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span")).click();
    Thread.sleep(2000);
   
    
    /*
   // driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")).click();

    //job titile

 //  WebElement title= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]"));
 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")).click();
 Thread.sleep(2000);

 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")).click(); 
   //vacancy
//    title.click();

    WebElement  vacancy=  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]"));
   //hiring manager
    Thread.sleep(2000);
    vacancy.click();
    WebElement hiringmanager= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));
    //status
    Thread.sleep(2000);
    hiringmanager.click();
    WebElement status=  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]"));
 // String st1=status.getText();
    Thread.sleep(2000);

  status.click();
   
    //candidate name

    WebElement candidatename= driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
    Thread.sleep(2000);

    candidatename.sendKeys("Vynala Prashanth");
    
    
    */
    
    
 String title=   driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")).getText();
    
    System.out.println(title);
    
    
    
    
    
    
    
    
    
    
    }
}
