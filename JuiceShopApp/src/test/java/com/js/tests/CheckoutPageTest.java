package com.js.tests;

import org.testng.annotations.Test;

import com.js.pages.CheckoutPage;

public class CheckoutPageTest {
	private CheckoutPageTest() {

	}
	@Test
public void checkoutTest() {
	new CheckoutPage()
	.clickCheckOut();
}
}
