package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page {

	public WebDriver driver;
	

	public Address_Page(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement proceedBtn3;


	public WebElement getProceedBtn3() {
		return proceedBtn3;
	}
	

}
