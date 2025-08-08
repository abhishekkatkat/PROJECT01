package Windows_handlees;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentwinhandle = driver.getWindowHandle();
		
		System.out.println("Parent window handle " +parentwinhandle);
		
		driver.findElement(By.className("whButtons")).click();
		
		Set <String> handles = driver.getWindowHandles();
				
				for(  String handle : handles) {
					
					System.out.println( handle);
					
				if(!handle.equals(parentwinhandle)) {
					
					driver.switchTo().window(handle);
					
					driver.findElement(By.id("firstName")).sendKeys("Abhishek");
					
					Thread.sleep(2000);
					
					driver.close();
					
				}
				}
					driver.switchTo().window(parentwinhandle);
					
					driver.findElement(By.className("whTextBox")).sendKeys("Back to parent window");
	
		
	}

}
