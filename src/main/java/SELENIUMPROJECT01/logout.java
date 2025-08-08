package SELENIUMPROJECT01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logout {
	
	
	@Test
	
	public void logoutTC() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://shoppersstack.com/");
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.get("https://shoppersstack.com/");
		
	    driver.findElement(By.id("loginBtn")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"vertical-tab-1\"]")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"vertical-tab-0\"]")).click();
	    
	    driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("abhishekkatkar10102000@gmail.com");
	    
	    driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("@Abhi1010");
	    
	    driver.findElement(By.xpath("//*[@id=\"Login\"]/span[1]")).click();
	    
	    System.out.println("Successfully logged in");
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z']")).click();
	    
	    Thread.sleep(2000);
	      
	    driver.findElement(By.xpath("//*[@id=\"account-menu\"]/div[3]/ul/li[7]")).click();
	    
	    
	    
		
		
		
		
	}
	

}
