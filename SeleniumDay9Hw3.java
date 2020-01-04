package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//*/
//* Open "https://ultimateqa.com/complicated-page/"
//* find "Skills Improved:" using css selectors and validate text
//* find "How to deal with a large page that has many elements and divisions?" using css selector and validate it
//* find "Properly structuring your page objects" using css selector and validate it
//*
//*/

public class SeleniumDay9Hw3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Documents/Libraries/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://ultimateqa.com/complicated-page/");

		WebElement skills = driver.findElement(By.cssSelector("#Skills_Improved"));

		WebElement text1 = driver.findElement(By.cssSelector(
				"#et-boc > div > div > div > div.et_pb_row.et_pb_row_0 > div > div > div > ul > li:nth-child(1)"));
		System.out.println(text1.getText());

		String test = "How to deal with a large page that has many elements and divisions?";

		System.out.println(test.equals(text1) ? "Success" : "failure");

		WebElement text2 = driver.findElement(By.cssSelector(
				"#et-boc > div > div > div > div.et_pb_row.et_pb_row_0 > div > div > div > ul > li:nth-child(2)"));
		System.out.println(text2.getText());
		String test2 = "Properly structuring your page objects";
		System.out.println(test2.equals(text2) ? "Success" : "failure");
		driver.close();
	}

}
