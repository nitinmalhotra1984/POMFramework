package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.app.base.BasePage;
import com.app.utils.Constants;
import com.app.utils.ElementUtils;

public class LoginPage extends BasePage
{
	private WebDriver driver;
	ElementUtils elementUtil;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		elementUtil = new ElementUtils(this.driver);
	}
	
	
	
	By signupLink = By.linkText("Sign up");
	By username = By.id("username");
	By password = By.id("password");
	By loginBtn = By.id("loginBtn");
	
	public String getTitleofPage()
	{
		String pageTitle = elementUtil.waitAndGetPageTitle(Constants.LOGIN_PAGE_TITLE, 20);
		log.info("title of the page is returned");
		return pageTitle;
		
	}
	
	public boolean verifySignUpLinkExistence()
	{
		boolean flag = elementUtil.getDisplayStatusOfElement(this.signupLink);
		log.info("Sign up Link existence is validate");
		return flag;
		
	}
	
	
}
