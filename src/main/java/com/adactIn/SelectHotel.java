package com.adactIn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClassProject {
	
	public SelectHotel() {
      PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	public WebElement selectButton;

	public WebElement getSelectButton() {
		return selectButton;
	}
	
	@FindBy(id="continue")
	public WebElement continueClk;

	public WebElement getContinueClk() {
		return continueClk;
	}
	

}
