package MyTestRunner;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class googleSearch {

WebDriver driver;
String ur="https://www.google.com";
	
	@Given("browser is open")
	public void browser_is_open() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(ur);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("validate- Browser is open");
	}

	@And("user is on search page")
	public void user_is_on_search_page() {
		
     WebElement drive=driver.findElement(By.name("q"));
     drive.sendKeys("amazon.in");
     drive.sendKeys(Keys.ENTER);
     driver.findElement(By.xpath("//*[@id=\"tads\"]//a/div[1]/span")).click();
		System.out.println("validate- user on search page");

		
	}

	@When("the user type text")
	public void the_user_type_text() {
		
	WebElement dr=	driver.findElement(By.id("twotabsearchtextbox"));
dr.sendKeys("iphone 13");
dr.sendKeys(Keys.ENTER);
System.out.println("validate- user type text");

	}

	@And("click on the search button")
	public void click_on_the_search_button() {
		
		driver.findElement(By.xpath("//*[(text()='Apple iPhone 13 (128GB) - Blue')]")).click();
		
		System.out.println("validate- clicked on search button");

	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
		System.out.println("validate- user navigate to search button");

	
	}
	@Then("user is logged out")
	public void user_is_logged_out() {
 
	System.out.println("validate - user logged out successfully");
	}
	
	
}
