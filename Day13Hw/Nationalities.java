package Day13Hw;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nationalities {

	@Test

	public void Login() {
		System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Documents/Libraries/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://test-basqar.mersys.io");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[formcontrolname=\"username\"]")).sendKeys("admin");
		driver.findElement(By.cssSelector("[formcontrolname=\"password\"]")).sendKeys("admin");
		driver.findElement(By.cssSelector("button[aria-label=\"LOGIN\"]")).click();
	}

	@Test

	public void Create() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Documents/Libraries/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://test-basqar.mersys.io");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[formcontrolname=\"username\"]")).sendKeys("admin");
		driver.findElement(By.cssSelector("[formcontrolname=\"password\"]")).sendKeys("admin");
		driver.findElement(By.cssSelector("button[aria-label=\"LOGIN\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//fa-icon[@class='collapsable-arrow ng-fa-icon ng-tns-c27-13 ng-star-inserted']"))
				.click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//fa-icon[@class='collapsable-arrow ng-fa-icon ng-tns-c27-14 ng-star-inserted']"))
				.click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//fa-icon[@class='nav-link-icon ng-fa-icon ng-star-inserted']")).click();

		driver.findElement(By.xpath("//fa-icon[@class='nav-link-icon ng-fa-icon ng-star-inserted']")).click();

		driver.findElement(By.xpath("//span[text()='Nationalities']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='mat-mini-fab mat-button-base mat-accent']")).click();


//		
		 driver.findElement( By.cssSelector( "mat-dialog-container ms-text-field[placeholder=\"GENERAL.FIELD.NAME\"] > input" ) ).sendKeys("GroupGenius");
	driver.findElement(By.xpath(
		"//button[@class='save-button mat-accent mat-button mat-raised-button mat-button-base ng-star-inserted']"))
		.click();
	}

	@Test

	public void Edit() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Documents/Libraries/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://test-basqar.mersys.io");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[formcontrolname=\"username\"]")).sendKeys("admin");
		driver.findElement(By.cssSelector("[formcontrolname=\"password\"]")).sendKeys("admin");
		driver.findElement(By.cssSelector("button[aria-label=\"LOGIN\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//fa-icon[@class='collapsable-arrow ng-fa-icon ng-tns-c27-13 ng-star-inserted']"))
				.click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//fa-icon[@class='collapsable-arrow ng-fa-icon ng-tns-c27-14 ng-star-inserted']"))
				.click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//fa-icon[@class='nav-link-icon ng-fa-icon ng-star-inserted']")).click();

		driver.findElement(By.xpath("//fa-icon[@class='nav-link-icon ng-fa-icon ng-star-inserted']")).click();

		driver.findElement(By.xpath("//span[text()='Nationalities']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='mat-mini-fab mat-button-base mat-accent']")).click();

//		driver.findElement(By.xpath("//input[@id='ms-text-field-2']")).sendKeys("Group1");
//		
		driver.findElement( By.cssSelector( "mat-dialog-container ms-text-field[placeholder=\"GENERAL.FIELD.NAME\"] > input" ) ).sendKeys("Grouppp");
//		
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//button[@class='save-button mat-accent mat-button mat-raised-button mat-button-base ng-star-inserted']"))
				.click();

		Thread.sleep(2000);

		List<WebElement> names = driver.findElements(By.xpath("//tbody//tr/td[2]"));

//		
		List<WebElement> edit = driver
				.findElements(By.xpath("//button[@class='mat-button mat-button-base mat-accent ng-star-inserted']"));

		for (int i = 0; i < names.size(); i++) {

			names.get(i).getText();
	
			if (names.get(i).getText().contains("Grouppp") ) {

				edit.get(i).click();
	
			}
			

			driver.findElement( By.cssSelector( "mat-dialog-container ms-text-field[placeholder=\"GENERAL.FIELD.NAME\"] > input" ) ).clear();
		}
			
		driver.findElement( By.cssSelector( "mat-dialog-container ms-text-field[placeholder=\"GENERAL.FIELD.NAME\"] > input" ) ).sendKeys("Tugba");
			
			driver.findElement(By.xpath(
					"//button[@class='save-button mat-accent mat-button mat-raised-button mat-button-base ng-star-inserted']"))
					.click();
	}

	@Test

	public void Delete() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Documents/Libraries/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://test-basqar.mersys.io");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[formcontrolname=\"username\"]")).sendKeys("admin");
		driver.findElement(By.cssSelector("[formcontrolname=\"password\"]")).sendKeys("admin");
		driver.findElement(By.cssSelector("button[aria-label=\"LOGIN\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//fa-icon[@class='collapsable-arrow ng-fa-icon ng-tns-c27-13 ng-star-inserted']"))
				.click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//fa-icon[@class='collapsable-arrow ng-fa-icon ng-tns-c27-14 ng-star-inserted']"))
				.click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//fa-icon[@class='nav-link-icon ng-fa-icon ng-star-inserted']")).click();

		driver.findElement(By.xpath("//fa-icon[@class='nav-link-icon ng-fa-icon ng-star-inserted']")).click();

		driver.findElement(By.xpath("//span[text()='Nationalities']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='mat-mini-fab mat-button-base mat-accent']")).click();

//		driver.findElement(By.xpath("//input[@id='ms-text-field-2']")).sendKeys("Group1");
//		
		driver.findElement( By.cssSelector( "mat-dialog-container ms-text-field[placeholder=\"GENERAL.FIELD.NAME\"] > input" ) ).sendKeys("Ahmet2");
//		
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//button[@class='save-button mat-accent mat-button mat-raised-button mat-button-base ng-star-inserted']"))
				.click();

		Thread.sleep(2000);

		List<WebElement> names = driver.findElements(By.xpath("//tbody//tr/td[2]"));

//		
		List<WebElement> edit = driver
				.findElements(By.xpath("//button[@class='mat-button mat-button-base mat-accent ng-star-inserted']"));

		for (int i = 0; i < names.size(); i++) {

			names.get(i).getText();
	
			if (names.get(i).getText().contains("Ahmet2") ) {

				edit.get(i).click();
	
			}
			
			driver.findElement( By.cssSelector( "mat-dialog-container ms-text-field[placeholder=\"GENERAL.FIELD.NAME\"] > input" ) ).clear();
		}
			
		driver.findElement( By.cssSelector( "mat-dialog-container ms-text-field[placeholder=\"GENERAL.FIELD.NAME\"] > input" ) ).sendKeys("Ayse13");
			
			driver.findElement(By.xpath(
					"//button[@class='save-button mat-accent mat-button mat-raised-button mat-button-base ng-star-inserted']"))
					.click();
			Thread.sleep(3000);
	
			 driver
					.findElement(By.xpath("//button[@class='mat-button mat-button-base mat-warn ng-star-inserted']")).click();
			 
			 
			 driver.findElement(By.xpath("//button[@class='mat-button mat-raised-button mat-button-base mat-accent']")).click();
	
	}
			
	}
