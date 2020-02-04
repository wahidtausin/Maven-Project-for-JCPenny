package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class ActiveWearPage {
	WebDriver dr;
	@FindBy(xpath="//img[@title='Juniors']") WebElement clicktoJuniors;
	
 public ActiveWearPage(WebDriver dr) {
	// TODO Auto-generated constructor stub
		
		this.dr=dr; 
		PageFactory.initElements(dr, this);
	}
 public JuniorPage clickOnJunior() {
	 Helper.clickOnElement(clicktoJuniors);
	 return new JuniorPage(dr);
 }

}
