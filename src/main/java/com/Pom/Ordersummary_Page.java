package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ordersummary_Page {
	public WebDriver driver;

	public Ordersummary_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[@class='page-heading']")
	private WebElement orderSummary;

	public WebElement getOrderSummary() {
		return orderSummary;
	}
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirmOrder;

	public WebElement getConfirmOrder() {
		return confirmOrder;
	}

	
	
}
