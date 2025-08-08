package HTMLBasicControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLcontrols {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		driver.findElement(By.id("firstName")).sendKeys("Abhishek");
		
		driver.findElement(By.className("bcRadioButton")).click();
		
		driver.findElement(By.id("englishchbx")).click();
		
		driver.findElement(By.id("hindichbx")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("hindichbx")).click();
		
		
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
	}

}
