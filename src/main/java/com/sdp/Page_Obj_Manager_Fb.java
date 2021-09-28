package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Pom.Fb_Homepage;
import com.Pom.Fb_Signinpage;

public class Page_Obj_Manager_Fb {
	
	public WebDriver driver;
	
	private Fb_Homepage fbhome;
	
	private Fb_Signinpage fbsign;
	
	public Page_Obj_Manager_Fb(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public Fb_Homepage getInstancefbhome() {
		fbhome = new Fb_Homepage(driver);
		return fbhome;

	}
	
	public Fb_Signinpage getInstancefbsign() {
		fbsign = new Fb_Signinpage(driver);
		return fbsign;

	}
	
	
	

}
