package com.js.tests;

import org.testng.annotations.Test;

import com.js.pages.HomePage;

public class HomePageTest extends BaseTest{
	private HomePageTest() {
	}
	@Test
	public void mainPageTest() {
		
	new HomePage()
	.clickDismiss().clickCookie()
	.clickAccount().clickLogin();

	}

}
