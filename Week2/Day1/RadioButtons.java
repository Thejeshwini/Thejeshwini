package week2.day1.assign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/radio.html");
		
		//selecting yes or No buttons
		driver.findElementByXPath("//div[@id=\"first\"]/label[1]").click();
		
	//	finding the default value selected -Ask this checked is slected but op comes wrong
		
		
		  if(driver.findElementByXPath("(//input[@name='news' and @type='radio'])[2]").
		  getAttribute("value").contains("1")) { System.out.println("true"); }else{
		  System.out.println("false"); }
		 
	
	
	
	//selecting the age group
	driver.findElementByXPath("//input[@name='age' and @type='radio'][1]").click();
	
	driver.close();

	}

}
