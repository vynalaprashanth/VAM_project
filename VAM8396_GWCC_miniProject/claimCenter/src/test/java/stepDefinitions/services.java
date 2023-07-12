package stepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.*;
import pageObject.pageObj1;
import pageObject.pageObj2;
import pageObject.pageObj3;
import utillls.BrowserDriver;
import utillls.BrowserFactory;



public class services {
	WebDriver driver;
 public  pageObj1 ob1 =	PageFactory.initElements(BrowserDriver.getCurrentDriver(),pageObj1.class );	;
 public  pageObj2 ob2=	PageFactory.initElements(BrowserDriver.getCurrentDriver(),pageObj2.class );	 ;
 public  pageObj3 ob3 =	PageFactory.initElements(BrowserDriver.getCurrentDriver(),pageObj3.class );	;
 BrowserFactory bf = new BrowserFactory();
	
	
@Given("I open base url")
public void i_open_base_url() {
	 
	 BrowserDriver.getCurrentDriver("edge").get("http://23.20.231.101:8280/cc/ClaimCenter.do");
	 
}

@When("I pass correct username and password")
public void i_pass_correct_username_and_password() {


		ob1=PageFactory.initElements(BrowserDriver.getCurrentDriver(),pageObj1.class );	

ob1.insertUserName();
ob1.insertPassowrd();
}

@Then("I login")
public void i_login() {
	 ob1.login();
}
////2
@When("Find Policy")
public void find_policy() {
	 
	

	 
	 ob2.cliamAndNewClaim();
	 
	 
}

@Then("Enter the Policy Number")
public void enter_the_policy_number() {
	 ob2.policyNumber();
	 
}

@Then("Click on Search")
public void click_on_search() throws InterruptedException {
	 ob2.searching();
	 Thread.sleep(3000);
}

@Then("I select")
public void i_select() {
	ob2.selectBoxM();
}


@When("I enter loss date")
public void i_enter_loss_date() {
	ob2.dateValue();
}

	

@When("Select the How Reported from the dropdown list")
public void select_the_how_reported_from_the_dropdown_list() {
ob2.basicInfo();
}
@Then("Select the Name")
public void select_the_name() {
	ob2.SelectName();
}
@Then("Choose New Person")
public void choose_new_person() {
	ob2.ChooseNewPerson();
}
@Then("Enter First Name")
public void enter_first_name() {
	ob2.EnterFirstName();
}
@Then("Enter Last Name")
public void enter_last_name() {
	ob2.EnterLastName();
}
@Then("Click on Update")
public void click_on_update() {
	ob2.ClickUpdate();
}
@Then("Choose Related to Insured as Claimant from dropdown list")
public void choose_related_to_insured_as_claimant_from_dropdown_list() {
ob2.relavtiveType();
}



@Then("Select Loss Cause from the dropdown list")
public void select_loss_cause_from_the_dropdown_list() {
	ob2.SelectLossCause();
}
@Then("Select Location from the dropdown list")
public void select_location_from_the_dropdown_list() {
	ob2.selectLocation();
}
//3
 @When("click search drop down and select claims")
 public void click_search_drop_down_and_select_claims() throws InterruptedException {
	

 ob3.cliamsDD();
 
 
 }

 @Then("Search Claims")
 public void search_claims() throws InterruptedException {
	 ob3.searchClaims();
 }

 @When("click search drop down and select Activities")
 public void click_search_drop_down_and_select_activities() throws InterruptedException {
 
 ob3.cliamsDD();
 }

 @Then("Search Activities")
 public void search_activities() throws InterruptedException {
 ob3.activites();
 }
 @When("click search drop down and select Recoveries")
 public void click_search_drop_down_and_select_recoveries() throws InterruptedException {
 ob3.cliamsDD();}

 @Then("Search Recoveries")
 public void search_recoveries() throws InterruptedException {
 ob3.recovery();}
	    
	}
