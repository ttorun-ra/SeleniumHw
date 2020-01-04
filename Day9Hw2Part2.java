package com.selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day9Hw2Part2 {

	public static void main(String[] args) throws MalformedURLException {
		
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
		System.out.println(driver.getCurrentUrl());
		
		 URL url = new URL("file:///Users/yavuzaydin/IdeaProjects/Day9Hw/src/study/techno/SignUpForm.html");
		 String protocol = url.getProtocol();
         String host = url.getHost();
         int port = url.getPort();
         String path = url.getPath();
          
         System.out.println("URL created: " + url);
         System.out.println("protocol: " + protocol);
         System.out.println("host: " + host);
         System.out.println("port: " + port);
         System.out.println("path: " + path);
         
         String path1 = "file:///" + System.getProperty( "user.dir" ) + "/src/day9/homework/homework1/SignUpFormSolution.html";
         driver.get( path1 );
         driver.findElement( By.name( "username" ) ).sendKeys( "name" );
         driver.findElement( By.name( "password" ) ).sendKeys( "password" );
         driver.findElement( By.name( "password_repeat" ) ).sendKeys( "password" );
         driver.findElement( By.name( "address" ) ).sendKeys( "7514 Riverview Rd.\n" + "Sheboygan, WI 53081" );
         driver.findElement( By.cssSelector( "input[type='radio'][value='male']" ) ).click();
         Select plan = new Select( driver.findElement( By.name( "plan" ) ) );
         plan.selectByIndex( plan.getOptions().size() - 1 ); //selects last option
         driver.findElement( By.name( "agreement" ) ).click();
//         driver.quit();
         
         
         
       

	}

}
