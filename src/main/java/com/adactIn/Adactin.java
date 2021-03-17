package com.adactIn;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Adactin  extends BaseClassProject{
	public static void main(String[] args) throws Exception {
		
		BaseClassProject project=new BaseClassProject();
		 project.getdriver();
		 project.launchUrl("https://adactinhotelapp.com/index.php");
		 
		 LoginPage page=new LoginPage();
		 WebElement txtUsername = page.getTxtUsername();
		 project.enterText(txtUsername, "prakash0");
	 
		 WebElement txtPassword = page.getTxtPassword();
		 project.enterText(txtPassword,"J5M3AD");
		 
        WebElement clkButton = page.getClkButton();
        project.btnClick(clkButton);
        
        SearchPage page1=new SearchPage();
        project.dropDown(page1.getLocation(),"visibleText", "Brisbane");
        
        project.dropDown(page1.getHotels(), "VisibleText", "Hotel Sunshine");
        
        project.dropDown(page1.getRoom(), "VisibleText", "Super Deluxe");
        
        project.dropDown(page1.getRoomNo(), "VisibleText", "5 - Five");

        project.enterText(page1.getDatePickIn(), "15/04/2021");
        
        project.enterText(page1.getDatePickOut(), "25/04/2021");
        
        project.dropDown(page1.getAdultPerRoom(), "visibleText", "3 - Three");
        
        project.dropDown(page1.getChildRoom(), "visibleText", "3 - Three");
        
        project.btnClick(page1.getSearchsubmit());
        
        SelectHotel hotel=new SelectHotel();
                
        project.btnClick(hotel.getSelectButton());
        
        project.btnClick(hotel.getContinueClk());
        
        
        
        BookHotel book=new BookHotel();
        
        project.enterText(book.getFirstName(), "prakash");
        
        project.enterText(book.getLastName(), "01");
        
        project.enterText(book.getAddress(), "Nagalamman nagar");
        
        project.enterText(book.getCreditCardNo(), "1234567899874561");
        
        project.dropDown(book.getCreditCardType(), "visibleText", "Master Card");
        
        project.dropDown(book.getPickMonth(), "visibleText", "June");
        
        project.dropDown(book.getPickYear(), "visibleText", "2022");
        
        project.enterText(book.getCvvNo(), "896");
        
        project.btnClick(book.getBookNow());
        
        Thread.sleep(6000);
        
        BookingConfirmation booking=new BookingConfirmation();
        
        String attribute = booking.attribute(booking.getOrderNo(), "value");
        System.out.println(attribute);
        
        
        
       // Assert.assertEquals(attribute, "xyzjsjdkj");
        
        
	}

}
