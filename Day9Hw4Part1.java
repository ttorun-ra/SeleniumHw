package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9Hw4Part1 {
	  /**
     * open "https://ultimateqa.com/filling-out-forms/"
     * fill in et_pb_contact_form_0 with some random data
     * click on submit button of this form
     * check that text "Form filled out successfully" is displayed
	 * @throws InterruptedException 
     **/
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Documents/Libraries/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ultimateqa.com/filling-out-forms/");
		
		driver.findElement(By.xpath("//*[@id='et_pb_contact_name_0']")).sendKeys("Tugba");
		
		driver.findElement(By.xpath("//*[@id='et_pb_contact_message_0']")).sendKeys("This is too much");
		
		driver.findElement(By.xpath("//*[@class='et_pb_contact_submit et_pb_button']")).click();
		
		WebElement message=driver.findElement(By.xpath("//*[@class='et-pb-contact-message']"));
		
		System.out.println(!message.isDisplayed() ? "success" : "failure");
//	}
	}
}
