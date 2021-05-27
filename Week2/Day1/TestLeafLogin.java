package week2.day1.assign;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafLogin {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();
		String actualTitlePage = "Leaftaps - TestLeaf Automation Platform";

		driver.findElementById("username").sendKeys("DemosalesManager");

		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();

		String gettitlePage = driver.getTitle();
		System.out.println("expected titlepage : " + gettitlePage);

		// assertEquals(gettitlePage, actualTitlePage);
		if (gettitlePage.equalsIgnoreCase(actualTitlePage)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Leads").click();

		driver.findElementByLinkText("Create Lead").click();

		WebElement companyname1 = driver.findElement(By.id("createLeadForm_companyName"));
		companyname1.sendKeys("IBM");
		String oldText = companyname1.getText();

		driver.findElementById("createLeadForm_firstName").sendKeys("Sanju");

		driver.findElementById("createLeadForm_lastName").sendKeys("Jashu");

		driver.findElementById("createLeadForm_dataSourceId").sendKeys("Direct Mail");

		driver.findElementById("createLeadForm_marketingCampaignId").sendKeys("Automobile");

		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("tej");

		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("reddy");

		driver.findElementById("createLeadForm_personalTitle").sendKeys("abcd");

		driver.findElementById("createLeadForm_birthDate").sendKeys("3/11/21");

		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("titile is Testleaf");

		driver.findElementById("createLeadForm_departmentName").sendKeys("department science");

		driver.findElementById("createLeadForm_annualRevenue").sendKeys("100");

		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		Select drpdownCurrency = new Select(currency);
		drpdownCurrency.selectByIndex(2);
		
		driver.findElementByName("submitButton").click();

		 driver.findElementByLinkText("Duplicate Lead").click();
		  
		  driver.findElementById("createLeadForm_companyName").clear();
		 
		  WebElement companyname2 =
		 driver.findElement(By.id("createLeadForm_companyName"));
		  companyname2.sendKeys("New Company Testleafyteju");
		
		 /* // String newText = companyname2.getText(); System.out.println(newText);
		 * if(oldText.equals(newText)) {
		 * System.out.println("Not Changed the Company name to new"); }else {
		 * System.out.println("Changed the Company name to new"); }
		 * 
		  */
		  driver.findElementByName("submitButton").click();
		  
		WebElement gettextnameNew = driver.findElementById("viewLead_companyName_sp");
		String newText = gettextnameNew.getText();
	//	System.out.println(gettextnameNew.getText());
		
		if(oldText.equals(newText)) {
			  System.out.println("Not Changed the Company name to new"); }else {
			 System.out.println("Changed the Company name to new"); }
			 
		
		driver.close();
	}

}
