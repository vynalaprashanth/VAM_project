package TestNg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
	String url = "https://demowebshop.tricentis.com";
	WebDriver driver;
@Test
	public void tricentisTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@class='button-1 register-button']")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Prashanth");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Vynala");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vynalaprashanth@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Venny@1234");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Venny@1234");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();

}
}



