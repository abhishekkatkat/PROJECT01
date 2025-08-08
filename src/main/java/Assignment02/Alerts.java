package Assignment02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
	    driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Test");
	    
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	    
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	     Alert firstalert = driver.switchTo().alert();
	     
	     firstalert.accept();
	     
	     
	     System.out.println("First alert accepted");
	     
	     
	     Alert secondalert = driver.switchTo().alert();
	     
	     secondalert.accept();
	     
	     System.out.println("Second Alert accepted");
	     
	     
	     
		

	}

}
