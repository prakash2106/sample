package org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactIn.LibGlobal;

public class LoginPage extends LibGlobal {
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='username']")

		private WebElement userName;
	@FindBy()

	public WebElement getUserName() {
		return userName;
	}
	
	
	

}
