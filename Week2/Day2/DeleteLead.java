package week2.day2.Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		driver.findElementById("username").sendKeys("DemosalesManager");

		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//span[text()='Phone']").click();
		
		driver.findElementByName("phoneAreaCode").sendKeys("11");
		
		driver.findElementByName("phoneNumber").sendKeys("9901444748");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
