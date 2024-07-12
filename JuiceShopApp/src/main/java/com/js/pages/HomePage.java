package com.js.pages;

import org.openqa.selenium.By;

import com.js.enums.WaitStrategy;

public final class HomePage extends BasePage{

	private By btnDismiss=By.xpath("//span[text()='Dismiss']");
	private By btnCookie=By.xpath("//a[contains(text(), 'Me want')]");
	private By btnAccount=By.id("navbarAccount");
	private By btnLogin=By.id("navbarLoginButton");


	public HomePage clickDismiss() {		
		click(btnDismiss, WaitStrategy.CLICKABLE);
		return this;
	}
	public HomePage clickCookie() {
		click(btnCookie, WaitStrategy.CLICKABLE);
		return this;
	}
	public HomePage clickAccount() {
		click(btnAccount, WaitStrategy.CLICKABLE);
		return this;

	}
	public LoginPage clickLogin() {
		click(btnLogin, WaitStrategy.CLICKABLE);
		return new LoginPage();
	}


}

