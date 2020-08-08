package com.app.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{
	public WebDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		BasePage basePage = new BasePage();
		driver = basePage.init_driver("Chrome");
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com");
		
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
