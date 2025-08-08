package SELENIUMPROJECT01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {
	@Test   (dataProvider = "datasupplier")
	public void loginaccounts(String email, String password) throws InterruptedException {
		
       
		WebDriver driver = new ChromeDriver();
		driver.get("https://shoppersstack.com/");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		driver.findElement(By.id("loginBtn")).click();
	    driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys(email);
	    driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"Login\"]/span[1]")).click();
	    
	    System.out.println("Successfully logged in");
	    
	    Thread.sleep(3000);
	    driver.quit();
	    
	   
	}
	     @DataProvider
	public String [] [] datasupplier() {
		
	    	 String [][] data = { {"abhishektest@gmail.com", "@Abhi1010"},
	    			          {"abhishekkatkar10102000@gmail.com", "@Abhi1010"}};
	    	 
		return data;
	}
	
}
