package SBIServices;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SBIlogin {

	  JFrame f;
	//  @FindBy(linkText ="LOGIN")WebElement button1;
	     @FindBy(xpath="/html/body/div/div/div[3]/div[1]/div[2]")WebElement button2;
	    
	    @FindBy(name="userName")WebElement uname;
	   
	    @FindBy(name="password")WebElement pass;
	    @FindBy(name="loginCaptchaValue")WebElement captcha;
	    @FindBy(id="Button2")WebElement submit;
	    @FindBy(xpath="//*[@id=\"login_block\"]/div[3]")WebElement umessage;  

	    public SBIlogin getbutton() {
	        button2.click();
	        return this;
	    }
	    public SBIlogin getuname(String em) {
	        uname.sendKeys(em);
	        return this;
	    }
	    public SBIlogin getpassword(String pa) {
	        pass.sendKeys(pa);
	        return this;
	    }
	  
	    
	    public SBIlogin getcaptcha() {
	        String name=JOptionPane.showInputDialog(f,"Enter Captcha");
	        captcha.sendKeys(name);
//	        captcha.sendKeys(name);
	        return this;
	    }
	    public SBIlogin clicksubmit() {
	        submit.click();
	        try {
	            System.out.println(umessage.getText());
	            
	        }catch(NoSuchElementException e) {
	            e.printStackTrace();
	        }
       
//	    public SBIlogin usermessage(String um) {
//	        umessage.click();


	       return this;
	    }
	    
	}
	  
	  
  

