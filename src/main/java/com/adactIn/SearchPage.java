package com.adactIn;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClassProject {

	//in constructor initiate elements in the page to driver 
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
		
	}

	//step 1 deriving the object with anotation
	
	@FindBy(xpath = "//select[@id='location']")
	public WebElement location;

	
	//generate getter 
	public WebElement getLocation() {
		return location;
	}
	
	@FindBy(xpath="//select[@id='hotels']")
	public WebElement hotels;
	
	@FindBy(xpath="//select[@id='room_type']")
	public WebElement room;
	
	@FindBy(xpath="//select[@id='room_nos']")
	public WebElement roomNo;
	
	@FindBy(xpath="//input[@id='datepick_in']")
	public WebElement datePickIn;
	
	@FindBy(xpath="//input[@id='datepick_out']")
	public WebElement datePickOut;
	
	public WebElement getHotels() {
		return hotels;
	}




	public WebElement getRoom() {
		return room;
	}




	public WebElement getRoomNo() {
		return roomNo;
	}




	public WebElement getDatePickIn() {
		return datePickIn;
	}




	public WebElement getDatePickOut() {
		return datePickOut;
	}




	public WebElement getAdultPerRoom() {
		return AdultPerRoom;
	}


	public WebElement getChildRoom() {
		return childRoom;
	}

	@FindBy(xpath="//select[@id='adult_room']")
	public WebElement AdultPerRoom;
	
	
    @FindBy(xpath="//select[@id='child_room']")
    public WebElement childRoom;
    
    @FindBy(id = "Submit")
    public WebElement searchsubmit;


	public WebElement getSearchsubmit() {
		return searchsubmit;
	}
		
}
