package appObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAppObjects {
	
	
	@FindBy(name="user")WebElement username;
	public LoginAppObjects InsertUserName(String un) {
		
		username.sendKeys(un);
		return this;
	}
	
	
	@FindBy(name = "pass")WebElement password;
	public LoginAppObjects InsertPassword(String pw) {
		password.sendKeys(pw);
		return this;
	}
	
	
	@FindBy(name="btnSubmit")WebElement submit;
	public LoginAppObjects clickSubmit() {
		submit.click();
		return this;
	}
	
	@FindBy(linkText="Logout")WebElement Logout;
	public LoginAppObjects clickLogOut() {
		Logout.click();
		return this;
	}
	
	
	
	
	
	

}
