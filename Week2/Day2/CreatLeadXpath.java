
package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatLeadXpath {

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
		
		
	//	driver.findElementByXPath("//input[@name ='submitButton']").click();
		
	}

}
