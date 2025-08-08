package SELENIUMPROJECT01;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class SelectProduct{
	
       public void Selectprod() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
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
	    
	    driver.findElement(By.xpath("//a[@id='electronics']")).click();
	    

	    
	//   List <WebElement> categories =  driver.findElements(By.xpath("//*[@id=\"root\"]/div[2]/div/nav/ul/li[4]/div"));
	
        Thread.sleep(3000);
	    
	    List <WebElement> categories =  driver.findElements(By.xpath("//a[@id='electronics']/following-sibling::div//li"));
	 
	  //  System.out.println(categories.size());
	    
	    for(WebElement category : categories) {
		   
		   String text = category.getText();
		   
		   System.out.println(text);
		   
		   if (text.equalsIgnoreCase("Laptops")) {
			   
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", category);
		        
		        category.click();
		        
		        break;
		        
		   }
		        driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div/div[5]/div[3]/div[2]/button")).click();
			   
		        
			  System.out.println("Product added to the card");
		  
		   }
		   
		   
	 
	
}
}
