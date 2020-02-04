package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Helper {

	
	public static void mouseOver(WebDriver driver,WebElement target) {
		Actions a=new Actions(driver);
		a.moveToElement(target).build().perform();
	}
	public static void clickOnElement(WebElement element)
	{
		//element.click();
		waitForElement(element).click();
	}
	
	public static WebElement waitForElement(WebElement element) {
		//WebDriverWait wait=new WebDriverWait(driver, timeOutInSeconds)
		
		ExpectedConditions.invisibilityOf(element);
		return element;
	}
	
	
	
}
