package com.ActionBOA.qa;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.LocatorBOA.qa.ForgotIDpageLocatorBOA;
import com.UtilityBOA.qa.BaseBOA;

public class ForgotIDpageActionBOA  extends BaseBOA {

	ForgotIDpageLocatorBOA  forgotIDpageLocatorBOA = new ForgotIDpageLocatorBOA();
	
public void VerifyafterclickingthelinktheForgotIDpasswordpageshouldbedisplay() {
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(forgotIDpageLocatorBOA.VerifyforgotIdPage));
		
		
		boolean VerifyforgotIdPage =  forgotIDpageLocatorBOA.VerifyforgotIdPage.isDisplayed();
		
		Assert.assertTrue(VerifyforgotIdPage);
	}
	
}
