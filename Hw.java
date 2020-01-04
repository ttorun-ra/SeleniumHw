package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw {
	public static void main(String[] args) {
	



	System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Documents/Libraries/drivers/chromedriver");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.seleniumeasy.com/test/");

	List<WebElement> links = driver.findElements(By.cssSelector(".board-inner a"));
	
	 String[] h3 = { "WELCOME TO SELENIUM EASY DEMO", "BASIC EXAMPLES TO START  WITH SELENIUM",
	  
	    "INTERMEDIATE EXAMPLES WITH MOST POPULAR COMPONENTS", " ADVANCED EXAMPLES WITH COMPONENTS",
	    "THANKS FOR STAYING TUNED! WE ARE DONE" };
	 
	 WebElement h3Tag = driver.findElement(By.cssSelector(".tab-content .active h3"));

	 for(int i=0; i<links.size();i++) {
		 
		 links.get(i).click();
		 
		boolean h3Validation = h3Tag.getText().equals(h3[i]);
		
	 }
	}
}
