package com.ActionBOA.qa;



import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.LocatorBOA.qa.HomepageLocatorBOA;
import com.UtilityBOA.qa.BOATestdata;
import com.UtilityBOA.qa.BaseBOA;

public class HomepageActionBOA  extends BaseBOA {
	
	HomepageLocatorBOA  homepageLocatorBOA = new HomepageLocatorBOA();
	
	public void EnteraninvaliduserId() {
		
		homepageLocatorBOA.userId.sendKeys(BOATestdata.invalidID);
	}
	
	public void Enteraninvalidpassword() {
		
		homepageLocatorBOA.passwordfield.sendKeys(BOATestdata.invalidPassword);
		
	}
	
	public void ClicktheLoginbutton() {
		
		homepageLocatorBOA.loginBtn.click();
		
	}
	
	public void Verifyusercannotloginsuccessfully() {
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.elementToBeClickable(homepageLocatorBOA.errorMessage));	
		
	boolean errorMessage =	homepageLocatorBOA.errorMessage.isDisplayed();
	
	Assert.assertTrue(errorMessage);
		
	}
	
	public void Verifyanerrormessageshoulddisplaywithaninvalidlogin() {
		
		boolean verifyErrorSMS = homepageLocatorBOA.verifyErrorSMS.isDisplayed();
		
		Assert.assertTrue(verifyErrorSMS);
	}
	
	public void Theloginbuttonisontheloginfield() {
		
		boolean verifyloginBtn =	homepageLocatorBOA.loginBtn.isDisplayed();
		Assert.assertTrue(verifyloginBtn);
		
	}
	
	public void Verifytheloginbuttonshouldbeclickable() {
		
		homepageLocatorBOA.loginBtn.click();
		
	  boolean verifysignInAlert =	homepageLocatorBOA.signInAlert.isDisplayed();
	  
	  Assert.assertTrue(verifysignInAlert);
		
	}
	
	public void ClicktheForgotIDpasswordlink(){
		
		homepageLocatorBOA.forgotIDLink.click();
		
	}
		
	public void Theappointmentlinkshouldbeavailableontheloginpage() {
		
		homepageLocatorBOA.crossIcon.click();
		
	boolean appointmentLink = homepageLocatorBOA.appointmentLink.isDisplayed();
	
	Assert.assertTrue(appointmentLink);
		
	}
	
	public void Clicktheappointmentlink() {
		
		homepageLocatorBOA.appointmentLink.click();
	}	
	
	public void ClickthesecurityHelplink() {
		
		homepageLocatorBOA.SecurityHelpLink.click();
		
	}
	
	public void YourclosestfinancialcenterorATMlinkwilldisplayontheloginpage() {
	
		homepageLocatorBOA.crossIcon.click();
		
	boolean verifyfinATMCenter = homepageLocatorBOA.finATMCenter.isDisplayed();
	
	Assert.assertTrue(verifyfinATMCenter);
	
		
	}
	
	public void ClicktheclosestfinancialcenterorATMlink() {
		
		homepageLocatorBOA.finATMCenter.click();
	}

}
