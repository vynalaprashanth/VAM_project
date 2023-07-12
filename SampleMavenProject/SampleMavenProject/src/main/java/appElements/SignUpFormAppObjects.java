package appElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpFormAppObjects {
	
	@FindBy(xpath="//*[@id=\"right_col_middle\"]/a")WebElement freeAccount;
	@FindBy(name="email")WebElement email;
	
	public SignUpFormAppObjects clickSignUp() {
		
		freeAccount.click();
		return this;
		
	}
	
	
	public SignUpFormAppObjects insertEmail(String em) {
		email.sendKeys(em);
		return this;
	}
	

}
