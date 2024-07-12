package com.js.pages;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;

import com.js.enums.ConfigProperties;
import com.js.enums.SelectStrategy;
import com.js.enums.WaitStrategy;
import com.js.utils.JsonUtils;

public class PaymentPage extends BasePage{

	private By addCard=By.id("mat-expansion-panel-header-0");
	private By txtboxName=By.id("mat-input-1");
	private By txtboxCardNum=By.id("mat-input-2");
	private By drpdownExpMon=By.id("mat-input-3");
	private By drpdownExpYr=By.id("mat-input-4");
	private By btSubmit=By.id("submitButton");

	public PaymentPage clickAddNewCard() {
		click(addCard, WaitStrategy.CLICKABLE);
		return this;
	}
	public PaymentPage enterName(){
		try {
			sendKeys(txtboxName, 
					JsonUtils.getTestData(ConfigProperties.NAME), WaitStrategy.PRESENCE);
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		return this;
	}
	public PaymentPage enterCardNum(){
		try {
			sendKeys(txtboxCardNum,
					JsonUtils.getTestData(ConfigProperties.CARDNUMBER), WaitStrategy.PRESENCE);
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		return this;
	}
	public PaymentPage selectMonth(){
		try {
			selectOption(drpdownExpMon, SelectStrategy.VALUE, 
					JsonUtils.getTestData(ConfigProperties.EXPMONTH));
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		return this;
	}
	public PaymentPage selectYear(){
		try {
			selectOption(drpdownExpYr, SelectStrategy.VALUE, 
					JsonUtils.getTestData(ConfigProperties.EXPYEAR));
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		return this;
	}
	public PaymentPage clickSubmit() {
		click(btSubmit, WaitStrategy.CLICKABLE);
		return this;
	}
}
