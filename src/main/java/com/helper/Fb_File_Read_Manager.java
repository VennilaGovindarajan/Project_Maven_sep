package com.helper;

public class Fb_File_Read_Manager {

	private Fb_File_Read_Manager() {

		// restrict to create object in another class

	}

	public static Fb_File_Read_Manager getInstance() {  //public static
		Fb_File_Read_Manager reader = new Fb_File_Read_Manager();
		return reader;

	}

	public Fb_Configuration_Reader getInstanceCR() throws Throwable {

		Fb_Configuration_Reader reader = new Fb_Configuration_Reader();
		return reader;
		
	}

}
