package SeleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import appBase.BaseClass;
import appElements.SignUpFormAppObjects;

public class SignUpFormService extends BaseClass {
	
	
	WebDriver driver;
	SignUpFormAppObjects signup;
	
	@Test
	public void verifySignUp() {
		
		
		
		signup = PageFactory.initElements(driver, SignUpFormAppObjects.class);
		signup.clickSignUp().insertEmail("test@gmail.com");
		
		
	}
	
	
	

}
