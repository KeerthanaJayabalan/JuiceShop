package com.js.tests;

import org.testng.annotations.BeforeMethod;

import com.js.driver.Driver;

public class BaseTest {
	protected BaseTest() {
	}

	@BeforeMethod
	protected void setUp() throws Exception{
		Driver.initDriver();
	}
	
	protected void tearDown() {
		Driver.quitDriver();
	}
}
