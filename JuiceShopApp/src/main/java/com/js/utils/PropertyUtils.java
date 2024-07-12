package com.js.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.js.constants.FrameworkConstants;
import com.js.enums.ConfigProperties;

public final class PropertyUtils {
	
	private PropertyUtils() {

	}
	
	private static Properties properties=new Properties();
	private static final Map<String, String> CONFIGMAP=new HashMap<>();

	static {
		try {
			FileInputStream inputStream=new FileInputStream(FrameworkConstants.getConfigFilePath());
			properties.load(inputStream);
			for(Map.Entry<Object, Object> entry:properties.entrySet()) {
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim());
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to load properties file: " + e.getMessage());
		}
		catch(IOException e1) {
			e1.printStackTrace();
			throw new RuntimeException("Properties file not found: " + e1.getMessage());
		}
	}
	
	public static String getValue(ConfigProperties key) throws Exception {
		if(Objects.isNull(key.name().toLowerCase()) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))){
			throw new Exception("Property name "+key+" is not found, please check config.properties");
		}
		return CONFIGMAP.get(key.name().toLowerCase());
	}
}
