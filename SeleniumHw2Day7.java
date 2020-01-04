package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHw2Day7 {
    // https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html
    // click on the "Autocloseable success message" button
    // then validate that "I'm an autocloseable success  message. I will hide in 5 seconds."
    // disappears, wait at least 10 seconds for it to disappear
	  // repeat Task 4 for all the buttons. Success, warning, danger and info buttons.

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Documents/Libraries/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");

		WebElement warning = driver.findElement(By.xpath("//button[@id='autoclosable-btn-warning']"));
		
		warning.click();
		

		WebDriverWait wait = new WebDriverWait(driver, 10);

		try {

			wait.until(ExpectedConditions
					.invisibilityOfElementLocated(By.className("alert alert-warning alert-autocloseable-warning")));

			System.out.println("Success");

		} catch (Exception e) {

			System.out.println("Failure");
		}
		  driver.quit();

	}

}
