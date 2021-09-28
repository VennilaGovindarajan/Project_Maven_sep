package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page1 {
public WebDriver driver;

@FindBy(xpath="//button[@name='processAddress']")
private WebElement proceedBtn7;

public Address_Page1(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getProceedBtn7() {
	return proceedBtn7;
}

}
