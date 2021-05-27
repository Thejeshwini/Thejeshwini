package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroudComboDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement comboSelect = 
		driver.findElementByXPath("(//section[@class='innerblock']//select)[6]");
		Select drpdwn = new Select(comboSelect);
		
		drpdwn.selectByVisibleText("Appium");
		drpdwn.selectByIndex(4);
		

	}

}
