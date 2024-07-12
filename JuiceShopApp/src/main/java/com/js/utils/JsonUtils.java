package com.js.utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.js.enums.ConfigProperties;

public final class JsonUtils {
	private JsonUtils() {

	}
	
	public static JSONObject getJsonData() throws IOException, org.json.simple.parser.ParseException {

		File filename = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\json\\new-user.json");
		String json = FileUtils.readFileToString(filename, StandardCharsets.UTF_8);
		Object obj = new JSONParser().parse(json);
		return (JSONObject) obj;

	}
	public static String getTestData(ConfigProperties name) throws IOException, org.json.simple.parser.ParseException{
		return (String) getJsonData().get(name.name().toLowerCase());
	}
}
