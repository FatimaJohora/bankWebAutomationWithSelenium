package com.ActionBOA.qa;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.LocatorBOA.qa.ATMpageLocatorBOA;
import com.UtilityBOA.qa.BaseBOA;

public class ATMpageActionBOA  extends BaseBOA {

	ATMpageLocatorBOA  aTMpageLocatorBOA  = new ATMpageLocatorBOA();
	
	
	
	public void VerifyafterclickingthelinkthepageshoulddisplaysothatwesearchclosestfinancialcenterorATM() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(aTMpageLocatorBOA.VerifyATMPage));
		
	boolean VerifyATMPage =	 aTMpageLocatorBOA.VerifyATMPage.isDisplayed();
	
	Assert.assertTrue(VerifyATMPage);
		
	}
}
