package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailId;

	
	public Login_Page(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}

	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement signInBtn;
	
	
	
}
