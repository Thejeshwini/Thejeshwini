package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		
		//pre-condition to setup the driver path
		WebDriverManager.chromedriver().setup();
		
		//System.getProperty(key)
		
		//to open the chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//wait
		Thread.sleep(4000);
		
		driver.findElementById("username").sendKeys("DemosalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("IBM");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Sanju");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Jashu");
		
	
		
		// id should not conatin number to use as locator
	//driver.findElementById("ext-gen626").click();	
		
	WebElement industry =	driver.findElementById("createLeadForm_industryEnumId");
	
	Select drpdown = new Select(industry);
	
	//drpdown.selectByValue("IND_HEALTH_CARE");
	drpdown.selectByVisibleText("Health Care");	
		
//	driver.findElementByName("submitButton").click();
		
		//closing the window
	//	driver.close();
	}

}
