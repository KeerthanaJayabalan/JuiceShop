package com.js.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;

import com.js.enums.ConfigProperties;
import com.js.enums.WaitStrategy;
import com.js.utils.DynamicXpathUtils;
import com.js.utils.PropertyUtils;

public class AddressPage extends BasePage{
	//private By form=By.id("address-form");
	private String addrForm="//*[text()='%s']";
	private String radioBtnAddress="//input[@type='radio']/following::*[text()='%s']";
	private By btnContinue=By.xpath("//span[text()='Continue']");
	private By btnSubmit=By.id("submitButton");


	public AddressPage clickAddNewAddress() {
		String xpath=DynamicXpathUtils.getXpath(addrForm, "Add New Address");
		try {
			click(By.xpath(xpath), WaitStrategy.CLICKABLE);
		}catch (Exception e) {
			scrollToClick(By.xpath(xpath));
		}
		return this;
	}
	public AddressPage addCountry(){
		String xpath=DynamicXpathUtils.getXpath(addrForm, "Country");
		click(By.xpath(xpath), WaitStrategy.CLICKABLE);
		try {
			sendKeys(By.xpath(xpath), PropertyUtils.getValue(ConfigProperties.COUNTRY)
					, WaitStrategy.CLICKABLE);
		}
		catch (ElementNotInteractableException e) {			
			try {
				scrollToElement(PropertyUtils.getValue(ConfigProperties.COUNTRY), By.xpath(xpath));
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return this;
	}
	public AddressPage addName(){
		String xpath=DynamicXpathUtils.getXpath(addrForm, "Name");
		click(By.xpath(xpath), WaitStrategy.CLICKABLE);
		try {
			sendKeys(By.xpath(xpath), PropertyUtils.getValue(ConfigProperties.NAME)
					, WaitStrategy.CLICKABLE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public AddressPage addMobile(){
		String xpath=DynamicXpathUtils.getXpath(addrForm, "Mobile Number");
		click(By.xpath(xpath), WaitStrategy.CLICKABLE);
		try {
			sendKeys(By.xpath(xpath), PropertyUtils.getValue(ConfigProperties.MOBILE)
					, WaitStrategy.CLICKABLE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public AddressPage addZip(){
		String xpath=DynamicXpathUtils.getXpath(addrForm, "ZIP Code");
		click(By.xpath(xpath), WaitStrategy.CLICKABLE);
		try {
			sendKeys(By.xpath(xpath), PropertyUtils.getValue(ConfigProperties.ZIP)
					, WaitStrategy.VISIBLE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public AddressPage addAddress(){
		String xpath=DynamicXpathUtils.getXpath(addrForm, "Address");
		click(By.xpath(xpath), WaitStrategy.CLICKABLE);
		try {
			sendKeys(By.xpath(xpath), PropertyUtils.getValue(ConfigProperties.ADDRESS)
					, WaitStrategy.VISIBLE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public AddressPage addCity() throws Exception {
		String xpath=DynamicXpathUtils.getXpath(addrForm, "City");
		click(By.xpath(xpath), WaitStrategy.CLICKABLE);
		sendKeys(By.xpath(xpath), PropertyUtils.getValue(ConfigProperties.CITY)
				, WaitStrategy.VISIBLE);
		return this;
	}
	public AddressPage addState() throws Exception {
		String xpath=DynamicXpathUtils.getXpath(addrForm, "State");
		click(By.xpath(xpath), WaitStrategy.CLICKABLE);
		sendKeys(By.xpath(xpath), PropertyUtils.getValue(ConfigProperties.STATE)
				, WaitStrategy.VISIBLE);
		return this;
	}
	public AddressPage clickSubmit() {
		click(btnSubmit, WaitStrategy.CLICKABLE);
		return this;
	}
	public AddressPage clickAddressButton() {
		String xpath=DynamicXpathUtils.getXpath(radioBtnAddress, "Name ");
		click(By.xpath(xpath), WaitStrategy.CLICKABLE);
		return this;
	}
	public DeliveryoptionPage clickContinue() {		
		click(btnContinue, WaitStrategy.CLICKABLE);
		return new DeliveryoptionPage();
	}

}
