package com.bit.test;

import org.junit.Test;

import com.page.ActiveWearPage;
import com.page.HomePage;
import com.page.JuniorPage;
import com.page.ProductDetailesPage;

public class SmokeTest extends BaseTest{
	HomePage homePage;
	ActiveWearPage activeWearPage;
	JuniorPage juniorPage;
	ProductDetailesPage ProductDetailesPage;

	@Test
	public void test() {
		
		homePage=new HomePage(dr); 
	}
}
