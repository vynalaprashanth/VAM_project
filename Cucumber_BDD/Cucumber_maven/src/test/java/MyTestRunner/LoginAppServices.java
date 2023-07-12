package MyTestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAppServices {
	

	@Given("user start home page")
	public void user_start_home_page() {
	System.out.println("start page");    
	}
	@When("user insert username and password")
	public void user_insert_username_and_password() {
		System.out.println("get username and password");  
	}
	
	@When("user insert username")
	public void user_insert_username() {
	   System.out.println("Enter username");
	}
	@When("user insert Invalid password")
	public void user_insert_invalid_password() {
	   System.out.println("Enter InvalidPassword");
	}
	@Then("user click submit button")
	public void user_click_submit_button() {
		System.out.println("click on submit");  
	}
	@Then("user close browser")
	public void user_close_browser() {
	
		System.out.println("close browser");  
	}


	
	
	
	

	@When("user click on free account type button")
	public void user_click_on_free_account_type_button() {
	   System.out.println("click free account");
	}
	@When("user insert account details")
	public void user_insert_account_details() {
	   System.out.println("enter account details");
	}
	@Then("click submit")
	public void click_submit() {
	   System.out.println("click submit");
	}



	
}
