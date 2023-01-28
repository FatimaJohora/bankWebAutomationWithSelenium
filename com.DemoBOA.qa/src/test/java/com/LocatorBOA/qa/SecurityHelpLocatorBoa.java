package com.LocatorBOA.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UtilityBOA.qa.BaseBOA;

public class SecurityHelpLocatorBoa extends BaseBOA{
	
	
	public SecurityHelpLocatorBoa() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[@id='securityModal_title']")
	
	public WebElement VerifysecurityHelppage;

}
