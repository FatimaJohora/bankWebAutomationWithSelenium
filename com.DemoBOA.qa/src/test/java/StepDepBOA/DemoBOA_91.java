package StepDepBOA;

import com.ActionBOA.qa.HomepageActionBOA;
import com.UtilityBOA.qa.BaseBOA;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoBOA_91  extends BaseBOA {
	
	HomepageActionBOA  homepageActionBOA  = new HomepageActionBOA();
	
	@Given("^Launch the application<\"([^\"]*)\">$")
	public void launch_the_application(String URL) throws Throwable {
		
		lunchURL(URL);
	}
	
	@When("^Enter an invalid user Id$")
	public void enter_an_invalid_user_Id() throws Throwable {
		
		homepageActionBOA.EnteraninvaliduserId();
	   
	}

	@When("^Enter an invalid password$")
	public void enter_an_invalid_password() throws Throwable {
		
		homepageActionBOA.Enteraninvalidpassword();
	   
	}

	@When("^Click the Login button$")
	public void click_the_Login_button() throws Throwable {
		
		homepageActionBOA.ClicktheLoginbutton();
		Thread.sleep(5000);
	   
	}

	@Then("^Verify user can not log in successfully$")
	public void verify_user_can_not_log_in_successfully() throws Throwable {
		
		homepageActionBOA.Verifyusercannotloginsuccessfully();
	   
	}
	
	@Then("^Verify an error message should display with an invalid log in$")
	public void verify_an_error_message_should_display_with_an_invalid_log_in() throws Throwable {
	   
		homepageActionBOA.Verifyanerrormessageshoulddisplaywithaninvalidlogin();
	}


  
	
	

}
