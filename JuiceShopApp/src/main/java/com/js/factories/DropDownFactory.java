package com.js.factories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.js.enums.SelectStrategy;

public class DropDownFactory {

	public static void selectOption(SelectStrategy selectStrategy, WebElement element, 
			String value) {
		Select select=new Select(element);
		if(selectStrategy == SelectStrategy.VALUE ) {
			select.selectByValue(value);
		}else if(selectStrategy == SelectStrategy.TEXT) {
			select.selectByVisibleText(value);
		}else {
			select.selectByIndex(Integer.parseInt(value));
		}

	}
}
