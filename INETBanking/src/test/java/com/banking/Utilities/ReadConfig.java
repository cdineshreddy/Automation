package com.banking.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties property;

	public ReadConfig() {
		try {
			FileInputStream fis = new FileInputStream("./Configuration/config.properties");
			property = new Properties();
			property.load(fis);

		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String getApplicationUrl() {
		String url=property.getProperty("baseUrl");
		return url;
	}
	
	public String getUsername() {
		String username=property.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password=property.getProperty("password");
		return password;
	}
	
	public String getChromePath() {
		String chromepath=property.getProperty("chromepath");
		return chromepath;
	}
	
	public String getEdgePath() {
		String edgepath=property.getProperty("edgepath");
		return edgepath;
	}
	
}
