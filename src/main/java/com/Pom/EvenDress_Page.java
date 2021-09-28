package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EvenDress_Page {
	public WebDriver driver;
	
	@FindBy(linkText = "Evening Dresses")
	private WebElement eveDresses;

	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getEveDresses() {
		return eveDresses;
	}


	@FindBy(xpath = "//div[@class='product-container']")
	private WebElement printedDress;

	
	public EvenDress_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getPrintedDress() {
		return printedDress;
	}
	
	@FindBy(xpath="//span[text()='Quick view']")
	private WebElement quickView;

	public WebElement getQuickView() {
		return quickView;
	}
	

}
