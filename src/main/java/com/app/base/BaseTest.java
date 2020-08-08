package com.app.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{
	public WebDriver driver;
	public Properties prop;
	
	
	@BeforeTest
	public void setUp()
	{
		BasePage basePage = new BasePage();
		prop = basePage.init_properties();
		driver = basePage.init_driver(prop);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
