package com.app.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.app.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage 
{
	
	public Logger log = Logger.getLogger(BasePage.class);
	
	public WebDriver init_driver(Properties prop)
	{
		WebDriver driver=null;
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Invalid browser provided");
		}
		
		return driver;
	}
	
	public Properties init_properties()
	{
		Properties prop = new Properties();
		try
		{
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + Constants.CONFIG_FILE_PATH);
			prop.load(ip);
		}
		catch(Exception e)
		{
			
		}
		return prop;
	}
}
