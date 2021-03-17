package com.adactIn;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LibGlobal {

	//private final String FileUtils = null;
	static WebDriver driver;

	public WebDriver getdriver() {

		// System.setProperty("webdriver.chrome.driver",
		// System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sony\\eclipse-workspace\\PRAKASH\\Adactinworkout\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void closeTab() {
		driver.close();
	}

	public void enterText(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void btnClick(WebElement element) {
		element.click();
	}

	public void dragAndDrop(WebElement element, WebElement source, WebElement target) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).perform();
	}

	public void mouseOver(WebElement element, WebElement target) {
		Actions ac = new Actions(driver);
		ac.moveToElement(target).perform();
		;
	}

	public void quit() {
		driver.quit();
	}

	public void ClickAndHoldAction(WebElement element, WebElement name) {
		Actions ac = new Actions(driver);
		ac.clickAndHold(name).release(name).perform();
	}

	public void rightClick(WebElement element, WebElement button) {
		Actions ac = new Actions(driver);
		ac.contextClick(button).perform();
	}

	public void doubleClick(WebElement text) {
		Actions ac = new Actions(driver);
		ac.doubleClick(text).perform();
	}

	public void simplealert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	public void confirmalert(String options) {
		if (options.equalsIgnoreCase("accept")) {
			Alert al = driver.switchTo().alert();
			al.accept();
			driver.switchTo().defaultContent();
		} else {
			Alert al = driver.switchTo().alert();
			al.dismiss();
			driver.switchTo().defaultContent();
		}
	}

	public void promptalert(String options, String Value) {
		if (options.contains("accept")) {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			driver.switchTo().defaultContent();
		} else {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(Value);
			alert.dismiss();
			driver.switchTo().defaultContent();
		}

	}

	public void scrollDown(String Value, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Value, element);
	}

	public void screenShot(String data) {
      TakesScreenshot ts=(TakesScreenshot) driver;		
      File sourceFile = ts.getScreenshotAs(OutputType.FILE);
      File destFile=new File(System.getProperty("user.dir")+"\\target\\"+data+".png");
	}

}
