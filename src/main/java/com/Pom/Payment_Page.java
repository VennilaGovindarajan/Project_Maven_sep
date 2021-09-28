package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement paybyBank;

	public Payment_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPaybyBank() {
		return paybyBank;
	}
	
	

}
