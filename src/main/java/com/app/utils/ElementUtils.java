package com.app.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils 
{
	WebDriver driver;
	
	public ElementUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getElement(By locator)
	{
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	public void waitForElementToBeVisible(By locator,int noOfSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver,noOfSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	public void waitForElementToBeClickable(By locator,int noOfSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver,noOfSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public String waitAndGetPageTitle(String title, int noOfSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, noOfSeconds);
		wait.until(ExpectedConditions.titleContains(title));
		String pageTitle = driver.getTitle();
		return pageTitle;
		
		
	}
}






