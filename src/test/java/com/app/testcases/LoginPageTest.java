package com.app.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.app.pages.LoginPage;
import com.app.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest 
{
	LoginPage loginPage;
	WebDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com");
		
	}
	
	
	@BeforeClass
	public void loginPageSetUp()
	{
		loginPage = new LoginPage(driver);
	}
	
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest()
	{
		String loginPageTitle = loginPage.getTitleofPage();
		Assert.assertEquals(loginPageTitle, Constants.loginPageTitle);
	}
	
	
	@Test(priority=2)
	public void verifySignUpLinkTest()
	{
		boolean flag = loginPage.verifySignUpLinkExistence();
		Assert.assertTrue(flag);
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
}
