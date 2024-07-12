package com.js.factories;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.js.constants.FrameworkConstants;
import com.js.driver.DriverManager;
import com.js.enums.WaitStrategy;

public class ExplicitWaitFactory {

	public static WebElement performExplicitWait(WaitStrategy waitStrategy, By by) {
		WebElement element=null;
		if(waitStrategy == WaitStrategy.CLICKABLE) {
			element=new WebDriverWait(DriverManager.getDriver(), 
					Duration.ofSeconds(FrameworkConstants.getExplicitWaitTime()))
					.until(ExpectedConditions.elementToBeClickable(by));
		}else if(waitStrategy == WaitStrategy.PRESENCE) {
			element=new WebDriverWait(DriverManager.getDriver(), 
					Duration.ofSeconds(FrameworkConstants.getExplicitWaitTime()))
					.until(ExpectedConditions.presenceOfElementLocated(by));
		}else if(waitStrategy == WaitStrategy.VISIBLE){
			element=new WebDriverWait(DriverManager.getDriver(), 
					Duration.ofSeconds(FrameworkConstants.getExplicitWaitTime()))
					.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		return element;
	}	
}
