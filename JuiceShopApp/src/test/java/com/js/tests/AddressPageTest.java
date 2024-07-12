package com.js.tests;

import org.testng.annotations.Test;

import com.js.pages.AddressPage;

public class AddressPageTest {
	private AddressPageTest() {
	}
	@Test
	public void testAddressPage() throws Exception {
		new AddressPage()		
		.clickAddNewAddress()
		.addCountry()
		.addName()
		.addMobile()
		.addZip()
		.addAddress()
		.addCity()
		.addState().clickSubmit()
		.clickAddressButton()
		.clickContinue();
		
		
	}
}
