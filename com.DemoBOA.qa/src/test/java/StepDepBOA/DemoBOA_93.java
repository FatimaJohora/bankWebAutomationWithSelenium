package StepDepBOA;

import com.ActionBOA.qa.ForgotIDpageActionBOA;
import com.ActionBOA.qa.HomepageActionBOA;
import com.UtilityBOA.qa.BaseBOA;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoBOA_93 extends BaseBOA {
	
	HomepageActionBOA  homepageActionBOA = new HomepageActionBOA();
	
	ForgotIDpageActionBOA  forgotIDpageActionBOA = new  ForgotIDpageActionBOA();
	
	@When("^Click the Forgot ID password link$")
	public void click_the_Forgot_ID_password_link() throws Throwable {
		
		homepageActionBOA.ClicktheForgotIDpasswordlink();
	   
	}

	@Then("^Verify after clicking the link, the Forgot ID password page should be display$")
	public void verify_after_clicking_the_link_the_Forgot_ID_password_page_should_be_display() throws Throwable {
	   
		forgotIDpageActionBOA.VerifyafterclickingthelinktheForgotIDpasswordpageshouldbedisplay();
	}


}
