package WebTable;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamictable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		WebElement table = driver.findElement(By.tagName("table"));
		
		List <WebElement> column = table.findElements(By.tagName("th"));
		
		System.out.println(" Fetch totsl number of columns = " +column.size());
		
		List <WebElement> rows = driver.findElements(By.tagName("tr"));
		
		System.out.println("fetch total number of rows = "+rows.size());
		
		for( int i = 0; i<rows.size(); i++) {
			
		
				List <WebElement> cell = rows.get(i).findElements(By.tagName("td"));
				
				System.out.println( "Rows has total " +(i+1) +" cells" +cell.size() );
				
			
			
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
