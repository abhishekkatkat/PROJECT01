package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapsingledd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");

		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		
		List <WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
			
		for(WebElement option : options) {
			
		
		String text = option.getText();
			
			System.out.println(text);
			
			if(text.equals("JavaScript")) {
				
				option.click();
				
				break;
			}
		}
		
	}}