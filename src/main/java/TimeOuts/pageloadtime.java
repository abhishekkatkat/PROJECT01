package TimeOuts;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageloadtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15)); 	
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		
		driver.findElement(By.id("btn2")).click();
		
		
		driver.findElement(By.id("txt2)")).sendKeys("text entered");
		
		
		
		
	}

}
