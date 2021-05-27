package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathRelationship {

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
		
	//	driver.findElementByXPath("//a[@class='selected']").click();
		
		driver.findElementByXPath("//div[@class ='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
		driver.findElementByXPath("//a[text() ='Merge Leads']").click();
		
		//xpath for icon in mergeleads From lead and To lead.
		driver.findElementByXPath("//table[@name = 'ComboBox_partyIdFrom']/following-sibling::a/img").click();
		
		driver.findElementByXPath("//table[@name = 'ComboBox_partyIdTo']/following-sibling::a/img").click();
		
		
	}

}
