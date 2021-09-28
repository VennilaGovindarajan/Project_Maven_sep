package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page1 {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkBox1;
	
	public Shipping_Page1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckBox1() {
		return checkBox1;
	}

	public WebElement getProceedBtn8() {
		return proceedBtn8;
	}

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement proceedBtn8;
	

}
