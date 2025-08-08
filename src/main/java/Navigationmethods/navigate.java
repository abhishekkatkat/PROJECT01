package Navigationmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.className("gLFyf")).sendKeys("hrt tutorials");
		
		driver.findElement(By.className("gNO89b")).submit();
		
		driver.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
		
		driver.findElement(By.className("_aa4b _add6 _ac4d _ap35")).sendKeys("Abhishek Katkar Test");
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		driver.close();
		
		
		

	}

}
