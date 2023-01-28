package com.UtilityBOA.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseBOA {
	
	public static Properties boaprop;
	public static WebDriver driver;
	
	public  BaseBOA() {
		
		try {
			FileInputStream boafls = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\ConfigBOA\\qa\\config.properties");
			
			boaprop = new Properties();
			boaprop.load(boafls);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void initBOABrowser() {
		 String CampBrowserset = boaprop.getProperty("Browser1");
		 if(CampBrowserset.equals("Chrome")) {
				
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\DriverBOA\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(BOATestdata.ImplicitlyWait));
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(BOATestdata.pageLoad));
				
	}
		 else if(CampBrowserset.equals("FireFox")) {
				
			}
	}
		 public static void lunchURL(String URL) {
				driver.get(boaprop.getProperty("URL"));
				
			}
	

}
