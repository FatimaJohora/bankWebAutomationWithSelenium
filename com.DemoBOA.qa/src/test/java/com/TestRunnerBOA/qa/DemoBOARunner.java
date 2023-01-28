package com.TestRunnerBOA.qa;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.UtilityBOA.qa.BaseBOA;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

   @CucumberOptions(features={"src\\test\\boaresources\\com\\DemoBOAFeatures"},
                   plugin= {"json:target/cucumber.json"},                    
 
                //  glue="StepDepBOA" ,  tags={"@Login"})
                 // glue="StepDepBOA" ,  tags={"@LogInBtn"})
                //  glue="StepDepBOA" ,  tags={"@ForgotID"})
                 //  glue="StepDepBOA" ,  tags={"@Appointment"})
                   glue="StepDepBOA" ,  tags={" @Security"})
                   //glue="StepDepBOA" ,  tags={" @ATMLink"})
   
public class DemoBOARunner  extends AbstractTestNGCucumberTests {
	   
	   @BeforeTest
		public void startURL() {
		   BaseBOA test = new BaseBOA();
			test.initBOABrowser();
			
		}
		
		@AfterTest
		public  void closeURL() {
			BaseBOA test = new BaseBOA();
			test.driver.quit();
			
		}

}
