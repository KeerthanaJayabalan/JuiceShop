package com.js.tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import com.js.enums.ConfigProperties;
import com.js.pages.LoginPage;
import com.js.utils.JsonUtils;

public class LoginPageTest {
	private LoginPageTest() {
	}
	@Test
	public void loginTest() throws IOException, ParseException {
		
	new LoginPage()
	.enterEmail(JsonUtils.getTestData(ConfigProperties.EMAIL))
	.enterPassword(JsonUtils.getTestData(ConfigProperties.PASSWORD))
	.clickLogin();	

	}
}
