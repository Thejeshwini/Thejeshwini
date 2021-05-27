package week2.day1.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {

	public static void main(String[] args) {
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
		
		driver.findElementByXPath("//a[text()='Create Account']").click();
		
		WebElement currency = driver.findElementById("currencyUomId");
		
		Select currenyDrop = new Select(currency);
		currenyDrop.selectByValue("INR");
		
		driver.findElementByName("description").sendKeys("NRI Account");
		
		driver.findElementByXPath("//span[text()='Local Name']/following::input[@id='groupNameLocal']").sendKeys("Local name Tej");
		
		driver.findElementByXPath("//span[text()='Site Name']/following::input[@id='officeSiteName']").sendKeys("site name Banglore");
		
		driver.findElementByXPath("//table[@class='fourColumnForm']//input[@id='annualRevenue']").sendKeys("17k823fer");
		
		WebElement industry =
				driver.findElementByName("industryEnumId");
				
				Select industryDrop = new Select(industry);
				industryDrop.selectByValue("IND_SOFTWARE");
				
				WebElement ownership =
						driver.findElementByName("ownershipEnumId");

						Select ownershipDrop = new Select(ownership);
						ownershipDrop.selectByVisibleText("S-Corporation");
						
						WebElement source =
								driver.findElementById("dataSourceId");
								
								Select sourceDrop = new Select(source);
								sourceDrop.selectByValue("LEAD_EMPLOYEE");
								
								WebElement marketingCamp =
										driver.findElementById("marketingCampaignId");
								
								Select marketingCampDrop = new Select(marketingCamp);
								marketingCampDrop.selectByIndex(6);
								
								WebElement stateProvinc = 
										driver.findElementById("generalStateProvinceGeoId");
								
								Select stateProvineDrop = new Select(stateProvinc);
								stateProvineDrop.selectByValue("TX");
								
								
								driver.findElementByXPath("//table[@class='fourColumnForm']//following::input[@type='submit']").click();
								
								WebElement errorMessage = driver.findElementByXPath("//div[@class='messages']");
							String	textError= errorMessage.getText();
							System.out.println(textError);
		
		
		
		
	}

}
