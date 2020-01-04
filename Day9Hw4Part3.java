package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day9Hw4Part3 {
	/**
	 * Open "http://the-internet.herokuapp.com/dynamic_controls"
	 *
	 * click on "Enable" button wait for <input> of type="text" to be enabled within
	 * 5 seconds if <input> of type="text" is enabled print success verify that
	 * <p>
	 * with id="message" is visible and has text "It's enabled!"
	 *
	 * click on "Disable" button wait for <input> of type="text" to be disabled
	 * within 5 seconds if <input> of type="text" is disabled print success verify
	 * that
	 * <p>
	 * with id="message" is visible and has text "It's disabled!"
	 * @throws InterruptedException 
	 *
	 **/

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Documents/Libraries/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/dynamic_controls");

		driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
		
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, 5);		

		WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#message")));
		
		
		System.out.println(webElement.getText());
		String text = "It's enabled!";

		System.out.println(text.equals(webElement.getText()) ? "success" : "failure");

		System.out.println(webElement.getTagName());
//
//		driver.findElement(By.xpath("//*[@id='input-example']/button")).click();
//		
//		WebDriverWait wait1 = new WebDriverWait(driver, 5);
//		WebElement webElement1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#message")));
//		System.out.println(webElement1.getText());
//		String text2="It's disabled!";
//		System.out.println(text2.equals(webElement1.getText()) ? "success" : "failure");
		//driver.quit();

	}

}
