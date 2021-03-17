package org.adactinworkout;

import org.locators.LoginPage;
import org.locators.SearchHotel;
import org.openqa.selenium.WebElement;

import com.adactIn.BaseClassProject;
import com.adactIn.LibGlobal;
import com.adactIn.SearchPage;

public class Adactinworkout {
	
	public static void main(String[] args) throws Exception {
		LibGlobal l=new LibGlobal();
SearchPage s = new SearchPage();
		LoginPage lo=new LoginPage();
		BaseClassProject b= new BaseClassProject();
		
		l.enterText(lo.getUserName(), "franklin@g,ail.com");
		b.dropDown(s.getLocation(), "value", "Sydney");
	
}
}
