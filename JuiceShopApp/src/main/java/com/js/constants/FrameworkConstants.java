package com.js.constants;

public class FrameworkConstants {
	private FrameworkConstants() {
	}
	private static final String CONFIGFILEPATH=System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties";
	private static final int EXPLICITWaitTIME=30;
	
	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}
	public static int getExplicitWaitTime() {
		return EXPLICITWaitTIME;
	}
}

