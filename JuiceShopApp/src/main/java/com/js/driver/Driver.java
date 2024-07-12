package com.js.driver;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

import com.js.enums.ConfigProperties;
import com.js.utils.PropertyUtils;

public final class Driver {

	private Driver() {

	}
	public static void initDriver() throws Exception{
		if(Objects.isNull(DriverManager.getDriver())) {			
			DriverManager.setDriver(new ChromeDriver());			
			DriverManager.getDriver().get(PropertyUtils.getValue(ConfigProperties.URL));
		}	
	}
	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}

	}
}
