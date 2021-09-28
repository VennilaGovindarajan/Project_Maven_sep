package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page1 {
	public WebDriver driver;
	
	@FindBy(xpath="//h1[contains(text(),'choose your payment method')]")
	private WebElement pleasechoose;
	
	public Payment_Page1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPleasechoose() {
		return pleasechoose;
	}

	public WebElement getBankwire() {
		
		return bankwire;
	}

	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement bankwire;
	

}
