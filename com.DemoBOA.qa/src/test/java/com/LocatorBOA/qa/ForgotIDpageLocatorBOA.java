package com.LocatorBOA.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UtilityBOA.qa.BaseBOA;

public class ForgotIDpageLocatorBOA  extends BaseBOA{
	
	public ForgotIDpageLocatorBOA() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[@id='skip-to-h1']")
	public WebElement VerifyforgotIdPage;
	

}
