package com.acti.generics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class BasePage 
{
	public void selectbyvisbletext(WebElement element , String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void movetoelement(WebDriver driver , WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void robotenter() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void threadsleep() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	
	public void explicitwaittitleis(WebDriver driver , String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleIs(title));
	}
	
	public void alertaccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void javascriptclick(WebDriver driver , WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	public void validatetext(WebElement element , String expectedtext)
	{
		String actualText=element.getText();
		String expectedText=expectedtext;
		Assert.assertEquals(actualText, expectedText);
	}	

	public void validatetitle(WebDriver driver,String expectedtitle)
	{
	String actualTitle=driver.getTitle();
		String expectedTitle=expectedtitle;
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}