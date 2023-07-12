package MyTestRunner;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


/////Parameterization and Data Driven Testing




public class DemoLoginTest {
	WebDriver driver;

	@Given("browser is opened")
	public void browser_is_opened() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		System.out.println("Validate - browser is opened");


	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver.get("https://example.testproject.io/web/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Validate - user is on login page");
		JavascriptExecutor js=  (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,300)");
		Thread.sleep(3000);
	}

	// (.*)is used to implement the data of user and password of given credentials.
	//^ and $ symbols are used in between username and password to run 1 by 1 credentials
	@When("^user enters (.*) and  (.*)$")
	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys(username);
		
		//Taking Password from the sentence and sending the password into the element dialogue box
		
		 
		//		String dri=	driver.findElement(By.id("passwordHelp")).getText();
		//		String pass=dri.split(" ")[3].trim();
		driver.findElement(By.id("password")).sendKeys(password);

		Thread.sleep(2000);

		System.out.println("Validate - user enters valid crediantials");
	}

	@And("click on submit button")
	public void click_on_submit_button() {
		driver.findElement(By.id("login")).click();	

		System.out.println("Validate - click on submit button");
	}

	@Then("user logged into the url successfully")
	public void user_logged_into_the_url_successfully() {

		driver.findElement(By.id("logout")).click();
		System.out.println("Validate - user logged into the url successfully");
		driver.close();
		driver.quit();
	}

}
