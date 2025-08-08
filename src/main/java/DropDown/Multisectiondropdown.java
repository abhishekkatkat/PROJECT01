package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multisectiondropdown {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		WebElement multisetdd = driver.findElement(By.id("ide"));
		
		Select options = new Select(multisetdd);
		
		options.selectByIndex(1);
		
		Thread.sleep(2000);
		
		options.selectByValue("ij");
		
		Thread.sleep(2000);
		
		options.selectByVisibleText("Visual Studio");
		
		Thread.sleep(2000);
		
		options.deselectByValue("ij");
		
		
		
	}

}
