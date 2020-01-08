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

public class ProjectTestNG {

	WebDriver driver;

	@BeforeClass

	public void setup() {

		System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Documents/Libraries/drivers/chromedriver");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://test-basqar.mersys.io");

	}

	@Test

	public void verifying() {

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

		String firstName = "Tugba1";
		String lastName = "Aydin";

		String expectedname = firstName + " " + lastName;

		List<WebElement> names = driver.findElements(By.xpath("//tbody//tr//td[3]"));

		for (int i = 0; i < names.size(); i++) {

			if (names.equals(expectedname)) {

				String name = names.get(i).getText();

				Assert.assertEquals(expectedname, name);
			}
		}
	}

	@Test
	public void testingExamName() {
		String expectedExam = " Senior High School Entrance Exam for 11th Grade Level Students ";

		List<WebElement> examNAme = driver.findElements(By.cssSelector("tbody tr td:nth-child(6)"));

		for (int i = 0; i < examNAme.size(); i++) {

			if (examNAme.equals(expectedExam)) {

				String examname = examNAme.get(i).getText().trim();

				Assert.assertEquals(expectedExam, examname);
			}

		}
	}

	@Test
	public void testingGender() {
		String myGender = "Female";

		List<WebElement> genders = driver.findElements(By.cssSelector("tbody tr td:nth-child(8)"));

		for (int i = 0; i < genders.size(); i++) {
			if (genders.equals(myGender)) {

				String gender = genders.get(i).getText().trim();

				Assert.assertEquals(gender, myGender);
			}
		}

	}

	@AfterClass
	public void quit() {
		 driver.quit();
	}
}
