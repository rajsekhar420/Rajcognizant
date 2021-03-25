package com.Name.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig() {
		
//                  		./ is represents project directory / it's in that folder we can load files
		File src=new File("./ConfigurationFiles\\config.properties");
		try
		{
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is"+e.getMessage());
		}
	}

	
	public String getApplicationUrl() {
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String Getusername() {
		String user=pro.getProperty("userName");
		return user;
	}
public String Getpassword() {
	String password=pro.getProperty("password");
	return password;
}
public String getDriver() {
	String chrome=pro.getProperty("chromePath");
	return chrome;
}
}
