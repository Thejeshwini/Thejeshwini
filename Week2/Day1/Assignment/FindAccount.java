package week2.day1.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElementById("username").sendKeys("DemosalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByXPath("//a[text()='Accounts']").click();
		
		driver.findElementByXPath("//a[text()='Find Accounts']").click();
		
		driver.findElementByXPath("(//div[@class='x-form-element']/input[@name ='accountName'])[2]")
		.sendKeys("Credit Limited Account");
		
		
		  driver.findElementByXPath("//button[text()='Find Accounts']").click();
		  
		  Thread.sleep(3000);
		  driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']").click();
		  
		  driver.findElementByXPath("//a[text()='Edit' and @class='subMenuButton']").click();
		  
		  String getAccountName = driver.findElementById("accountName").getAttribute("value"); 
		//  String accountname = getAccountName.getAttribute("value");
		  System.out.println("print account name is :  " +getAccountName);
		 
		String descriptionData =
				driver.findElementByName("description").getAttribute("value");
			//	String descriptionvalue = descriptionData.getAttribute("value");
				System.out.println("print account descripti is : " +descriptionData);
				
			String getTitlePageAccount	= driver.getTitle();
			System.out.println(getTitlePageAccount);
	}

}
