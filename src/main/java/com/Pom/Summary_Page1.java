package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_Page1 {
	public WebDriver driver;
	
	@FindBy(xpath="//h1[@id='cart_title']")
	private WebElement shoppingCart;
	
	public Summary_Page1(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}

	public WebElement getShoppingCart() {
		return shoppingCart;
	}

	public WebElement getProceedBtn6() {
		return proceedBtn6;
	}

	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceedBtn6;
	
	

}
