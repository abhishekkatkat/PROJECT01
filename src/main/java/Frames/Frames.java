package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert"); 
		

		
	  WebElement frame1 = driver.findElement(By.id("iframeResult"));
		
	//	driver.switchTo().frame("iframeResult");   // switch to frame by Frame name
	  
	  driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		
		
		
		
		

	}

}
