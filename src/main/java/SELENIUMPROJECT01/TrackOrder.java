package SELENIUMPROJECT01;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TrackOrder {
	
	@BeforeMethod
	public void setup() {
		

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		

	}
		
	WebDriver driver;
	
	@Test 

	public void trackmyorder() throws InterruptedException {
		
		
		driver.get("https://shoppersstack.com/");
		
	    driver.findElement(By.id("loginBtn")).click();
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"vertical-tab-1\"]")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"vertical-tab-0\"]")).click();
	    
	    driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("abhishekkatkar10102000@gmail.com");
	    
	    driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("@Abhi1010");
	    
	    driver.findElement(By.xpath("//*[@id=\"Login\"]/span[1]")).click();
	    
	    Thread.sleep(2000);
	    
	    System.out.println("Successfully logged in");
	    
	    driver.findElement(By.xpath("//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z\"]")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"account-menu\"]/div[3]/ul/li[4]")).click();
	    
	    Thread.sleep(3000);
        
	     driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[1]//div[1]//div[5]//div[1]//button[1]")).click();
	     
	  
	     System.out.println("Order Cancelled Successfully ");
	     
	     
	}
}
