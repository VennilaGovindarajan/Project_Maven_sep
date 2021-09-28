package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;  //--> static

	public Configuration_Reader() throws Throwable {

		File f = new File(
				"C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);

		p = new Properties(); // --> static

		p.load(fis);

	}

	public String getBrowserConfig() {

		String browserconfig = p.getProperty("browser"); // case sensitive

		return browserconfig;

	}

	public String getLaunchBrowser() {

		String url = p.getProperty("url");

		return url;

	}

	public String getEmailId() {

		String EmailId = p.getProperty("db_EmailId");

		return EmailId;

	}

	public String getPassword() {
		
		String Password = p.getProperty("db_Password");
		
		return Password;
	}

}
