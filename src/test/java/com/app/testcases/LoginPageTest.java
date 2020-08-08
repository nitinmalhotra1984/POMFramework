package com.app.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.app.base.BaseTest;
import com.app.pages.LoginPage;
import com.app.utils.Constants;

public class LoginPageTest extends BaseTest
{
	LoginPage loginPage;
	
	
	@BeforeClass
	public void loginPageSetUp()
	{
		loginPage = new LoginPage(driver);
	}
	
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest()
	{
		String loginPageTitle = loginPage.getTitleofPage();
		Assert.assertEquals(loginPageTitle, Constants.LOGIN_PAGE_TITLE);
	}
	
	
	@Test(priority=2)
	public void verifySignUpLinkTest()
	{
		boolean flag = loginPage.verifySignUpLinkExistence();
		Assert.assertTrue(flag);
	}
	
	
	
	
}
