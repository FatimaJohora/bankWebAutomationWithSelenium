package StepDepBOA;

import com.ActionBOA.qa.HomepageActionBOA;
import com.ActionBOA.qa.SecurityHelpActionBoa;
import com.UtilityBOA.qa.BaseBOA;
import com.UtilityBOA.qa.ScreenshotsBOA;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoBOA_95  extends BaseBOA {
   
	HomepageActionBOA homepageActionBOA  = new HomepageActionBOA();
	
	SecurityHelpActionBoa  securityHelpActionBoa  = new SecurityHelpActionBoa();
	
	@When("^Click  the security  Help link$")
	public void click_the_security_Help_link() throws Throwable {
		
		homepageActionBOA.ClickthesecurityHelplink();
	    
	}

	@Then("^Verify after clicking the link, Security Help window should display$")
	public void verify_after_clicking_the_link_Security_Help_window_should_display() throws Throwable {
		
		securityHelpActionBoa.VerifyafterclickingthelinkSecurityHelpwindowshoulddisplay();
		
		ScreenshotsBOA.takeCampScreenshot(driver, "Security Help page");
	   
	}
}
