package com.app.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.apache.log4j.Logger;

public class BaseTest 
{
	public WebDriver driver;
	public Properties prop;
	public Logger log = Logger.getLogger(BaseTest.class);
	
	
	@BeforeTest
	public void setUp()
	{
		BasePage basePage = new BasePage();
		prop = basePage.init_properties();
		driver = basePage.init_driver(prop);
		log.info("browser is launched");
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		log.info("Application is launched");
		
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
