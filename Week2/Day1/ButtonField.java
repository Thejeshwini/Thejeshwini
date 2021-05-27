package week2.day1.assign;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonField {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//clicking on home and navigate back
		driver.findElementById("home").click();
		driver.navigate().back();
		
		
		//finding the positon x,y cordinates
		WebElement buttonPostion=
		driver.findElementById("position");
		
		Point location = buttonPostion.getLocation();
	//	System.out.println(location);
		int x = location.getX();
		int y =location.getY();
		System.out.println("Print co-ordinates  " + x + " and " + y);	
				
				
				
		//Printing background colour of the button
		String bckgroundColour =	
		driver.findElementById("color").getCssValue("background-color");
		System.out.println(  "background color is:  " +bckgroundColour);
		
		
		//Finding the size width and height
		WebElement buttonSize =
		driver.findElementById("size");
		
		int elementwidth = buttonSize.getSize().getWidth();
		System.out.println("  Elementwidth " + elementwidth);
		int elementHeight = buttonSize.getSize().getHeight();
		System.out.println("  ElementHeight " + elementHeight);
		
		driver.close();
		
		
	
	}

}
