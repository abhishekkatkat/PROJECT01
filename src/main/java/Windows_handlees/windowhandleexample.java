package Windows_handlees;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandleexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		
		String mainwindow = driver.getWindowHandle();
		
		
		driver.findElement(By.id("windowButton")).click();
		
		Set <String> allwindowhandles = driver.getWindowHandles();
		
		for(String handle : allwindowhandles) {
			
			if(!handle.equals(mainwindow)) {
				
				
				driver.switchTo().window(handle);
				
				break;
		
			}
		}
		
		Thread.sleep(2000);
		
		System.out.println("title of the window = " +driver.getTitle());
		
		System.out.println("text in the window"+driver.findElement(By.tagName("h1")).getText());
		
		driver.close();
		
		driver.switchTo().window(mainwindow);
		
		
		System.out.println("Back to main window = " +driver.getTitle());
		
		driver.quit();
		
	}
	
	

}
