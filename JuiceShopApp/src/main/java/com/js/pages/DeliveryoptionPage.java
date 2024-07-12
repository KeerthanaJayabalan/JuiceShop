package com.js.pages;

import org.openqa.selenium.By;

import com.js.enums.WaitStrategy;

public class DeliveryoptionPage extends BasePage{

	private By btnOneDay=By.id("mat-radio-43-input");
	private By btnContinue=By.xpath("//span[text()='Continue']");
	public DeliveryoptionPage clickOption() {
		click(btnOneDay, WaitStrategy.CLICKABLE);
		return this;
	}
	public PaymentPage clickContinue() {
		click(btnContinue, WaitStrategy.CLICKABLE);
		return new PaymentPage();
	}
}
