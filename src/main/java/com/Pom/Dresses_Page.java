package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dressesMenu;

	public Dresses_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getDressesMenu() {
		return dressesMenu;
	}
	
	

	
	
	
	

}
