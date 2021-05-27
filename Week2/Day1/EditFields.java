package week2.day1.assign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" http://www.leafground.com/pages/Edit.html");
		
		driver.findElementById("email").sendKeys("njrtheju@gmail.com1");
		
		driver.findElementByXPath("//input[@value ='Append ']").sendKeys("extra");
	
		//Print text from the field
		WebElement getdefaultText = 
				driver.findElementByXPath("//input[@name ='username']");
	//	getdefaultText.click();
		String defaultvalue = getdefaultText.getAttribute("value");
		System.out.println("default value in field: " +defaultvalue);
		
		driver.findElementByXPath("//input[@value ='Clear me!!']").clear();
		
		//field is not enabled so o/p is false,
		System.out.println(driver.findElementByXPath("//input[@disabled ='true']").isEnabled());	
		
	driver.close();
	}

}
