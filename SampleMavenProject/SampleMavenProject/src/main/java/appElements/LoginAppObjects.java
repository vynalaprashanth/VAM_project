package appElements;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAppObjects {
	
	@FindBy(name="user")WebElement uname;
	@FindBy(name = "pass")WebElement pword;
	@FindBy(name="btnSubmit")WebElement submit;
	@FindBy(linkText = "Logout")WebElement signout;
	@FindBy(id = "right_col_top_err")WebElement usermessage;
	
	
	public LoginAppObjects Insertusername(String un) {
		
		
		uname.sendKeys(un);
		return this;
		
	}
	
	
	public LoginAppObjects Insertpassword(String pw) {
		
		pword.sendKeys(pw);
		return this;
	}
	
	public LoginAppObjects Clicksubmit() {
		
	
		
		submit.click();
	
		try {
			
			System.out.println(usermessage.getText());
			
			
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		
		
		
		return this;
	}
	
	public LoginAppObjects clickSignout() {
		
	try {
		
		if(signout.isEnabled()) {
			signout.click();
			System.out.println("Login success");
		}
		
	}catch(NoSuchElementException s) {
		s.printStackTrace();
	}
		
		
		
		return this;
		
	}
	

}
