package com.LocatorBOA.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UtilityBOA.qa.BaseBOA;

public class HomepageLocatorBOA extends BaseBOA {
	
	public HomepageLocatorBOA() {
		
		PageFactory.initElements(driver, this);
		
	}
		
		@FindBy(xpath = "//input[@id='onlineId1']")
		public WebElement userId;
		
		@FindBy(xpath = "//input[@id='passcode1']")
		public WebElement passwordfield;
		
		@FindBy(css = "#signIn")
		public WebElement  loginBtn;
		
		@FindBy(xpath = "//h1[text()='Log In to Online Banking']")
		public WebElement errorMessage;
		
		@FindBy(xpath = "//a[text()='Forgot ID/Password']")
		public WebElement verifyErrorSMS;
	
		@FindBy(xpath = "//div[@id='signin-message']")
		public WebElement signInAlert;
		
		@FindBy(xpath = "//a[@id='forgot-oid-pwd']")
		public WebElement forgotIDLink;
				
		@FindBy(xpath = "//a[@id='apptScheduler']")
		public WebElement appointmentLink;
		
		@FindBy(id = "engagementBannerCloseBtn")
		public WebElement crossIcon;
		
		@FindBy(xpath = "//a[text()='Security & Help']")
		public WebElement SecurityHelpLink;
		
		@FindBy(id = "finCenterLocator")
		public WebElement finATMCenter;

}
