package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fb_Configuration_Reader {

	public static Properties p;

	public Fb_Configuration_Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\properties\\FbConfiguration.Properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();  //static

		p.load(fis);
	}

	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}

	public String getLaunchBrowser() {
		String url = p.getProperty("url");
		return url;

	}
	

	public String getFirstName() {
		
		String firstname = p.getProperty("db_Firstname");
		
		return firstname;

	}

	public String getLastname() {
		String lastname = p.getProperty("db_Lastname");
		return lastname;

	}

	public String getMobileno() {
		String mobileno = p.getProperty("db_MobileNo");
		return mobileno;
	}

	public String getPassword() {
		String password = p.getProperty("db_Password");
		return password;

	}
}
