package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class ProductDetailesPage {
	WebDriver dr;
	@FindBy(xpath="") WebElement ;
	@FindBy(xpath="//p[text()='Add To Cart']") WebElement addToCardPath;
	
	public ProductDetailesPage(WebDriver dr) {
	// TODO Auto-generated constructor stub
		
		this.dr=dr; 
		PageFactory.initElements(dr, this);
	}
	public AddToCardPath() {
		Helper.clickOnElement(addToCardPath);
		
	}
 
`
}
