package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class pageObj1 {

	@FindBy(name = "Login-LoginScreen-LoginDV-username")
	WebElement username;

	@FindBy(name = "Login-LoginScreen-LoginDV-password")
	WebElement password;
	@FindBy(xpath = "//*[@id='Login-LoginScreen-LoginDV-submit']/div")
	WebElement loginButton;

	private static WebDriver driver;

	
	public void insertUserName() {
		username.sendKeys("su");
		

		
	}
	public void insertPassowrd() {
		
		password.sendKeys("gw");

		
	}
	public void login() {
	loginButton.click();
	}
}
