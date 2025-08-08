package Windows_handlees;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows_handless {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		  
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		
		String mainwindow = driver.getWindowHandle();
		
		Set <String> allwindowhandles = driver.getWindowHandles();
		
		for(String handle : allwindowhandles) {
			
			if( !handle.equals(mainwindow)) {
				
				break;
				
			}
		}
		
		Thread.sleep(2000);
		
		System.out.println("printing title of the new window = " +driver.getTitle());
		
		System.out.println(" prrinting text from the new window = "+driver.findElement(By.tagName("h1")).getText());
		
		
		driver.close();
		
		driver.switchTo().window(mainwindow);
		
		System.out.println("printing tile of the main page = " +driver.getTitle());
		
		
		driver.quit();
			
		
		}
		
}