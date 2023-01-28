package com.ActionBOA.qa;

import java.time.Duration;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.LocatorBOA.qa.SecurityHelpLocatorBoa;
import com.UtilityBOA.qa.BaseBOA;

public class SecurityHelpActionBoa extends BaseBOA {
	
	SecurityHelpLocatorBoa  securityHelpLocatorBoa  = new SecurityHelpLocatorBoa();
	
	public void  VerifyafterclickingthelinkSecurityHelpwindowshoulddisplay() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(securityHelpLocatorBoa.VerifysecurityHelppage));
		
		boolean VerifysecurityHelppage = securityHelpLocatorBoa.VerifysecurityHelppage.isDisplayed();
		
		Assert.assertTrue(VerifysecurityHelppage);
	}

}
