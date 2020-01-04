package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html
// click on the "Normal success message" button then validate
// that message is equal "I'm a normal success message. To close use the appropriate button."
// then click on X button on the message
// validate the the message is invisible or not present
// repeat Task 3 for all the buttons. Success, warning, danger and info buttons.

public class HwSeleniumDay7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Documents/Libraries/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
		
		// WARNING BUTTON
//
		WebElement warning = driver.findElement(By.xpath("//button[@id='normal-btn-warning']"));

		warning.click();

		WebElement message = driver.findElement(By.xpath("//*[@class='alert alert-warning alert-normal-warning']"));

		System.out.println(message.getText());

		WebElement close = driver.findElement(By.xpath("//html/body/div[2]/div/div[2]/div/div[2]/div[4]/button"));

		System.out.println(close.getText());

		String test = message.getText().replace(close.getText(), "").trim();

		String text = "I'm a normal warning message. To close use the appropriate button.";
	
		System.out.println(text.equals(test) ? "success" : "failure");
//		
		close.click();
//
		System.out.println(!message.isDisplayed() ? "success" : "failure");
//		
		// DANGER BUTTON
		
		WebElement danger = driver.findElement(By.xpath("//button[@id='normal-btn-danger']"));

		danger.click();
		
		WebElement message1 = driver.findElement(By.xpath("//*[@class='alert alert-danger alert-normal-danger']"));

		System.out.println(message1.getText());
		
		WebElement close1 = driver.findElement(By.xpath("//html/body/div[2]/div/div[2]/div/div[2]/div[6]/button"));

		System.out.println(close1.getText());
		
		String test1 = message1.getText().replace(close1.getText(), "").trim();

		String text1 = "I'm a normal danger message. To close use the appropriate button.";
		
		System.out.println(text1.equals(test1) ? "success" : "failure");
//		
		close1.click();
//
		System.out.println(!message1.isDisplayed() ? "success" : "failure");
		
		
		// INFO BUTTON
		
		WebElement info = driver.findElement(By.xpath("//button[@id='normal-btn-info']"));

		info.click();
		
		WebElement message2 = driver.findElement(By.xpath("//*[@class='alert alert-info alert-normal-info']"));

		System.out.println(message2.getText());
		
		WebElement close2 = driver.findElement(By.xpath("//html/body/div[2]/div/div[2]/div/div[2]/div[8]/button"));

		System.out.println(close2.getText());
		
		String test2 = message2.getText().replace(close2.getText(), "").trim();

		String text2 = "I'm a normal info message. To close use the appropriate button.";
		
		System.out.println(text2.equals(test2) ? "success" : "failure");
//		
	     close2.click();
//
		System.out.println(!message2.isDisplayed() ? "success" : "failure");
		
		
		
	}

}
