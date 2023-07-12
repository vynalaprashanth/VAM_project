package CucumberTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserNewAccount {
	


	@When("user click on free account type button")
	public void user_click_on_free_account_type_button() {
	   
		System.out.println("user click free account");
	}
	
	
	@When("user insert account details")
	public void user_insert_account_details() {
	   System.out.println("user insert details");
	}
	
	
	@Then("click submit")
	public void click_submit() {
	   
		System.out.println("click submit");
	}




}
