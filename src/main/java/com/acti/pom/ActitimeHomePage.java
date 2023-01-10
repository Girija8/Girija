package com.acti.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.generics.BasePage;


public class ActitimeHomePage extends BasePage
{
	public WebDriver driver;
	
	@FindBy(xpath = "//div[.='Task']")
	private WebElement tasksLink;
	
	@FindBy(id = "logoutLink")
	private WebElement logoutLink;
	
	public ActitimeHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void tasksMethod() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", tasksLink);
		Thread.sleep(3000);
	}
	
	public void logoutMethod()
	{
		javascriptclick(driver, logoutLink);
	}
}