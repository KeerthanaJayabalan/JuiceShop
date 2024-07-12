package com.js.pages;

import org.openqa.selenium.By;

import com.js.enums.WaitStrategy;

public class ProductPage extends BasePage{
	
	private By btnAddAppleJuice=By.cssSelector(
			"mat-grid-tile:nth-child(1) > div > mat-card > div:nth-child(2) > button");
	private By btnBasket=By.xpath("//span[contains(text(), 'Basket')]");
	
	public ProductPage addJuiceToCart() {		
		click(btnAddAppleJuice, WaitStrategy.CLICKABLE);
		return this;
	}
	public CheckoutPage clickBasket() {
		click(btnBasket, WaitStrategy.CLICKABLE);
		return new CheckoutPage();
	}
}
