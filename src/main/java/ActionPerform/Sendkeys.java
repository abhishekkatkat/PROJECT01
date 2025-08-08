package ActionPerform;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		Actions a = new Actions(driver);
		
		a.sendKeys(Keys.F5);
		
		a.sendKeys(Keys.CONTROL+ "t");
		
		a.sendKeys(Keys.CONTROL+"n");
		
		 
			
			
		}
			

}
