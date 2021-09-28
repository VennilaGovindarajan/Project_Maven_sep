package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tops_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//img[contains(@title,'Faded Short')]")
	private WebElement fadedTshirt;
	
	public Tops_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFadedTshirt() {
		return fadedTshirt;
	}

	public WebElement getQuickView2() {
		return quickView2;
	}

	@FindBy(xpath="(//a[@class='quick-view'])[1]")
	private WebElement quickView2;

}
