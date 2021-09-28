package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_img_Page1 {
public WebDriver driver;

@FindBy(xpath="//a[@title='Proceed to checkout']")
private WebElement proceedBtn5;

public Product_img_Page1(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getProceedBtn5() {
	return proceedBtn5;
}

}
