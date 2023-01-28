package com.LocatorBOA.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UtilityBOA.qa.BaseBOA;

public class ATMpageLocatorBOA  extends BaseBOA {
  
	public ATMpageLocatorBOA() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[text()='Find a Financial Center or ATM']")
	public WebElement VerifyATMPage;
}
