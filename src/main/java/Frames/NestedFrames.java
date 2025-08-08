package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.findElement(By.className("frmTextBox")).sendKeys("Main page");
		
		driver.switchTo().frame(driver.findElement(By.id("frm3")));
		
		
		WebElement dropdown = driver.findElement(By.id("selectnav1"));
		
		Select option = new Select(dropdown);
		
		
		option.selectByVisibleText("Tech News");
		
		
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		
		WebElement dropdown1 = driver.findElement(By.id("course"));
		
		Select option1 = new Select (dropdown1);
		
		option1.selectByVisibleText("java");
		
		
		driver.switchTo().defaultContent();
		
		
		driver.findElement(By.className("frmTextBox")) .clear();

		driver.findElement(By.className("frmTextBox")).sendKeys("Again back to the main page");
		
		
		
		
		
		
		
		
	}

}
