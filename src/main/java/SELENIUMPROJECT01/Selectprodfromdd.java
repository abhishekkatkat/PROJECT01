package SELENIUMPROJECT01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectprodfromdd {
	
	
	@BeforeMethod
	public void setup() {
		

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
	}
	
		

		
	WebDriver driver;
	
	@Test (priority=1 , groups="smoke")

	public void buyfromdropdown() throws InterruptedException {
		
		
		driver.get("https://shoppersstack.com/");
		
		Thread.sleep(15000);
	    driver.findElement(By.id("loginBtn")).click();
	    driver.findElement(By.xpath("//*[@id=\"vertical-tab-1\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"vertical-tab-0\"]")).click();
	    driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("abhishekkatkar10102000@gmail.com");
	    driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("@Abhi1010");
	    driver.findElement(By.xpath("//*[@id=\"Login\"]/span[1]")).click();
	    System.out.println("Successfully logged in");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//select[@class=\"navbar_selectBlock__UPLw4\"]")).click();
	    
	 // Locate the <select> element
	    WebElement dropdown = driver.findElement(By.xpath("//select[@class='navbar_selectBlock__UPLw4']"));

	    // Initialize the Select object with the <select> element
	    Select selectoption = new Select(dropdown);

	    // Select an option by index
	    selectoption.selectByIndex(2);
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.id("searchBtn")).click();
	    driver.findElement(By.xpath("//img[@alt=\"nike shues\"]")).click();
	    driver.findElement(By.xpath("//button[@id='Add To Cart']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@id='cart']//*[name()='svg']")).click();
	    
	    Thread.sleep(2000);

	   driver.findElement(By.id("buynow_fl")).click();
	   driver.findElement(By.xpath("//input[@id=\"125313\"]")).click();
	    driver.findElement(By.className("selectaddress_proceed__qiGsK")).click();
	    driver.findElement(By.xpath("//label[2]")).click();
	    driver.findElement(By.xpath("//button[normalize-space()='Proceed']")).click();   
	    
	    
	    
	    driver.close();
	    

	  
	    

}
}