package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class HomePage {
	WebDriver dr;
	@FindBy(xpath="//div[text()='Back To School']") WebElement backToSchoolMainMenu;
	
	public HomePage(WebDriver dr) {
		
		this.dr=dr; 
		PageFactory.initElements(dr, this);
	}
	
	public ActiveWearPage hoverOvwerBackToSchool() {
		Helper.mouseOver(dr, backToSchoolMainMenu);
		return new ActiveWearPage(dr);
		
	}

}
