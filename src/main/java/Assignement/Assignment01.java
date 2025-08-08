package Assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment01 {

	
	public static void main (String [] args ){
		
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		System.out.println(" Verifiying the Webpage Title = " +driver.getTitle());
		
		  driver.findElement(By.id("vfb-7-1")).click();
		  
		  
          driver.findElement(By.id("vfb-6-1")).click();
		  
		  driver.findElement(By.id("vfb-6-2")).click();
		  
		  System.out.println("Checkbox and radio buttons selected");
		
		  
		  driver.get("https://demo.guru99.com/test/newtours/register.php");
		  
		  WebElement countryname = driver.findElement(By.name("country"));
		  
		  Select selectcontry = new Select(countryname);
		  
		  selectcontry.selectByVisibleText("KUWAIT");
		  
		  
		  
		  
		   
		
	}
}
