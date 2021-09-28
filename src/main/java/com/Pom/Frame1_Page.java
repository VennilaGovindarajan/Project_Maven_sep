package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frame1_Page {
	public WebDriver driver;
	
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	private WebElement frame1;
	
	public Frame1_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFrame1() {
		return frame1;
	}

	public WebElement getPlusBtn() {
		return plusBtn;
	}

	public WebElement getSizeBtn() {
		return sizeBtn;
	}

	public WebElement getColour() {
		return colour;
	}

	public WebElement getAddtoCart() {
		return addtoCart;
	}

	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plusBtn;
	
	@FindBy(xpath="//select[@id='group_1']")
	private WebElement sizeBtn;
	
	@FindBy(xpath="//a[@name='Pink']")
	private WebElement colour;
	
	@FindBy(xpath="//button[@name='Submit']")
	private WebElement addtoCart;
	
	

}
