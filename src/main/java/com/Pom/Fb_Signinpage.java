package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Signinpage {

	public WebDriver driver;

	public Fb_Signinpage(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	@FindBy(name = "firstname")
	private WebElement firstName;

	@FindBy(name = "lastname")
	private WebElement lastName;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement mobileNo;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement password;

	@FindBy(name = "birthday_day")
	private WebElement day;

	@FindBy(name = "birthday_month")
	private WebElement month;

	@FindBy(name = "birthday_year")
	private WebElement year;

	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement radioBtn;

}
