package StepDepBOA;

import com.ActionBOA.qa.HomepageActionBOA;
import com.UtilityBOA.qa.BaseBOA;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoBOA_92 extends BaseBOA {
	
	HomepageActionBOA  homepageActionBOA = new HomepageActionBOA();

	@When("^The login button is on the login field$")
	public void the_login_button_is_on_the_login_field() throws Throwable {
		
		homepageActionBOA.Theloginbuttonisontheloginfield();

	}

	@Then("^Verify the login button should be clickable$")
	public void verify_the_login_button_should_be_clickable() throws Throwable {
		
		homepageActionBOA.Verifytheloginbuttonshouldbeclickable();

	}

}
