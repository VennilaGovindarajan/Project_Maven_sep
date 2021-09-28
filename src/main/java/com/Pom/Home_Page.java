package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver; // --> null
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement signin;

	public Home_Page(WebDriver driver2) {
		this.driver=driver2;  //--> chrome
	
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getSignin() {
		
		return signin;
	}
	
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement womenMenu;

	public WebElement getWomenMenu() {
		return womenMenu;
	}
	@FindBy(xpath="(//a[@title='Tops'])[1]")
	private WebElement tops;

	public WebElement getTops() {
		return tops;
	}
	

}
