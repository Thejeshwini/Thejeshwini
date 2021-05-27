package week2.day2.Assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		driver.findElementById("username").sendKeys("DemosalesManager");

		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByXPath("//a[text()='Contacts']").click();
		
		driver.findElementByXPath("//a[text()='Create Contact']").click();
		
		driver.findElementById("firstNameField").sendKeys("Raj");
		
		driver.findElementById("lastNameField").sendKeys("chopra");

		driver.findElementById("createContactForm_firstNameLocal").sendKeys("tej");
		
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("reddy");

		driver.findElementById("createContactForm_departmentName").sendKeys("depart name is KGF");
		
		driver.findElementById("createContactForm_description").sendKeys("desprit is about slenium");
		
		driver.findElementById("createContactForm_primaryEmail").sendKeys("nirtehj@gmail.com");
		
		WebElement stateprov =
		driver.findElementById("createContactForm_generalStateProvinceGeoId");
		
		Select stateDrop = new Select(stateprov);
		stateDrop.selectByVisibleText("New York");
		
		driver.findElementByName("submitButton").click();
		
		driver.findElementByXPath("//a[text()='Edit']").click();
		
		driver.findElementById("updateContactForm_description").clear();
		
		driver.findElementById("updateContactForm_importantNote").sendKeys("importnote data enetre");
		
		driver.findElementByXPath("//td/input[@value='Update']").click();
		
		String resultingTiltle =driver.getTitle();
		System.out.println("Resulting page title is " + resultingTiltle);
		
		driver.close();
		
		
		
	}

}
