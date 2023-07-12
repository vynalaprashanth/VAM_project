package CucumberTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAppService 
{
    
	


	@Given("user start home page")
	public void user_start_home_page() {
	 
		System.out.println("start browser");
		
	}
	
	
	@When("user insert username and password")
	public void user_insert_username_and_password() {
		
		System.out.println("insert username and password");
	    
	}
	


	@When("user insert username and invalidpassword")
	public void user_insert_username_and_invalidpassword() {
	    
		System.out.println("verify invalid login");
	}



	
	@Then("user click submit button")
	public void user_click_submit_button() {
	    System.out.println("click submit ");
	}
	
	
	@Then("user close browser")
	public void user_close_browser() {
	   
		System.out.println("close browser");
	}



	
	
	
	
}
