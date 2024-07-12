package com.js.pages;

import org.openqa.selenium.By;

import com.js.enums.WaitStrategy;

public class LoginPage extends BasePage{
	private By textboxEmail=By.id("email");
	private By textboxPassword=By.xpath("//input[@id='password' and @type='password']");
	private By btnLogin=By.id("loginButton");

	public LoginPage enterEmail(String email){
		sendKeys(textboxEmail, email, WaitStrategy.PRESENCE);
		return this;
	}
	public LoginPage enterPassword(String password){
		sendKeys(textboxPassword, password, WaitStrategy.PRESENCE);
		return this;
	}
	public ProductPage clickLogin() {
		click(btnLogin, WaitStrategy.CLICKABLE);
		return new ProductPage();
	}
	
}
