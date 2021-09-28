package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderconfirm_Page1 {
	public WebDriver driver;
	
	@FindBy(xpath="//h1[text()='Order confirmation']")
	private WebElement orderConfirm;

	public Orderconfirm_Page1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrderConfirm() {
		return orderConfirm;
	}

}
