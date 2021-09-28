package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_Page {

	public WebDriver driver;
	
	@FindBy(xpath="//h1[@id='cart_title']")
	private WebElement shopping;

	public Summary_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getShopping() {
		return shopping;
	}
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceedBtn2;

	public WebElement getProceedBtn2() {
		return proceedBtn2;
	}
	
	
	
}
