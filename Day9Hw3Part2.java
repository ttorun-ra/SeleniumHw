package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Open "http://the-internet.herokuapp.com/login"
 *
 * using XPath: grab username from first <em> tag and store inside a String grab
 * password from second <em> tag and store inside a String fill in username and
 * password inputs with above username and password find <button> with
 * type="submit" and click it find and verify text "Welcome to the Secure Area.
 * When you are done click logout below." find "Log out" button and click it
 * find and verify text "You logged out of the secure area!"
 */

public class Day9Hw3Part2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Documents/Libraries/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/login");

		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);

		driver.findElement(By.xpath("//*[@class='radius']")).click();

		String header = driver.findElement(By.cssSelector(".subheader")).getText();
		System.out.println(header);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
		String logout = driver.findElement(By.xpath("//*[@class='flash success']")).getText();
		System.out.println(logout);
		driver.quit();
	}

}
