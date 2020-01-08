package Project9;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Project9TestNG {

	WebDriver driver;

	@BeforeClass

	public void setup() {

		System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Documents/Libraries/drivers/chromedriver");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://test-basqar.mersys.io");

	}

	@Test

	public void login() throws InterruptedException {
        // login info
		driver.findElement(By.cssSelector("[formcontrolname=\"username\"]")).sendKeys("admin");

		driver.findElement(By.cssSelector("[formcontrolname=\"password\"]")).sendKeys("admin");

		driver.findElement(By.cssSelector("button[aria-label=\"LOGIN\"]")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Entrance Exam
		driver.findElement(By.xpath("//fa-icon[@class='collapsable-arrow ng-fa-icon ng-tns-c27-16 ng-star-inserted']"))
				.click();

		// Registration Info
		driver.findElement(By.xpath("//span[text()='Registration Approve']")).click();

		// Plus icon
		
		driver.findElement(By.xpath("//button[@class='mat-mini-fab mat-button-base mat-accent']")).click();

		
		// grade level of registration

		driver.findElement(By.xpath("//span[contains(text(),'Grade Level of Registration')]")).click();

	
		driver.findElement(By.xpath("//span[@class='mat-option-text'][contains(text(),'11th')]")).click();

		WebDriverWait wait = new WebDriverWait(driver, 25);

		wait.until(ExpectedConditions
				.invisibilityOfElementLocated(By.xpath("//span[@class='mat-option-text'][contains(text(),'11th')]")));
		
         // choose exam
		
		driver.findElement(By.xpath("//mat-select[@aria-label='Choose Exam']")).click();

        // exam name
		driver.findElement(By.xpath(
				"//span[@class='mat-option-text'][contains(text(),' Senior High School Entrance Exam for 11th Grade Level Students ')]"))
				.click();

		// Clicking on information page

		driver.findElement(By.xpath("(//div[@class='mat-tab-label mat-ripple ng-star-inserted'])[1]")).click();

		String firstName = "Tugba1";

		// firstname
		driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys(firstName);

		String lastName = "Aydin";

		// lastname
		driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys(lastName);

		// gender click
		driver.findElement(By.xpath("(//div[@class='mat-select-value'])[1]")).click();

		// female click
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[2]")).click();

		String name = firstName + " " + lastName;

		String gender = "female";

		String birth = "961988";

		driver.findElement(By.xpath("//input[@placeholder='Date of Birth']" + "")).sendKeys("9/6/1988");

		driver.findElement(By.xpath("//input[@placeholder='Personal ID']" + "")).sendKeys("12346");

		// click on citizenship
		WebElement citizenship = driver
				.findElement(By.xpath("//div//span[@class='mat-select-placeholder ng-tns-c36-70 ng-star-inserted']"));

		citizenship.click();

		// selecting country
		driver.findElement(By.xpath("//mat-option//span[@class='mat-option-text'][contains(text(),'Turkey')]")).click();

		String email = "tttttt@gmail.com";

		driver.findElement(By.xpath("//input[@placeholder='Email']" + "")).sendKeys(email);

		// clicking on nationality

		driver.findElement(By.xpath("(//div[@class='mat-select-value'])[3]")).click();

		// Selecting Turkish

		driver.findElement(By.xpath("//mat-option//span[@class='mat-option-text'][contains(text(),'Turkish" + "')]"))
				.click();

		// closing the cookies warning
		driver.findElement(By.xpath("//a[@class='cc-btn cc-dismiss']")).click();
		
		
		
		// click on Relative Inf0
		
		driver.findElement(By.xpath("(//div[@class='mat-tab-label mat-ripple ng-star-inserted'])[2]")).click();

		

		wait.until(ExpectedConditions
				.invisibilityOfElementLocated(By.xpath("(//div[@class='mat-tab-label mat-ripple ng-star-inserted'])[2]")));
		
		// Click on represantative
		

		driver.findElement(By.xpath("(//mat-select[@aria-label='Representative'])[1]")).click();
		
		
		// Click on Mother
		
		driver.findElement(By.xpath("//span[@class='mat-option-text'][contains(text(),'Mother')]")).click();
		
		
		// filling out the lastname and firstname
		
		driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys("Adams");
		
		driver.findElement(By.xpath("(//input[@placeholder='First Name'])[1]")).sendKeys("Mary");
		
		// mobile phone
		
		driver.findElement(By.xpath("(//input[@placeholder='Mobile Phone'])[1]")).sendKeys("12345567");
		
		//click on Country
		
		driver.findElement(By.xpath("(//mat-select[@aria-label='Country'])[1]")).click();
		
		// selecting country
		
		
		driver.findElement(By.cssSelector("mat-option:nth-child(5)")).click();
	
	

//		// click on Save button
//
		wait.until(ExpectedConditions
				.invisibilityOfElementLocated(By.cssSelector("mat-option:nth-child(5)")));

		driver.findElement(By.xpath("//ms-save-button[@caption='GENERAL.BUTTTON.SAVE']")).click();
		
		WebElement fullName= driver.findElement(By.xpath("//tbody//tr//td[3][contains(text(),'Tugba Aydin')]"));
		
		System.out.println(fullName.getText());
		
		String expected=fullName.getText();
		
		Assert.assertEquals(name, expected);

	}
 
	}
