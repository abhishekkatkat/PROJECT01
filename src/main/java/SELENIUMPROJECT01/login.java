package SELENIUMPROJECT01;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	
	@BeforeMethod
	public void setup() {
		

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
	}
	
	
	@AfterMethod
	
	public void closebrowser() {
		
		driver.quit();
		
	}
		
	WebDriver driver;
	
	@Test (priority=1 , groups="smoke")

	public void loginTC() throws InterruptedException {
		
		
		driver.get("https://shoppersstack.com/");
		
	    driver.findElement(By.id("loginBtn")).click();
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"vertical-tab-1\"]")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"vertical-tab-0\"]")).click();
	    
	    driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("abhishekkatkar10102000@gmail.com");
	    
	    driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("@Abhi1010");
	    
	    driver.findElement(By.xpath("//*[@id=\"Login\"]/span[1]")).click();
	    
	    Thread.sleep(2000);
	    
	    System.out.println("Successfully logged in");
	}
	
	@Test (priority = 2)
	public void invalidlogin() throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.get("https://shoppersstack.com/");
		
		driver.findElement(By.id("loginBtn")).click();
	
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("test123@gmail.com");
		
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("@test123");
		
		System.out.println("Verified Invalid login test case");
		
		 driver.findElement(By.xpath("//*[@id=\"Login\"]/span[1]")).click();
		 
		 Thread.sleep(3000);
		 
		 driver.quit();
		
	}
	  
}
