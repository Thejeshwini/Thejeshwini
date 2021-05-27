package week2.day1.Assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemosalesManager");
		
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		
		driver.findElementByXPath("//a[text() ='Leads']").click();
		
		driver.findElementByXPath("//a[text() ='Create Lead']").click();
		
		driver.findElementByXPath("//input[@id ='createLeadForm_companyName']").sendKeys("Testleaf");
		
		driver.findElementByXPath("//input[@id ='createLeadForm_firstName']").sendKeys("teju");
		
		driver.findElementByXPath("//input[@id ='createLeadForm_lastName']").sendKeys("prab");
		
		WebElement source = 
				driver.findElementById("createLeadForm_dataSourceId");
		
		Select sourceDrop = new Select(source);
		sourceDrop.selectByVisibleText("Employee");
		
		
		
		WebElement marketing =
				driver.findElementById("createLeadForm_marketingCampaignId");
		
		Select marketingDrop = new Select(marketing);
		marketingDrop.selectByValue("9001");
		
		
		WebElement ownership =
				driver.findElementByName("ownershipEnumId");

				Select ownershipDrop = new Select(ownership);
				ownershipDrop.selectByIndex(5);
		
		
		WebElement country =
				driver.findElementById("createLeadForm_generalCountryGeoId");
		
		Select countryDrp = new Select(country);
		countryDrp.selectByVisibleText("India");
		
	 driver.findElementByName("submitButton").click();
		
		//printing the title of the page
		String gettitlePage = driver.getTitle();
		System.out.println("Resulting titlepage : " + gettitlePage);
		
		driver.close();
		
	}

}
