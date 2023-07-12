package TestNg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends test1 {

	@Test
	public void successlogin() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='user']")).sendKeys("qatrainer");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='btnSubmit']")).click();
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Successfull Login");

	}

}
