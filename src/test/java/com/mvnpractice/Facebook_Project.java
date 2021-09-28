package com.mvnpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Pom.Fb_Homepage;
import com.Pom.Fb_Signinpage;
import com.helper.Fb_File_Read_Manager;
import com.mvnpractice.Project_BaseClass;
import com.sdp.Page_Obj_Manager_Fb;

public class Facebook_Project extends Project_BaseClass{
	
	public static WebDriver driver=browserConfig("chrome");  
	
	public static Page_Obj_Manager_Fb pomfb = new Page_Obj_Manager_Fb(driver);
	
	public static void main(String[] args) throws Throwable {
		
		String url = Fb_File_Read_Manager.getInstance().getInstanceCR().getLaunchBrowser();
		launchBrowser(url);
		clickonElement(pomfb.getInstancefbhome().getCreateAccountBtn());
		sleep(2000);
		String firstname = Fb_File_Read_Manager.getInstance().getInstanceCR().getFirstName();
		inputValues(pomfb.getInstancefbsign().getFirstName(), firstname);
		
		String lastname = Fb_File_Read_Manager.getInstance().getInstanceCR().getLastname();
		inputValues(pomfb.getInstancefbsign().getLastName(), lastname);
		
		String mobileno = Fb_File_Read_Manager.getInstance().getInstanceCR().getMobileno();
		inputValues(pomfb.getInstancefbsign().getMobileNo(), mobileno);
		
		String password = Fb_File_Read_Manager.getInstance().getInstanceCR().getPassword();
		inputValues(pomfb.getInstancefbsign().getPassword(), password);
		
		selectBy(pomfb.getInstancefbsign().getDay(), "index", "3");
		selectBy(pomfb.getInstancefbsign().getMonth(), "visibletext", "Mar");
		selectBy(pomfb.getInstancefbsign().getYear(), "value","2003");
		clickonElement(pomfb.getInstancefbsign().getRadioBtn());
		
	}

}
