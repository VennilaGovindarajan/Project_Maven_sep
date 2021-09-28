package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderconfirm_Page {
	public WebDriver driver;
	
	@FindBy(xpath="//h1[@class='page-heading']")
	private WebElement orderConfirmation;

	public Orderconfirm_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrderConfirmation() {
		return orderConfirmation;
	}
	@FindBy(xpath="//a[@title='My Store']")
	private WebElement logo;

	public WebElement getLogo() {
		return logo;
	}
	

}
