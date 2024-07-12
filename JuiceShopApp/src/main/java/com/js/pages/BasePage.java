package com.js.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.js.driver.DriverManager;
import com.js.enums.SelectStrategy;
import com.js.enums.WaitStrategy;
import com.js.factories.DropDownFactory;
import com.js.factories.ExplicitWaitFactory;
import com.js.utils.JsonUtils;

public class BasePage {
	private static JavascriptExecutor js;
	protected void click(By by, WaitStrategy waitStrategy) {
		WebElement element=ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.click();
	}
	protected void sendKeys(By by, String value, WaitStrategy waitStrategy) {
		WebElement element=ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.sendKeys(value);
	}	
	protected void selectOption(By by, SelectStrategy selectStrategy, String value) {
		WebElement element=DriverManager.getDriver().findElement(by);
		DropDownFactory.selectOption(selectStrategy, element, value);
	}
	protected static void scrollToClick(By by) { 
		WebElement element=DriverManager.getDriver().findElement(by);
		js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	protected static void scrollToElement(String text, By by) { 
		WebElement element=DriverManager.getDriver().findElement(by);
		js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].value='" +text+ "';", element);
		
	}
		
}
