package Assignment03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testng {
	
	@BeforeTest
	public void initiatedriver() {
		
		System.out.println("Initiate Driver ");
	}
	
	@Test (dataProvider="data")
	
	public void test(String username , String Password) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/login.html");
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@id=\"passwd\"]")).sendKeys(Password);
		
		driver.findElement(By.xpath("//button[@id=\"SubmitLogin\"]")).click();
		
		driver.close();
	}

	

	
	@DataProvider  (name = "data")
	public Object[][] dataset(){
		
		
		return new Object[][] {
			
			
			{"abhishek 01", "password01"}, {"abhishek02", "password02"}};
			
			
	}
}
