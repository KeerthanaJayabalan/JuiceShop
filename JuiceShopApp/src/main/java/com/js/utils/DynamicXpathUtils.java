package com.js.utils;

public final class DynamicXpathUtils {
	private DynamicXpathUtils() {
	}
	public static String getXpath(String xpath, String value) {
		return xpath.replace("%s", value);
	}
}
