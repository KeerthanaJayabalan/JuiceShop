package com.js.tests;

import com.js.pages.PaymentPage;

public class PaymentPageTest {
 
	private PaymentPageTest() {
	}
	public void addPaymentDetails() {
		try {
			new PaymentPage()
			.clickAddNewCard()
			.enterName()
			.enterCardNum()
			.selectMonth().selectYear()
			.clickSubmit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
