package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleselectiondropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement dropdown  = driver.findElement(By.id("course"));
		
		Select selectoption = new Select(dropdown);
		
		
		selectoption.selectByIndex(1);
		
		Thread.sleep(2000);
		
		selectoption.selectByValue("net");
		
		Thread.sleep(2000);
		
		selectoption.selectByVisibleText("Javascript");
		
		selectoption.deselectAll();
		
		
		
		

	}
	   

}
