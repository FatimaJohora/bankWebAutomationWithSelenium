package StepDepBOA;

import com.ActionBOA.qa.AppointpageActionBOA;
import com.ActionBOA.qa.HomepageActionBOA;
import com.UtilityBOA.qa.BaseBOA;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoBOA_94  extends BaseBOA {
	
	HomepageActionBOA  homepageActionBOA = new HomepageActionBOA();
	AppointpageActionBOA  appointpageActionBOA = new AppointpageActionBOA();
	
	
	@When("^The appointment link should be available on the login page$")
	public void the_appointment_link_should_be_available_on_the_login_page() throws Throwable {
		
		homepageActionBOA.Theappointmentlinkshouldbeavailableontheloginpage();
		
	}

	@When("^Click the appointment link$")
	public void click_the_appointment_link() throws Throwable {
		
		homepageActionBOA.Clicktheappointmentlink();
		
	}

	@Then("^Verify after clicking the link the page should display so that we make an Appointment$")
	public void verify_after_clicking_the_link_the_page_should_display_so_that_we_make_an_Appointment() throws Throwable {
		
		appointpageActionBOA.VerifyafterclickingthelinkthepageshoulddisplaysothatwemakeanAppointment();
	   
	}

}
