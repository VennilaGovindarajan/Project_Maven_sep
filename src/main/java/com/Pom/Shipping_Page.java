package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {
	public WebDriver driver;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBox;

	public Shipping_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getProceedBtn4() {
		return proceedBtn4;
	}

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement proceedBtn4;

}
