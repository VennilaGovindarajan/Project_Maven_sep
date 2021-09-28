package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Homepage {

	public WebDriver driver;  //null
	
	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement createAccountBtn;

	public Fb_Homepage(WebDriver driver2) {

		this.driver = driver2;  //chrome

		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateAccountBtn() {
		return createAccountBtn;
	}

}
