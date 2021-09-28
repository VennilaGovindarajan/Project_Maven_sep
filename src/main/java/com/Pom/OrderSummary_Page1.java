package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummary_Page1 {
	public WebDriver driver;
	
	@FindBy(xpath="//h1[normalize-space()='Order summary']")
	private WebElement ordersummary;

	public OrderSummary_Page1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrdersummary() {
		return ordersummary;
	}
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirmOrder1;

	public WebElement getConfirmOrder1() {
		return confirmOrder1;
	}
	

}
