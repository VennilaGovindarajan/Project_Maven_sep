package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frames2_Page {

	public WebDriver driver;

	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement frame2;

	public Frames2_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFrame2() {
		return frame2;
	}

	public WebElement getPlusBtn1() {
		return plusBtn1;
	}

	public WebElement getSizeBtn1() {
		return sizeBtn1;
	}

	public WebElement getColour1() {
		return colour1;
	}

	public WebElement getAddtocart1() {
		return addtocart1;
	}

	@FindBy(xpath = "//a[contains(@class,'btn btn-default button-plus product_quantity_up')]")
	private WebElement plusBtn1;

	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement sizeBtn1;

	@FindBy(xpath = "//a[@title='Blue']")
	private WebElement colour1;
	
	@FindBy(xpath="//button[@name='Submit']")
	private WebElement addtocart1;
	
}
