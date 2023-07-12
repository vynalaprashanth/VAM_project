package parabankpr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practicepara {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();	
		
		WebDriver driver=new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
        
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("customer.firstName")).sendKeys("vynala");
		driver.findElement(By.name("customer.lastName")).sendKeys("prashanth");
		driver.findElement(By.id("customer.address.street")).sendKeys("3-2-11/197,mallapur");
		driver.findElement(By.name("customer.address.city")).sendKeys("Hyderabad");
		driver.findElement(By.name("customer.address.state")).sendKeys("Telangana");
		driver.findElement(By.name("customer.address.zipCode")).sendKeys("500076");
		driver.findElement(By.name("customer.phoneNumber")).sendKeys("9989163980");
		driver.findElement(By.id("customer.ssn")).sendKeys("99");
		
		driver.findElement(By.id("customer.username")).sendKeys("venny3");
		driver.findElement(By.id("customer.password")).sendKeys("Venny@12");
		driver.findElement(By.id("repeatedPassword")).sendKeys("Venny@12");
		driver.findElement(By.xpath("//td/input[@type='submit']")).click();
	String p = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p")).getText();
	System.out.println(p);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Log Out']")).click();
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("venny3");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Venny@12");
	driver.findElement(By.xpath("//div//input[@value='Log In']")).click();
	Thread.sleep(3000);
	String pr = driver.findElement(By.xpath("(//div[@id='rightPanel'])//div[@class='ng-scope']")).getText();
	
	System.out.println(pr);
	
	}

}
