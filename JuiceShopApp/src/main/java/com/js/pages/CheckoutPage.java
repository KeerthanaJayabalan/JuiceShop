package com.js.pages;

import org.openqa.selenium.By;

import com.js.enums.WaitStrategy;

public class CheckoutPage extends BasePage{

	private By btnCheckout=By.id("checkoutButton");
	
	public AddressPage clickCheckOut() {
		click(btnCheckout, WaitStrategy.CLICKABLE);
		return new AddressPage();
	}
	
	
}
