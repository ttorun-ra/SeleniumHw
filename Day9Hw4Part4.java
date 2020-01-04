package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day9Hw4Part4 {
    /**
     * Open "http://the-internet.herokuapp.com/dynamic_controls"
     *
     * click on "Enable" button
     * wait for <input> of type="text" to be enabled within 2 seconds
     * if <input> of type="text" is still disabled print "Failure"
     * if test failed, take a screenshot and store it in homework4 folder
     * This test must fail
     * @throws InterruptedException 
     **/
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Documents/Libraries/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/dynamic_controls");
		
		driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
		
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, 2);	
		
		WebElement webElement1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#message")));
		System.out.println(webElement1.getText());
		
		

	}

}
