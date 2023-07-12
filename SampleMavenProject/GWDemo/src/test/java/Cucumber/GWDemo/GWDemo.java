package Cucumber.GWDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GWDemo {

	WebDriver driver;
	String url= "http://23.20.231.101:8280/cc/ClaimCenter.do";

	
	
	@Given("user is on web browser")
	public void user_is_on_web_browser() {
		WebDriverManager.chromedriver().setup();

		driver= new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("URL is Printed");

	}

	@And("user clicks on the url and enters to login page")
	public void user_clicks_on_the_url_and_enters_to_login_page() {
		driver.get(url);

	}

	@When("the user enters  username and password")
	public void the_user_enters_username_and_password() {
        
		driver.findElement(By.name("Login-LoginScreen-LoginDV-username")).sendKeys("su");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("gw");

	}

	@And("click ok submit button")
	public void click_ok_submit_button() {

     driver.findElement(By.xpath("//div[@class='gw-action--inner gw-hasDivider']")).click();
		
		
	}
@Then("click search button")
	public void click_Search_button() {

		
		driver.findElement(By.xpath("//*[@id=\"TabBar-DesktopTab\"]/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"TabBar-SearchTab-Search_ClaimSearchesGroup\"]/div[1]/div[2]")).click();

	}
}
