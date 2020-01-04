package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day9Hw2Part1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Documents/Libraries/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///Users/yavuzaydin/IdeaProjects/Day9Hw/src/study/techno/SignUpForm.html");
		
		driver.findElement(By.xpath("/html/body/div/form/p[1]/input")).sendKeys("Tugba");
		

		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("12345");
		driver.findElement(By.xpath("/html/body/div/form/p[3]/input")).sendKeys("12345");
		driver.findElement(By.xpath("/html/body/div/form/p[4]/textarea")).sendKeys("Alpharetta");
		driver.findElement(By.xpath("/html/body/div/form/p[5]/input[2]")).click();
		
		//driver.findElement(By.xpath("//*[@select='Basic']")).click();
		driver.findElement(By.xpath("//*[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
	}
	

}
