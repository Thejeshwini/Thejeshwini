package week2.day1.assign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {

	public static void main(String[] args) {
		
			
			WebDriverManager.chromedriver().setup();
	
			ChromeDriver driver = new ChromeDriver();
	
			driver.manage().window().maximize();
	
			driver.get("http://leafground.com/pages/Link.html");
			
			driver.findElementByXPath("(//a[text()='Go to Home Page'])[1]").click();
			
			String getHomePge = driver.getTitle();
			System.out.println("home page title : "+getHomePge);
			
			driver.navigate().back();
			
			
			//without clicking where the link should go further
			System.out.println(driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href"));
			
		WebElement getErrortext = 
				driver.findElementByLinkText("Verify am I broken?");
		getErrortext.click();
	System.out.println(driver.getCurrentUrl());
	
	driver.navigate().back();
			
	driver.findElementByXPath("(//a[text()='Go to Home Page'])[2]").click();
	}

}
