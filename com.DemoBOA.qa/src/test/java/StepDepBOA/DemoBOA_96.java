package StepDepBOA;

import com.ActionBOA.qa.ATMpageActionBOA;
import com.ActionBOA.qa.HomepageActionBOA;
import com.UtilityBOA.qa.BaseBOA;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoBOA_96 extends BaseBOA {
	
	HomepageActionBOA  homepageActionBOA = new  HomepageActionBOA();
	ATMpageActionBOA   aTMpageActionBOA   = new  ATMpageActionBOA();

	@When("^Your closest financial center or ATM link will display on the login page$")
	public void your_closest_financial_center_or_ATM_link_will_display_on_the_login_page() throws Throwable {
		
		homepageActionBOA.YourclosestfinancialcenterorATMlinkwilldisplayontheloginpage();
		
		

	}

	@When("^Click the closest financial center or ATM link$")
	public void click_the_closest_financial_center_or_ATM_link() throws Throwable {
		
		homepageActionBOA.ClicktheclosestfinancialcenterorATMlink();

	}

	@Then("^Verify after clicking the link, the page should display so that we search closest financial center or ATM$")
	public void verify_after_clicking_the_link_the_page_should_display_so_that_we_search_closest_financial_center_or_ATM()
			throws Throwable {
		
		aTMpageActionBOA.VerifyafterclickingthelinkthepageshoulddisplaysothatwesearchclosestfinancialcenterorATM();

	}

}
