package com.selenium;

import java.util.Random;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day9Hw4Part2 {

	public static void main(String[] args) throws TimeoutException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Documents/Libraries/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ultimateqa.com/filling-out-forms/");
//		driver.findElement(By.xpath("//*[@id='et_pb_contact_name_1']")).sendKeys("Tugba");
//		driver.findElement(By.xpath("//*[@id='et_pb_contact_message_1']")).sendKeys("This is too much");
//		driver.findElement(By.xpath("//*[@class='input et_pb_contact_captcha']")).sendKeys("19");
//		
//		driver.findElement(By.cssSelector("#et_pb_contact_form_1 > div.et_pb_contact > form > div > button")).click();
//		
//		WebElement message= driver.findElement(By.xpath("//*[@class='et-pb-contact-message']"));
//		System.out.println(!message.isDisplayed() ? "success" : "failure");
		

        driver.findElement( By.id( "et_pb_contact_name_1" ) ).sendKeys( generateRandomWordOfLength( 10 ) );
        driver.findElement( By.id( "et_pb_contact_message_1" ) ).sendKeys( generateRandomWordsOfLength( 10 ) );
        String mathProblem = driver.findElement( By.cssSelector( ".et_pb_contact_form_1 span.et_pb_contact_captcha_question" ) ).getText();
        String solution = solveMathProblem( mathProblem );
        driver.findElement( By.name( "et_pb_contact_captcha_1" ) ).sendKeys( solution );
        driver.findElement( By.cssSelector( ".et_pb_column_1 button" ) ).click();

        WebDriverWait wait = new WebDriverWait( driver, 15 );
        String testString = "Success";
        wait.until( ExpectedConditions.visibilityOfElementLocated( By.xpath( "//*[contains(text(), '" + testString + "')]" ) ) );
		System.out.println( "Success!" );

    }

    private static String solveMathProblem(String mathProblem) {
        String[] params = mathProblem.split( "\\+" );
        int sum = 0;
        for(String p : params) {
            sum += Integer.valueOf( p.trim() );
        }
        return String.valueOf( sum );
    }

    public static String generateRandomWordOfLength(int length) {
        String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < length; i++) {
            sb.append( candidateChars.charAt( random.nextInt( candidateChars
                    .length() ) ) );
        }
        return sb.toString();
    }

    public static String generateRandomWordsOfLength(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < length; i++) {
            sb.append( generateRandomWordOfLength( random.nextInt( 10 ) ) + " " );
        }
        return sb.toString();
    }

}
		

