package com.ActionBOA.qa;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.LocatorBOA.qa.AppointpageLocatorBOA;
import com.UtilityBOA.qa.BaseBOA;

public class AppointpageActionBOA extends BaseBOA {
	
	
	AppointpageLocatorBOA   appointpageLocatorBOA = new AppointpageLocatorBOA();
	
	
	
	public void VerifyafterclickingthelinkthepageshoulddisplaysothatwemakeanAppointment() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(appointpageLocatorBOA.ScheduleAppointmentPage));
		
	boolean verifyScheduleAppointmentPage =	appointpageLocatorBOA.ScheduleAppointmentPage.isDisplayed();
	
	Assert.assertTrue(verifyScheduleAppointmentPage);
		
	}

}
